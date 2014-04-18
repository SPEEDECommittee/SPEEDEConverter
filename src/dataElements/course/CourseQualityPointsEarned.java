package dataElements.course;

import dataElements.BaseDataElement;

public class CourseQualityPointsEarned extends BaseDataElement {

	public CourseQualityPointsEarned() {}

	public String getEdiName() {return "CRS12";}
	public String getXmlName() {return "CourseQualityPointsEarned";}
	public Boolean getIsRequired() {return false;}

	public String getEdiValue(String xmlValue) {
		return xmlValue;
	}

	public String getXmlValue(String ediValue) {
		return ediValue;
	}

}
