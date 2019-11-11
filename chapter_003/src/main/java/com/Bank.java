package com;

import java.util.*;

public class Bank {

    Map<com.User, List<Account>> users = new HashMap<>();

    public void addUser(com.User user) {
        this.users.putIfAbsent(user, new ArrayList<>());
    }

    public void deleteUser(com.User user) {
        this.users.remove(user);
    }

    public void addAccountToUser(String passport, Account account) {

        for (User key : users.keySet()) {
            if (key.getPassport().equals(passport)) {
                this.users.get(key).add(account);
            }
        }
    }

    public void deleteAccountFromUser(String passport, Account account) {
        for (User key : users.keySet()) {
            if (key.getPassport().equals(passport)) {
                this.users.get(key).remove(account);
            }
        }
    }

    public List<Account> getUserAccounts(String passport) {
        List<Account> list = new ArrayList<>();
        for (User key : users.keySet()) {
            if (key.getPassport().equals(passport)) {
                list = this.users.get(key);
            }
        }
        return list;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport, String dstRequisite, double amount) {
        boolean src = false;
        boolean dst = false;
        boolean transfer = false;
        List<Account> srcList = getUserAccounts(srcPassport);
        List<Account> dstList = getUserAccounts(destPassport);

        for (Account account : srcList) {
            if (account.getRequisites().equals(srcRequisite)) {
                src = true;
                srcList = Arrays.asList(account);
                break;
            }
        }
        for (Account account : dstList) {
            if (account.getRequisites().equals(dstRequisite)) {
                dst = true;
                dstList = Arrays.asList(account);
                break;
            }
        }
        if ((src && dst) && (srcList.get(0).transfer(dstList.get(0), amount))) {
            transfer = true;
        }
        return transfer;
    }
}