package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRGuidelineComplianceAssessmentUpdateInputModelGuidelineComplianceAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRGuidelineComplianceAssessmentUpdateOutputModel
 */
public class CRGuidelineComplianceAssessmentUpdateOutputModel   {
  private CRGuidelineComplianceAssessmentUpdateInputModelGuidelineComplianceAssessmentInstanceRecord guidelineComplianceAssessmentInstanceRecord = null;

  private String guidelineComplianceAssessmentUpdateActionTaskReference = null;

  private Object guidelineComplianceAssessmentUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return guidelineComplianceAssessmentUpdateActionTaskReference
  **/

  public String getGuidelineComplianceAssessmentUpdateActionTaskReference() {
    return guidelineComplianceAssessmentUpdateActionTaskReference;
  }

  public void setGuidelineComplianceAssessmentUpdateActionTaskReference(String guidelineComplianceAssessmentUpdateActionTaskReference) {
    this.guidelineComplianceAssessmentUpdateActionTaskReference = guidelineComplianceAssessmentUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

