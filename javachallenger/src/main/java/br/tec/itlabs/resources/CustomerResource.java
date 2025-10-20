package br.tec.itlabs.resources;

import br.tec.itlabs.dto.CustomerDto;
import br.tec.itlabs.services.CustomerService;

public class CustomerResource {

    CustomerService customerService;

    CustomerResource(CustomerService customerService) {
        this.customerService = customerService;
    }

    public CustomerDto findById(int customerId) {
        return customerService.findById(customerId);
    }
}
