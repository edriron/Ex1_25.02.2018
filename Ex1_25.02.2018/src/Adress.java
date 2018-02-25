public class Adress {
	private int houseNum;
	private String city;
	private String country;
	
	public Adress (int houseNum, String city, String country) {
		this.houseNum = houseNum;
		this.city = city;
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "[City " + city + ", house number " + houseNum + ", " + country + "]";
	}
}