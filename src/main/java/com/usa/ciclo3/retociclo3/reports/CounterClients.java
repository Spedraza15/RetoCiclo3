package com.usa.ciclo3.retociclo3.reports;

import com.usa.ciclo3.retociclo3.model.Client;

public class CounterClients {
    private Long total;
    private Client client;

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public CounterClients(Long total, Client client) {
        this.total = total;
        this.client = client;


    }
}