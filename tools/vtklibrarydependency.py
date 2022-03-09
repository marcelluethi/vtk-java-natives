#
# Determines the order of the vtk libraries, such that dependency relationships
# are preserved.
#
# Usage:
# On linux call python vtklibraryorder dir,
# where dir is the directory containing all vtk libraries.
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
        out = subprocess.Popen(['ldd',  vtklibdir +"/" +file], 
        stdout=subprocess.PIPE, 
        stderr=subprocess.STDOUT,
        encoding='utf-8')       
        stdout,stderr = out.communicate() 

        # the file pattern might need to be adapter for other versions of vtk
        filepattern = '(libvtk.+?).so.*'

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
        print("list.add(\"" +lib.replace("libvtk", "vtk").replace(".so", "") +"\");")

if __name__ == "__main__":
    main(sys.argv)