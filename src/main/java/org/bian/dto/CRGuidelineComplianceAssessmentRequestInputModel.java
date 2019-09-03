package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRGuidelineComplianceAssessmentRequestInputModelGuidelineComplianceAssessmentInstanceRecord;
import org.bian.dto.CRGuidelineComplianceAssessmentRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRGuidelineComplianceAssessmentRequestInputModel
 */
public class CRGuidelineComplianceAssessmentRequestInputModel   {
  private String guidelineComplianceServicingSessionReference = null;

  private String guidelineComplianceAssessmentInstanceReference = null;

  private CRGuidelineComplianceAssessmentRequestInputModelGuidelineComplianceAssessmentInstanceRecord guidelineComplianceAssessmentInstanceRecord = null;

  private Object guidelineComplianceAssessmentRequestActionTaskRecord = null;

  private CRGuidelineComplianceAssessmentRequestInputModelRequestRecordType requestRecordType = null;


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

  public CRGuidelineComplianceAssessmentRequestInputModelGuidelineComplianceAssessmentInstanceRecord getGuidelineComplianceAssessmentInstanceRecord() {
    return guidelineComplianceAssessmentInstanceRecord;
  }

  public void setGuidelineComplianceAssessmentInstanceRecord(CRGuidelineComplianceAssessmentRequestInputModelGuidelineComplianceAssessmentInstanceRecord guidelineComplianceAssessmentInstanceRecord) {
    this.guidelineComplianceAssessmentInstanceRecord = guidelineComplianceAssessmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return guidelineComplianceAssessmentRequestActionTaskRecord
  **/

  public Object getGuidelineComplianceAssessmentRequestActionTaskRecord() {
    return guidelineComplianceAssessmentRequestActionTaskRecord;
  }

  public void setGuidelineComplianceAssessmentRequestActionTaskRecord(Object guidelineComplianceAssessmentRequestActionTaskRecord) {
    this.guidelineComplianceAssessmentRequestActionTaskRecord = guidelineComplianceAssessmentRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRGuidelineComplianceAssessmentRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRGuidelineComplianceAssessmentRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

