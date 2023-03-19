package ch.unibas.cs.gravis.vtkjavanativelibs.impl;

import com.google.auto.service.AutoService;

import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import ch.unibas.cs.gravis.vtkjavanativelibs.VtkNativeLibrariesImpl;
import ch.unibas.cs.gravis.vtkjavanativelibs.Platform;

/**
  * Implementation of VtkNativeLibraries for LInux (64 bit)
  */ 
@AutoService(VtkNativeLibrariesImpl.class)
public class VtkNativeLibrariesImplMacOSM1 implements VtkNativeLibrariesImpl {

    public VtkNativeLibrariesImplMacOSM1() {
    }

    public String getName() {
        return "VtkNativeLibrariesMacOSM1";
    }


    public String getVersion() {
        return "9.1";
    }

    public List<URL> getVtkLibraries() {
        List<String> libraryList = new LinkedList<>();


        libraryList.add("libvtkWrappingTools-9.1.dylib");
        libraryList.add("libvtkdoubleconversion-9.1.dylib");
        libraryList.add("libvtkexpat-9.1.dylib");
        libraryList.add("libvtkfmt-9.1.dylib");
        libraryList.add("libvtkglew-9.1.dylib");
        libraryList.add("libvtkjpeg-9.1.dylib");
        libraryList.add("libvtkjsoncpp-9.1.dylib");
        libraryList.add("libvtkkissfft-9.1.dylib");
        libraryList.add("libvtklibproj-9.1.dylib");
        libraryList.add("libvtkloguru-9.1.dylib");
        libraryList.add("libvtklz4-9.1.dylib");
        libraryList.add("libvtklzma-9.1.dylib");
        libraryList.add("libvtkogg-9.1.dylib");
        libraryList.add("libvtkpugixml-9.1.dylib");
        libraryList.add("libvtksqlite-9.1.dylib");
        libraryList.add("libvtksys-9.1.dylib");
        libraryList.add("libvtkverdict-9.1.dylib");
        libraryList.add("libvtkzlib-9.1.dylib");
        libraryList.add("libvtkCommonCore-9.1.dylib");
        libraryList.add("libvtkDICOMParser-9.1.dylib");
        libraryList.add("libvtkfreetype-9.1.dylib");
        libraryList.add("libvtkhdf5-9.1.dylib");
        libraryList.add("libvtklibxml2-9.1.dylib");
        libraryList.add("libvtkmetaio-9.1.dylib");
        libraryList.add("libvtkpng-9.1.dylib");
        libraryList.add("libvtktheora-9.1.dylib");
        libraryList.add("libvtktiff-9.1.dylib");
        libraryList.add("libvtkJava-9.1.dylib");
        libraryList.add("libvtkCommonCoreJava.jnilib");
        libraryList.add("libvtkCommonMath-9.1.dylib");
        libraryList.add("libvtkCommonMathJava.jnilib");
        libraryList.add("libvtkCommonSystem-9.1.dylib");
        libraryList.add("libvtkCommonSystemJava.jnilib");
        libraryList.add("libvtkgl2ps-9.1.dylib");
        libraryList.add("libvtkhdf5_hl-9.1.dylib");
        libraryList.add("libvtklibharu-9.1.dylib");
        libraryList.add("libvtkCommonMisc-9.1.dylib");
        libraryList.add("libvtkCommonMiscJava.jnilib");
        libraryList.add("libvtkCommonTransforms-9.1.dylib");
        libraryList.add("libvtkCommonTransformsJava.jnilib");
        libraryList.add("libvtkcgns-9.1.dylib");
        libraryList.add("libvtknetcdf-9.1.dylib");
        libraryList.add("libvtkCommonDataModel-9.1.dylib");
        libraryList.add("libvtkCommonDataModelJava.jnilib");
        libraryList.add("libvtkexodusII-9.1.dylib");
        libraryList.add("libvtkCommonColor-9.1.dylib");
        libraryList.add("libvtkCommonColorJava.jnilib");
        libraryList.add("libvtkCommonComputationalGeometry-9.1.dylib");
        libraryList.add("libvtkCommonComputationalGeometryJava.jnilib");
        libraryList.add("libvtkCommonExecutionModel-9.1.dylib");
        libraryList.add("libvtkCommonExecutionModelJava.jnilib");
        libraryList.add("libvtkioss-9.1.dylib");
        libraryList.add("libvtkFiltersCore-9.1.dylib");
        libraryList.add("libvtkFiltersCoreJava.jnilib");
        libraryList.add("libvtkFiltersProgrammable-9.1.dylib");
        libraryList.add("libvtkFiltersProgrammableJava.jnilib");
        libraryList.add("libvtkFiltersSelection-9.1.dylib");
        libraryList.add("libvtkFiltersSelectionJava.jnilib");
        libraryList.add("libvtkFiltersTopology-9.1.dylib");
        libraryList.add("libvtkFiltersTopologyJava.jnilib");
        libraryList.add("libvtkFiltersVerdict-9.1.dylib");
        libraryList.add("libvtkIOCONVERGECFD-9.1.dylib");
        libraryList.add("libvtkIOCONVERGECFDJava.jnilib");
        libraryList.add("libvtkIOCore-9.1.dylib");
        libraryList.add("libvtkIOCoreJava.jnilib");
        libraryList.add("libvtkIOEnSight-9.1.dylib");
        libraryList.add("libvtkIOMovie-9.1.dylib");
        libraryList.add("libvtkIOMovieJava.jnilib");
        libraryList.add("libvtkIONetCDF-9.1.dylib");
        libraryList.add("libvtkIONetCDFJava.jnilib");
        libraryList.add("libvtkIOVeraOut-9.1.dylib");
        libraryList.add("libvtkIOVideo-9.1.dylib");
        libraryList.add("libvtkIOVideoJava.jnilib");
        libraryList.add("libvtkImagingCore-9.1.dylib");
        libraryList.add("libvtkImagingCoreJava.jnilib");
        libraryList.add("libvtkImagingMath-9.1.dylib");
        libraryList.add("libvtkImagingMathJava.jnilib");
        libraryList.add("libvtkFiltersGeneral-9.1.dylib");
        libraryList.add("libvtkFiltersGeneralJava.jnilib");
        libraryList.add("libvtkFiltersGeometry-9.1.dylib");
        libraryList.add("libvtkFiltersGeometryJava.jnilib");
        libraryList.add("libvtkIOHDF-9.1.dylib");
        libraryList.add("libvtkIOImage-9.1.dylib");
        libraryList.add("libvtkIOImageJava.jnilib");
        libraryList.add("libvtkIOLegacy-9.1.dylib");
        libraryList.add("libvtkIOLegacyJava.jnilib");
        libraryList.add("libvtkIOOggTheora-9.1.dylib");
        libraryList.add("libvtkIOOggTheoraJava.jnilib");
        libraryList.add("libvtkIOPLY-9.1.dylib");
        libraryList.add("libvtkIOPLYJava.jnilib");
        libraryList.add("libvtkIOSQL-9.1.dylib");
        libraryList.add("libvtkIOSQLJava.jnilib");
        libraryList.add("libvtkIOTecplotTable-9.1.dylib");
        libraryList.add("libvtkIOTecplotTableJava.jnilib");
        libraryList.add("libvtkIOXMLParser-9.1.dylib");
        libraryList.add("libvtkIOXMLParserJava.jnilib");
        libraryList.add("libvtkImagingColor-9.1.dylib");
        libraryList.add("libvtkImagingColorJava.jnilib");
        libraryList.add("libvtkImagingFourier-9.1.dylib");
        libraryList.add("libvtkImagingFourierJava.jnilib");
        libraryList.add("libvtkImagingSources-9.1.dylib");
        libraryList.add("libvtkImagingSourcesJava.jnilib");
        libraryList.add("libvtkImagingStatistics-9.1.dylib");
        libraryList.add("libvtkImagingStatisticsJava.jnilib");
        libraryList.add("libvtkImagingStencil-9.1.dylib");
        libraryList.add("libvtkFiltersHyperTree-9.1.dylib");
        libraryList.add("libvtkFiltersHyperTreeJava.jnilib");
        libraryList.add("libvtkFiltersSMP-9.1.dylib");
        libraryList.add("libvtkFiltersSMPJava.jnilib");
        libraryList.add("libvtkFiltersSources-9.1.dylib");
        libraryList.add("libvtkFiltersSourcesJava.jnilib");
        libraryList.add("libvtkFiltersStatistics-9.1.dylib");
        libraryList.add("libvtkFiltersStatisticsJava.jnilib");
        libraryList.add("libvtkFiltersTexture-9.1.dylib");
        libraryList.add("libvtkFiltersTextureJava.jnilib");
        libraryList.add("libvtkIOExodus-9.1.dylib");
        libraryList.add("libvtkIOExodusJava.jnilib");
        libraryList.add("libvtkIOLSDyna-9.1.dylib");
        libraryList.add("libvtkIOLSDynaJava.jnilib");
        libraryList.add("libvtkIOSegY-9.1.dylib");
        libraryList.add("libvtkIOXML-9.1.dylib");
        libraryList.add("libvtkIOXMLJava.jnilib");
        libraryList.add("libvtkImagingGeneral-9.1.dylib");
        libraryList.add("libvtkImagingGeneralJava.jnilib");
        libraryList.add("libvtkImagingHybrid-9.1.dylib");
        libraryList.add("libvtkImagingHybridJava.jnilib");
        libraryList.add("libvtkParallelCore-9.1.dylib");
        libraryList.add("libvtkParallelCoreJava.jnilib");
        libraryList.add("libvtkFiltersAMR-9.1.dylib");
        libraryList.add("libvtkFiltersAMRJava.jnilib");
        libraryList.add("libvtkFiltersGeneric-9.1.dylib");
        libraryList.add("libvtkFiltersGenericJava.jnilib");
        libraryList.add("libvtkFiltersImaging-9.1.dylib");
        libraryList.add("libvtkFiltersImagingJava.jnilib");
        libraryList.add("libvtkFiltersModeling-9.1.dylib");
        libraryList.add("libvtkFiltersModelingJava.jnilib");
        libraryList.add("libvtkIOAsynchronous-9.1.dylib");
        libraryList.add("libvtkIOAsynchronousJava.jnilib");
        libraryList.add("libvtkIOParallelXML-9.1.dylib");
        libraryList.add("libvtkIOParallelXMLJava.jnilib");
        libraryList.add("libvtkImagingMorphological-9.1.dylib");
        libraryList.add("libvtkImagingMorphologicalJava.jnilib");
        libraryList.add("libvtkParallelDIY-9.1.dylib");
        libraryList.add("libvtkRenderingCore-9.1.dylib");
        libraryList.add("libvtkRenderingCoreJava.jnilib");
        libraryList.add("libvtkDomainsChemistry-9.1.dylib");
        libraryList.add("libvtkFiltersExtraction-9.1.dylib");
        libraryList.add("libvtkFiltersExtractionJava.jnilib");
        libraryList.add("libvtkFiltersFlowPaths-9.1.dylib");
        libraryList.add("libvtkFiltersFlowPathsJava.jnilib");
        libraryList.add("libvtkFiltersHybrid-9.1.dylib");
        libraryList.add("libvtkFiltersHybridJava.jnilib");
        libraryList.add("libvtkFiltersPoints-9.1.dylib");
        libraryList.add("libvtkFiltersPointsJava.jnilib");
        libraryList.add("libvtkIOAMR-9.1.dylib");
        libraryList.add("libvtkIOCityGML-9.1.dylib");
        libraryList.add("libvtkIOCityGMLJava.jnilib");
        libraryList.add("libvtkRenderingFreeType-9.1.dylib");
        libraryList.add("libvtkRenderingFreeTypeJava.jnilib");
        libraryList.add("libvtkRenderingImage-9.1.dylib");
        libraryList.add("libvtkRenderingImageJava.jnilib");
        libraryList.add("libvtkRenderingLOD-9.1.dylib");
        libraryList.add("libvtkRenderingSceneGraph-9.1.dylib");
        libraryList.add("libvtkRenderingSceneGraphJava.jnilib");
        libraryList.add("libvtkRenderingUI-9.1.dylib");
        libraryList.add("libvtkRenderingUIJava.jnilib");
        libraryList.add("libvtkRenderingVolume-9.1.dylib");
        libraryList.add("libvtkRenderingVolumeJava.jnilib");
        libraryList.add("libvtkTestingRendering-9.1.dylib");
        libraryList.add("libvtkFiltersParallel-9.1.dylib");
        libraryList.add("libvtkFiltersParallelJava.jnilib");
        libraryList.add("libvtkIOCGNSReader-9.1.dylib");
        libraryList.add("libvtkIOChemistry-9.1.dylib");
        libraryList.add("libvtkIOChemistryJava.jnilib");
        libraryList.add("libvtkIOGeometry-9.1.dylib");
        libraryList.add("libvtkIOGeometryJava.jnilib");
        libraryList.add("libvtkIOIOSS-9.1.dylib");
        libraryList.add("libvtkIOIOSSJava.jnilib");
        libraryList.add("libvtkIOMINC-9.1.dylib");
        libraryList.add("libvtkInfovisCore-9.1.dylib");
        libraryList.add("libvtkInfovisCoreJava.jnilib");
        libraryList.add("libvtkInteractionStyle-9.1.dylib");
        libraryList.add("libvtkInteractionStyleJava.jnilib");
        libraryList.add("libvtkRenderingAnnotation-9.1.dylib");
        libraryList.add("libvtkRenderingAnnotationJava.jnilib");
        libraryList.add("libvtkRenderingContext2D-9.1.dylib");
        libraryList.add("libvtkRenderingContext2DJava.jnilib");
        libraryList.add("libvtkRenderingLabel-9.1.dylib");
        libraryList.add("libvtkRenderingLabelJava.jnilib");
        libraryList.add("libvtkRenderingOpenGL2-9.1.dylib");
        libraryList.add("libvtkRenderingOpenGL2Java.jnilib");
        libraryList.add("libvtkChartsCore-9.1.dylib");
        libraryList.add("libvtkDomainsChemistryOpenGL2-9.1.dylib");
        libraryList.add("libvtkFiltersParallelImaging-9.1.dylib");
        libraryList.add("libvtkFiltersParallelImagingJava.jnilib");
        libraryList.add("libvtkIOImport-9.1.dylib");
        libraryList.add("libvtkIOInfovis-9.1.dylib");
        libraryList.add("libvtkIOMotionFX-9.1.dylib");
        libraryList.add("libvtkIOParallel-9.1.dylib");
        libraryList.add("libvtkInfovisLayout-9.1.dylib");
        libraryList.add("libvtkInteractionWidgets-9.1.dylib");
        libraryList.add("libvtkInteractionWidgetsJava.jnilib");
        libraryList.add("libvtkRenderingContextOpenGL2-9.1.dylib");
        libraryList.add("libvtkRenderingContextOpenGL2Java.jnilib");
        libraryList.add("libvtkRenderingGL2PSOpenGL2-9.1.dylib");
        libraryList.add("libvtkRenderingVolumeOpenGL2-9.1.dylib");
        libraryList.add("libvtkRenderingVolumeOpenGL2Java.jnilib");
        libraryList.add("libvtkRenderingVtkJS-9.1.dylib");
        libraryList.add("libvtkRenderingVtkJSJava.jnilib");
        libraryList.add("libvtkIOExport-9.1.dylib");
        libraryList.add("libvtkIOExportJava.jnilib");
        libraryList.add("libvtkInteractionImage-9.1.dylib");
        libraryList.add("libvtkInteractionImageJava.jnilib");
        libraryList.add("libvtkViewsCore-9.1.dylib");
        libraryList.add("libvtkViewsCoreJava.jnilib");
        libraryList.add("libvtkGeovisCore-9.1.dylib");
        libraryList.add("libvtkGeovisCoreJava.jnilib");
        libraryList.add("libvtkIOExportGL2PS-9.1.dylib");
        libraryList.add("libvtkIOExportPDF-9.1.dylib");
        libraryList.add("libvtkIOExportPDFJava.jnilib");
        libraryList.add("libvtkViewsContext2D-9.1.dylib");
        libraryList.add("libvtkViewsInfovis-9.1.dylib");


        Class clazz =  this.getClass();
        return libraryList
                .stream()
                .map(libraryName -> clazz.getResource(libraryName))
                .collect(Collectors.toList());
    }

    @Override
    public List<URL> getJoglLibraries() {
        List<String> libraryList = new LinkedList<>();

        libraryList.add("libgluegen_rt.dylib");
        libraryList.add("libnativewindow_awt.dylib");
        libraryList.add("libnativewindow_macosx.dylib");
        libraryList.add("libjogl_desktop.dylib");
        libraryList.add("libjogl_mobile.dylib");
        libraryList.add("libnewt_head.dylib");

        Class clazz =  this.getClass();
        return libraryList
                .stream()
                .map(libraryName -> clazz.getResource(libraryName))
                .collect(Collectors.toList());
    }

    public List<String> getSupportedPlatforms() {
        List<String> list = new LinkedList<>();
        list.add(Platform.PLATFORM_MACM1 );
        return list;
    }
}

