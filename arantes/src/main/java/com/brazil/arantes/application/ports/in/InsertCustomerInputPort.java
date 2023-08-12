package com.brazil.arantes.application.ports.in;

import com.brazil.arantes.application.core.domain.Customer;

public interface InsertCustomerInputPort {
    void insert(Customer customer, String zipCode);
}
