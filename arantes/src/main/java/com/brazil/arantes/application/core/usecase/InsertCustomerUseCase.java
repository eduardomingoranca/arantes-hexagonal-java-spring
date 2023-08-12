package com.brazil.arantes.application.core.usecase;

import com.brazil.arantes.application.core.domain.Address;
import com.brazil.arantes.application.core.domain.Customer;
import com.brazil.arantes.application.ports.out.FindAddressByZipCodeOutputPort;
import com.brazil.arantes.application.ports.out.InsertCustomerOutputPort;

public class InsertCustomerUseCase {
    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;
    private final InsertCustomerOutputPort insertCustomerOutputPort;

    public InsertCustomerUseCase(FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort,
                                 InsertCustomerOutputPort insertCustomerOutputPort) {
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
    }

    public void insert(Customer customer, String zipCode) {
        // obtendo o endereco do cliente
        Address address = findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        insertCustomerOutputPort.insert(customer);
    }
}
