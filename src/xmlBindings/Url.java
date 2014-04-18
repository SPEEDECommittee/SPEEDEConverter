package xmlBindings;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

public class Url {

	private String urlAddress;

	Url() {}

	public String getUrlAddress() {return urlAddress;}

	@XmlElement(name = "URLAddress")
	public void setUrlAddress(String urlAddress) {this.urlAddress = urlAddress;}

}
