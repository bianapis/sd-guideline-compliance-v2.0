package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRGuidelineComplianceAssessmentRequestInputModelGuidelineComplianceAssessmentInstanceRecord
 */
public class CRGuidelineComplianceAssessmentRequestInputModelGuidelineComplianceAssessmentInstanceRecord   {
  private String guidelineComplianceAssessmentType = null;

  private String businessUnitReference = null;

  private String productServiceReference = null;

  private String customerReference = null;

  private String documentReference = null;

  private String guidelineComplianceAssessmentWorkProducts = null;


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_K1lxwG7NEeO82qXU9yOWsg/elements/_ddIbAG7VEeO82qXU9yOWsg  bian-reference: GuidelineComplianceCheck (as Assessment).AssessmentType  general-info: The type and make-up of guideline compliance tests referenced in the assessment 
   * @return guidelineComplianceAssessmentType
  **/

  public String getGuidelineComplianceAssessmentType() {
    return guidelineComplianceAssessmentType;
  }

  public void setGuidelineComplianceAssessmentType(String guidelineComplianceAssessmentType) {
    this.guidelineComplianceAssessmentType = guidelineComplianceAssessmentType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The business function or unit assessed for compliance if appropriate 
   * @return businessUnitReference
  **/

  public String getBusinessUnitReference() {
    return businessUnitReference;
  }

  public void setBusinessUnitReference(String businessUnitReference) {
    this.businessUnitReference = businessUnitReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The associated product/service being assessed if appropriate 
   * @return productServiceReference
  **/

  public String getProductServiceReference() {
    return productServiceReference;
  }

  public void setProductServiceReference(String productServiceReference) {
    this.productServiceReference = productServiceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the customer assessed if appropriate 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


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


}

