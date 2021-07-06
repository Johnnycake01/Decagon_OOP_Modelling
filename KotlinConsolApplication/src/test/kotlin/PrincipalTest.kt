import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class PrincipalTest {

    @Test
    fun validatePerformActionFunction() {
        Principal.setName("Johnson")
        assertEquals("Principal Johnson coordinates all activities in the school",Principal.performAction())
    }

    @Test
    fun validateHireApplicantFunctionOne() {
        val applicant1 = Applicant()
        val applicant2 = Applicant()
        applicant2.academicQualification ="WEAC"
        applicant2.position = "cleaner"
        applicant2.setName("tunde")
        applicant2.yearsOfExperience = 1
        applicant1.academicQualification ="HND"
        applicant1.position = "cleaner"
        applicant1.setName("Johnson")
        applicant1.yearsOfExperience = 5
        assertEquals("Johnson has been hired",Principal.hireApplicant(applicant1))
        assertEquals("tunde has not been hired because tunde does not meet desired qualification",Principal.hireApplicant(applicant2))
    }

    @Test
    fun validateHireApplicantFunctionTwo() {

        val applicant2 = Applicant()
        applicant2.academicQualification ="WEAC"
        applicant2.position = "cleaner"
        applicant2.setName("tunde")
        applicant2.yearsOfExperience = 1

        assertEquals("tunde has not been hired because tunde does not meet desired qualification",Principal.hireApplicant(applicant2))
    }
    @Test
    fun validateFireSTaffFunction() {
        assertEquals("Staff Johnson has been fired",Principal.fireStaff("Johnson"))
    }
}