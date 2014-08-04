package dk.unwire.mticket.oiorest.location.service.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * http://geo.oiorest.dk/takstzoner/operat%C3%B8rer.json
 * @author jp
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Operator {

	@JsonProperty("nr")
	private int number;
	@JsonProperty("navn")
	private String name;
	private String takstzoner;

	public int getNumber() {
		return this.number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTakstzoner() {
		return this.takstzoner;
	}

	public void setTakstzoner(String takstzoner) {
		this.takstzoner = takstzoner;
	}

}
