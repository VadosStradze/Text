package com.company.oop.bank;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Client {
    private String name;
    private Set<Account> accountList;

    public Client(String name) {
        this.name = name;
        this.accountList = new HashSet<>();
    }
    public Client(){

    }
    public Client(String name, Set<Account> accountList){
        this.accountList = accountList;
        this.name = name;
    }


    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", accountList=" + accountList +
                '}';
    }

    public void add(Account account){
        accountList.add(account);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(Set<Account> accountList) {
        this.accountList = accountList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(name, client.name) && Objects.equals(accountList, client.accountList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, accountList);
    }
}
