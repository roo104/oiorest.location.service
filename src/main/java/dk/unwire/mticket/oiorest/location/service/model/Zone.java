package dk.unwire.mticket.oiorest.location.service.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * http://geo.oiorest.dk/takstzoner.json?operat%C3%B8rnr=200
 * @author jp
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Zone {

	@JsonProperty("nr")
	private int number;
	@JsonProperty("operatør")
	private Operator operator;

}
