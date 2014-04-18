package xmlBindings;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

public class Email {

	private String emailAddress;

	public Email() {}

	public String getEmailAddress() {return emailAddress;}

	@XmlElement(name = "EmailAddress")
	public void setEmailAddress(String emailAddress) {this.emailAddress = emailAddress;}

}
