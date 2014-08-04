package dk.unwire.mticket.oiorest.location.service.datatypes;

public enum TariffZone {

	BAT(240, "BAT,"),
	MOVIA_H(200, "Movia H"),
	MOVIA_S(235, "Movia S"),
	MOVIA_V(230, "Movia V"),
	NT(280, "NT");

	private int number;
	private String name;

	private TariffZone(int number, String name) {
		this.number = number;
		this.name = name;
	}

	public int getNumber() {
		return this.number;
	}

	public String getName() {
		return this.name;
	}
}
