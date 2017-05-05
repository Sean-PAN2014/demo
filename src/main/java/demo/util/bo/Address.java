package demo.util.bo;

public class Address {
	private String city;

	public Address() {
	}

	public Address(String city) {
		super();
		this.city = city;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Address [city=");
		builder.append(city);
		builder.append("]");
		return builder.toString();
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
