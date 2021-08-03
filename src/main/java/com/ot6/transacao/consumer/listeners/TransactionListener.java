package com.ot6.transacao.consumer.listeners;

import com.ot6.transacao.consumer.messages.TransactionMessage;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TransactionListener {

    @KafkaListener(topics = "${spring.kafka.topic.transactions}")
    public void listen(TransactionMessage transactionMessage) {
        System.out.println("---------------------------");
        System.out.println(transactionMessage.toString());
    }
}
