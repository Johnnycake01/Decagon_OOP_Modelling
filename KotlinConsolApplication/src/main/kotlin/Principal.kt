object Principal: Staff(){
    private var acceptedApplicantName: ArrayList<String> = ArrayList()
    override fun performAction():String{
        return "Principal ${this.getName()} coordinates all activities in the school"
    }
    fun hireApplicant(applicant: Applicant):String {
            if (applicant.position == "teacher") {
                return if ((applicant.academicQualification == "HND" || applicant.academicQualification == "BSC") && applicant.yearsOfExperience > 3) {
                    acceptedApplicantName.add(applicant.getName())
                    "${applicant.getName()} has been hired"
                } else {
                    "${applicant.getName()} has not been hired because ${applicant.getName()} does not meet desired qualification"
                }
            } else if (applicant.position == "cleaner") {
                return if ((applicant.equals("WAEC") || applicant.academicQualification == "HND" || applicant.academicQualification == "BSC") && applicant.yearsOfExperience > 1
                ) {
                    acceptedApplicantName.add(applicant.getName())
                    "${applicant.getName()} has been hired"

                } else {
                    "${applicant.getName()} has not been hired because ${applicant.getName()} does not meet desired qualification"
                }
            }
    return "Sorry you have not been hired"
    }
    fun fireStaff(staff:String):String{
        return "Staff $staff has been fired"
    }

    fun getPrincipalInfo(){
        println("Enter your ID")
        val principalId = Integer.valueOf(readLine())
        Principal.setId(principalId)
        println("Enter your name: ")
        val principalName = readLine()
        if (principalName != null) {
            Principal.setName(principalName)
        }
        println("Enter your age")
        val principalAge = Integer.valueOf(readLine())
        Principal.setAge(principalAge)
        println("welcome Mr ${Principal.getName()} what would you love to do")
        println("select 1) to hire applicant or 2) to fire a staff")
        val input3 = Integer.valueOf(readLine())
        if (input3 == 1){
            println(Applicant.showApplicant(Applicant.countApply))

        } else if(input3 == 2){
            println("enter the name of staff you want to fire ")
            val staffName = readLine()
            if (staffName != null) println(fireStaff(staffName))
        }
    }
}
