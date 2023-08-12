package com.brazil.arantes.adapters.out.client.mapper;

import com.brazil.arantes.adapters.out.client.response.AddressResponse;
import com.brazil.arantes.application.core.domain.Address;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {
    @Mappings({
            @Mapping(target = "street", source = "street"),
            @Mapping(target = "city", source = "city"),
            @Mapping(target = "state", source = "state")
    })
    Address toAddress(AddressResponse addressResponse);
}
