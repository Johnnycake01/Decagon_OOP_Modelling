class Applicant: User() {
    var position:String = ""
    var academicQualification:String = ""
    var yearsOfExperience:Int = 0
    companion object {
    var countApply: ArrayList<Applicant> = ArrayList()
    fun apply(applicant:Applicant):String{
        countApply.add(applicant)
        return "you have Success fully applied"
    }
    fun countA(count:ArrayList<Applicant>):Int{
        return count.size
    }

       fun showApplicant(count: ArrayList<Applicant>):String {
           if (count.size > 0) {
               println("we have ${countA(countApply)} Applicant(s) with name(s) as follow -> ")
               for (i in count) {
                   return "${i.getName()}, "
                   Principal.hireApplicant(i)
               }
           } else {
               return "No one has applied yet"
           }
           return ""
       }
        fun getApplicantInfo(){
            val newApplicant = Applicant()
            println("Positions Available as at now \n1)Cleaner \n2)Librarian")
            when (Integer.valueOf(readLine())) {
                1 -> newApplicant.position = "cleaner"

                2 -> newApplicant.position = "librarian"
                else -> println("Position not available")
            }
            println("Enter your name ")
            val applicantName = readLine()
            if (applicantName != null) {
                newApplicant.setName(applicantName)
            }
            println("Enter your Age")
            val applicantAge = Integer.valueOf(readLine())
            newApplicant.setAge(applicantAge)
            println("Enter your Years Of Experience")
            val year = Integer.valueOf(readLine())
            newApplicant.yearsOfExperience = year
            println("Choose Academic Qualification \n1)HND \n2)BSC \n3)WAEC")

            newApplicant.academicQualification = when (Integer.valueOf(readLine())){
                1 ->  "HND"
                2 -> "BSC"
                3 -> "WAEC"
                else -> null.toString()
            }

            apply(newApplicant)
        }
   }

}