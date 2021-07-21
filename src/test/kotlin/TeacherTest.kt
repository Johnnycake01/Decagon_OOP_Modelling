import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class TeacherTest {

    @Test
    fun validatePerformActionFunction() {
        val teacher1 = Teacher()
        teacher1.setName("Johnson")
        assertEquals("Johnson can mark attendance",teacher1.performAction() )
    }

    @Test
    fun validateShowStudentsFunction() {
        val techer = Teacher()
        val student1 = Student()
        student1.setName("Johnson")
        student1.setId(112)
        student1.setAge(23)
        val student2 = Student()
        student2.setName("Tunde")
        student2.setId(111)
        student2.setAge(23)
        Student.studentArray.add(student1)
        Student.studentArray.add(student2)
        assertEquals("[name='Johnson', age=23, id=112, name='Tunde', age=23, id=111]",techer.showStudents().toString())
    }

    @Test
    fun markAttendance() {
        val techer = Teacher()
        val student1 = Student()
        student1.setName("Johnson")
        student1.setId(112)
        student1.setAge(23)
        val student2 = Student()
        student2.setName("Tunde")
        student2.setId(111)
        student2.setAge(23)
        Student.studentArray.add(student1)
        Student.studentArray.add(student2)
        assertEquals("the total number of student in school is 2",techer.markAttendance())
    }
}