package com.bridgelabz

class Employee {
    String employeeName
    String gender
    Integer age
    Integer salary
    String department
    String state
    String city
    static belongsTo = [company:Company]


    static constraints = {
    }
}
