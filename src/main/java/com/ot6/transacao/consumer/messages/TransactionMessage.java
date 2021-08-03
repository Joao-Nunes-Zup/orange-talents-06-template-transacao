package com.ot6.transacao.consumer.messages;

import com.ot6.transacao.consumer.messages.CardMessage;
import com.ot6.transacao.consumer.messages.EstablishmentMessage;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransactionMessage {

    private String id;
    private BigDecimal valor;
    private EstablishmentMessage estabelecimento;
    private CardMessage cartao;
    private LocalDateTime efetivadaEm;

    public String getId() {
        return id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public EstablishmentMessage getEstabelecimento() {
        return estabelecimento;
    }

    public CardMessage getCartao() {
        return cartao;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }

    @Override
    public String toString() {
        return "TransactionMessage{" +
                "id='" + id + '\'' +
                ", valor=" + valor +
                ", estabelecimento=" + estabelecimento +
                ", cartao=" + cartao +
                ", efetivadaEm=" + efetivadaEm +
                '}';
    }
}
