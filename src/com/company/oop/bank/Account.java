package com.company.oop.bank;

import java.util.Objects;

public class Account {
    private Integer accountNumber;
    private boolean status;
    private Double resource;

    public Account(Integer accountNumber, boolean status, Double  resource) {
        this.accountNumber = accountNumber;
        this.status = status;
        this.resource = resource;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", status=" + status +
                ", resource'" + resource + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return status == account.status && Objects.equals(accountNumber, account.accountNumber) && Objects.equals(resource, account.resource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, status, resource);
    }

    public Account(){

    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Double getResource() {
        return resource;
    }

    public void setResource(Double resource) {
        this.resource = resource;
    }
}
