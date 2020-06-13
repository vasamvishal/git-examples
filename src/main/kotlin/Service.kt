import Model.DomainModel

class Service(val repository: Repository) {
    fun getStudentMarks(request: DomainModel):Boolean {
        return repository.getStudent(request.toRequestEntity())
    }

}
