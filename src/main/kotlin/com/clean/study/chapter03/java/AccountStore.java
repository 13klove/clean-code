package com.clean.study.chapter03.java;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class AccountStore {
    private List<Account> accountList = new ArrayList<>();

    public Account findByPhone(String phone) {
        return accountList.stream().filter(account -> account.getPhone() == phone).findFirst().orElse(null);
    }

    public Account save(Account account) {
        account.setId(getId());
        accountList.add(account);
        return account;
    }

    public Account findById(String id) {
        return accountList.stream().filter(account -> account.getId() == id).findFirst().orElse(null);
    }

    private String getId() {
        return UUID.randomUUID().toString();
    }

}
