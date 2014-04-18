package dataElements;

import dataElements.course.CourseCreditLevel;

public class TestDataElement {

	public static void main(String[] args) {
		CourseCreditLevel courseLevel = new CourseCreditLevel();
		System.out.println("getEdiName=" + courseLevel.getEdiName());
		System.out.println("getXmlName=" + courseLevel.getXmlName());
		System.out.println("getEdiValue=" + courseLevel.getEdiValue("Remedial"));
		System.out.println("getEdiValue=" + courseLevel.getEdiValue("CollegePreparatory"));
		System.out.println("getXmlValue=" + courseLevel.getXmlValue("DL"));
		System.out.println("getIsRequired=" + courseLevel.getIsRequired());
	}

}