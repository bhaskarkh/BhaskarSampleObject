package address;

import java.util.Optional;

public class Address {
    // Fields (Attributes) using Optional type
    private final Optional<Integer> id;
    private final Optional<String> street;
    private final Optional<String> city;
    private final Optional<String> state;
    private final Optional<String> country;
    private final Optional<String> pincode;

    // Private constructor to prevent direct instantiation
    private Address(Builder builder) {
        this.id = builder.id;
        this.street = builder.street;
        this.city = builder.city;
        this.state = builder.state;
        this.country = builder.country;
        this.pincode = builder.pincode;
    }

    // Static factory method to get a new builder instance
    public static Builder builder() {
        return new Builder();
    }

    public Optional<Integer> getId() {
        return id;
    }

    public Optional<String> getStreet() {
        return street;
    }

    public Optional<String> getCity() {
        return city;
    }

    public Optional<String> getState() {
        return state;
    }

    public Optional<String> getCountry() {
        return country;
    }

    public Optional<String> getPincode() {
        return pincode;
    }


    // Static nested Builder class
    public static class Builder {
        // Optional fields initialized as empty
        private Optional<Integer> id = Optional.empty();
        private Optional<String> street = Optional.empty();
        private Optional<String> city = Optional.empty();
        private Optional<String> state = Optional.empty();
        private Optional<String> country = Optional.empty();
        private Optional<String> pincode = Optional.empty();

        // Builder method for id
        public Builder id(Integer id) {
            this.id = Optional.ofNullable(id);
            return this;
        }

        // Builder method for street
        public Builder street(String street) {
            this.street = Optional.ofNullable(street);
            return this;
        }

        // Builder method for city
        public Builder city(String city) {
            this.city = Optional.ofNullable(city);
            return this;
        }

        // Builder method for state
        public Builder state(String state) {
            this.state = Optional.ofNullable(state);
            return this;
        }

        // Builder method for country
        public Builder country(String country) {
            this.country = Optional.ofNullable(country);
            return this;
        }

        // Builder method for pincode
        public Builder pincode(String pincode) {
            this.pincode = Optional.ofNullable(pincode);
            return this;
        }

        // Build method to create an Address instance
        public Address build() {
            return new Address(this);
        }
    }

    // Overriding toString() method for easy printing of the address
    @Override
    public String toString() {
        return "Address: " +
                "ID: " + id.map(String::valueOf).orElse("Unknown ID") + ", " +
                "Street: " + street.orElse("Unknown Street") + ", " +
                "City: " + city.orElse("Unknown City") + ", " +
                "State: " + state.orElse("Unknown State") + ", " +
                "Country: " + country.orElse("Unknown Country") + ", " +
                "Pincode: " + pincode.orElse("Unknown Pincode");
    }
}
