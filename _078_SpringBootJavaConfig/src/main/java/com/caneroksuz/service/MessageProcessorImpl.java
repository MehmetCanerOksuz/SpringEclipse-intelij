package com.caneroksuz.service;


public class MessageProcessorImpl implements MessageProcessor {

    private SelectService selectService;


    public MessageProcessorImpl(SelectService selectService) {

        this.selectService = selectService;
    }

    public void setSelectService(SelectService selectService) {

        this.selectService = selectService;
    }

    @Override
    public void processingMsg(String message) {
        selectService.sendMsg(message);
    }
}
