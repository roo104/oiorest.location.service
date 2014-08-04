package dk.unwire.mticket.oiorest.location.service.model;

import org.codehaus.jackson.annotate.JsonProperty;

public class Wgs84coordinat {

	@JsonProperty("bredde")
	private float latitude;
	@JsonProperty("længde")
	private float longitude;

	public float getLongitude() {
		return this.longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

	public float getLatitude() {
		return this.latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

}
