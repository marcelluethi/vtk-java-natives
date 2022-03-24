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
public class VtkNativeLibrariesImplMacOS implements VtkNativeLibrariesImpl {

    public VtkNativeLibrariesImplMacOS() {
    }

    public String getName() {
        return "VtkNativeLibrariesMacOS";
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
        libraryList.add("libvtkCommonCoreJava.dylib");
        libraryList.add("libvtkCommonMath-9.1.dylib");
        libraryList.add("libvtkCommonMathJava.dylib");
        libraryList.add("libvtkCommonSystem-9.1.dylib");
        libraryList.add("libvtkCommonSystemJava.dylib");
        libraryList.add("libvtkgl2ps-9.1.dylib");
        libraryList.add("libvtkhdf5_hl-9.1.dylib");
        libraryList.add("libvtklibharu-9.1.dylib");
        libraryList.add("libvtkCommonMisc-9.1.dylib");
        libraryList.add("libvtkCommonMiscJava.dylib");
        libraryList.add("libvtkCommonTransforms-9.1.dylib");
        libraryList.add("libvtkCommonTransformsJava.dylib");
        libraryList.add("libvtkcgns-9.1.dylib");
        libraryList.add("libvtknetcdf-9.1.dylib");
        libraryList.add("libvtkCommonDataModel-9.1.dylib");
        libraryList.add("libvtkCommonDataModelJava.dylib");
        libraryList.add("libvtkexodusII-9.1.dylib");
        libraryList.add("libvtkCommonColor-9.1.dylib");
        libraryList.add("libvtkCommonColorJava.dylib");
        libraryList.add("libvtkCommonComputationalGeometry-9.1.dylib");
        libraryList.add("libvtkCommonComputationalGeometryJava.dylib");
        libraryList.add("libvtkCommonExecutionModel-9.1.dylib");
        libraryList.add("libvtkCommonExecutionModelJava.dylib");
        libraryList.add("libvtkioss-9.1.dylib");
        libraryList.add("libvtkFiltersCore-9.1.dylib");
        libraryList.add("libvtkFiltersCoreJava.dylib");
        libraryList.add("libvtkFiltersProgrammable-9.1.dylib");
        libraryList.add("libvtkFiltersProgrammableJava.dylib");
        libraryList.add("libvtkFiltersSelection-9.1.dylib");
        libraryList.add("libvtkFiltersSelectionJava.dylib");
        libraryList.add("libvtkFiltersTopology-9.1.dylib");
        libraryList.add("libvtkFiltersTopologyJava.dylib");
        libraryList.add("libvtkFiltersVerdict-9.1.dylib");
        libraryList.add("libvtkIOCONVERGECFD-9.1.dylib");
        libraryList.add("libvtkIOCONVERGECFDJava.dylib");
        libraryList.add("libvtkIOCore-9.1.dylib");
        libraryList.add("libvtkIOCoreJava.dylib");
        libraryList.add("libvtkIOEnSight-9.1.dylib");
        libraryList.add("libvtkIOMovie-9.1.dylib");
        libraryList.add("libvtkIOMovieJava.dylib");
        libraryList.add("libvtkIONetCDF-9.1.dylib");
        libraryList.add("libvtkIONetCDFJava.dylib");
        libraryList.add("libvtkIOVeraOut-9.1.dylib");
        libraryList.add("libvtkIOVideo-9.1.dylib");
        libraryList.add("libvtkIOVideoJava.dylib");
        libraryList.add("libvtkImagingCore-9.1.dylib");
        libraryList.add("libvtkImagingCoreJava.dylib");
        libraryList.add("libvtkImagingMath-9.1.dylib");
        libraryList.add("libvtkImagingMathJava.dylib");
        libraryList.add("libvtkFiltersGeneral-9.1.dylib");
        libraryList.add("libvtkFiltersGeneralJava.dylib");
        libraryList.add("libvtkFiltersGeometry-9.1.dylib");
        libraryList.add("libvtkFiltersGeometryJava.dylib");
        libraryList.add("libvtkIOHDF-9.1.dylib");
        libraryList.add("libvtkIOImage-9.1.dylib");
        libraryList.add("libvtkIOImageJava.dylib");
        libraryList.add("libvtkIOLegacy-9.1.dylib");
        libraryList.add("libvtkIOLegacyJava.dylib");
        libraryList.add("libvtkIOOggTheora-9.1.dylib");
        libraryList.add("libvtkIOOggTheoraJava.dylib");
        libraryList.add("libvtkIOPLY-9.1.dylib");
        libraryList.add("libvtkIOPLYJava.dylib");
        libraryList.add("libvtkIOSQL-9.1.dylib");
        libraryList.add("libvtkIOSQLJava.dylib");
        libraryList.add("libvtkIOTecplotTable-9.1.dylib");
        libraryList.add("libvtkIOTecplotTableJava.dylib");
        libraryList.add("libvtkIOXMLParser-9.1.dylib");
        libraryList.add("libvtkIOXMLParserJava.dylib");
        libraryList.add("libvtkImagingColor-9.1.dylib");
        libraryList.add("libvtkImagingColorJava.dylib");
        libraryList.add("libvtkImagingFourier-9.1.dylib");
        libraryList.add("libvtkImagingFourierJava.dylib");
        libraryList.add("libvtkImagingSources-9.1.dylib");
        libraryList.add("libvtkImagingSourcesJava.dylib");
        libraryList.add("libvtkImagingStatistics-9.1.dylib");
        libraryList.add("libvtkImagingStatisticsJava.dylib");
        libraryList.add("libvtkImagingStencil-9.1.dylib");
        libraryList.add("libvtkFiltersHyperTree-9.1.dylib");
        libraryList.add("libvtkFiltersHyperTreeJava.dylib");
        libraryList.add("libvtkFiltersSMP-9.1.dylib");
        libraryList.add("libvtkFiltersSMPJava.dylib");
        libraryList.add("libvtkFiltersSources-9.1.dylib");
        libraryList.add("libvtkFiltersSourcesJava.dylib");
        libraryList.add("libvtkFiltersStatistics-9.1.dylib");
        libraryList.add("libvtkFiltersStatisticsJava.dylib");
        libraryList.add("libvtkFiltersTexture-9.1.dylib");
        libraryList.add("libvtkFiltersTextureJava.dylib");
        libraryList.add("libvtkIOExodus-9.1.dylib");
        libraryList.add("libvtkIOExodusJava.dylib");
        libraryList.add("libvtkIOLSDyna-9.1.dylib");
        libraryList.add("libvtkIOLSDynaJava.dylib");
        libraryList.add("libvtkIOSegY-9.1.dylib");
        libraryList.add("libvtkIOXML-9.1.dylib");
        libraryList.add("libvtkIOXMLJava.dylib");
        libraryList.add("libvtkImagingGeneral-9.1.dylib");
        libraryList.add("libvtkImagingGeneralJava.dylib");
        libraryList.add("libvtkImagingHybrid-9.1.dylib");
        libraryList.add("libvtkImagingHybridJava.dylib");
        libraryList.add("libvtkParallelCore-9.1.dylib");
        libraryList.add("libvtkParallelCoreJava.dylib");
        libraryList.add("libvtkFiltersAMR-9.1.dylib");
        libraryList.add("libvtkFiltersAMRJava.dylib");
        libraryList.add("libvtkFiltersGeneric-9.1.dylib");
        libraryList.add("libvtkFiltersGenericJava.dylib");
        libraryList.add("libvtkFiltersImaging-9.1.dylib");
        libraryList.add("libvtkFiltersImagingJava.dylib");
        libraryList.add("libvtkFiltersModeling-9.1.dylib");
        libraryList.add("libvtkFiltersModelingJava.dylib");
        libraryList.add("libvtkIOAsynchronous-9.1.dylib");
        libraryList.add("libvtkIOAsynchronousJava.dylib");
        libraryList.add("libvtkIOParallelXML-9.1.dylib");
        libraryList.add("libvtkIOParallelXMLJava.dylib");
        libraryList.add("libvtkImagingMorphological-9.1.dylib");
        libraryList.add("libvtkImagingMorphologicalJava.dylib");
        libraryList.add("libvtkParallelDIY-9.1.dylib");
        libraryList.add("libvtkRenderingCore-9.1.dylib");
        libraryList.add("libvtkRenderingCoreJava.dylib");
        libraryList.add("libvtkDomainsChemistry-9.1.dylib");
        libraryList.add("libvtkFiltersExtraction-9.1.dylib");
        libraryList.add("libvtkFiltersExtractionJava.dylib");
        libraryList.add("libvtkFiltersFlowPaths-9.1.dylib");
        libraryList.add("libvtkFiltersFlowPathsJava.dylib");
        libraryList.add("libvtkFiltersHybrid-9.1.dylib");
        libraryList.add("libvtkFiltersHybridJava.dylib");
        libraryList.add("libvtkFiltersPoints-9.1.dylib");
        libraryList.add("libvtkFiltersPointsJava.dylib");
        libraryList.add("libvtkIOAMR-9.1.dylib");
        libraryList.add("libvtkIOCityGML-9.1.dylib");
        libraryList.add("libvtkIOCityGMLJava.dylib");
        libraryList.add("libvtkRenderingFreeType-9.1.dylib");
        libraryList.add("libvtkRenderingFreeTypeJava.dylib");
        libraryList.add("libvtkRenderingImage-9.1.dylib");
        libraryList.add("libvtkRenderingImageJava.dylib");
        libraryList.add("libvtkRenderingLOD-9.1.dylib");
        libraryList.add("libvtkRenderingSceneGraph-9.1.dylib");
        libraryList.add("libvtkRenderingSceneGraphJava.dylib");
        libraryList.add("libvtkRenderingUI-9.1.dylib");
        libraryList.add("libvtkRenderingUIJava.dylib");
        libraryList.add("libvtkRenderingVolume-9.1.dylib");
        libraryList.add("libvtkRenderingVolumeJava.dylib");
        libraryList.add("libvtkTestingRendering-9.1.dylib");
        libraryList.add("libvtkFiltersParallel-9.1.dylib");
        libraryList.add("libvtkFiltersParallelJava.dylib");
        libraryList.add("libvtkIOCGNSReader-9.1.dylib");
        libraryList.add("libvtkIOChemistry-9.1.dylib");
        libraryList.add("libvtkIOChemistryJava.dylib");
        libraryList.add("libvtkIOGeometry-9.1.dylib");
        libraryList.add("libvtkIOGeometryJava.dylib");
        libraryList.add("libvtkIOIOSS-9.1.dylib");
        libraryList.add("libvtkIOIOSSJava.dylib");
        libraryList.add("libvtkIOMINC-9.1.dylib");
        libraryList.add("libvtkInfovisCore-9.1.dylib");
        libraryList.add("libvtkInfovisCoreJava.dylib");
        libraryList.add("libvtkInteractionStyle-9.1.dylib");
        libraryList.add("libvtkInteractionStyleJava.dylib");
        libraryList.add("libvtkRenderingAnnotation-9.1.dylib");
        libraryList.add("libvtkRenderingAnnotationJava.dylib");
        libraryList.add("libvtkRenderingContext2D-9.1.dylib");
        libraryList.add("libvtkRenderingContext2DJava.dylib");
        libraryList.add("libvtkRenderingLabel-9.1.dylib");
        libraryList.add("libvtkRenderingLabelJava.dylib");
        libraryList.add("libvtkRenderingOpenGL2-9.1.dylib");
        libraryList.add("libvtkRenderingOpenGL2Java.dylib");
        libraryList.add("libvtkChartsCore-9.1.dylib");
        libraryList.add("libvtkDomainsChemistryOpenGL2-9.1.dylib");
        libraryList.add("libvtkFiltersParallelImaging-9.1.dylib");
        libraryList.add("libvtkFiltersParallelImagingJava.dylib");
        libraryList.add("libvtkIOImport-9.1.dylib");
        libraryList.add("libvtkIOInfovis-9.1.dylib");
        libraryList.add("libvtkIOMotionFX-9.1.dylib");
        libraryList.add("libvtkIOParallel-9.1.dylib");
        libraryList.add("libvtkInfovisLayout-9.1.dylib");
        libraryList.add("libvtkInteractionWidgets-9.1.dylib");
        libraryList.add("libvtkInteractionWidgetsJava.dylib");
        libraryList.add("libvtkRenderingContextOpenGL2-9.1.dylib");
        libraryList.add("libvtkRenderingContextOpenGL2Java.dylib");
        libraryList.add("libvtkRenderingGL2PSOpenGL2-9.1.dylib");
        libraryList.add("libvtkRenderingVolumeOpenGL2-9.1.dylib");
        libraryList.add("libvtkRenderingVolumeOpenGL2Java.dylib");
        libraryList.add("libvtkRenderingVtkJS-9.1.dylib");
        libraryList.add("libvtkRenderingVtkJSJava.dylib");
        libraryList.add("libvtkIOExport-9.1.dylib");
        libraryList.add("libvtkIOExportJava.dylib");
        libraryList.add("libvtkInteractionImage-9.1.dylib");
        libraryList.add("libvtkInteractionImageJava.dylib");
        libraryList.add("libvtkViewsCore-9.1.dylib");
        libraryList.add("libvtkViewsCoreJava.dylib");
        libraryList.add("libvtkGeovisCore-9.1.dylib");
        libraryList.add("libvtkGeovisCoreJava.dylib");
        libraryList.add("libvtkIOExportGL2PS-9.1.dylib");
        libraryList.add("libvtkIOExportPDF-9.1.dylib");
        libraryList.add("libvtkIOExportPDFJava.dylib");
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
        list.add(Platform.PLATFORM_MAC64);
        return list;
    }
}

