package com.ot6.transacao.consumer.messages;

public class CardMessage {

    private String id;
    private String email;

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "CardMessage{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
