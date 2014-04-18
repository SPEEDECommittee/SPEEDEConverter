package xmlBindings;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

public class Contacts {

	private Address address;
	private Phone phone;
	private Email email;
	private Url url;

	public Contacts() {}

	public Address getAddress() {return address;}
	public Phone getPhone() {return phone;}
	public Email getEmail() {return email;}
	public Url getUrl() {return url;}

	@XmlElement(name = "Address")
	public void setAddress(Address address) {this.address = address;}

	@XmlElement(name = "Phone")
	public void setPhone(Phone phone) {this.phone = phone;}

	@XmlElement(name = "Email")
	public void setEmail(Email email) {this.email = email;}

	@XmlElement(name = "Url")
	public void setUrl(Url url) {this.url = url;}

}
