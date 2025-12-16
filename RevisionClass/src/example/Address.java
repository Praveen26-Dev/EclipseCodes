package example;

public class Address {
	String H_No;
	String h_Pin;
	String city;


	public Address(String h_No, String h_Pin, String city) {
		super();
		H_No = h_No;
		this.h_Pin = h_Pin;
		this.city = city;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return H_No+" , "+h_Pin+" , "+city;
	}

}
