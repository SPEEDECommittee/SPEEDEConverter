package xmlBindings;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

public class Destination {

	private Organization organization;

	public Destination() {}

	public Organization getOrganization() {return organization;}

	@XmlElement(name = "Organization")
	public void setOrganization(Organization organization) {this.organization = organization;}


}
