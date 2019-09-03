package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRGuidelineComplianceAssessmentRetrieveOutputModelGuidelineComplianceAssessmentInstanceAnalysis
 */
public class CRGuidelineComplianceAssessmentRetrieveOutputModelGuidelineComplianceAssessmentInstanceAnalysis   {
  private String guidelineComplianceAssessmentInstanceAnalysisData = null;

  private String guidelineComplianceAssessmentInstanceAnalysisReportType = null;

  private Object guidelineComplianceAssessmentInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return guidelineComplianceAssessmentInstanceAnalysisData
  **/

  public String getGuidelineComplianceAssessmentInstanceAnalysisData() {
    return guidelineComplianceAssessmentInstanceAnalysisData;
  }

  public void setGuidelineComplianceAssessmentInstanceAnalysisData(String guidelineComplianceAssessmentInstanceAnalysisData) {
    this.guidelineComplianceAssessmentInstanceAnalysisData = guidelineComplianceAssessmentInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return guidelineComplianceAssessmentInstanceAnalysisReport
  **/

  public Object getGuidelineComplianceAssessmentInstanceAnalysisReport() {
    return guidelineComplianceAssessmentInstanceAnalysisReport;
  }

  public void setGuidelineComplianceAssessmentInstanceAnalysisReport(Object guidelineComplianceAssessmentInstanceAnalysisReport) {
    this.guidelineComplianceAssessmentInstanceAnalysisReport = guidelineComplianceAssessmentInstanceAnalysisReport;
  }


}

