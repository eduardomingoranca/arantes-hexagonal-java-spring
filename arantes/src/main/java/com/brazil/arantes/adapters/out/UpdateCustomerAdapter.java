package com.brazil.arantes.adapters.out;

import com.brazil.arantes.adapters.out.client.mapper.CustomerEntityMapper;
import com.brazil.arantes.adapters.out.repository.CustomerRepository;
import com.brazil.arantes.adapters.out.repository.entity.CustomerEntity;
import com.brazil.arantes.application.core.domain.Customer;
import com.brazil.arantes.application.ports.out.UpdateCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateCustomerAdapter implements UpdateCustomerOutputPort {
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void update(Customer customer) {
        CustomerEntity customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }

}
