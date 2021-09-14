package com.bridgelabz

class Company {
    String companyName
    String product
    Integer capacity
    String state
    String city
    static hasMany = [employee:Employee]

    static constraints = {
    }
}
