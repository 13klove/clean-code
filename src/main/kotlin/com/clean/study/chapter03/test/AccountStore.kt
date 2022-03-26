package com.clean.study.chapter03.test

import java.util.*

class AccountStore(
    private val accountList: MutableList<Account> = mutableListOf()
) {

    fun findByPhone(phone: String): Account? {
        return accountList.firstOrNull {
            it.phone == phone
        }
    }

    fun save(account: Account): Account {
        account.id = getId()
        accountList.add(account)
        return account
    }

    fun findById(id: String): Account {
        return accountList.first {
            it.id == id
        }
    }

    private fun getId(): String {
       return UUID.randomUUID().toString()
    }

}