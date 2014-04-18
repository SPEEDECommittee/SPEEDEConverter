package xmlBindings;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

public class Phone {

	private String areaCityCode;
	private String phoneNumber;

	public Phone() {}

	public String getAreaCityCode() {return areaCityCode;}
	public String getPhoneNumber() {return phoneNumber;}

	@XmlElement(name = "AreaCityCode")
	public void setAreaCityCode(String areaCityCode) {this.areaCityCode = areaCityCode;}

	@XmlElement(name = "PhoneNumber")
	public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}

}
