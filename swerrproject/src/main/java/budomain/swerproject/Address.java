package budomain.swerproject;

public class Address {
	String streetName;
	String houseNumber;
	String city;

	/*public Address(String streetName, String houseNumber, String city) {

		
	}*/

	public Address(String city2, String street, String house) {
		this.streetName = street;
		this.houseNumber = house;
		this.city = city2;// TODO Auto-generated constructor stub
	}

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public String getStreetName() {
		return streetName;
	}

	public  void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
}
