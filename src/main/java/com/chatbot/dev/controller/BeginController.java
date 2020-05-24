package com.chatbot.dev.controller;

import com.chatbot.dev.entity.Customer;
import com.chatbot.dev.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class BeginController {

    @Autowired
    private CustomerService customerService;

    @GetMapping(value = "/begin")
    private void showHome(Customer customer) throws IOException {
        customerService.connect(customer);
    }
}
