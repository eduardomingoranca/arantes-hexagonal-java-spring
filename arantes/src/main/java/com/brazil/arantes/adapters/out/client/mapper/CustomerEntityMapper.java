package com.brazil.arantes.adapters.out.client.mapper;

import com.brazil.arantes.adapters.out.repository.entity.CustomerEntity;
import com.brazil.arantes.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {
    @Mappings({
            @Mapping(target = "id", source = "id"),
            @Mapping(target = "name", source = "name"),
            @Mapping(target = "address", source = "address"),
            @Mapping(target = "cpf", source = "cpf"),
            @Mapping(target = "isValidCpf", source = "isValidCpf")
    })
    CustomerEntity toCustomerEntity(Customer customer);


    @Mappings({
            @Mapping(target = "id", source = "id"),
            @Mapping(target = "name", source = "name"),
            @Mapping(target = "address", source = "address"),
            @Mapping(target = "cpf", source = "cpf"),
            @Mapping(target = "isValidCpf", source = "isValidCpf")
    })
    Customer toCustomer(CustomerEntity customerEntity);
}
