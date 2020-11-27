package com.company.oop.bank;

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
