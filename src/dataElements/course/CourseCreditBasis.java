package dataElements.course;

import dataElements.BaseDataElement;

import java.util.HashMap;
import java.util.Map;

public class CourseCreditBasis  extends BaseDataElement {

	public CourseCreditBasis() {}

	public String getEdiName() {return "CRS01";}
	public String getXmlName() {return "CourseCreditBasis";}
	public Boolean getIsRequired() {return true;}

	public String getEdiValue(String xmlValue) {
		return (String)mapXmlToEdi().get(xmlValue);
	}

	public String getXmlValue(String ediValue) {
		return (String)mapEdiToXml().get(ediValue);
	}

	private Map<String, String> mapXmlToEdi() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("Regular", "R");
		map.put("AcademicRenewal", "Z");
		map.put("AdvancedPlacement", "A");
		map.put("AdvancedStanding", "B");
		map.put("ContinuingEducation", "Z");
		map.put("Correspondence", "N");
		map.put("Exemption", "Z");
		map.put("Equivalence", "Z");
		map.put("InternationalBaccalaureate", "I");
		map.put("Military", "M");
		map.put("Remedial", "Z");
		map.put("CreditByExam", "B");
		map.put("HighSchoolTransferCredit", null);
		map.put("HighSchoolCreditOnly", null);
		map.put("HighSchoolDualCredit", null);
		map.put("JuniorHighSchoolCredit", null);
		map.put("Major", "Z");
		map.put("AdultBasic", "Z");
		return map;
	}

	private Map<String, String> mapEdiToXml() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("A", "AdvancedPlacement");  //College Board's Advanced Placement (AP)
		map.put("B", "CreditByExam");
		map.put("C", "AdvancedStanding");   //College Level Examination Program (CLEP)
		map.put("D", "Military");  			//US Dept of Defense DANTES Program
		map.put("E", "Equivalence");  		//Life Experience
		map.put("F", null);  				//Study Abroad
		map.put("G", "CreditByExam");       //College Board (CEEB) Credit
		map.put("H", null);  				//Completion or Removal of an Incomplete Grade
		map.put("I", "InternationalBaccalaureate");
		map.put("M", "Military");
		map.put("N", "Correspondence");
		map.put("P", "Equivalence");  		//ACE Program on Noncollegiate Sponsored Instruction (ACE/PONSI)
		map.put("R", "Regular");
		map.put("T", null);					//Credits Transferred in from Another Institution
		map.put("V", null);					//Audit or Visitor Status - No Credit Awarded
		map.put("Z", null);                 //Other
		return map;
	}
}
