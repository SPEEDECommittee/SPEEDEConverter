package dataElements.course;

import dataElements.BaseDataElement;

import java.util.*;

public class CourseCreditLevel extends BaseDataElement {

	public CourseCreditLevel() {}

	public String getEdiName() {return "CRS08";} //Conflicts with CourseLevel
	public String getXmlName() {return "CourseCreditLevel";}
	public Boolean getIsRequired() {return false;}

	public String getEdiValue(String xmlValue) {
		return (String)mapXmlToEdi().get(xmlValue);
	}

	public String getXmlValue(String ediValue) {
		return (String)mapEdiToXml().get(ediValue);
	}

	private Map<String, String> mapXmlToEdi() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("Undergraduate", "U");
		map.put("LowerDivision", "L");
		map.put("UpperDivision", "H");
		map.put("Vocational", "14");
		map.put("TechnicalPreparatory","14");
		map.put("Graduate", "G");
		map.put("Professional", "P");
		map.put("Dual", "D");
		map.put("Grade13", null);
		map.put("DualGraduateUndergraduate", "D");
		map.put("GraduateProfessional", "DL");
		map.put("Ungraded", null);
		return map;
	}

	private Map<String, String> mapEdiToXml() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "Remedial");
		map.put("2", null);								//Basic
		map.put("3", null);								//Teacher's Aide
		map.put("4", null);								//General
		map.put("5", null);								//Applied
		map.put("6", null);								//Survey
		map.put("7", null);								//Regular
		map.put("8", null);								//Specialized Topics
		map.put("9", null);								//Advanced
		map.put("D", "Dual");							//Dual Level (Upper Division and Graduate)
		map.put("G", "GraduateProfessional");
		map.put("H", "UpperDivision");
		map.put("I", null);								//Institutional Credit
		map.put("L", "LowerDivision");
		map.put("M", null);								//Work in Major or Program
		map.put("P", "GraduateProfessional");
		map.put("R", "Remedial");
		map.put("U", null);								//Undergraduate
		map.put("10", null);							//Honors
		map.put("11", null);							//Gifted and Talented
		map.put("12", null);							//Advanced Placement
		map.put("13", null);							//Special Education
		map.put("14", null);							//Vocational Education
		map.put("15", null);							//Independent Study
		map.put("16", null);							//Work Experience
		map.put("17", null);							//Adult Basic
		map.put("18", null);							//Adult Secondary
		map.put("19", null);							//International Baccalaureate
		map.put("AR", null);							//Academic Renewal
		map.put("DL", "GraduateProfessional");			//Dual Level (Graduate adn Professional)
		return map;
	}

}
