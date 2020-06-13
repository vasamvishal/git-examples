import Model.DomainModel
import io.kotlintest.shouldBe
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Test

internal class ServiceTest {
    val repository = mockk<Repository>()
    val service = Service(repository);

    @Test
    fun getStudentMarks() {
        val requestStudentDomain = DomainModel(2, "c", 3, "3", 3 * 2)
        val requestEntity = StudentEntity(
            requestStudentDomain.rollName,
            requestStudentDomain.name,
            requestStudentDomain.age,
            requestStudentDomain.cls,
            requestStudentDomain.marks
        )

        every { repository.getStudent(requestEntity) } returns true
        val response = service.getStudentMarks(requestStudentDomain)
        response shouldBe true
        verify { repository.getStudent(requestEntity) }
    }
}