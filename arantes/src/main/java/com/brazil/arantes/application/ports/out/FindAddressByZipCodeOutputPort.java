package com.brazil.arantes.application.ports.out;

import com.brazil.arantes.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {
    Address find(String zipCode);
}
