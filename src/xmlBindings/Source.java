package xmlBindings;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

public class Source {

	private Organization organization;

	public Source() {}

	public Organization getOrganization() {return organization;}

	@XmlElement(name = "Organization")
	public void setOrganization(Organization organization) {this.organization = organization;}

}
