package dataElements.course;

import dataElements.BaseDataElement;

import java.util.HashMap;
import java.util.Map;

public class CourseRepeatCode extends BaseDataElement {

	public CourseRepeatCode() {}

	public String getEdiName() {return "CRS09";}
	public String getXmlName() {return "CourseRepeatCode";}
	public Boolean getIsRequired() {return false;}

	public String getEdiValue(String xmlValue) {
		return (String)mapXmlToEdi().get(xmlValue);
	}

	public String getXmlValue(String ediValue) {
		return (String)mapEdiToXml().get(ediValue);
	}

	private Map<String, String> mapXmlToEdi() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("RepeatNotCounted", "N");
		map.put("RepeatCounted", "R");
		map.put("ReplacementCounted", "R");
		map.put("ReplacedNotCount", "N");
		map.put("RepeatOtherInstitution", "R");
		map.put("NotCountedOther", "R");  //??Should this be "X"?
		return map;
	}

	private Map<String, String> mapEdiToXml() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("N", "RepeatNotCounted");
		map.put("R", "RepeatCounted");
		map.put("X", "NotCountedOther");
		return map;
	}

}
