package org.example.Builder;

public class Address {

    private String city;
    private int code;
    private String street;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public static class AddressBuilder{

        private String city;
        private int code = 0;
        private String street;

        public AddressBuilder setCity(String city){
            this.city = city;
            return this;
        }

        public AddressBuilder setCode(int code){
            this.code = code;
            return this;
        }

        public AddressBuilder setStreet(String street){
            this.street = street;
            return this;
        }

        public Address build(){
            Address address = new Address();
            address.setCity(city);
            address.setCode(code);
            address.setStreet(street);
            return address;
        }
    }
}
