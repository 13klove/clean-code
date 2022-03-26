package com.clean.study.chapter03.java;

import com.clean.study.chapter03.Role;

public class AccountService{

    private  AccountStore accountStore;
    private static final String COMPANY = "clean code company";

    public AccountService(AccountStore accountStore) {
        this.accountStore = accountStore;
    }

    public Account create(String name , String phone, Role role) {
        Account alreadyPhoneAccount = accountStore.findByPhone(phone);
        if (alreadyPhoneAccount != null) {
            throw new IllegalArgumentException("duplicate phone");
        }
        Account account = null;
        switch(role) {
            case USER :
                account = new Account(name, phone, role);
                break;
            case OPERATOR :
                account = new Account(name, phone, role, COMPANY);
                break;
        }

        return accountStore.save(account);
    }

}
