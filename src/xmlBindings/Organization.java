package xmlBindings;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

public class Organization {

	private String ipeds;
	private String organizationName;
	private Contacts contacts;

	public Organization() {}

	public String getIpeds() {return ipeds;}
	public String getOrganizationName() {return organizationName;}
	public Contacts getContacts() {return contacts;}

	@XmlElement(name = "IPEDS")
	public void setIpeds(String ipeds) {this.ipeds = ipeds;}

	@XmlElement(name = "OrganizationName")
	public void setOrganizationName(String organizationName) {this.organizationName = organizationName;}

	@XmlElement(name = "Contacts")
	public void setContacts(Contacts contacts) {this.contacts = contacts;}

}
