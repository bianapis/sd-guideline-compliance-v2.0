package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRGuidelineComplianceAssessmentUpdateInputModelGuidelineComplianceAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRGuidelineComplianceAssessmentUpdateInputModel
 */
public class CRGuidelineComplianceAssessmentUpdateInputModel   {
  private String guidelineComplianceServicingSessionReference = null;

  private String guidelineComplianceAssessmentInstanceReference = null;

  private CRGuidelineComplianceAssessmentUpdateInputModelGuidelineComplianceAssessmentInstanceRecord guidelineComplianceAssessmentInstanceRecord = null;

  private Object guidelineComplianceAssessmentUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * Get guidelineComplianceAssessmentInstanceRecord
   * @return guidelineComplianceAssessmentInstanceRecord
  **/

  public CRGuidelineComplianceAssessmentUpdateInputModelGuidelineComplianceAssessmentInstanceRecord getGuidelineComplianceAssessmentInstanceRecord() {
    return guidelineComplianceAssessmentInstanceRecord;
  }

  public void setGuidelineComplianceAssessmentInstanceRecord(CRGuidelineComplianceAssessmentUpdateInputModelGuidelineComplianceAssessmentInstanceRecord guidelineComplianceAssessmentInstanceRecord) {
    this.guidelineComplianceAssessmentInstanceRecord = guidelineComplianceAssessmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return guidelineComplianceAssessmentUpdateActionTaskRecord
  **/

  public Object getGuidelineComplianceAssessmentUpdateActionTaskRecord() {
    return guidelineComplianceAssessmentUpdateActionTaskRecord;
  }

  public void setGuidelineComplianceAssessmentUpdateActionTaskRecord(Object guidelineComplianceAssessmentUpdateActionTaskRecord) {
    this.guidelineComplianceAssessmentUpdateActionTaskRecord = guidelineComplianceAssessmentUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

