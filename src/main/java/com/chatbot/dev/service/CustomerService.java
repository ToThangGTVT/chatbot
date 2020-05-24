package com.chatbot.dev.service;

import com.chatbot.dev.entity.Customer;

import java.io.IOException;

public interface CustomerService {

    void connect(Customer customer) throws IOException;

}
