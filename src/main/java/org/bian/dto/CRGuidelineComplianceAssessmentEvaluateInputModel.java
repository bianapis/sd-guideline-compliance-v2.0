package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRGuidelineComplianceAssessmentEvaluateInputModelGuidelineComplianceAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRGuidelineComplianceAssessmentEvaluateInputModel
 */
public class CRGuidelineComplianceAssessmentEvaluateInputModel   {
  private String guidelineComplianceServicingSessionReference = null;

  private Object guidelineComplianceAssessmentEvaluateActionRecord = null;

  private String guidelineComplianceAssessmentInstanceStatus = null;

  private CRGuidelineComplianceAssessmentEvaluateInputModelGuidelineComplianceAssessmentInstanceRecord guidelineComplianceAssessmentInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Evaluate service call input and output record 
   * @return guidelineComplianceAssessmentEvaluateActionRecord
  **/

  public Object getGuidelineComplianceAssessmentEvaluateActionRecord() {
    return guidelineComplianceAssessmentEvaluateActionRecord;
  }

  public void setGuidelineComplianceAssessmentEvaluateActionRecord(Object guidelineComplianceAssessmentEvaluateActionRecord) {
    this.guidelineComplianceAssessmentEvaluateActionRecord = guidelineComplianceAssessmentEvaluateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Guideline Compliance Assessment instance (e.g. initialised, pending, active) 
   * @return guidelineComplianceAssessmentInstanceStatus
  **/

  public String getGuidelineComplianceAssessmentInstanceStatus() {
    return guidelineComplianceAssessmentInstanceStatus;
  }

  public void setGuidelineComplianceAssessmentInstanceStatus(String guidelineComplianceAssessmentInstanceStatus) {
    this.guidelineComplianceAssessmentInstanceStatus = guidelineComplianceAssessmentInstanceStatus;
  }


  /**
   * Get guidelineComplianceAssessmentInstanceRecord
   * @return guidelineComplianceAssessmentInstanceRecord
  **/

  public CRGuidelineComplianceAssessmentEvaluateInputModelGuidelineComplianceAssessmentInstanceRecord getGuidelineComplianceAssessmentInstanceRecord() {
    return guidelineComplianceAssessmentInstanceRecord;
  }

  public void setGuidelineComplianceAssessmentInstanceRecord(CRGuidelineComplianceAssessmentEvaluateInputModelGuidelineComplianceAssessmentInstanceRecord guidelineComplianceAssessmentInstanceRecord) {
    this.guidelineComplianceAssessmentInstanceRecord = guidelineComplianceAssessmentInstanceRecord;
  }


}

