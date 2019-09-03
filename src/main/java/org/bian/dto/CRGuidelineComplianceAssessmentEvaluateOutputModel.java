package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRGuidelineComplianceAssessmentEvaluateOutputModelGuidelineComplianceAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRGuidelineComplianceAssessmentEvaluateOutputModel
 */
public class CRGuidelineComplianceAssessmentEvaluateOutputModel   {
  private String guidelineComplianceAssessmentInstanceReference = null;

  private String guidelineComplianceAssessmentEvaluateActionReference = null;

  private Object guidelineComplianceAssessmentEvaluateActionRecord = null;

  private String guidelineComplianceAssessmentInstanceStatus = null;

  private CRGuidelineComplianceAssessmentEvaluateOutputModelGuidelineComplianceAssessmentInstanceRecord guidelineComplianceAssessmentInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Evaluate service call 
   * @return guidelineComplianceAssessmentEvaluateActionReference
  **/

  public String getGuidelineComplianceAssessmentEvaluateActionReference() {
    return guidelineComplianceAssessmentEvaluateActionReference;
  }

  public void setGuidelineComplianceAssessmentEvaluateActionReference(String guidelineComplianceAssessmentEvaluateActionReference) {
    this.guidelineComplianceAssessmentEvaluateActionReference = guidelineComplianceAssessmentEvaluateActionReference;
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

  public CRGuidelineComplianceAssessmentEvaluateOutputModelGuidelineComplianceAssessmentInstanceRecord getGuidelineComplianceAssessmentInstanceRecord() {
    return guidelineComplianceAssessmentInstanceRecord;
  }

  public void setGuidelineComplianceAssessmentInstanceRecord(CRGuidelineComplianceAssessmentEvaluateOutputModelGuidelineComplianceAssessmentInstanceRecord guidelineComplianceAssessmentInstanceRecord) {
    this.guidelineComplianceAssessmentInstanceRecord = guidelineComplianceAssessmentInstanceRecord;
  }


}

