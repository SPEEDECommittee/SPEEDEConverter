package xmlBindings;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CollegeTranscript")
public class CollegeTranscript {

	private TransmissionData transmissionData;
	private Student student;

	public CollegeTranscript() {}

	public TransmissionData getTransmissionData() {return transmissionData;}
	public Student getStudent() {return  student;}

	@XmlElement(name = "TransmissionData")
	public void setTransmissionData(TransmissionData transmissionData) {
		this.transmissionData = transmissionData;
	}

	@XmlElement(name = "Student")
	public void setStudent(Student student) {this.student = student;}

}
