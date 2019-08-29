package com.sda.oana.advanced.recap;

public class Director extends Profesor  {

    public Director(double salary, String subject) {
        super(salary, subject);
    }

    public Director(String name, int age, Gender gender, double salary, String subject) {
        super(name, age, gender, salary, subject);
    }
    public  void pay (double amount){
         // setSalary(amount*2);
          super.setSalary(amount*2);
    }


}
