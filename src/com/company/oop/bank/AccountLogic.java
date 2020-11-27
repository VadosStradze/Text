package com.company.oop.bank;

import java.util.HashSet;
import java.util.Set;

public class AccountLogic {
    public Set<Client> findClientByName(String name, Bank clientList) {
        Set<Client> result = new HashSet<>();
        Set<Client> list = clientList.getClientList();
        for (Client finder : list) {
            if (finder.getName().equals(name)) {
                result.add(finder);
            }

        }
        return result;

    }




}
