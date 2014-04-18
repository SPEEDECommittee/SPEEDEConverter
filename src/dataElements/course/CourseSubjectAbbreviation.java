package dataElements.course;

import dataElements.BaseDataElement;

public class CourseSubjectAbbreviation extends BaseDataElement {

	public CourseSubjectAbbreviation() {}

	public String getEdiName() {return "CRS";}
	public String getXmlName() {return "CourseSubjectAbbreviation";}
	public Boolean getIsRequired() {return false;}

	public String getEdiValue(String xmlValue) {
		return xmlValue;
	}

	public String getXmlValue(String ediValue) {
		return ediValue;
	}

}
