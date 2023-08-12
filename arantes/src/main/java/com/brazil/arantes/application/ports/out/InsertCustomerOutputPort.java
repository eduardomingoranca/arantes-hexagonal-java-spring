package com.brazil.arantes.application.ports.out;

import com.brazil.arantes.application.core.domain.Customer;

public interface InsertCustomerOutputPort {
    void insert(Customer customer);
}
