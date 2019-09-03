package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRGuidelineComplianceAssessmentRetrieveOutputModelGuidelineComplianceAssessmentInstanceAnalysis;
import org.bian.dto.CRGuidelineComplianceAssessmentRetrieveOutputModelGuidelineComplianceAssessmentInstanceRecord;
import org.bian.dto.CRGuidelineComplianceAssessmentRetrieveOutputModelGuidelineComplianceAssessmentInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRGuidelineComplianceAssessmentRetrieveOutputModel
 */
public class CRGuidelineComplianceAssessmentRetrieveOutputModel   {
  private CRGuidelineComplianceAssessmentRetrieveOutputModelGuidelineComplianceAssessmentInstanceRecord guidelineComplianceAssessmentInstanceRecord = null;

  private String guidelineComplianceAssessmentRetrieveActionTaskReference = null;

  private Object guidelineComplianceAssessmentRetrieveActionTaskRecord = null;

  private String guidelineComplianceAssessmentRetrieveActionResponse = null;

  private CRGuidelineComplianceAssessmentRetrieveOutputModelGuidelineComplianceAssessmentInstanceReportRecord guidelineComplianceAssessmentInstanceReportRecord = null;

  private CRGuidelineComplianceAssessmentRetrieveOutputModelGuidelineComplianceAssessmentInstanceAnalysis guidelineComplianceAssessmentInstanceAnalysis = null;


  /**
   * Get guidelineComplianceAssessmentInstanceRecord
   * @return guidelineComplianceAssessmentInstanceRecord
  **/

  public CRGuidelineComplianceAssessmentRetrieveOutputModelGuidelineComplianceAssessmentInstanceRecord getGuidelineComplianceAssessmentInstanceRecord() {
    return guidelineComplianceAssessmentInstanceRecord;
  }

  public void setGuidelineComplianceAssessmentInstanceRecord(CRGuidelineComplianceAssessmentRetrieveOutputModelGuidelineComplianceAssessmentInstanceRecord guidelineComplianceAssessmentInstanceRecord) {
    this.guidelineComplianceAssessmentInstanceRecord = guidelineComplianceAssessmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Guideline Compliance Assessment instance retrieve service call 
   * @return guidelineComplianceAssessmentRetrieveActionTaskReference
  **/

  public String getGuidelineComplianceAssessmentRetrieveActionTaskReference() {
    return guidelineComplianceAssessmentRetrieveActionTaskReference;
  }

  public void setGuidelineComplianceAssessmentRetrieveActionTaskReference(String guidelineComplianceAssessmentRetrieveActionTaskReference) {
    this.guidelineComplianceAssessmentRetrieveActionTaskReference = guidelineComplianceAssessmentRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return guidelineComplianceAssessmentRetrieveActionTaskRecord
  **/

  public Object getGuidelineComplianceAssessmentRetrieveActionTaskRecord() {
    return guidelineComplianceAssessmentRetrieveActionTaskRecord;
  }

  public void setGuidelineComplianceAssessmentRetrieveActionTaskRecord(Object guidelineComplianceAssessmentRetrieveActionTaskRecord) {
    this.guidelineComplianceAssessmentRetrieveActionTaskRecord = guidelineComplianceAssessmentRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return guidelineComplianceAssessmentRetrieveActionResponse
  **/

  public String getGuidelineComplianceAssessmentRetrieveActionResponse() {
    return guidelineComplianceAssessmentRetrieveActionResponse;
  }

  public void setGuidelineComplianceAssessmentRetrieveActionResponse(String guidelineComplianceAssessmentRetrieveActionResponse) {
    this.guidelineComplianceAssessmentRetrieveActionResponse = guidelineComplianceAssessmentRetrieveActionResponse;
  }


  /**
   * Get guidelineComplianceAssessmentInstanceReportRecord
   * @return guidelineComplianceAssessmentInstanceReportRecord
  **/

  public CRGuidelineComplianceAssessmentRetrieveOutputModelGuidelineComplianceAssessmentInstanceReportRecord getGuidelineComplianceAssessmentInstanceReportRecord() {
    return guidelineComplianceAssessmentInstanceReportRecord;
  }

  public void setGuidelineComplianceAssessmentInstanceReportRecord(CRGuidelineComplianceAssessmentRetrieveOutputModelGuidelineComplianceAssessmentInstanceReportRecord guidelineComplianceAssessmentInstanceReportRecord) {
    this.guidelineComplianceAssessmentInstanceReportRecord = guidelineComplianceAssessmentInstanceReportRecord;
  }


  /**
   * Get guidelineComplianceAssessmentInstanceAnalysis
   * @return guidelineComplianceAssessmentInstanceAnalysis
  **/

  public CRGuidelineComplianceAssessmentRetrieveOutputModelGuidelineComplianceAssessmentInstanceAnalysis getGuidelineComplianceAssessmentInstanceAnalysis() {
    return guidelineComplianceAssessmentInstanceAnalysis;
  }

  public void setGuidelineComplianceAssessmentInstanceAnalysis(CRGuidelineComplianceAssessmentRetrieveOutputModelGuidelineComplianceAssessmentInstanceAnalysis guidelineComplianceAssessmentInstanceAnalysis) {
    this.guidelineComplianceAssessmentInstanceAnalysis = guidelineComplianceAssessmentInstanceAnalysis;
  }


}

