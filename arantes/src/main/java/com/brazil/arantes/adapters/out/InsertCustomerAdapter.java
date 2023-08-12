package com.brazil.arantes.adapters.out;

import com.brazil.arantes.adapters.out.client.mapper.CustomerEntityMapper;
import com.brazil.arantes.adapters.out.repository.CustomerRepository;
import com.brazil.arantes.adapters.out.repository.entity.CustomerEntity;
import com.brazil.arantes.application.core.domain.Customer;
import com.brazil.arantes.application.ports.out.InsertCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerAdapter implements InsertCustomerOutputPort {
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void insert(Customer customer) {
        CustomerEntity customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }

}
