package Model

import StudentEntity

data class DomainModel(
    val rollName: Int,
    val name: String,
    val age: Int,
    val cls: String,
    val marks: Int
) {
    fun toRequestEntity(): StudentEntity {
        return StudentEntity(rollName, name, age, cls, marks);
    }
}



