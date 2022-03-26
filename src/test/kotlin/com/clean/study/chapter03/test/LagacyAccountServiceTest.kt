package com.clean.study.chapter03.test

import com.clean.study.chapter03.AccountFactoryImpl
import com.clean.study.chapter03.Role
import junit.framework.Assert.assertEquals
import org.junit.Test

class LagacyAccountServiceTest {

    @Test
    fun `legacy accountService 테스트`() {
        //given
        val accountStore = AccountStore()
        val accountService = AccountService(accountStore)
        //when
        val account = accountService.create("clean", "00000000000", Role.USER)
        val result = accountStore.findById(account.id!!)

        //then
        assertEquals(account.id, result.id)
    }

}