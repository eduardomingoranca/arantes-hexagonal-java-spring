package com.brazil.arantes.application.ports.in;

import com.brazil.arantes.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {
    Customer find(String id);
}
