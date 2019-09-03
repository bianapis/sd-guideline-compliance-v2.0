package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRGuidelineComplianceAssessmentRetrieveInputModelGuidelineComplianceAssessmentInstanceAnalysis;
import org.bian.dto.CRGuidelineComplianceAssessmentRetrieveInputModelGuidelineComplianceAssessmentInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRGuidelineComplianceAssessmentRetrieveInputModel
 */
public class CRGuidelineComplianceAssessmentRetrieveInputModel   {
  private Object guidelineComplianceAssessmentRetrieveActionTaskRecord = null;

  private String guidelineComplianceAssessmentRetrieveActionRequest = null;

  private CRGuidelineComplianceAssessmentRetrieveInputModelGuidelineComplianceAssessmentInstanceReportRecord guidelineComplianceAssessmentInstanceReportRecord = null;

  private CRGuidelineComplianceAssessmentRetrieveInputModelGuidelineComplianceAssessmentInstanceAnalysis guidelineComplianceAssessmentInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return guidelineComplianceAssessmentRetrieveActionRequest
  **/

  public String getGuidelineComplianceAssessmentRetrieveActionRequest() {
    return guidelineComplianceAssessmentRetrieveActionRequest;
  }

  public void setGuidelineComplianceAssessmentRetrieveActionRequest(String guidelineComplianceAssessmentRetrieveActionRequest) {
    this.guidelineComplianceAssessmentRetrieveActionRequest = guidelineComplianceAssessmentRetrieveActionRequest;
  }


  /**
   * Get guidelineComplianceAssessmentInstanceReportRecord
   * @return guidelineComplianceAssessmentInstanceReportRecord
  **/

  public CRGuidelineComplianceAssessmentRetrieveInputModelGuidelineComplianceAssessmentInstanceReportRecord getGuidelineComplianceAssessmentInstanceReportRecord() {
    return guidelineComplianceAssessmentInstanceReportRecord;
  }

  public void setGuidelineComplianceAssessmentInstanceReportRecord(CRGuidelineComplianceAssessmentRetrieveInputModelGuidelineComplianceAssessmentInstanceReportRecord guidelineComplianceAssessmentInstanceReportRecord) {
    this.guidelineComplianceAssessmentInstanceReportRecord = guidelineComplianceAssessmentInstanceReportRecord;
  }


  /**
   * Get guidelineComplianceAssessmentInstanceAnalysis
   * @return guidelineComplianceAssessmentInstanceAnalysis
  **/

  public CRGuidelineComplianceAssessmentRetrieveInputModelGuidelineComplianceAssessmentInstanceAnalysis getGuidelineComplianceAssessmentInstanceAnalysis() {
    return guidelineComplianceAssessmentInstanceAnalysis;
  }

  public void setGuidelineComplianceAssessmentInstanceAnalysis(CRGuidelineComplianceAssessmentRetrieveInputModelGuidelineComplianceAssessmentInstanceAnalysis guidelineComplianceAssessmentInstanceAnalysis) {
    this.guidelineComplianceAssessmentInstanceAnalysis = guidelineComplianceAssessmentInstanceAnalysis;
  }


}

