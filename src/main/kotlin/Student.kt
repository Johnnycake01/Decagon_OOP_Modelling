class Student: User(){
//   private var studentClass:String = ""
//    fun setStudentClass

    companion object {
//        private var course:Course = Course("English", "Mathematics","Chemistry", "Physics")
//        fun getCourse():Course {
//            return this.course
//        }
//        fun setCourse(course: Course){
//            this.course = course
//        }
        val studentArray:ArrayList<Student> = ArrayList()
        fun getStudentInfo() {
            val newStudent = Student()
            println("Enter Student ID")
            val studentId = Integer.valueOf(readLine())
            newStudent.setId(studentId)
            println("Enter your name ")
            val studentName = readLine()
            if (studentName != null) {
                newStudent.setName(studentName)
            }
            println("Enter your Age")
            val studentAge = Integer.valueOf(readLine())
            newStudent.setAge(studentAge)
            studentArray.add(newStudent)

        }
    }
}