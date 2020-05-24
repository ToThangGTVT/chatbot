package com.chatbot.dev.entity.json;

import java.util.List;

public class Messages {

    private List<Attachment> list;

    public Messages(List<Attachment> messages) {
        super();
        this.list = messages;
    }

    public Messages() {
        // TODO Auto-generated constructor stub
    }

    public List<Attachment> getMessages() {
        return list;
    }

    public void setMessages(List<Attachment> messages) {
        this.list = messages;
    }

}
