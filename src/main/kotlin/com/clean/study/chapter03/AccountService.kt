package com.clean.study.chapter03

import java.lang.Exception
import java.lang.IllegalArgumentException

class AccountService(
    private val accountStore: AccountStore,
    private val accountFactoryImpl: AccountFactory
) {

    fun create(account: Account): Account {
        try {
            return createAccount(account)
        } catch (e: IllegalArgumentException) {
            logError(e)
            throw e
        }
    }

    private fun createAccount(account: Account): Account {
        checkAlreadyExistsPhone(account.phone)
        val account = accountFactoryImpl.makeAccount(account)
        return accountStore.save(account)
    }

    private fun checkAlreadyExistsPhone(phone: String) {
        accountStore.findByPhone(phone)?.run { throw IllegalArgumentException("duplicate phone") }
    }

    private fun logError(e: Exception) {
        println(e.message)
    }

}