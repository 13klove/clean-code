package com.clean.study.chapter03

class AccountFactoryImpl: AccountFactory {

    override fun makeAccount(account: Account): Account {
        return when (account.role) {
            Role.USER -> User.create(account)
            Role.OPERATOR -> Operator.create(account)
        }
    }

}