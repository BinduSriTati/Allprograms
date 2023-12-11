public class Address {
    public int doorno;
    public String street;
    public String city;

    public int getDoorno() {
        return doorno;
    }

    public void setDoorno(int doorno) {
        this.doorno = doorno;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" + "doorno=" + doorno + ", street='" + street + '\'' + ", city='" + city + '\'' + '}';
    }

    public Address (int doorno, String street, String city) {
        this.doorno=doorno;
        this.street=street;
        this.city=city;




    }
}
