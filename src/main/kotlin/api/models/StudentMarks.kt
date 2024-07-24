package ru.lavafrai.mai.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class StudentMarks(
    @SerialName("student") val student: Student,
    @SerialName("recordBook") val recordBook: String,
    @SerialName("marks") val marks: List<Mark>
)