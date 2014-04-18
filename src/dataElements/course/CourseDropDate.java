package dataElements.course;

import dataElements.BaseDataElement;

public class CourseDropDate extends BaseDataElement {

	public CourseDropDate() {}

	public String getEdiName() {return "CRS19";}
	public String getXmlName() {return "CourseDropDate";}
	public Boolean getIsRequired() {return false;}

	public String getEdiValue(String xmlValue) {
		return xmlValue;
	}

	public String getXmlValue(String ediValue) {
		return ediValue;
	}

}
