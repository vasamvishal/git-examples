package Request

import Model.DomainModel

data class Student(
    val rollName: Int,
    val name: String,
    val age: Int,
    val cls: String
) {
    fun getStudentDomainModel():DomainModel {
        val marks=age*rollName;
        return DomainModel(rollName, name, age, cls,marks)
    }
}
