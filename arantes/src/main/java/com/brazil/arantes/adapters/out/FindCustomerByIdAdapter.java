package com.brazil.arantes.adapters.out;

import com.brazil.arantes.adapters.out.client.mapper.CustomerEntityMapper;
import com.brazil.arantes.adapters.out.repository.CustomerRepository;
import com.brazil.arantes.adapters.out.repository.entity.CustomerEntity;
import com.brazil.arantes.application.core.domain.Customer;
import com.brazil.arantes.application.ports.out.FindCustomerByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindCustomerByIdAdapter implements FindCustomerByIdOutputPort {
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public Optional<Customer> find(String id) {
        Optional<CustomerEntity> customerEntity = customerRepository.findById(id);
        return customerEntity.map(entity -> customerEntityMapper.toCustomer(entity));
    }

}
