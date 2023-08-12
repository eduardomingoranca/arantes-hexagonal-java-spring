package com.brazil.arantes.adapters.in.consumer.mapper;

import com.brazil.arantes.adapters.in.consumer.message.CustomerMessage;
import com.brazil.arantes.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CustomerMessageMapper {

    @Mappings({
            @Mapping(target = "address", ignore = true),
            @Mapping(target = "id", source = "id"),
            @Mapping(target = "name", source = "name"),
            @Mapping(target = "cpf", source = "cpf"),
            @Mapping(target = "isValidCpf", source = "isValidCpf"),
    })
    Customer toCustomer(CustomerMessage customerMessage);

}
