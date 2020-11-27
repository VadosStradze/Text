package com.company.oop.bank;

import java.util.HashSet;
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
}
