package dk.unwire.mticket.oiorest.location.service.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Stop {

	@JsonProperty("holdepladsnr")
	private String stopNumber;

	@JsonProperty("navn")
	private String name;

	@JsonProperty("wgs84koordinat")
	private Wgs84coordinat wgs84coordinat;

	public String getStopNumber() {
		return this.stopNumber;
	}

	public void setStopNumber(String stopNumber) {
		this.stopNumber = stopNumber;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Wgs84coordinat getWgs84coordinat() {
		return this.wgs84coordinat;
	}

	public void setWgs84coordinat(Wgs84coordinat wgs84coordinat) {
		this.wgs84coordinat = wgs84coordinat;
	}



}
