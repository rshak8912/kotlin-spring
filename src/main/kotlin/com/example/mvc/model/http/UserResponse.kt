package com.example.mvc.model.http

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.BeanDescription
import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.annotation.JsonNaming

data class UserResponse (
    var result:Result?=null,
    var description: String?=null,

    @JsonProperty("user")
    var userRequest: MutableList<UserRequest>?=null
)


@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy::class) // 카멜 케이스의 변수를 스네이크 방식으로 내려주기 위한 어노테이션
data class Result(
    var resultCode: String?=null,   // result_code
    var resultMessage:String?=null // result_message
)