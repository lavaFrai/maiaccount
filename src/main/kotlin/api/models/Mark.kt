package ru.lavafrai.mai.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Mark(
    @SerialName("name") val name: String,
    @SerialName("mark") val value: String,
    @SerialName("attempts") val attempts: Int,
    @SerialName("typeControlName") val date: String,
    @SerialName("semester") val typeControlName: Int,
    @SerialName("course") val course: Int,
    @SerialName("hours") val hours: Int,
    @SerialName("lecturer") val lecturer: String,
)
