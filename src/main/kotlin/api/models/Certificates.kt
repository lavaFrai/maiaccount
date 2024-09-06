package ru.lavafrai.mai.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Certificates(
    @SerialName("certificates") val certificates: List<Certificate>?,
)