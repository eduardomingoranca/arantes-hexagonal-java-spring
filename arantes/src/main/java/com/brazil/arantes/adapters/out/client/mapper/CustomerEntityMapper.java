package com.brazil.arantes.adapters.out.client.mapper;

import com.brazil.arantes.adapters.out.repository.entity.CustomerEntity;
import com.brazil.arantes.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {
    CustomerEntity toCustomerEntity(Customer customer);
    Customer toCustomer(CustomerEntity customerEntity);
}
