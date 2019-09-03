package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRGuidelineComplianceAssessmentExchangeOutputModel
 */
public class CRGuidelineComplianceAssessmentExchangeOutputModel   {
  private String guidelineComplianceAssessmentExchangeActionTaskReference = null;

  private Object guidelineComplianceAssessmentExchangeActionTaskRecord = null;

  private String guidelineComplianceAssessmentExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Guideline Compliance Assessment instance exchange service call 
   * @return guidelineComplianceAssessmentExchangeActionTaskReference
  **/

  public String getGuidelineComplianceAssessmentExchangeActionTaskReference() {
    return guidelineComplianceAssessmentExchangeActionTaskReference;
  }

  public void setGuidelineComplianceAssessmentExchangeActionTaskReference(String guidelineComplianceAssessmentExchangeActionTaskReference) {
    this.guidelineComplianceAssessmentExchangeActionTaskReference = guidelineComplianceAssessmentExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return guidelineComplianceAssessmentExchangeActionTaskRecord
  **/

  public Object getGuidelineComplianceAssessmentExchangeActionTaskRecord() {
    return guidelineComplianceAssessmentExchangeActionTaskRecord;
  }

  public void setGuidelineComplianceAssessmentExchangeActionTaskRecord(Object guidelineComplianceAssessmentExchangeActionTaskRecord) {
    this.guidelineComplianceAssessmentExchangeActionTaskRecord = guidelineComplianceAssessmentExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return guidelineComplianceAssessmentExchangeActionResponse
  **/

  public String getGuidelineComplianceAssessmentExchangeActionResponse() {
    return guidelineComplianceAssessmentExchangeActionResponse;
  }

  public void setGuidelineComplianceAssessmentExchangeActionResponse(String guidelineComplianceAssessmentExchangeActionResponse) {
    this.guidelineComplianceAssessmentExchangeActionResponse = guidelineComplianceAssessmentExchangeActionResponse;
  }


}

