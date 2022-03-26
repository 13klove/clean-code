package com.clean.study.chapter03.test

import com.clean.study.chapter03.*
import com.clean.study.chapter03.Account
import com.clean.study.chapter03.AccountService
import com.clean.study.chapter03.AccountStore
import org.junit.Test
import kotlin.test.assertEquals

class AccountServiceTest {

    @Test
    fun `clean code accountService USER 테스트`() {
        //given
        val accountStore = AccountStore()
        val accountFactoryImpl = AccountFactoryImpl()
        val accountService = AccountService(accountStore, accountFactoryImpl)

        //when
        val account = accountService.create(
            Account(name = "clean", phone = "11111111111", role = Role.USER)
        )
        val result = accountStore.findById(account.id!!)
        //then
        assertEquals(account.id, result.id)
    }

    @Test
    fun `clean code accountService OPERATOR 테스트`() {
        //given
        val accountStore = AccountStore()
        val accountFactoryImpl = AccountFactoryImpl()
        val accountService = AccountService(accountStore, accountFactoryImpl)

        //when
        val account = accountService.create(
            Account(name = "clean", phone = "22222222222", role = Role.OPERATOR)
        ) as Operator
        val result = accountStore.findById(account.id!!)

        //then
        assertEquals(account.id, result.id)
        assertEquals(account.company, "Clean Code Company")
    }

}