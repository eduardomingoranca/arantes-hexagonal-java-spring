package com.brazil.arantes.adapters.out;

import com.brazil.arantes.adapters.out.client.FindAddressByZipCodeClient;
import com.brazil.arantes.adapters.out.client.mapper.AddressResponseMapper;
import com.brazil.arantes.adapters.out.client.response.AddressResponse;
import com.brazil.arantes.application.core.domain.Address;
import com.brazil.arantes.application.ports.out.FindAddressByZipCodeOutputPort;
import org.springframework.beans.factory.annotation.Autowired;

public class FindAddressByZipCodeAdapter implements FindAddressByZipCodeOutputPort {
    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        AddressResponse addressResponse = findAddressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }

}
