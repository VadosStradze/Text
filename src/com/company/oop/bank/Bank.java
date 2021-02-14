package com.company.oop.bank;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Bank {
    private Set<Client> clientList;
    public Set<Client> getClientList() {
        return clientList;
    }
    public Bank(){
        clientList = new HashSet<>();
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




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bank bank = (Bank) o;
        return Objects.equals(clientList, bank.clientList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientList);
    }
}


