package ru.lavafrai.mai

import kotlinx.coroutines.runBlocking
import ru.lavafrai.mai.api.MaiAccountApi

fun main() {
    runBlocking {
        val api = MaiAccountApi.authorize("login", "password")

        val studentInfo = api.studentInfo()
        val student = studentInfo.students.last()

        println("Student: ${studentInfo.firstname} ${studentInfo.lastname} ${studentInfo.middlename}")
        println("Group: ${student.group}")
        println("Speciality: ${student.speciality} (${student.specialityCipher})")
        println()
        val marks = api.studentMarks(student.studentCode)
        println("Marks:")
        marks.marks.forEach {
            println("${it.name} - ${it.value} c ${it.attempts} попытки")
        }

        println(api.person())
    }
}