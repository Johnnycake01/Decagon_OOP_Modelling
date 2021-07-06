class Teacher: Staff(), StaffActions{
    private var course:String = ""
    override fun performAction():String{
                return "${this.getName()} can mark attendance"
    }
    fun showStudents():ArrayList<Student>{
        return Student.studentArray
    }
    fun markAttendance():String{
        return "the total number of student in school is ${Student.studentArray.size}"
    }
    companion object{
        fun getTeacherInfo(){
            val newTeacher = Teacher()
            println("Enter your ID")
            val teacherId = Integer.valueOf(readLine())
            newTeacher.setId(teacherId)
            println("Enter your name: ")
            val teacherName = readLine()
            if (teacherName != null) {
                newTeacher.setName(teacherName)
            }
            println("Enter your age")
            val teacherAge = Integer.valueOf(readLine())
            Principal.setAge(teacherAge)
            println("what would you love to do")
            println(newTeacher.performAction())
            println("press enter to show attendance")
            readLine()
            println(newTeacher.showStudents())
            println(newTeacher.markAttendance())
        }
    }
}