package com;

import java.util.*;

public class Bank {

    Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        this.users.putIfAbsent(user, new ArrayList<>());
    }

    public void deleteUser(User user) {
        this.users.remove(user);
    }

    public void addAccountToUser(String passport, Account account) {
        getUserAccounts(passport).add(account);
    }

    public void deleteAccountFromUser(String passport, Account account) {
        getUserAccounts(passport).remove(account);
    }

    public List<Account> getUserAccounts(String passport) {
        List<Account> list = new ArrayList<>();
        users.keySet().stream()
                .filter(user -> user.getPassport().equals(passport))
                .forEach(user -> list.addAll(this.users.get(user)));
        return list;
    }

    public List<Account> getAccountsByPassportAndRequisites(String passport, String requisites) {
        List<Account> accounts = new ArrayList<>();
        getUserAccounts(passport).stream()
                .filter(account -> account.getRequisites().equals(requisites))
                .forEach(account -> accounts.add(account));
        return accounts;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport, String dstRequisite, double amount) {
        boolean transfer = false;
        List<Account> srcList = getAccountsByPassportAndRequisites(srcPassport, srcRequisite);
        List<Account> dstList = getAccountsByPassportAndRequisites(destPassport, dstRequisite);

        if (!srcList.isEmpty() && !dstList.isEmpty()) {
            transfer = srcList.get(0).transfer(dstList.get(0), amount);
        }

        return transfer;
    }
}