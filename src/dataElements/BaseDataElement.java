package dataElements;

import java.util.Map;

public abstract class BaseDataElement {

	public abstract String getEdiName();
	public abstract String getXmlName();
	public abstract Boolean getIsRequired();
	public abstract String getEdiValue(String xmlValue);
	public abstract String getXmlValue(String ediValue);

}
