package com.clean.study.chapter03.test

import com.clean.study.chapter03.Role
import java.time.Instant

class Account(
    var id: String? = null,
    var name: String,
    var phone: String,
    var role: Role,
    var company: String? = null,
    var createAt: Long = Instant.now().toEpochMilli(),
    var updateAt: Long = Instant.now().toEpochMilli()
) {

}
