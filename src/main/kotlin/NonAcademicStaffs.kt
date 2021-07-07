import java.lang.NumberFormatException

class NonAcademicStaffs: Staff(), StaffActions {
    private var status: String = ""
    private fun getStatus(): String {
        return this.status
    }

    fun setStatus(status: String) {
        this.status = status
    }

    fun work(staff:NonAcademicStaffs):String {
        return if (staff.getStatus() == "cleaner") {
            ", your work is to clean the school environment"
        } else {
            ", you are in charge of the school library"
        }

    }
    companion object{
        fun getStaffInfo(){
            val newStaff = NonAcademicStaffs()
            println("Enter non teaching staff status either \n1)Cleaner \n2)Librarian ")
            val staffStatus = try{Integer.valueOf(readLine())}catch (e: NumberFormatException){println("Enter Integer Value")}
            if (staffStatus == 1){
                newStaff.setStatus("cleaner")
            }else if (staffStatus == 2){
                newStaff.setStatus("librarian")
            }
            println("Enter your ID")
            val staffId = Integer.valueOf(readLine())
            newStaff.setId(staffId)
            println("Enter your name: ")
            val staffName = readLine()
            if (staffName != null) {
                newStaff.setName(staffName)
            }
            println("Enter your age")
            val staffAge = Integer.valueOf(readLine())
            newStaff.setAge(staffAge)
            print("welcome Mr ${newStaff.getName()} ")
            newStaff.work(newStaff)
        }
    }
}