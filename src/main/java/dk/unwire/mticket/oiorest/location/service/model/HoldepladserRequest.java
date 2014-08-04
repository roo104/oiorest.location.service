package dk.unwire.mticket.oiorest.location.service.model;

/**
 * http://geo.oiorest.dk/holdepladser.json?navn=n%C3%B8rreport&maxantal=5
 * @author jp
 *
 */
public class HoldepladserRequest {

	private String name;
	private int maxResult;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMaxResult() {
		return this.maxResult;
	}

	public void setMaxResult(int maxResult) {
		this.maxResult = maxResult;
	}

}
