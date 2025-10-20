package br.tec.itlabs.dao;

import br.tec.itlabs.model.Customer;

public class CustomerDao {

    public Customer findById(int customerId) {
        return new Customer.Builder().id(customerId).build();
    }
}
