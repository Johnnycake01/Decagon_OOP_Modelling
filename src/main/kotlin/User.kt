abstract class User {
   private var name:String = ""
    private var age:Int = 0
    private var id:Int = 0

    fun getName():String{
        return this.name
    }
    fun setName(name:String){
        this.name = name
    }
    fun getAge():Int{
        return this.age
    }
    fun setAge(age:Int){
        this.age = age
    }
    fun getId():Int{
        return this.id
    }
    fun setId(id:Int){
        this.id = id
    }

    override fun toString(): String {
        return "name='$name', age=$age, id=$id"
    }
}