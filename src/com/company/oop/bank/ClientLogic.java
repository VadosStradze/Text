package com.company.oop.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ClientLogic {
    public List<Double> sumOfClientBills(String name, Bank clientList) {
        Set<Client> result = clientList.getClientList();
        List<Double> amount = new ArrayList<>();
        double totalAmount = 0;
        double negativeAmount=0;
        double positiveAmount=0;
        for (Client finder : result) {
            if (finder.getName().equals(name)) {
                Set<Account> clientAccountList = finder.getAccountList();
                for (Account find : clientAccountList) {
                    totalAmount = totalAmount + find.getResource();
                    if (find.getResource()>=0){
                        positiveAmount = positiveAmount+find.getResource();
                    }else {
                        negativeAmount = negativeAmount + find.getResource();
                    }

                }
                amount.add(positiveAmount);
                amount.add(negativeAmount);
                amount.add(totalAmount);
            }
        }

        return amount;

    }
}
