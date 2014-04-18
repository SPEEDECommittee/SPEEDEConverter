package dataElements.course;

import dataElements.BaseDataElement;

public class CourseAcademicGrade extends BaseDataElement {

	public CourseAcademicGrade() {}

	public String getEdiName() {return "CRS06";}
	public String getXmlName() {return "CourseAcademicGrade";}
	public Boolean getIsRequired() {return false;}

	public String getEdiValue(String xmlValue) {
		return xmlValue;
	}

	public String getXmlValue(String ediValue) {
		return ediValue;
	}

}
