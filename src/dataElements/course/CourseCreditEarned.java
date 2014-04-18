package dataElements.course;

import dataElements.BaseDataElement;

public class CourseCreditEarned extends BaseDataElement {

	public CourseCreditEarned() {}

	public String getEdiName() {return "CRS04";}
	public String getXmlName() {return "CourseCreditEarned";}
	public Boolean getIsRequired() {return false;}

	public String getEdiValue(String xmlValue) {
		return xmlValue;
	}

	public String getXmlValue(String ediValue) {
		return ediValue;
	}

}
