package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRGuidelineComplianceAssessmentEvaluateOutputModelGuidelineComplianceAssessmentInstanceRecord
 */
public class CRGuidelineComplianceAssessmentEvaluateOutputModelGuidelineComplianceAssessmentInstanceRecord   {
  private String documentReference = null;

  private String guidelineComplianceAssessmentWorkProducts = null;

  private String guidelineComplianceAssessmentResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to any documentation classified/archived as appropriate 
   * @return documentReference
  **/

  public String getDocumentReference() {
    return documentReference;
  }

  public void setDocumentReference(String documentReference) {
    this.documentReference = documentReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Work documentation, forms and schedules produced and referenced during the assessment 
   * @return guidelineComplianceAssessmentWorkProducts
  **/

  public String getGuidelineComplianceAssessmentWorkProducts() {
    return guidelineComplianceAssessmentWorkProducts;
  }

  public void setGuidelineComplianceAssessmentWorkProducts(String guidelineComplianceAssessmentWorkProducts) {
    this.guidelineComplianceAssessmentWorkProducts = guidelineComplianceAssessmentWorkProducts;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Outcome/result of the assessment, can include remedial actions 
   * @return guidelineComplianceAssessmentResult
  **/

  public String getGuidelineComplianceAssessmentResult() {
    return guidelineComplianceAssessmentResult;
  }

  public void setGuidelineComplianceAssessmentResult(String guidelineComplianceAssessmentResult) {
    this.guidelineComplianceAssessmentResult = guidelineComplianceAssessmentResult;
  }


}

