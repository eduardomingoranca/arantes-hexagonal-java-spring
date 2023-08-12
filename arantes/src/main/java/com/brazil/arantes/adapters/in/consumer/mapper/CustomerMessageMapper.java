package com.brazil.arantes.adapters.in.consumer.mapper;

import com.brazil.arantes.adapters.in.consumer.message.CustomerMessage;
import com.brazil.arantes.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMessageMapper {
    @Mapping(target = "address", ignore = true)
    Customer toCustomer(CustomerMessage customerMessage);

}
