package dataElements.course;

import dataElements.BaseDataElement;

public class CourseCreditValue extends BaseDataElement {

	public CourseCreditValue() {}

	public String getEdiName() {return "CRS03";}
	public String getXmlName() {return "CourseCreditValue";}
	public Boolean getIsRequired() {return false;}

	public String getEdiValue(String xmlValue) {
		return xmlValue;
	}

	public String getXmlValue(String ediValue) {
		return ediValue;
	}

}
