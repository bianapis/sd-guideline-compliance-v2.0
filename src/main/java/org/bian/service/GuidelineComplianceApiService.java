/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface GuidelineComplianceApiService {

	SDGuidelineComplianceActivateOutputModel activate(SDGuidelineComplianceActivateInputModel request);
	
	SDGuidelineComplianceConfigureOutputModel configure(String sdReferenceId, SDGuidelineComplianceConfigureInputModel request);
	
	CRGuidelineComplianceAssessmentEvaluateOutputModel evaluate(String sdReferenceId, CRGuidelineComplianceAssessmentEvaluateInputModel request);
	
	CRGuidelineComplianceAssessmentExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRGuidelineComplianceAssessmentExchangeInputModel request);
	
	SDGuidelineComplianceFeedbackOutputModel feedback(String sdReferenceId, SDGuidelineComplianceFeedbackInputModel request);
	
	CRGuidelineComplianceAssessmentRequestOutputModel request(String sdReferenceId, String crReferenceId, CRGuidelineComplianceAssessmentRequestInputModel request);
	
	CRGuidelineComplianceAssessmentRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDGuidelineComplianceRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRGuidelineComplianceAssessmentUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRGuidelineComplianceAssessmentUpdateInputModel request);
	
}
