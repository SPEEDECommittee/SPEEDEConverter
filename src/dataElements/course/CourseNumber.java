package dataElements.course;

import dataElements.BaseDataElement;

public class CourseNumber extends BaseDataElement {

	public CourseNumber() {}

	public String getEdiName() {return "CRS15";}
	public String getXmlName() {return "CourseNumber";}
	public Boolean getIsRequired() {return false;}

	public String getEdiValue(String xmlValue) {
		return xmlValue;
	}

	public String getXmlValue(String ediValue) {
		return ediValue;
	}

}
