package com.brazil.arantes.adapters.in.controller.mapper;

import com.brazil.arantes.adapters.in.controller.request.CustomerRequest;
import com.brazil.arantes.adapters.in.controller.response.CustomerResponse;
import com.brazil.arantes.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    @Mappings({
            @Mapping(target = "id", ignore = true),
            @Mapping(target = "address", ignore = true),
            @Mapping(target = "isValidCpf", ignore = true),
            @Mapping(target = "name", source = "name"),
            @Mapping(target = "cpf", source = "cpf")
    })
    Customer toCustomer(CustomerRequest customerRequest);


    @Mappings({
            @Mapping(target = "name", source = "name"),
            @Mapping(target = "address", source = "address"),
            @Mapping(target = "cpf", source = "cpf"),
            @Mapping(target = "isValidCpf", source = "isValidCpf")
    })
    CustomerResponse toCustomerResponse(Customer customer);
}
