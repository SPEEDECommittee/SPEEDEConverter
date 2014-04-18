package xmlBindings;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

public class Address {

	private String addressLine;
	private String city;
	private String stateProvinceCode;
	private String postalCode;

	public Address() {}

	public String getAddressLine() {return addressLine;}
	public String getCity() {return city;}
	public String getStateProvinceCode() {return stateProvinceCode;}
	public String getPostalCode() {return postalCode;}

	@XmlElement(name = "AddressLine")
	public void setAddressLine(String addressLine) {this.addressLine = addressLine;}

	@XmlElement(name = "City")
	public void setCity(String city) {this.city = city;}

	@XmlElement(name = "StateProvinceCode")
	public void setStateProvinceCode(String stateProvinceCode) {this.stateProvinceCode = stateProvinceCode;}

	@XmlElement(name = "PostalCode")
	public void setPostalCode(String postalCode) {this.postalCode = postalCode;}

}
