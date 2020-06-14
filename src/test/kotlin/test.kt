import Model.Car
import Model.DomainModel
import Request.Student
import com.fasterxml.jackson.databind.ObjectMapper
import io.kotlintest.shouldBe
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Test
import java.io.File


internal class CipHandlerTest {
    val service = mockk<Service>();
    val handler = Handler(service)

    @Test
    fun `should check for Student`() {
        val student = Student(1, "vishal", 12, "4")
        val studentDomainModel =
            DomainModel(student.rollName, student.name, student.age, student.cls, student.age * student.rollName)
        val abc = true
        every { service.getStudentMarks(studentDomainModel) } returns abc
        val response = handler.getStudent(student)
        response shouldBe "true";

        verify { service.getStudentMarks(studentDomainModel) }
    }
}


