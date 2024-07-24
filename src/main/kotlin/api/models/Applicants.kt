package ru.lavafrai.mai.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Applicants(
    @SerialName("person") val person: Person,
)