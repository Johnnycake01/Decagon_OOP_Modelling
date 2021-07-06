import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class NonAcademicStaffsTest {


    @Test
    fun valdateWorkFunction() {
        val library = NonAcademicStaffs()
        library.setStatus("cleaner")
        assertEquals(", your work is to clean the school environment",library.work(library))
    }
    @Test
    fun valdateWork2Function() {
        val library = NonAcademicStaffs()
        library.setStatus("library")
        assertEquals(", you are in charge of the school library",library.work(library))
    }

}


