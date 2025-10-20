package br.tec.itlabs.dto;

import br.tec.itlabs.model.Customer;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CustomerDto {
    private final String name;
    private final LocalDate birthDate;
    private final String address;
    private final String email;
    private final BigDecimal salary;

    public static class Builder {
        private String name;
        private LocalDate birthDate;
        private String address;
        private String email;
        private BigDecimal salary;

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

        public CustomerDto build() {
            return new CustomerDto(this);
        }
    }

    private CustomerDto(Builder builder) {
        this.name = builder.name;
        this.birthDate = builder.birthDate;
        this.address = builder.address;
        this.email = builder.email;
        this.salary = builder.salary;
    }

    public CustomerDto toCustomerDto(Customer customer) {
        return new CustomerDto.Builder()
                .name(customer.getName())
                .birthDate(customer.getBirthDate())
                .address(customer.getAddress())
                .email(customer.getEmail())
                .salary(customer.getSalary())
                .build();
    }
}
