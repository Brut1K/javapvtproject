package by.it_academy

fun main(arg: Array<String>){
    var student:Student = Student()
    student.name = "asd;a"
    student.name2 = "bnmajhghj1"

    var t:Int? = null

    println(t?.compareTo(5))
    var r:Byte? = t?.toByte()?:25


    val list:MutableList<String>
    var i =50
    when(i){
        in 10..40 ->{

        }
        50 ->{

        }
        else -> {

        }
    }

    for(a in arg){

    }





    test(34)
    print("ashd")
}

fun test(value: Int){

    println("vavavav = "+value)
}