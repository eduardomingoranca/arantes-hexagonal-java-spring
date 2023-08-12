package com.brazil.arantes.adapters.in.consumer;

import com.brazil.arantes.adapters.in.consumer.mapper.CustomerMessageMapper;
import com.brazil.arantes.adapters.in.consumer.message.CustomerMessage;
import com.brazil.arantes.application.core.domain.Customer;
import com.brazil.arantes.application.ports.in.UpdateCustomerInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiveValidatedCpfConsumer {
    @Autowired
    private UpdateCustomerInputPort updateCustomerInputPort;

    @Autowired
    private CustomerMessageMapper customerMessageMapper;

    @KafkaListener(topics = "tp-cpf-validated", groupId = "arantes")
    public void receive(CustomerMessage customerMessage) {
        Customer customer = customerMessageMapper.toCustomer(customerMessage);
        updateCustomerInputPort.update(customer, customerMessage.getZipCode());
    }

}
