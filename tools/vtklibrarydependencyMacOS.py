#
# Determines the order of the vtk libraries, such that dependency relationships
# are preserved.
#
# Usage:
# On linux call python vtklibraryorder dir,
# where dir is the directory containing all vtk libraries.
#
# Note: The Files .jnilib should be renamed to .dylib before running this script.
#
# Caution!
# There might be a bug in this script. The topological sort failed for one library.
# Based on the resulting error message, which explicitly referenced the offending library
# it was easily possible to move this one library into the correct place. However, it needs
# to be debugged at some point.
#
import sys
import os
import subprocess
import re
from toposort import toposort, toposort_flatten

def main(argv):
    print(argv)
    vtklibdir = argv[1]

    dependencygraph = dict()
    for file in os.listdir(vtklibdir):
        print(" processing file " +file)
        out = subprocess.Popen(['otool',  "-L", vtklibdir +"/" +file],
        stdout=subprocess.PIPE, 
        stderr=subprocess.STDOUT,
        encoding='utf-8')       
        stdout,stderr = out.communicate() 

        # the file pattern might need to be adapter for other versions of vtk
        filepattern = '(libvtk.+?).dylib.*'

        fileRegexp =  re.search(filepattern, file)
        if not fileRegexp:
            # We only process files that correspond to the pattern
            continue


        fileStem = fileRegexp.group(1)
        for line in stdout.split("\n"):
            print(line)
            dependencyRegexp = re.search(filepattern, line)
            if dependencyRegexp:
                dependencyStem = dependencyRegexp.group(1)
                print(fileStem + " depends on " + dependencyStem)
                if (not fileStem in dependencygraph):
                    dependencygraph[fileStem] = set()    
                dependencygraph[fileStem].add(dependencyStem)
        
    
    sortedlist = toposort_flatten(dependencygraph, sort=True)
    for lib in sortedlist:
        if not "9.1.9" in lib and not "9.1.1" in lib:
            print("libraryList.add(\"" +lib +".dylib"+ "\");")
if __name__ == "__main__":
    main(sys.argv)