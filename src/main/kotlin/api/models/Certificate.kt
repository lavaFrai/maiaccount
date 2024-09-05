package ru.lavafrai.mai.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Certificate(
    val id: Long,
    @SerialName("date") val updateDate: String,
    @SerialName("time") val updateTime: String,
    val status: String,
    val answer: AnswerFile,
)