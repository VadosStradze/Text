package com.company.oop.bank;

import java.util.HashSet;
import java.util.Set;

public class Bank {
    private Set<Client> clientList;

    public Set<Client> getClientList() {
        return clientList;
    }

    public void setClientList(Set<Client> clientList) {
        this.clientList = clientList;
    }
    public void add(Client client){
        clientList.add(client);
    }


    @Override
    public String toString() {
        return "Bank{" +
                "clientList=" + clientList +
                '}';
    }

    public Bank(){
        clientList = new HashSet<>();
    }

}
