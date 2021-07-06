fun main() { //main function
    //creating objects of data class Courses
    val science = Course("English", "Mathematics","Chemistry", "Physics")
    val art = Course("English", "Mathematics","History", "Geography")
    val commercial = Course("English", "Mathematics","Accounting", "Commerce")
    //follow instruction laid down
    println("Hello, welcome to Pinterest international College")
    var condition = true
    while (condition){
        println("Select an option to Login/Register \n1)Staff \n2)Student \n3)Applicant")
        println("Select 0 to terminate")
    when (Integer.valueOf(readLine())) {
        1 -> {
            var select = true
            while (select) {
                println("select \n1)Principal \n2)Teacher \n3)Non Teaching Staff")
                println("Press 0 to go back")
                when (Integer.valueOf(readLine())) {
                    1 -> Principal.getPrincipalInfo() //Accept principal info and perform action
                    2 -> Teacher.getTeacherInfo()
                    3 -> NonAcademicStaffs.getStaffInfo()
                    0 -> select = false
                    else -> println("Invalid Selection")
                        }
                    }
                }
        2 -> { println("Enter details to register")
                    Student.getStudentInfo()
                        var select = true
                        while (select) {
                            println("Select Class \n1)Science \n2)Art \n3)Commercial \n 0 to return")

                            when (Integer.valueOf(readLine())) {
                                1 -> println("you courses are $science")

                                2 -> println("you courses are $art")

                                3 -> println("you courses are $commercial")
                                0 -> select = false
                                else -> println("invalid course selected")
                            }
                        }
        }
        3 -> Applicant.getApplicantInfo()
        0 -> condition = false

    }
    }
}