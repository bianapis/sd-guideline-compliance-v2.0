package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRGuidelineComplianceAssessmentRetrieveInputModelGuidelineComplianceAssessmentInstanceReportRecord
 */
public class CRGuidelineComplianceAssessmentRetrieveInputModelGuidelineComplianceAssessmentInstanceReportRecord   {
  private String guidelineComplianceAssessmentInstanceReportReference = null;

  private String guidelineComplianceAssessmentInstanceReportType = null;

  private String guidelineComplianceAssessmentInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return guidelineComplianceAssessmentInstanceReportReference
  **/

  public String getGuidelineComplianceAssessmentInstanceReportReference() {
    return guidelineComplianceAssessmentInstanceReportReference;
  }

  public void setGuidelineComplianceAssessmentInstanceReportReference(String guidelineComplianceAssessmentInstanceReportReference) {
    this.guidelineComplianceAssessmentInstanceReportReference = guidelineComplianceAssessmentInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return guidelineComplianceAssessmentInstanceReportParameters
  **/

  public String getGuidelineComplianceAssessmentInstanceReportParameters() {
    return guidelineComplianceAssessmentInstanceReportParameters;
  }

  public void setGuidelineComplianceAssessmentInstanceReportParameters(String guidelineComplianceAssessmentInstanceReportParameters) {
    this.guidelineComplianceAssessmentInstanceReportParameters = guidelineComplianceAssessmentInstanceReportParameters;
  }


}

