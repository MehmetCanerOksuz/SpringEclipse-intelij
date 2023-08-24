package com.caneroksuz.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MessageProcessorImpl implements MessageProcessor {

    @Autowired
    @Qualifier("cService")
    private SelectService selectService;




    @Override
    public void processingMsg(String message) {
        selectService.sendMsg(message);
    }
}
