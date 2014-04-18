package dataElements.course;

import dataElements.BaseDataElement;

import java.util.HashMap;
import java.util.Map;

public class CourseCreditUnits extends BaseDataElement {

	public CourseCreditUnits() {}

	public String getEdiName() {return "CRS02";}
	public String getXmlName() {return "CourseCreditUnits";}
	public Boolean getIsRequired() {return false;}

	public String getEdiValue(String xmlValue) {
		return (String)mapXmlToEdi().get(xmlValue);
	}

	public String getXmlValue(String ediValue) {
		return (String)mapEdiToXml().get(ediValue);
	}

	private Map<String, String> mapXmlToEdi() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("NoCredit", "N");
		map.put("Quarter", "Q");
		map.put("Semester", "S");
		map.put("Units", "U");
		map.put("ClockHours", "X");
		map.put("CarnegieUnits", "G");
		map.put("ContinuingEducationUnits", "C");
		map.put("Unreported", "X");
		map.put("Other", "X");
		return map;
	}

	private Map<String, String> mapEdiToXml() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("A", "Other");						//Adult Credits
		map.put("C", "ContinuingEducationUnits");
		map.put("G", "CarnegieUnits");
		map.put("N", "NoCredit");
		map.put("Q", "Quarter");
		map.put("S", "Semester");
		map.put("U", "Units");
		map.put("V", null);							//Vocational Credits
		map.put("X", "Other");
		return map;
	}

}
