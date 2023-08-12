package com.brazil.arantes.application.core.usecase;

import com.brazil.arantes.application.core.domain.Address;
import com.brazil.arantes.application.core.domain.Customer;
import com.brazil.arantes.application.ports.in.InsertCustomerInputPort;
import com.brazil.arantes.application.ports.out.FindAddressByZipCodeOutputPort;
import com.brazil.arantes.application.ports.out.InsertCustomerOutputPort;
import com.brazil.arantes.application.ports.out.SendCpfForValidationOutputPort;

public class InsertCustomerUseCase implements InsertCustomerInputPort {
    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;
    private final InsertCustomerOutputPort insertCustomerOutputPort;
    private final SendCpfForValidationOutputPort sendCpfForValidationOutputPort;


    public InsertCustomerUseCase(FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort,
                                 InsertCustomerOutputPort insertCustomerOutputPort,
                                 SendCpfForValidationOutputPort sendCpfForValidationOutputPort) {
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
        this.sendCpfForValidationOutputPort = sendCpfForValidationOutputPort;
    }

    @Override
    public void insert(Customer customer, String zipCode) {
        // obtendo o endereco do cliente
        Address address = findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        insertCustomerOutputPort.insert(customer);
        // enviando o cpf do cliente para a validacao
        sendCpfForValidationOutputPort.send(customer.getCpf());
    }

}
