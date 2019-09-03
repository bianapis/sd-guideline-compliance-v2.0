package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRGuidelineComplianceAssessmentExchangeInputModelGuidelineComplianceAssessmentExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRGuidelineComplianceAssessmentExchangeInputModel
 */
public class CRGuidelineComplianceAssessmentExchangeInputModel   {
  private String guidelineComplianceServicingSessionReference = null;

  private String guidelineComplianceAssessmentInstanceReference = null;

  private Object guidelineComplianceAssessmentExchangeActionTaskRecord = null;

  private CRGuidelineComplianceAssessmentExchangeInputModelGuidelineComplianceAssessmentExchangeActionRequest guidelineComplianceAssessmentExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return guidelineComplianceServicingSessionReference
  **/

  public String getGuidelineComplianceServicingSessionReference() {
    return guidelineComplianceServicingSessionReference;
  }

  public void setGuidelineComplianceServicingSessionReference(String guidelineComplianceServicingSessionReference) {
    this.guidelineComplianceServicingSessionReference = guidelineComplianceServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Guideline Compliance Assessment instance 
   * @return guidelineComplianceAssessmentInstanceReference
  **/

  public String getGuidelineComplianceAssessmentInstanceReference() {
    return guidelineComplianceAssessmentInstanceReference;
  }

  public void setGuidelineComplianceAssessmentInstanceReference(String guidelineComplianceAssessmentInstanceReference) {
    this.guidelineComplianceAssessmentInstanceReference = guidelineComplianceAssessmentInstanceReference;
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
   * Get guidelineComplianceAssessmentExchangeActionRequest
   * @return guidelineComplianceAssessmentExchangeActionRequest
  **/

  public CRGuidelineComplianceAssessmentExchangeInputModelGuidelineComplianceAssessmentExchangeActionRequest getGuidelineComplianceAssessmentExchangeActionRequest() {
    return guidelineComplianceAssessmentExchangeActionRequest;
  }

  public void setGuidelineComplianceAssessmentExchangeActionRequest(CRGuidelineComplianceAssessmentExchangeInputModelGuidelineComplianceAssessmentExchangeActionRequest guidelineComplianceAssessmentExchangeActionRequest) {
    this.guidelineComplianceAssessmentExchangeActionRequest = guidelineComplianceAssessmentExchangeActionRequest;
  }


}

