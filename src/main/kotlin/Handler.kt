import Request.Student

class Handler(val service: Service) {
    fun getStudent(student: Student): String {
        val studentDomainModel = student.getStudentDomainModel();
        val servicelayer=service.getStudentMarks(studentDomainModel)
        if(servicelayer){
            return "true"
        }
        else if(servicelayer){
            return "def"
        }
        else{
            return "false"
        }
    }
}
