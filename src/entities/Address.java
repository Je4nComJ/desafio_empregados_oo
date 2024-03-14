package entities;

public class Address {
	private static String email;
	private String phone;
	
	public Address() {
	}

	public Address(String email, String phone) {
		Address.email = email;
		this.phone = phone;
	}

	public static String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		Address.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return email;
	}
	
}
