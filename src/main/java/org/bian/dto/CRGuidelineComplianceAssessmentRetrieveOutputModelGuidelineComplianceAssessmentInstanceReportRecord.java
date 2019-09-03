package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRGuidelineComplianceAssessmentRetrieveOutputModelGuidelineComplianceAssessmentInstanceReportRecord
 */
public class CRGuidelineComplianceAssessmentRetrieveOutputModelGuidelineComplianceAssessmentInstanceReportRecord   {
  private String guidelineComplianceAssessmentInstanceReportData = null;

  private String guidelineComplianceAssessmentInstanceReportType = null;

  private Object guidelineComplianceAssessmentInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return guidelineComplianceAssessmentInstanceReportData
  **/

  public String getGuidelineComplianceAssessmentInstanceReportData() {
    return guidelineComplianceAssessmentInstanceReportData;
  }

  public void setGuidelineComplianceAssessmentInstanceReportData(String guidelineComplianceAssessmentInstanceReportData) {
    this.guidelineComplianceAssessmentInstanceReportData = guidelineComplianceAssessmentInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return guidelineComplianceAssessmentInstanceReportType
  **/

  public String getGuidelineComplianceAssessmentInstanceReportType() {
    return guidelineComplianceAssessmentInstanceReportType;
  }

  public void setGuidelineComplianceAssessmentInstanceReportType(String guidelineComplianceAssessmentInstanceReportType) {
    this.guidelineComplianceAssessmentInstanceReportType = guidelineComplianceAssessmentInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return guidelineComplianceAssessmentInstanceReport
  **/

  public Object getGuidelineComplianceAssessmentInstanceReport() {
    return guidelineComplianceAssessmentInstanceReport;
  }

  public void setGuidelineComplianceAssessmentInstanceReport(Object guidelineComplianceAssessmentInstanceReport) {
    this.guidelineComplianceAssessmentInstanceReport = guidelineComplianceAssessmentInstanceReport;
  }


}

