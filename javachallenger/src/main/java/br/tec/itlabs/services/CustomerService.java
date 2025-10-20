package br.tec.itlabs.services;

import br.tec.itlabs.dao.CustomerDao;
import br.tec.itlabs.dto.CustomerDto;
import br.tec.itlabs.model.Customer;

public class CustomerService {

    CustomerDao customerDao;

    CustomerService(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public CustomerDto findById(int customerId) {
        if (customerId > 0 ) {
            customerDao.findById(customerId);
        }
        return null;
    }
}
