package com.brazil.arantes.application.ports.out;

import com.brazil.arantes.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {
    Optional<Customer> find(String id);
}
