package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRGuidelineComplianceAssessmentRequestOutputModelGuidelineComplianceAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRGuidelineComplianceAssessmentRequestOutputModel
 */
public class CRGuidelineComplianceAssessmentRequestOutputModel   {
  private CRGuidelineComplianceAssessmentRequestOutputModelGuidelineComplianceAssessmentInstanceRecord guidelineComplianceAssessmentInstanceRecord = null;

  private String guidelineComplianceAssessmentRequestActionTaskReference = null;

  private Object guidelineComplianceAssessmentRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get guidelineComplianceAssessmentInstanceRecord
   * @return guidelineComplianceAssessmentInstanceRecord
  **/

  public CRGuidelineComplianceAssessmentRequestOutputModelGuidelineComplianceAssessmentInstanceRecord getGuidelineComplianceAssessmentInstanceRecord() {
    return guidelineComplianceAssessmentInstanceRecord;
  }

  public void setGuidelineComplianceAssessmentInstanceRecord(CRGuidelineComplianceAssessmentRequestOutputModelGuidelineComplianceAssessmentInstanceRecord guidelineComplianceAssessmentInstanceRecord) {
    this.guidelineComplianceAssessmentInstanceRecord = guidelineComplianceAssessmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Guideline Compliance Assessment instance request service call 
   * @return guidelineComplianceAssessmentRequestActionTaskReference
  **/

  public String getGuidelineComplianceAssessmentRequestActionTaskReference() {
    return guidelineComplianceAssessmentRequestActionTaskReference;
  }

  public void setGuidelineComplianceAssessmentRequestActionTaskReference(String guidelineComplianceAssessmentRequestActionTaskReference) {
    this.guidelineComplianceAssessmentRequestActionTaskReference = guidelineComplianceAssessmentRequestActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

