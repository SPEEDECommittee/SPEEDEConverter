package dataElements.course;

import dataElements.BaseDataElement;

public class CourseTitle extends BaseDataElement {

	public CourseTitle() {}

	public String getEdiName() {return "CRS16";}
	public String getXmlName() {return "CourseTitle";}
	public Boolean getIsRequired() {return false;}

	public String getEdiValue(String xmlValue) {
		return xmlValue;
	}

	public String getXmlValue(String ediValue) {
		return ediValue;
	}

}
