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
public class VtkNativeLibrariesImplLinux implements VtkNativeLibrariesImpl {

    public VtkNativeLibrariesImplLinux() {
    }

    public String getName() {
        return "VtkNativeLibrariesLinux";
    }


    public String getVersion() {
        return "9.1";
    }

    public List<URL> getVtkLibraries() {
        List<String> libraryList = new LinkedList<>();
        libraryList.add("libvtkDICOMParser-9.1.so");
        libraryList.add("libvtkdoubleconversion-9.1.so");
        libraryList.add("libvtkexpat-9.1.so");
        libraryList.add("libvtkfmt-9.1.so");
        libraryList.add("libvtkglew-9.1.so");
        libraryList.add("libvtkjpeg-9.1.so");
        libraryList.add("libvtkjsoncpp-9.1.so");
        libraryList.add("libvtkkissfft-9.1.so");
        libraryList.add("libvtklibproj-9.1.so");
        libraryList.add("libvtkloguru-9.1.so");
        libraryList.add("libvtklz4-9.1.so");
        libraryList.add("libvtklzma-9.1.so");
        libraryList.add("libvtkogg-9.1.so");
        libraryList.add("libvtkpugixml-9.1.so");
        libraryList.add("libvtksqlite-9.1.so");
        libraryList.add("libvtksys-9.1.so");
        libraryList.add("libvtkverdict-9.1.so");
        libraryList.add("libvtkzlib-9.1.so");
        libraryList.add("libvtkCommonCore-9.1.so");
        libraryList.add("libvtkfreetype-9.1.so");
        libraryList.add("libvtkhdf5-9.1.so");
        libraryList.add("libvtklibxml2-9.1.so");
        libraryList.add("libvtkmetaio-9.1.so");
        libraryList.add("libvtkpng-9.1.so");
        libraryList.add("libvtktheora-9.1.so");
        libraryList.add("libvtktiff-9.1.so");
        libraryList.add("libvtkCommonColor-9.1.so");
        libraryList.add("libvtkCommonMath-9.1.so");
        libraryList.add("libvtkCommonMisc-9.1.so");
        libraryList.add("libvtkCommonSystem-9.1.so");
        libraryList.add("libvtkJava-9.1.so");
        libraryList.add("libvtkcgns-9.1.so");
        libraryList.add("libvtkgl2ps-9.1.so");
        libraryList.add("libvtkhdf5_hl-9.1.so");
        libraryList.add("libvtklibharu-9.1.so");
        libraryList.add("libvtkCommonCoreJava.so");
        libraryList.add("libvtkCommonTransforms-9.1.so");
        libraryList.add("libvtknetcdf-9.1.so");
        libraryList.add("libvtkCommonColorJava.so");
        libraryList.add("libvtkCommonDataModel-9.1.so");
        libraryList.add("libvtkCommonMathJava.so");
        libraryList.add("libvtkCommonMiscJava.so");
        libraryList.add("libvtkCommonSystemJava.so");
        libraryList.add("libvtkCommonTransformsJava.so");
        libraryList.add("libvtkexodusII-9.1.so");
        libraryList.add("libvtkCommonComputationalGeometry-9.1.so");
        libraryList.add("libvtkCommonDataModelJava.so");
        libraryList.add("libvtkCommonExecutionModel-9.1.so");
        libraryList.add("libvtkioss-9.1.so");
        libraryList.add("libvtkCommonComputationalGeometryJava.so");
        libraryList.add("libvtkCommonExecutionModelJava.so");
        libraryList.add("libvtkFiltersCore-9.1.so");
        libraryList.add("libvtkFiltersProgrammable-9.1.so");
        libraryList.add("libvtkFiltersSelection-9.1.so");
        libraryList.add("libvtkFiltersTopology-9.1.so");
        libraryList.add("libvtkFiltersVerdict-9.1.so");
        libraryList.add("libvtkIOCONVERGECFD-9.1.so");
        libraryList.add("libvtkIOCore-9.1.so");
        libraryList.add("libvtkIOEnSight-9.1.so");
        libraryList.add("libvtkIOMovie-9.1.so");
        libraryList.add("libvtkIONetCDF-9.1.so");
        libraryList.add("libvtkIOSegY-9.1.so");
        libraryList.add("libvtkIOVeraOut-9.1.so");
        libraryList.add("libvtkIOVideo-9.1.so");
        libraryList.add("libvtkImagingCore-9.1.so");
        libraryList.add("libvtkImagingMath-9.1.so");
        libraryList.add("libvtkFiltersCoreJava.so");
        libraryList.add("libvtkFiltersGeneral-9.1.so");
        libraryList.add("libvtkFiltersGeometry-9.1.so");
        libraryList.add("libvtkFiltersHyperTree-9.1.so");
        libraryList.add("libvtkFiltersProgrammableJava.so");
        libraryList.add("libvtkFiltersSMP-9.1.so");
        libraryList.add("libvtkFiltersSelectionJava.so");
        libraryList.add("libvtkFiltersTopologyJava.so");
        libraryList.add("libvtkFiltersVerdictJava.so");
        libraryList.add("libvtkIOCONVERGECFDJava.so");
        libraryList.add("libvtkIOCoreJava.so");
        libraryList.add("libvtkIOEnSightJava.so");
        libraryList.add("libvtkIOHDF-9.1.so");
        libraryList.add("libvtkIOImage-9.1.so");
        libraryList.add("libvtkIOLegacy-9.1.so");
        libraryList.add("libvtkIOMovieJava.so");
        libraryList.add("libvtkIONetCDFJava.so");
        libraryList.add("libvtkIOOggTheora-9.1.so");
        libraryList.add("libvtkIOPLY-9.1.so");
        libraryList.add("libvtkIOSQL-9.1.so");
        libraryList.add("libvtkIOSegYJava.so");
        libraryList.add("libvtkIOTecplotTable-9.1.so");
        libraryList.add("libvtkIOVeraOutJava.so");
        libraryList.add("libvtkIOVideoJava.so");
        libraryList.add("libvtkIOXMLParser-9.1.so");
        libraryList.add("libvtkImagingColor-9.1.so");
        libraryList.add("libvtkImagingCoreJava.so");
        libraryList.add("libvtkImagingFourier-9.1.so");
        libraryList.add("libvtkImagingHybrid-9.1.so");
        libraryList.add("libvtkImagingMathJava.so");
        libraryList.add("libvtkImagingSources-9.1.so");
        libraryList.add("libvtkImagingStatistics-9.1.so");
        libraryList.add("libvtkImagingStencil-9.1.so");
        libraryList.add("libvtkFiltersGeneralJava.so");
        libraryList.add("libvtkFiltersGeometryJava.so");
        libraryList.add("libvtkFiltersHyperTreeJava.so");
        libraryList.add("libvtkFiltersSMPJava.so");
        libraryList.add("libvtkFiltersSources-9.1.so");
        libraryList.add("libvtkFiltersStatistics-9.1.so");
        libraryList.add("libvtkFiltersTexture-9.1.so");
        libraryList.add("libvtkIOCityGML-9.1.so");
        libraryList.add("libvtkIOExodus-9.1.so");
        libraryList.add("libvtkIOHDFJava.so");
        libraryList.add("libvtkIOImageJava.so");
        libraryList.add("libvtkIOLSDyna-9.1.so");
        libraryList.add("libvtkIOLegacyJava.so");
        libraryList.add("libvtkIOOggTheoraJava.so");
        libraryList.add("libvtkIOPLYJava.so");
        libraryList.add("libvtkIOSQLJava.so");
        libraryList.add("libvtkIOTecplotTableJava.so");
        libraryList.add("libvtkIOXML-9.1.so");
        libraryList.add("libvtkIOXMLParserJava.so");
        libraryList.add("libvtkImagingColorJava.so");
        libraryList.add("libvtkImagingFourierJava.so");
        libraryList.add("libvtkImagingGeneral-9.1.so");
        libraryList.add("libvtkImagingHybridJava.so");
        libraryList.add("libvtkImagingSourcesJava.so");
        libraryList.add("libvtkImagingStatisticsJava.so");
        libraryList.add("libvtkImagingStencilJava.so");
        libraryList.add("libvtkParallelCore-9.1.so");
        libraryList.add("libvtkFiltersAMR-9.1.so");
        libraryList.add("libvtkFiltersGeneric-9.1.so");
        libraryList.add("libvtkFiltersImaging-9.1.so");
        libraryList.add("libvtkFiltersModeling-9.1.so");
        libraryList.add("libvtkFiltersSourcesJava.so");
        libraryList.add("libvtkFiltersStatisticsJava.so");
        libraryList.add("libvtkFiltersTextureJava.so");
        libraryList.add("libvtkIOAsynchronous-9.1.so");
        libraryList.add("libvtkIOCityGMLJava.so");
        libraryList.add("libvtkIOExodusJava.so");
        libraryList.add("libvtkIOLSDynaJava.so");
        libraryList.add("libvtkIOParallelXML-9.1.so");
        libraryList.add("libvtkIOXMLJava.so");
        libraryList.add("libvtkImagingGeneralJava.so");
        libraryList.add("libvtkImagingMorphological-9.1.so");
        libraryList.add("libvtkParallelCoreJava.so");
        libraryList.add("libvtkParallelDIY-9.1.so");
        libraryList.add("libvtkRenderingCore-9.1.so");
        libraryList.add("libvtkDomainsChemistry-9.1.so");
        libraryList.add("libvtkFiltersAMRJava.so");
        libraryList.add("libvtkFiltersExtraction-9.1.so");
        libraryList.add("libvtkFiltersFlowPaths-9.1.so");
        libraryList.add("libvtkFiltersGenericJava.so");
        libraryList.add("libvtkFiltersHybrid-9.1.so");
        libraryList.add("libvtkFiltersImagingJava.so");
        libraryList.add("libvtkFiltersModelingJava.so");
        libraryList.add("libvtkFiltersPoints-9.1.so");
        libraryList.add("libvtkIOAMR-9.1.so");
        libraryList.add("libvtkIOAsynchronousJava.so");
        libraryList.add("libvtkIOParallelXMLJava.so");
        libraryList.add("libvtkImagingMorphologicalJava.so");
        libraryList.add("libvtkRenderingCoreJava.so");
        libraryList.add("libvtkRenderingFreeType-9.1.so");
        libraryList.add("libvtkRenderingImage-9.1.so");
        libraryList.add("libvtkRenderingLOD-9.1.so");
        libraryList.add("libvtkRenderingSceneGraph-9.1.so");
        libraryList.add("libvtkRenderingUI-9.1.so");
        libraryList.add("libvtkRenderingVolume-9.1.so");
        libraryList.add("libvtkTestingRendering-9.1.so");
        libraryList.add("libvtkDomainsChemistryJava.so");
        libraryList.add("libvtkFiltersExtractionJava.so");
        libraryList.add("libvtkFiltersFlowPathsJava.so");
        libraryList.add("libvtkFiltersHybridJava.so");
        libraryList.add("libvtkFiltersParallel-9.1.so");
        libraryList.add("libvtkFiltersPointsJava.so");
        libraryList.add("libvtkIOAMRJava.so");
        libraryList.add("libvtkIOCGNSReader-9.1.so");
        libraryList.add("libvtkIOChemistry-9.1.so");
        libraryList.add("libvtkIOGeometry-9.1.so");
        libraryList.add("libvtkIOIOSS-9.1.so");
        libraryList.add("libvtkIOMINC-9.1.so");
        libraryList.add("libvtkInfovisCore-9.1.so");
        libraryList.add("libvtkInteractionStyle-9.1.so");
        libraryList.add("libvtkRenderingAnnotation-9.1.so");
        libraryList.add("libvtkRenderingContext2D-9.1.so");
        libraryList.add("libvtkRenderingFreeTypeJava.so");
        libraryList.add("libvtkRenderingImageJava.so");
        libraryList.add("libvtkRenderingLODJava.so");
        libraryList.add("libvtkRenderingLabel-9.1.so");
        libraryList.add("libvtkRenderingOpenGL2-9.1.so");
        libraryList.add("libvtkRenderingSceneGraphJava.so");
        libraryList.add("libvtkRenderingUIJava.so");
        libraryList.add("libvtkRenderingVolumeJava.so");
        libraryList.add("libvtkTestingRenderingJava.so");
        libraryList.add("libvtkViewsCore-9.1.so");
        libraryList.add("libvtkChartsCore-9.1.so");
        libraryList.add("libvtkDomainsChemistryOpenGL2-9.1.so");
        libraryList.add("libvtkFiltersParallelImaging-9.1.so");
        libraryList.add("libvtkFiltersParallelJava.so");
        libraryList.add("libvtkIOCGNSReaderJava.so");
        libraryList.add("libvtkIOChemistryJava.so");
        libraryList.add("libvtkIOGeometryJava.so");
        libraryList.add("libvtkIOIOSSJava.so");
        libraryList.add("libvtkIOImport-9.1.so");
        libraryList.add("libvtkIOInfovis-9.1.so");
        libraryList.add("libvtkIOMINCJava.so");
        libraryList.add("libvtkIOMotionFX-9.1.so");
        libraryList.add("libvtkIOParallel-9.1.so");
        libraryList.add("libvtkInfovisCoreJava.so");
        libraryList.add("libvtkInfovisLayout-9.1.so");
        libraryList.add("libvtkInteractionStyleJava.so");
        libraryList.add("libvtkInteractionWidgets-9.1.so");
        libraryList.add("libvtkRenderingAnnotationJava.so");
        libraryList.add("libvtkRenderingContext2DJava.so");
        libraryList.add("libvtkRenderingContextOpenGL2-9.1.so");
        libraryList.add("libvtkRenderingGL2PSOpenGL2-9.1.so");
        libraryList.add("libvtkRenderingLabelJava.so");
        libraryList.add("libvtkRenderingOpenGL2Java.so");
        libraryList.add("libvtkRenderingVolumeOpenGL2-9.1.so");
        libraryList.add("libvtkRenderingVtkJS-9.1.so");
        libraryList.add("libvtkViewsContext2D-9.1.so");
        libraryList.add("libvtkViewsCoreJava.so");
        libraryList.add("libvtkChartsCoreJava.so");
        libraryList.add("libvtkDomainsChemistryOpenGL2Java.so");
        libraryList.add("libvtkFiltersParallelImagingJava.so");
        libraryList.add("libvtkGeovisCore-9.1.so");
        libraryList.add("libvtkIOExport-9.1.so");
        libraryList.add("libvtkIOImportJava.so");
        libraryList.add("libvtkIOInfovisJava.so");
        libraryList.add("libvtkIOMotionFXJava.so");
        libraryList.add("libvtkIOParallelJava.so");
        libraryList.add("libvtkInfovisLayoutJava.so");
        libraryList.add("libvtkInteractionImage-9.1.so");
        libraryList.add("libvtkInteractionWidgetsJava.so");
        libraryList.add("libvtkRenderingContextOpenGL2Java.so");
        libraryList.add("libvtkRenderingGL2PSOpenGL2Java.so");
        libraryList.add("libvtkRenderingVolumeOpenGL2Java.so");
        libraryList.add("libvtkRenderingVtkJSJava.so");
        libraryList.add("libvtkViewsContext2DJava.so");
        libraryList.add("libvtkViewsInfovis-9.1.so");
        libraryList.add("libvtkGeovisCoreJava.so");
        libraryList.add("libvtkIOExportGL2PS-9.1.so");
        libraryList.add("libvtkIOExportJava.so");
        libraryList.add("libvtkIOExportPDF-9.1.so");
        libraryList.add("libvtkInteractionImageJava.so");
        libraryList.add("libvtkViewsInfovisJava.so");
        libraryList.add("libvtkIOExportGL2PSJava.so");
        libraryList.add("libvtkIOExportPDFJava.so");

        Class clazz =  this.getClass();
        return libraryList
                .stream()
                .map(libraryName -> clazz.getResource(libraryName))
                .collect(Collectors.toList());
    }

    @Override
    public List<URL> getJoglLibraries() {
        List<String> libraryList = new LinkedList<>();

        libraryList.add("libgluegen_rt.so");
        libraryList.add("libnativewindow_awt.so");
        libraryList.add("libnativewindow_drm.so");
        libraryList.add("libnativewindow_x11.so");
        libraryList.add("libjogl_desktop.so");
        libraryList.add("libjogl_mobile.so");
        libraryList.add("libnewt_head.so");
        libraryList.add("libnewt_drm.so");

        Class clazz =  this.getClass();
        return libraryList
                .stream()
                .map(libraryName -> clazz.getResource(libraryName))
                .collect(Collectors.toList());
    }

    public List<String> getSupportedPlatforms() {
        List<String> list = new LinkedList<>();
        list.add(Platform.PLATFORM_LINUX64);
        return list;
    }
}

