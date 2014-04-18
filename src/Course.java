import dataElements.*;
import dataElements.course.*;

import java.util.HashMap;
import java.util.Map;

public class Course {

	public Course() {}

	public String parseEdi(String ediSegment, String separator) {
		String xmlGroup = "<Course>";
		String courseCodeType = "";
		String[] ediDataValues = ediSegment.split(separator);
//		String[] ediDataValues = Pattern.compile(separator).split(ediSegment);
		for (String value : ediDataValues) {
			System.out.println("split=" + value);
		}
		for (int i = 0; i < ediDataValues.length; i++) {
			if (ediDataValues[i] != null && !ediDataValues[i].equals("")) {
				String dataElementName = determineDataElementName(i);
				if (dataElementName.equals("CRS10")) {
					courseCodeType = determineCourseCodeType(ediDataValues[i]);
				} else {
					if (dataElementName.equals("CRS11")) {
						if (!courseCodeType.equals("")) {
							xmlGroup += "<" + courseCodeType + ">" + ediDataValues[i] +
									"</" + courseCodeType + ">";
						}
					} else {
						BaseDataElement dataElement = ediDataElements().get(dataElementName);
						if (dataElement != null) {
							if (dataElement.getXmlValue(ediDataValues[i]) != null &&
									!dataElement.getXmlValue(ediDataValues[i]).equals("")) {
								xmlGroup += "<" + dataElement.getXmlName() + ">" +
										dataElement.getXmlValue(ediDataValues[i]) +
										"</" + dataElement.getXmlName() + ">";
							}
						}
					}
				}
			}
		}
		xmlGroup += "</Course>";
		return xmlGroup;
	}

    public String parseXml(String courseTag, String terminator) {
        String courseSegment = "CRS";

        return courseSegment + terminator;
    }

   	private Map<String, BaseDataElement> ediDataElements() {
		Map<String, BaseDataElement> map = new HashMap<String, BaseDataElement>();
		map.put("CRS01", new CourseCreditBasis());
		map.put("CRS02", new CourseCreditUnits());
		map.put("CRS03", new CourseCreditValue());
		map.put("CRS04", new CourseCreditEarned());
		map.put("CRS05", new CourseAcademicGradeScaleCode());
		map.put("CRS06", new CourseAcademicGrade());
		map.put("CRS07", null);
		map.put("CRS08", new CourseLevel());    		//??Conflict with dataElements.course.CourseCreditLevel
		map.put("CRS09", new CourseRepeatCode());
		map.put("CRS10", null);                      	//Special mapping for code qualifier
		map.put("CRS11", null);                      	//Special mapping for code qualifier
		map.put("CRS12", new CourseQualityPointsEarned());
		map.put("CRS13", null);
		map.put("CRS14", new CourseSubjectAbbreviation());
		map.put("CRS15", new CourseNumber());
		map.put("CRS16", new CourseTitle());
		map.put("CRS19", new CourseDropDate());
		return map;
	}

    private Map<String, BaseDataElement> xmlDataElements() {
        Map<String, BaseDataElement> map = new HashMap<String, BaseDataElement>();
        map.put("CourseAcademicGrade", new CourseAcademicGrade());
        map.put("CourseAcademicGradeScaleCode", new CourseAcademicGradeScaleCode());
        map.put("CourseCreditBasis", new CourseCreditBasis());
        map.put("CourseCreditEarned", new CourseCreditEarned());
        map.put("CourseCreditLevel", new CourseCreditLevel()); //Conflicts with CourseLevel
        map.put("CourseCreditUnits", new CourseCreditUnits());
        map.put("CourseCreditValue", new CourseCreditValue());
        map.put("CourseDropDate", new CourseDropDate());
        map.put("CourseLevel", new CourseLevel());
        map.put("CourseNumber", new CourseNumber());
        map.put("CourseQualityPointsEarned", new CourseQualityPointsEarned());
        map.put("CourseRepeatCode", new CourseRepeatCode());
        map.put("CourseSubjectAbbreviation", new CourseSubjectAbbreviation());
        map.put("CourseTitle", new CourseTitle());
        return map;
    }

	private String determineDataElementName(int i) {
		String dataElementName = "CRS";
		if (i < 9) {
			dataElementName += "0" + (i + 1);
		} else {
			dataElementName += (i + 1);
		}
		return dataElementName;
	}

	private String determineCourseCodeType(String dataElementValue) {
		String courseCodeType = "";
		if (dataElementValue.equals("81")) {
			courseCodeType = "CourseCIPCode";
		} else {
			if (dataElementValue.equals("CA")) {
				courseCodeType = "CourseCSISCode";
			} else {
				if (dataElementValue.equals("CC")) {
					courseCodeType = "CourseUSISCode";
				}
			}
		}
		return courseCodeType;
	}

}
