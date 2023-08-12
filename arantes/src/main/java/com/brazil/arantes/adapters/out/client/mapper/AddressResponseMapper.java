package com.brazil.arantes.adapters.out.client.mapper;

import com.brazil.arantes.adapters.out.client.response.AddressResponse;
import com.brazil.arantes.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {
    Address toAddress(AddressResponse addressResponse);
}
