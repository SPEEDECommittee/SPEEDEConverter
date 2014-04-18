import xmlBindings.CollegeTranscript;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SPEEDEConverter {

	public static void main(String[] args) {
		List<String> processingMessages = new ArrayList<String>();
		if (args.length < 2) {
			throw new IllegalArgumentException("inputFilePath and/or outputFilePath is/are Missing.");
		}
		File inputFilePath = new File(args[0]);
		processingMessages.add("inputFilePath=" + inputFilePath);
		File outputFilePath = new File(args[1]);
		processingMessages.add("outputFilePath=" + outputFilePath);
		File[] fileList;
		if (inputFilePath.isDirectory()) {
			fileList = inputFilePath.listFiles();
		} else {
			throw new IllegalArgumentException("inputFilePath is not a Valid directory.");
		}
		if (fileList == null || fileList.length == 0) {
			processingMessages.add("**No files to process.");
		} else {
			for (File file : fileList) {
				if (file.isFile()) {
				 	processingMessages.add("**" + file.getName() + " is being processed.");
					try {
						BufferedReader reader = new BufferedReader(new FileReader(file));
						String line = reader.readLine();
						if (line != null && !line.equals("")) {
							System.out.println("*****File Content" + line);
							if (line.startsWith("ISA")) {
								processingMessages = processEDI(line);
							} else {
								if (line.startsWith("<?xml")) {
									processingMessages = processXML(file);
								}
							}
							if (!processingMessages.isEmpty()) {

							}
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
				} else {
					processingMessages.add("**" + file.getName() + " is not a file and has been skipped.");
				}
			}
		}

	}

	private static List<String> processEDI(String line) {
		List<String> processingMessages = new ArrayList<String>();
		String terminator = escapedDelimeter(line.substring(105,106));
		String separator = escapedDelimeter(line.substring(3,4));
		System.out.println("*****terminator=" + terminator + " separator=" + separator);

		return processingMessages;
	}

	private static List<String> processXML(File file) {
		List<String> processingMessages = new ArrayList<String>();
		System.out.println("*****In processXML");
		try {
			JAXBContext collegeTranscriptContext =
					JAXBContext.newInstance(CollegeTranscript.class);
			Unmarshaller collegeTranscriptUnmarshaller = collegeTranscriptContext.createUnmarshaller();
			CollegeTranscript collegeTranscript = (CollegeTranscript)collegeTranscriptUnmarshaller.unmarshal(file);
			System.out.println("*****DocumentID=" + collegeTranscript.getTransmissionData().getDocumentId());
			System.out.println("*****CreateDateTime=" + collegeTranscript.getTransmissionData().getCreatedDateTime());
			System.out.println("*****DocumentTypeCode=" + collegeTranscript.getTransmissionData().getDocumentTypeCode());
			System.out.println("*****TransmissionType=" + collegeTranscript.getTransmissionData().getTransmissionType());
			System.out.println("*****Source-Organization-IPEDS=" + collegeTranscript.getTransmissionData().getSource().getOrganization().getIpeds());
			System.out.println("*****Source-Organization-OrganizationName=" + collegeTranscript.getTransmissionData().getSource().getOrganization().getOrganizationName());

		} catch (Exception e) {
			processingMessages.add(e.getMessage());
			e.printStackTrace();
		}

		return processingMessages;
	}

	private static String escapedDelimeter(String delimeter) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("|", "\\|");
		if (map.get(delimeter) == null || map.get(delimeter).isEmpty()) {
			return delimeter;
		} else {
			return map.get(delimeter);
		}
	}

}
