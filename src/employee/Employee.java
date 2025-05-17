package employee;

import address.Address;
import person.Person;

import java.math.BigDecimal;
import java.util.Optional;


public class Employee extends Person {
    private final Optional<Integer> employeeId;
    private final Optional<String> deptName;
    private final Optional<BigDecimal> salary;

    // Constructor for Employee (Calls super from Person)
    private Employee(Builder builder) {
        super(builder.id, builder.firstName, builder.lastName, builder.age, builder.address);
        this.employeeId = builder.employeeId;
        this.deptName = builder.deptName;
        this.salary = builder.salary;
    }

    // Getters
    public Optional<Integer> getEmployeeId() {
        return employeeId;
    }

    public Optional<String> getDeptName() {
        return deptName;
    }

    public Optional<BigDecimal> getSalary() {
        return salary;
    }

    // Builder Class
    public static class Builder {
        // Fields for Person (inherited fields)
        private Optional<Integer> id = Optional.empty();
        private Optional<String> firstName = Optional.empty();
        private Optional<String> lastName = Optional.empty();
        private Optional<Integer> age = Optional.empty();
        private Optional<Address> address = Optional.empty();

        // Fields for Employee (additional fields)
        private Optional<Integer> employeeId = Optional.empty();
        private Optional<String> deptName = Optional.empty();
        private Optional<BigDecimal> salary = Optional.empty();

        // Builder methods for Person fields
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

        // Builder methods for Employee fields
        public Builder employeeId(Integer employeeId) {
            this.employeeId = Optional.ofNullable(employeeId);
            return this;
        }

        public Builder deptName(String deptName) {
            this.deptName = Optional.ofNullable(deptName);
            return this;
        }

        public Builder salary(BigDecimal salary) {
            this.salary = Optional.ofNullable(salary);
            return this;
        }

        // Build method to create Employee object
        public Employee build() {
            return new Employee(this);
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId.orElse(null) +
                ", deptName=" + deptName.orElse("N/A") +
                ", salary=" + salary.orElse(BigDecimal.ZERO) +
                ", Person Details=" + super.toString() +
                '}';
    }
}

