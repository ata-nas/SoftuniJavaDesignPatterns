public class AddressBuilder {
    private String name;
    private String telephone;
    private String email;
    private String street;
    private String city;
    private String country;

    private AddressBuilder() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private final AddressBuilder builderAddress;

        private Builder() {
            builderAddress = new AddressBuilder();
        }

        public Builder withName(String name) {
            builderAddress.name = name;
            return this;
        }

        public Builder withTelephone(String telephone) {
            builderAddress.telephone = telephone;
            return this;
        }

        public Builder withEmail(String email) {
            builderAddress.email = email;
            return this;
        }

        public Builder withStreet(String street) {
            builderAddress.street = street;
            return this;
        }

        public Builder withCity(String city) {
            builderAddress.city = city;
            return this;
        }

        public Builder withCountry(String country) {
            builderAddress.country = country;
            return this;
        }

        public AddressBuilder build() {
            return builderAddress;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "name='" + name + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

}


