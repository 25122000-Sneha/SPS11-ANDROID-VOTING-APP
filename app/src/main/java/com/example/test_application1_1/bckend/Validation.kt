package com.example.test_application1_1.bckend

class Validation {
    fun check_adhaar(number:String):Boolean{
        return number.length==12

    }
    fun check_dob(number:String):Boolean{
        return number.length==8
    }
}

