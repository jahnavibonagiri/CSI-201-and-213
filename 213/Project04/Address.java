package Project04;

public class Address{
	
    private String street;
    private String city;
    private String state;
    private String zipcode;
    
/**
 * Address constructor
 * 
 * @param street Stree name
 * @param city city name
 * @param state state name
 * @param zipcode zip code
 */
    public  Address(String street, String city, String state, String zipcode) {
            this.street = street;
            this.city = city;
            this.state = state;
            this.zipcode = zipcode;
    }

public String getCity() {
    return city;
}

public String getStreet() {
    return street;
}

public String getState() {
    return state;
}

public String getZipcode() {
    return zipcode;
}

public void setCity(String city) {
    this.city = city;
}

public void setStreet(String street) {
    this.street = street;
}

public void setState(String state) {
    this.state = state;
}

public void setZipcode(String zipcode) {
    this.zipcode = zipcode;
}
}

