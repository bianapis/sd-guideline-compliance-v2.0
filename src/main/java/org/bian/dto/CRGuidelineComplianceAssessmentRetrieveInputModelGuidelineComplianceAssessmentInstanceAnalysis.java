package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRGuidelineComplianceAssessmentRetrieveInputModelGuidelineComplianceAssessmentInstanceAnalysis
 */
public class CRGuidelineComplianceAssessmentRetrieveInputModelGuidelineComplianceAssessmentInstanceAnalysis   {
  private String guidelineComplianceAssessmentInstanceAnalysisReference = null;

  private String guidelineComplianceAssessmentInstanceAnalysisReportType = null;

  private String guidelineComplianceAssessmentInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return guidelineComplianceAssessmentInstanceAnalysisReference
  **/

  public String getGuidelineComplianceAssessmentInstanceAnalysisReference() {
    return guidelineComplianceAssessmentInstanceAnalysisReference;
  }

  public void setGuidelineComplianceAssessmentInstanceAnalysisReference(String guidelineComplianceAssessmentInstanceAnalysisReference) {
    this.guidelineComplianceAssessmentInstanceAnalysisReference = guidelineComplianceAssessmentInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return guidelineComplianceAssessmentInstanceAnalysisReportType
  **/

  public String getGuidelineComplianceAssessmentInstanceAnalysisReportType() {
    return guidelineComplianceAssessmentInstanceAnalysisReportType;
  }

  public void setGuidelineComplianceAssessmentInstanceAnalysisReportType(String guidelineComplianceAssessmentInstanceAnalysisReportType) {
    this.guidelineComplianceAssessmentInstanceAnalysisReportType = guidelineComplianceAssessmentInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return guidelineComplianceAssessmentInstanceAnalysisParameters
  **/

  public String getGuidelineComplianceAssessmentInstanceAnalysisParameters() {
    return guidelineComplianceAssessmentInstanceAnalysisParameters;
  }

  public void setGuidelineComplianceAssessmentInstanceAnalysisParameters(String guidelineComplianceAssessmentInstanceAnalysisParameters) {
    this.guidelineComplianceAssessmentInstanceAnalysisParameters = guidelineComplianceAssessmentInstanceAnalysisParameters;
  }


}

