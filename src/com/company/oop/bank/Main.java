package com.company.oop.bank;

public class Main {

    public static void main(String[] args) {
        Client client = new Client("Vadim");
        Client client1 = new Client("Serega");
        AccountLogic finder = new AccountLogic();
        Bank clientList = new Bank();
        ClientLogic calculator = new ClientLogic();


        Account account = new Account(453214, true, -23.42);
        Account account2 = new Account(453215, false, 65.92);
        Account account3 = new Account(453216, true, 57.81);

        Account account4 = new Account(453217, true, -10.0);
        Account account5 = new Account(453218, false, 30.20);
        Account account6 = new Account(453219, true, 40.80);

        client1.add(account4);
        client1.add(account5);
        client1.add(account6);
        client.add(account);
        client.add(account2);
        client.add(account3);

        System.out.println();

        clientList.add(client);
        clientList.add(client1);

        System.out.println(finder.findClientByName("Serega", clientList));

        System.out.println();

        System.out.println(clientList);

        System.out.println();

        System.out.println(calculator.sumOfClientBills("Vadim", clientList));
    }
}
