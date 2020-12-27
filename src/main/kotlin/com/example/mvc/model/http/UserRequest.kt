package com.example.mvc.model.http

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.annotation.JsonNaming

//@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy::class)
data class UserRequest(
    var name: String? = null,
    var age: Int? = null,
    var email: String? = null,
    var address: String? = null,
    var phoneNumber: String? = null // phone_number
    // 코틀린은 기본 컨벤션이 카멜, rest는 스네이크

    /*@JsonProperty("phone_number")
    var phoneNumber: String? = null // phone_number*/
)

