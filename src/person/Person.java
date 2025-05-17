package person;


import address.Address;

import java.util.Optional;

public class Person {
    // Fields using Optional type
    private final Optional<Integer> id;
    private final Optional<String> firstName;
    private final Optional<String> lastName;
    private final Optional<Integer> age;
    private final Optional<Address> address;

    // Private constructor to prevent direct instantiation

    public Person(Optional<Integer> id, Optional<String> firstName, Optional<String> lastName, Optional<Integer> age, Optional<Address> address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    private  Person(Builder builder) {
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.address = builder.address;
    }

    // Static factory method to get a new builder instance
    public static Builder builder() {
        return new Builder();
    }

    public Optional<Integer> getId() {
        return id;
    }

    public Optional<String> getFirstName() {
        return firstName;
    }

    public Optional<String> getLastName() {
        return lastName;
    }

    public Optional<Integer> getAge() {
        return age;
    }

    public Optional<Address> getAddress() {
        return address;
    }


    // Static nested Builder class
    public static class Builder {
        private Optional<Integer> id = Optional.empty();
        private Optional<String> firstName = Optional.empty();
        private Optional<String> lastName = Optional.empty();
        private Optional<Integer> age = Optional.empty();
        private Optional<Address> address = Optional.empty();

        public Builder id(Integer id) {
            this.id = Optional.ofNullable(id);
            return this;
        }

        public Builder firstName(String firstName) {
            this.firstName = Optional.ofNullable(firstName);
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = Optional.ofNullable(lastName);
            return this;
        }

        public Builder age(Integer age) {
            this.age = Optional.ofNullable(age);
            return this;
        }

        public Builder address(Address address) {
            this.address = Optional.ofNullable(address);
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "Person: " +
                "ID: " + id.map(String::valueOf).orElse("Unknown ID") + ", " +
                "First Name: " + firstName.orElse("Unknown First Name") + ", " +
                "Last Name: " + lastName.orElse("Unknown Last Name") + ", " +
                "Age: " + age.map(String::valueOf).orElse("Unknown Age") + ", " +
                "Address: " + address.map(Address::toString).orElse("No Address Provided");
    }
}

