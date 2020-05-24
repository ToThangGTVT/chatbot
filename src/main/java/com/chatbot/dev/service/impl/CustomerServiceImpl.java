package com.chatbot.dev.service.impl;

import com.chatbot.dev.entity.Customer;
import com.chatbot.dev.repository.CustomerRepository;
import com.chatbot.dev.service.CustomerService;
import com.chatbot.dev.utils.CurlToBlock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    private Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public void connect(Customer customer) throws IOException {

        if (!checkExits(customer)) {
            save(customer);
        }

        CurlToBlock.accessToBlock("", "alertBegin", String.valueOf(customer.getId()));
    }

    private boolean checkExits(Customer customer) {
        Optional<Customer> customerCheck = customerRepository.findById(customer.getId());
        return customerCheck.isPresent();
    }

}
