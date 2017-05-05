package demo.util.vo;

public class PhoneNumber {
	private String number;

	public PhoneNumber() {
	}

	public PhoneNumber(String number) {
		super();
		this.number = number;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PhoneNumber [number=");
		builder.append(number);
		builder.append("]");
		return builder.toString();
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

}
