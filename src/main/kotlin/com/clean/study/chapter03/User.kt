package com.clean.study.chapter03

class User(
    id: String? = null,
    name: String,
    phone: String,
    role: Role,
): Account(id, name, phone, role) {

    companion object {
        fun create(account: Account): User {
            return User(
                name = account.name,
                phone = account.phone,
                role = account.role,
            )
        }
    }

}