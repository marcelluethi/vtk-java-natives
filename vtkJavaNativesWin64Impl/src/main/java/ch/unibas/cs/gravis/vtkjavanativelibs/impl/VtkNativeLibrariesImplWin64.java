package ch.unibas.cs.gravis.vtkjavanativelibs.impl;


import com.google.auto.service.AutoService;

import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import ch.unibas.cs.gravis.vtkjavanativelibs.VtkNativeLibrariesImpl;
import ch.unibas.cs.gravis.vtkjavanativelibs.Platform;

/**
  * Implementation of VtkNativeLibraries for Windows (64 bit)
  */ 
@AutoService(VtkNativeLibrariesImpl.class)
public class VtkNativeLibrariesImplWin64 implements VtkNativeLibrariesImpl {

    public VtkNativeLibrariesImplWin64() {}

    public String getName() {
        return "VtkNativeLibrariesWin64";
    }

    public String getVersion() {
        return "9.1";
    }

    public List<URL> getVtkLibraries() {
        List<String> libraryList = new LinkedList<>();
        libraryList.add("ucrtbased.dll");
        libraryList.add("VCRUNTIME140D.dll");
        libraryList.add("VCRUNTIME140_1D.dll");
        libraryList.add("MSVCP140D.dll");
        libraryList.add("vtkDICOMParser-9.1d.dll");
        libraryList.add("vtkdoubleconversion-9.1d.dll");
        libraryList.add("vtkexpat-9.1d.dll");
        libraryList.add("vtkfmt-9.1d.dll");
        libraryList.add("vtkglew-9.1d.dll");
        libraryList.add("vtkjpeg-9.1d.dll");
        libraryList.add("vtkjsoncpp-9.1d.dll");
        libraryList.add("vtkkissfft-9.1d.dll");
        libraryList.add("vtklibproj-9.1d.dll");
        libraryList.add("vtkloguru-9.1d.dll");
        libraryList.add("vtklz4-9.1d.dll");
        libraryList.add("vtklzma-9.1d.dll");
        libraryList.add("vtkogg-9.1d.dll");
        libraryList.add("vtkpugixml-9.1d.dll");
        libraryList.add("vtksqlite-9.1d.dll");
        libraryList.add("vtksys-9.1d.dll");
        libraryList.add("vtkverdict-9.1d.dll");
        libraryList.add("vtkzlib-9.1d.dll");
        libraryList.add("vtkCommonCore-9.1d.dll");
        libraryList.add("vtkfreetype-9.1d.dll");
        libraryList.add("vtkhdf5-9.1d.dll");
        libraryList.add("vtklibxml2-9.1d.dll");
        libraryList.add("vtkmetaio-9.1d.dll");
        libraryList.add("vtkpng-9.1d.dll");
        libraryList.add("vtktheora-9.1d.dll");
        libraryList.add("vtktiff-9.1d.dll");
        libraryList.add("vtkCommonColor-9.1d.dll");
        libraryList.add("vtkCommonMath-9.1d.dll");
        libraryList.add("vtkCommonMisc-9.1d.dll");
        libraryList.add("vtkCommonSystem-9.1d.dll");
        libraryList.add("vtkJava-9.1d.dll");
        libraryList.add("vtkcgns-9.1d.dll");
        libraryList.add("vtkgl2ps-9.1d.dll");
        libraryList.add("vtkhdf5_hl-9.1d.dll");
        libraryList.add("vtklibharu-9.1d.dll");
        libraryList.add("vtkCommonCoreJava.dll");
        libraryList.add("vtkCommonTransforms-9.1d.dll");
        libraryList.add("vtknetcdf-9.1d.dll");
        libraryList.add("vtkCommonColorJava.dll");
        libraryList.add("vtkCommonDataModel-9.1d.dll");
        libraryList.add("vtkCommonMathJava.dll");
        libraryList.add("vtkCommonMiscJava.dll");
        libraryList.add("vtkCommonSystemJava.dll");
        libraryList.add("vtkCommonTransformsJava.dll");
        libraryList.add("vtkexodusII-9.1d.dll");
        libraryList.add("vtkCommonComputationalGeometry-9.1d.dll");
        libraryList.add("vtkCommonDataModelJava.dll");
        libraryList.add("vtkCommonExecutionModel-9.1d.dll");
        libraryList.add("vtkioss-9.1d.dll");
        libraryList.add("vtkCommonComputationalGeometryJava.dll");
        libraryList.add("vtkCommonExecutionModelJava.dll");
        libraryList.add("vtkFiltersCore-9.1d.dll");
        libraryList.add("vtkFiltersProgrammable-9.1d.dll");
        libraryList.add("vtkFiltersSelection-9.1d.dll");
        libraryList.add("vtkFiltersTopology-9.1d.dll");
        libraryList.add("vtkFiltersVerdict-9.1d.dll");
        libraryList.add("vtkIOCONVERGECFD-9.1d.dll");
        libraryList.add("vtkIOCore-9.1d.dll");
        libraryList.add("vtkIOEnSight-9.1d.dll");
        libraryList.add("vtkIOMovie-9.1d.dll");
        libraryList.add("vtkIONetCDF-9.1d.dll");
        libraryList.add("vtkIOSegY-9.1d.dll");
        libraryList.add("vtkIOVeraOut-9.1d.dll");
        libraryList.add("vtkIOVideo-9.1d.dll");
        libraryList.add("vtkImagingCore-9.1d.dll");
        libraryList.add("vtkImagingMath-9.1d.dll");
        libraryList.add("vtkFiltersCoreJava.dll");
        libraryList.add("vtkFiltersGeneral-9.1d.dll");
        libraryList.add("vtkFiltersGeometry-9.1d.dll");
        libraryList.add("vtkFiltersHyperTree-9.1d.dll");
        libraryList.add("vtkFiltersProgrammableJava.dll");
        libraryList.add("vtkFiltersSMP-9.1d.dll");
        libraryList.add("vtkFiltersSelectionJava.dll");
        libraryList.add("vtkFiltersTopologyJava.dll");
        libraryList.add("vtkFiltersVerdictJava.dll");
        libraryList.add("vtkIOCONVERGECFDJava.dll");
        libraryList.add("vtkIOCoreJava.dll");
        libraryList.add("vtkIOEnSightJava.dll");
        libraryList.add("vtkIOHDF-9.1d.dll");
        libraryList.add("vtkIOImage-9.1d.dll");
        libraryList.add("vtkIOLegacy-9.1d.dll");
        libraryList.add("vtkIOMovieJava.dll");
        libraryList.add("vtkIONetCDFJava.dll");
        libraryList.add("vtkIOOggTheora-9.1d.dll");
        libraryList.add("vtkIOPLY-9.1d.dll");
        libraryList.add("vtkIOSQL-9.1d.dll");
        libraryList.add("vtkIOSegYJava.dll");
        libraryList.add("vtkIOTecplotTable-9.1d.dll");
        libraryList.add("vtkIOVeraOutJava.dll");
        libraryList.add("vtkIOVideoJava.dll");
        libraryList.add("vtkIOXMLParser-9.1d.dll");
        libraryList.add("vtkImagingColor-9.1d.dll");
        libraryList.add("vtkImagingCoreJava.dll");
        libraryList.add("vtkImagingFourier-9.1d.dll");
        libraryList.add("vtkImagingHybrid-9.1d.dll");
        libraryList.add("vtkImagingMathJava.dll");
        libraryList.add("vtkImagingSources-9.1d.dll");
        libraryList.add("vtkImagingStatistics-9.1d.dll");
        libraryList.add("vtkImagingStencil-9.1d.dll");
        libraryList.add("vtkFiltersGeneralJava.dll");
        libraryList.add("vtkFiltersGeometryJava.dll");
        libraryList.add("vtkFiltersHyperTreeJava.dll");
        libraryList.add("vtkFiltersSMPJava.dll");
        libraryList.add("vtkFiltersSources-9.1d.dll");
        libraryList.add("vtkFiltersStatistics-9.1d.dll");
        libraryList.add("vtkFiltersTexture-9.1d.dll");
        libraryList.add("vtkIOCityGML-9.1d.dll");
        libraryList.add("vtkIOExodus-9.1d.dll");
        libraryList.add("vtkIOHDFJava.dll");
        libraryList.add("vtkIOImageJava.dll");
        libraryList.add("vtkIOLSDyna-9.1d.dll");
        libraryList.add("vtkIOLegacyJava.dll");
        libraryList.add("vtkIOOggTheoraJava.dll");
        libraryList.add("vtkIOPLYJava.dll");
        libraryList.add("vtkIOSQLJava.dll");
        libraryList.add("vtkIOTecplotTableJava.dll");
        libraryList.add("vtkIOXML-9.1d.dll");
        libraryList.add("vtkIOXMLParserJava.dll");
        libraryList.add("vtkImagingColorJava.dll");
        libraryList.add("vtkImagingFourierJava.dll");
        libraryList.add("vtkImagingGeneral-9.1d.dll");
        libraryList.add("vtkImagingHybridJava.dll");
        libraryList.add("vtkImagingSourcesJava.dll");
        libraryList.add("vtkImagingStatisticsJava.dll");
        libraryList.add("vtkImagingStencilJava.dll");
        libraryList.add("vtkParallelCore-9.1d.dll");
        libraryList.add("vtkFiltersAMR-9.1d.dll");
        libraryList.add("vtkFiltersGeneric-9.1d.dll");
        libraryList.add("vtkFiltersImaging-9.1d.dll");
        libraryList.add("vtkFiltersModeling-9.1d.dll");
        libraryList.add("vtkFiltersSourcesJava.dll");
        libraryList.add("vtkFiltersStatisticsJava.dll");
        libraryList.add("vtkFiltersTextureJava.dll");
        libraryList.add("vtkIOAsynchronous-9.1d.dll");
        libraryList.add("vtkIOCityGMLJava.dll");
        libraryList.add("vtkIOExodusJava.dll");
        libraryList.add("vtkIOLSDynaJava.dll");
        libraryList.add("vtkIOParallelXML-9.1d.dll");
        libraryList.add("vtkIOXMLJava.dll");
        libraryList.add("vtkImagingGeneralJava.dll");
        libraryList.add("vtkImagingMorphological-9.1d.dll");
        libraryList.add("vtkParallelCoreJava.dll");
        libraryList.add("vtkParallelDIY-9.1d.dll");
        libraryList.add("vtkRenderingCore-9.1d.dll");
        libraryList.add("vtkDomainsChemistry-9.1d.dll");
        libraryList.add("vtkFiltersAMRJava.dll");
        libraryList.add("vtkFiltersExtraction-9.1d.dll");
        libraryList.add("vtkFiltersFlowPaths-9.1d.dll");
        libraryList.add("vtkFiltersGenericJava.dll");
        libraryList.add("vtkFiltersHybrid-9.1d.dll");
        libraryList.add("vtkFiltersImagingJava.dll");
        libraryList.add("vtkFiltersModelingJava.dll");
        libraryList.add("vtkFiltersPoints-9.1d.dll");
        libraryList.add("vtkIOAMR-9.1d.dll");
        libraryList.add("vtkIOAsynchronousJava.dll");
        libraryList.add("vtkIOParallelXMLJava.dll");
        libraryList.add("vtkImagingMorphologicalJava.dll");
        libraryList.add("vtkRenderingCoreJava.dll");
        libraryList.add("vtkRenderingFreeType-9.1d.dll");
        libraryList.add("vtkRenderingImage-9.1d.dll");
        libraryList.add("vtkRenderingLOD-9.1d.dll");
        libraryList.add("vtkRenderingSceneGraph-9.1d.dll");
        libraryList.add("vtkRenderingUI-9.1d.dll");
        libraryList.add("vtkRenderingVolume-9.1d.dll");
        libraryList.add("vtkTestingRendering-9.1d.dll");
        libraryList.add("vtkDomainsChemistryJava.dll");
        libraryList.add("vtkFiltersExtractionJava.dll");
        libraryList.add("vtkFiltersFlowPathsJava.dll");
        libraryList.add("vtkFiltersHybridJava.dll");
        libraryList.add("vtkFiltersParallel-9.1d.dll");
        libraryList.add("vtkFiltersPointsJava.dll");
        libraryList.add("vtkIOAMRJava.dll");
        libraryList.add("vtkIOCGNSReader-9.1d.dll");
        libraryList.add("vtkIOChemistry-9.1d.dll");
        libraryList.add("vtkIOGeometry-9.1d.dll");
        libraryList.add("vtkIOIOSS-9.1d.dll");
        libraryList.add("vtkIOMINC-9.1d.dll");
        libraryList.add("vtkInfovisCore-9.1d.dll");
        libraryList.add("vtkInteractionStyle-9.1d.dll");
        libraryList.add("vtkRenderingAnnotation-9.1d.dll");
        libraryList.add("vtkRenderingContext2D-9.1d.dll");
        libraryList.add("vtkRenderingFreeTypeJava.dll");
        libraryList.add("vtkRenderingImageJava.dll");
        libraryList.add("vtkRenderingLODJava.dll");
        libraryList.add("vtkRenderingLabel-9.1d.dll");
        libraryList.add("vtkRenderingOpenGL2-9.1d.dll");
        libraryList.add("vtkRenderingSceneGraphJava.dll");
        libraryList.add("vtkRenderingUIJava.dll");
        libraryList.add("vtkRenderingVolumeJava.dll");
        libraryList.add("vtkTestingRenderingJava.dll");
        libraryList.add("vtkViewsCore-9.1d.dll");
        libraryList.add("vtkChartsCore-9.1d.dll");
        libraryList.add("vtkDomainsChemistryOpenGL2-9.1d.dll");
        libraryList.add("vtkFiltersParallelImaging-9.1d.dll");
        libraryList.add("vtkFiltersParallelJava.dll");
        libraryList.add("vtkIOCGNSReaderJava.dll");
        libraryList.add("vtkIOChemistryJava.dll");
        libraryList.add("vtkIOGeometryJava.dll");
        libraryList.add("vtkIOIOSSJava.dll");
        libraryList.add("vtkIOImport-9.1d.dll");
        libraryList.add("vtkIOInfovis-9.1d.dll");
        libraryList.add("vtkIOMINCJava.dll");
        libraryList.add("vtkIOMotionFX-9.1d.dll");
        libraryList.add("vtkIOParallel-9.1d.dll");
        libraryList.add("vtkInfovisCoreJava.dll");
        libraryList.add("vtkInfovisLayout-9.1d.dll");
        libraryList.add("vtkInteractionStyleJava.dll");
        libraryList.add("vtkInteractionWidgets-9.1d.dll");
        libraryList.add("vtkRenderingAnnotationJava.dll");
        libraryList.add("vtkRenderingContext2DJava.dll");
        libraryList.add("vtkRenderingContextOpenGL2-9.1d.dll");
        libraryList.add("vtkRenderingGL2PSOpenGL2-9.1d.dll");
        libraryList.add("vtkRenderingLabelJava.dll");
        libraryList.add("vtkRenderingOpenGL2Java.dll");
        libraryList.add("vtkRenderingVolumeOpenGL2-9.1d.dll");
        libraryList.add("vtkRenderingVtkJS-9.1d.dll");
        libraryList.add("vtkViewsContext2D-9.1d.dll");
        libraryList.add("vtkViewsCoreJava.dll");
        libraryList.add("vtkChartsCoreJava.dll");
        libraryList.add("vtkDomainsChemistryOpenGL2Java.dll");
        libraryList.add("vtkFiltersParallelImagingJava.dll");
        libraryList.add("vtkGeovisCore-9.1d.dll");
        libraryList.add("vtkIOExport-9.1d.dll");
        libraryList.add("vtkIOImportJava.dll");
        libraryList.add("vtkIOInfovisJava.dll");
        libraryList.add("vtkIOMotionFXJava.dll");
        libraryList.add("vtkIOParallelJava.dll");
        libraryList.add("vtkInfovisLayoutJava.dll");
        libraryList.add("vtkInteractionImage-9.1d.dll");
        libraryList.add("vtkInteractionWidgetsJava.dll");
        libraryList.add("vtkRenderingContextOpenGL2Java.dll");
        libraryList.add("vtkRenderingGL2PSOpenGL2Java.dll");
        libraryList.add("vtkRenderingVolumeOpenGL2Java.dll");
        libraryList.add("vtkRenderingVtkJSJava.dll");
        libraryList.add("vtkViewsContext2DJava.dll");
        libraryList.add("vtkViewsInfovis-9.1d.dll");
        libraryList.add("vtkGeovisCoreJava.dll");
        libraryList.add("vtkIOExportGL2PS-9.1d.dll");
        libraryList.add("vtkIOExportJava.dll");
        libraryList.add("vtkIOExportPDF-9.1d.dll");
        libraryList.add("vtkInteractionImageJava.dll");
        libraryList.add("vtkViewsInfovisJava.dll");
        libraryList.add("vtkIOExportGL2PSJava.dll");
        libraryList.add("vtkIOExportPDFJava.dll");

        Class clazz =  this.getClass();
        return libraryList
                .stream()
                .map(libraryName -> clazz.getResource(libraryName))
                .collect(Collectors.toList());
    }

    @Override
    public List<URL> getJoglLibraries() {
        List<String> libraryList = new LinkedList<>();

        libraryList.add("gluegen_rt.dll");
        libraryList.add("nativewindow_awt.dll");
        libraryList.add("nativewindow_win32.dll");
        libraryList.add("jogl_desktop.dll");
        libraryList.add("jogl_mobile.dll");
        libraryList.add("newt_head.dll");

        Class clazz =  this.getClass();
        return libraryList
                .stream()
                .map(libraryName -> clazz.getResource(libraryName))
                .collect(Collectors.toList());
    }


    public List<String> getSupportedPlatforms() {
        List<String> list = new LinkedList<>();
        list.add(Platform.PLATFORM_WIN64);
        return list;
    }


}
