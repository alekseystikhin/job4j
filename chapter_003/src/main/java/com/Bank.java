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

    public Account getAccountsByPassportAndRequisites(String passport, String requisites) {
        Account account = null;
        getUserAccounts(passport).stream()
                .filter(acc -> acc.getRequisites().equals(requisites));
        return account;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport, String dstRequisite, double amount) {
        boolean transfer = false;
        Account srcList = getAccountsByPassportAndRequisites(srcPassport, srcRequisite);
        Account dstList = getAccountsByPassportAndRequisites(destPassport, dstRequisite);

        if (srcList != null && dstList != null) {
            transfer = srcList.transfer(dstList, amount);
        }

        return transfer;
    }
}