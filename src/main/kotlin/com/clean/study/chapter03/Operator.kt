package com.clean.study.chapter03

class Operator(
    id: String? = null,
    name: String,
    phone: String,
    role: Role,
    var company: String,
) : Account(id, name, phone, role) {

    companion object {
        fun create(account: Account): Operator {
            return Operator(
                name = account.name,
                phone = account.phone,
                role = account.role,
                company = "Clean Code Company"
            )
        }
    }

}