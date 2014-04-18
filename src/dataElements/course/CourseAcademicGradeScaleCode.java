package dataElements.course;

import dataElements.BaseDataElement;

public class CourseAcademicGradeScaleCode extends BaseDataElement {

	public CourseAcademicGradeScaleCode() {}

	public String getEdiName() {return "CRS05";}
	public String getXmlName() {return "CourseAcademicGradeScaleCode";}
	public Boolean getIsRequired() {return false;}

	public String getEdiValue(String xmlValue) {
		return xmlValue;
	}

	public String getXmlValue(String ediValue) {
		return ediValue;
	}

}
