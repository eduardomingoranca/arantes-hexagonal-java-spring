package com.brazil.arantes.config;

import com.brazil.arantes.adapters.out.FindAddressByZipCodeAdapter;
import com.brazil.arantes.adapters.out.UpdateCustomerAdapter;
import com.brazil.arantes.application.core.usecase.FindCustomerByIdUseCase;
import com.brazil.arantes.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {
    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(FindCustomerByIdUseCase findCustomerByIdUseCase,
                                                       FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
                                                       UpdateCustomerAdapter updateCustomerAdapter) {
        return new UpdateCustomerUseCase(findCustomerByIdUseCase, findAddressByZipCodeAdapter, updateCustomerAdapter);
    }

}
