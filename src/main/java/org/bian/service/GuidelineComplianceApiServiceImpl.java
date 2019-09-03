/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class GuidelineComplianceApiServiceImpl implements GuidelineComplianceApiService {

	public SDGuidelineComplianceActivateOutputModel activate(SDGuidelineComplianceActivateInputModel request){
		return JsonReader.read("activate-SDGuidelineComplianceActivateOutputModel.json",new TypeReference<SDGuidelineComplianceActivateOutputModel>(){});
	}
	
	public SDGuidelineComplianceConfigureOutputModel configure(String sdReferenceId, SDGuidelineComplianceConfigureInputModel request){
		return JsonReader.read("configure-SDGuidelineComplianceConfigureOutputModel.json",new TypeReference<SDGuidelineComplianceConfigureOutputModel>(){});
	}
	
	public CRGuidelineComplianceAssessmentEvaluateOutputModel evaluate(String sdReferenceId, CRGuidelineComplianceAssessmentEvaluateInputModel request){
		return JsonReader.read("evaluate-CRGuidelineComplianceAssessmentEvaluateOutputModel.json",new TypeReference<CRGuidelineComplianceAssessmentEvaluateOutputModel>(){});
	}
	
	public CRGuidelineComplianceAssessmentExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRGuidelineComplianceAssessmentExchangeInputModel request){
		return JsonReader.read("exchange-CRGuidelineComplianceAssessmentExchangeOutputModel.json",new TypeReference<CRGuidelineComplianceAssessmentExchangeOutputModel>(){});
	}
	
	public SDGuidelineComplianceFeedbackOutputModel feedback(String sdReferenceId, SDGuidelineComplianceFeedbackInputModel request){
		return JsonReader.read("feedback-SDGuidelineComplianceFeedbackOutputModel.json",new TypeReference<SDGuidelineComplianceFeedbackOutputModel>(){});
	}
	
	public CRGuidelineComplianceAssessmentRequestOutputModel request(String sdReferenceId, String crReferenceId, CRGuidelineComplianceAssessmentRequestInputModel request){
		return JsonReader.read("request-CRGuidelineComplianceAssessmentRequestOutputModel.json",new TypeReference<CRGuidelineComplianceAssessmentRequestOutputModel>(){});
	}
	
	public CRGuidelineComplianceAssessmentRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRGuidelineComplianceAssessmentRetrieveOutputModel.json",new TypeReference<CRGuidelineComplianceAssessmentRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDGuidelineComplianceRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDGuidelineComplianceRetrieveOutputModel.json",new TypeReference<SDGuidelineComplianceRetrieveOutputModel>(){});
	}
	
	public CRGuidelineComplianceAssessmentUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRGuidelineComplianceAssessmentUpdateInputModel request){
		return JsonReader.read("update-CRGuidelineComplianceAssessmentUpdateOutputModel.json",new TypeReference<CRGuidelineComplianceAssessmentUpdateOutputModel>(){});
	}
	
}
