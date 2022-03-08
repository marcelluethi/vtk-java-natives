package vtkjava.impl;

import javax.annotation.processing.Processor;
import com.google.auto.service.AutoService;
import java.util.List;
import vtkjava.VtkNativeLibrariesImpl;
import vtkjava.Platform;

/**
  * Implementation of VtkNativeLibraries for Windows (64 bit)
  */ 
@AutoService(VtkNativeLibrariesImpl.class)
public class VtkNativeLibrariesImplWin64 extends VtkNativeLibrariesImpl {

    public VtkNativeLibrariesImplWin64() {}

    @Override
    public String getName() {
        return "VtkNativeLibrariesWin64";
    }

    @Override
    public String getVersion() {
        return "9.1";
    }

    @Override
    protected void getLibraryNamesInto(List<String> list) {
        list.add("ucrtbased");
        list.add("VCRUNTIME140D");
        list.add("VCRUNTIME140_1D");
        list.add("MSVCP140D");
        list.add("vtkDICOMParser-9.1");
        list.add("vtkdoubleconversion-9.1");
        list.add("vtkexpat-9.1");
        list.add("vtkfmt-9.1");
        list.add("vtkglew-9.1");
        list.add("vtkjpeg-9.1");
        list.add("vtkjsoncpp-9.1");
        list.add("vtkkissfft-9.1");
        list.add("vtklibproj-9.1");
        list.add("vtkloguru-9.1");
        list.add("vtklz4-9.1");
        list.add("vtklzma-9.1");
        list.add("vtkogg-9.1");
        list.add("vtkpugixml-9.1");
        list.add("vtksqlite-9.1");
        list.add("vtksys-9.1");
        list.add("vtkverdict-9.1");
        list.add("vtkzlib-9.1");
        list.add("vtkCommonCore-9.1");
        list.add("vtkfreetype-9.1");
        list.add("vtkhdf5-9.1");
        list.add("vtklibxml2-9.1");
        list.add("vtkmetaio-9.1");
        list.add("vtkpng-9.1");
        list.add("vtktheora-9.1");
        list.add("vtktiff-9.1");
        list.add("vtkCommonColor-9.1");
        list.add("vtkCommonMath-9.1");
        list.add("vtkCommonMisc-9.1");
        list.add("vtkCommonSystem-9.1");
        list.add("vtkJava-9.1");
        list.add("vtkcgns-9.1");
        list.add("vtkgl2ps-9.1");
        list.add("vtkhdf5_hl-9.1");
        list.add("vtklibharu-9.1");
        list.add("vtkCommonCoreJava");
        list.add("vtkCommonTransforms-9.1");
        list.add("vtknetcdf-9.1");
        list.add("vtkCommonColorJava");
        list.add("vtkCommonDataModel-9.1");
        list.add("vtkCommonMathJava");
        list.add("vtkCommonMiscJava");
        list.add("vtkCommonSystemJava");
        list.add("vtkCommonTransformsJava");
        list.add("vtkexodusII-9.1");
        list.add("vtkCommonComputationalGeometry-9.1");
        list.add("vtkCommonDataModelJava");
        list.add("vtkCommonExecutionModel-9.1");
        list.add("vtkioss-9.1");
        list.add("vtkCommonComputationalGeometryJava");
        list.add("vtkCommonExecutionModelJava");
        list.add("vtkFiltersCore-9.1");
        list.add("vtkFiltersProgrammable-9.1");
        list.add("vtkFiltersSelection-9.1");
        list.add("vtkFiltersTopology-9.1");
        list.add("vtkFiltersVerdict-9.1");
        list.add("vtkIOCONVERGECFD-9.1");
        list.add("vtkIOCore-9.1");
        list.add("vtkIOEnSight-9.1");
        list.add("vtkIOMovie-9.1");
        list.add("vtkIONetCDF-9.1");
        list.add("vtkIOSegY-9.1");
        list.add("vtkIOVeraOut-9.1");
        list.add("vtkIOVideo-9.1");
        list.add("vtkImagingCore-9.1");
        list.add("vtkImagingMath-9.1");
        list.add("vtkFiltersCoreJava");
        list.add("vtkFiltersGeneral-9.1");
        list.add("vtkFiltersGeometry-9.1");
        list.add("vtkFiltersHyperTree-9.1");
        list.add("vtkFiltersProgrammableJava");
        list.add("vtkFiltersSMP-9.1");
        list.add("vtkFiltersSelectionJava");
        list.add("vtkFiltersTopologyJava");
        list.add("vtkFiltersVerdictJava");
        list.add("vtkIOCONVERGECFDJava");
        list.add("vtkIOCoreJava");
        list.add("vtkIOEnSightJava");
        list.add("vtkIOHDF-9.1");
        list.add("vtkIOImage-9.1");
        list.add("vtkIOLegacy-9.1");
        list.add("vtkIOMovieJava");
        list.add("vtkIONetCDFJava");
        list.add("vtkIOOggTheora-9.1");
        list.add("vtkIOPLY-9.1");
        list.add("vtkIOSQL-9.1");
        list.add("vtkIOSegYJava");
        list.add("vtkIOTecplotTable-9.1");
        list.add("vtkIOVeraOutJava");
        list.add("vtkIOVideoJava");
        list.add("vtkIOXMLParser-9.1");
        list.add("vtkImagingColor-9.1");
        list.add("vtkImagingCoreJava");
        list.add("vtkImagingFourier-9.1");
        list.add("vtkImagingHybrid-9.1");
        list.add("vtkImagingMathJava");
        list.add("vtkImagingSources-9.1");
        list.add("vtkImagingStatistics-9.1");
        list.add("vtkImagingStencil-9.1");
        list.add("vtkFiltersGeneralJava");
        list.add("vtkFiltersGeometryJava");
        list.add("vtkFiltersHyperTreeJava");
        list.add("vtkFiltersSMPJava");
        list.add("vtkFiltersSources-9.1");
        list.add("vtkFiltersStatistics-9.1");
        list.add("vtkFiltersTexture-9.1");
        list.add("vtkIOCityGML-9.1");
        list.add("vtkIOExodus-9.1");
        list.add("vtkIOHDFJava");
        list.add("vtkIOImageJava");
        list.add("vtkIOLSDyna-9.1");
        list.add("vtkIOLegacyJava");
        list.add("vtkIOOggTheoraJava");
        list.add("vtkIOPLYJava");
        list.add("vtkIOSQLJava");
        list.add("vtkIOTecplotTableJava");
        list.add("vtkIOXML-9.1");
        list.add("vtkIOXMLParserJava");
        list.add("vtkImagingColorJava");
        list.add("vtkImagingFourierJava");
        list.add("vtkImagingGeneral-9.1");
        list.add("vtkImagingHybridJava");
        list.add("vtkImagingSourcesJava");
        list.add("vtkImagingStatisticsJava");
        list.add("vtkImagingStencilJava");
        list.add("vtkParallelCore-9.1");
        list.add("vtkFiltersAMR-9.1");
        list.add("vtkFiltersGeneric-9.1");
        list.add("vtkFiltersImaging-9.1");
        list.add("vtkFiltersModeling-9.1");
        list.add("vtkFiltersSourcesJava");
        list.add("vtkFiltersStatisticsJava");
        list.add("vtkFiltersTextureJava");
        list.add("vtkIOAsynchronous-9.1");
        list.add("vtkIOCityGMLJava");
        list.add("vtkIOExodusJava");
        list.add("vtkIOLSDynaJava");
        list.add("vtkIOParallelXML-9.1");
        list.add("vtkIOXMLJava");
        list.add("vtkImagingGeneralJava");
        list.add("vtkImagingMorphological-9.1");
        list.add("vtkParallelCoreJava");
        list.add("vtkParallelDIY-9.1");
        list.add("vtkRenderingCore-9.1");
        list.add("vtkDomainsChemistry-9.1");
        list.add("vtkFiltersAMRJava");
        list.add("vtkFiltersExtraction-9.1");
        list.add("vtkFiltersFlowPaths-9.1");
        list.add("vtkFiltersGenericJava");
        list.add("vtkFiltersHybrid-9.1");
        list.add("vtkFiltersImagingJava");
        list.add("vtkFiltersModelingJava");
        list.add("vtkFiltersPoints-9.1");
        list.add("vtkIOAMR-9.1");
        list.add("vtkIOAsynchronousJava");
        list.add("vtkIOParallelXMLJava");
        list.add("vtkImagingMorphologicalJava");
        list.add("vtkRenderingCoreJava");
        list.add("vtkRenderingFreeType-9.1");
        list.add("vtkRenderingImage-9.1");
        list.add("vtkRenderingLOD-9.1");
        list.add("vtkRenderingSceneGraph-9.1");
        list.add("vtkRenderingUI-9.1");
        list.add("vtkRenderingVolume-9.1");
        list.add("vtkTestingRendering-9.1");
        list.add("vtkDomainsChemistryJava");
        list.add("vtkFiltersExtractionJava");
        list.add("vtkFiltersFlowPathsJava");
        list.add("vtkFiltersHybridJava");
        list.add("vtkFiltersParallel-9.1");
        list.add("vtkFiltersPointsJava");
        list.add("vtkIOAMRJava");
        list.add("vtkIOCGNSReader-9.1");
        list.add("vtkIOChemistry-9.1");
        list.add("vtkIOGeometry-9.1");
        list.add("vtkIOIOSS-9.1");
        list.add("vtkIOMINC-9.1");
        list.add("vtkInfovisCore-9.1");
        list.add("vtkInteractionStyle-9.1");
        list.add("vtkRenderingAnnotation-9.1");
        list.add("vtkRenderingContext2D-9.1");
        list.add("vtkRenderingFreeTypeJava");
        list.add("vtkRenderingImageJava");
        list.add("vtkRenderingLODJava");
        list.add("vtkRenderingLabel-9.1");
        list.add("vtkRenderingOpenGL2-9.1");
        list.add("vtkRenderingSceneGraphJava");
        list.add("vtkRenderingUIJava");
        list.add("vtkRenderingVolumeJava");
        list.add("vtkTestingRenderingJava");
        list.add("vtkViewsCore-9.1");
        list.add("vtkChartsCore-9.1");
        list.add("vtkDomainsChemistryOpenGL2-9.1");
        list.add("vtkFiltersParallelImaging-9.1");
        list.add("vtkFiltersParallelJava");
        list.add("vtkIOCGNSReaderJava");
        list.add("vtkIOChemistryJava");
        list.add("vtkIOGeometryJava");
        list.add("vtkIOIOSSJava");
        list.add("vtkIOImport-9.1");
        list.add("vtkIOInfovis-9.1");
        list.add("vtkIOMINCJava");
        list.add("vtkIOMotionFX-9.1");
        list.add("vtkIOParallel-9.1");
        list.add("vtkInfovisCoreJava");
        list.add("vtkInfovisLayout-9.1");
        list.add("vtkInteractionStyleJava");
        list.add("vtkInteractionWidgets-9.1");
        list.add("vtkRenderingAnnotationJava");
        list.add("vtkRenderingContext2DJava");
        list.add("vtkRenderingContextOpenGL2-9.1");
        list.add("vtkRenderingGL2PSOpenGL2-9.1");
        list.add("vtkRenderingLabelJava");
        list.add("vtkRenderingOpenGL2Java");
        list.add("vtkRenderingVolumeOpenGL2-9.1");
        list.add("vtkRenderingVtkJS-9.1");
        list.add("vtkViewsContext2D-9.1");
        list.add("vtkViewsCoreJava");
        list.add("vtkChartsCoreJava");
        list.add("vtkDomainsChemistryOpenGL2Java");
        list.add("vtkFiltersParallelImagingJava");
        list.add("vtkGeovisCore-9.1");
        list.add("vtkIOExport-9.1");
        list.add("vtkIOImportJava");
        list.add("vtkIOInfovisJava");
        list.add("vtkIOMotionFXJava");
        list.add("vtkIOParallelJava");
        list.add("vtkInfovisLayoutJava");
        list.add("vtkInteractionImage-9.1");
        list.add("vtkInteractionWidgetsJava");
        list.add("vtkRenderingContextOpenGL2Java");
        list.add("vtkRenderingGL2PSOpenGL2Java");
        list.add("vtkRenderingVolumeOpenGL2Java");
        list.add("vtkRenderingVtkJSJava");
        list.add("vtkViewsContext2DJava");
        list.add("vtkViewsInfovis-9.1");
        list.add("vtkGeovisCoreJava");
        list.add("vtkIOExportGL2PS-9.1");
        list.add("vtkIOExportJava");
        list.add("vtkIOExportPDF-9.1");
        list.add("vtkInteractionImageJava");
        list.add("vtkViewsInfovisJava");
        list.add("vtkIOExportGL2PSJava");
        list.add("vtkIOExportPDFJava");
        
    }

    @Override
    protected void getSupportedPlatformsInto(List<String> list) {
        list.add(Platform.PLATFORM_WIN64);        
    }

    @Override
    protected String mapToResourceName(String baseName) {
        if (baseName.startsWith("vtk") && !baseName.endsWith("Java")) {
            return System.mapLibraryName(baseName + "d");
        } else {
            return System.mapLibraryName(baseName);
        }
    }
  
}
