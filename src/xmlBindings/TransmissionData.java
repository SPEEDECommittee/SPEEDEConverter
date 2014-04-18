package xmlBindings;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

public class TransmissionData {

	private String documentId;
	private String createdDateTime;
	private String documentTypeCode;
	private String transmissionType;
	private Source source;
	private Destination destination;

	public TransmissionData() {}

	public String getDocumentId() {return documentId;}
	public String getCreatedDateTime() {return createdDateTime;}
	public String getDocumentTypeCode() {return documentTypeCode;}
	public String getTransmissionType() {return transmissionType;}
	public Source getSource() {return source;}
	public Destination getDestination() {return destination;}

	@XmlElement(name = "DocumentID")
	public void setDocumentId(String documentId) {this.documentId = documentId;}

	@XmlElement(name = "CreatedDateTime")
	public void setCreatedDateTime(String createdDateTime) {this.createdDateTime = createdDateTime;}

	@XmlElement(name = "DocumentTypeCode")
	public void setDocumentTypeCode(String documentTypeCode) {this.documentTypeCode = documentTypeCode;}

	@XmlElement(name = "TransmissionType")
	public void setTransmissionType(String transmissionType) {this.transmissionType = transmissionType;}

	@XmlElement(name = "Source")
	public void setSource(Source source) {this.source = source;}

	@XmlElement(name = "Destination")
	public void setDestination(Destination destination) {this.destination = destination;}

}
