package br.tec.itlabs.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Customer {
    private final int id;
    private final String name;
    private final LocalDate birthDate;
    private final String address;
    private final String email;
    private final BigDecimal salary;
    private final String login;
    private final String passwordToken;

    public static class Builder {
        private int id;
        private String name;
        private LocalDate birthDate;
        private String address;
        private String email;
        private BigDecimal salary;
        private String login;
        private String passwordToken;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder birthDate(LocalDate birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder salary(BigDecimal salary) {
            this.salary = salary;
            return this;
        }

        public Builder login(String login) {
            this.login = login;
            return this;
        }

        public Builder passwordToken(String passwordToken) {
            this.passwordToken = passwordToken;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }
    }

    private Customer(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.birthDate = builder.birthDate;
        this.address = builder.address;
        this.email = builder.email;
        this.salary = builder.salary;
        this.login = builder.login;
        this.passwordToken = builder.passwordToken;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public String getLogin() {
        return login;
    }

    public String getPasswordToken() {
        return passwordToken;
    }
}
