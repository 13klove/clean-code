package com.clean.study.chapter03.test

import com.clean.study.chapter03.Role
import java.lang.IllegalArgumentException

class AccountService(
    private val accountStore: AccountStore,
) {

    companion object {
        const val COMPANY = "clean code company"
    }

    fun create(name: String, phone: String, role: Role): Account {
        val alreadyPhoneAccount = accountStore.findByPhone(phone)
        if (alreadyPhoneAccount != null) throw IllegalArgumentException("duplicate phone")
        val account = when(role) {
            Role.USER -> {
                Account(name = name, phone = phone, role = role)
            }
            Role.OPERATOR -> {
                Account(name = name, phone = phone, role = role, company = COMPANY)
            }
        }

        return accountStore.save(account)
    }

}