package com.clean.study.chapter03

import java.time.Instant

open class Account(
    var id: String? = null,
    var name: String,
    var phone: String,
    var role: Role,
    var createAt: Long = Instant.now().toEpochMilli(),
    var updateAt: Long = Instant.now().toEpochMilli()
) {

}
