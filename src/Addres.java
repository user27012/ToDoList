public class Addres {
    private String index;
    private String country;
    private String city;
    private String street;
    private String house;
    private String apartment;


    public Addres(String index, String country, String city, String street, String house, String apartment) {
        this.index = index;
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
        this.apartment = apartment;
    }


    public String getIndex() {
        return index;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHouse() {
        return house;
    }

    public String getApartment() {
        return apartment;
    }

}