package com.sda.oana.advanced.recap;

public class Profesor extends Person implements Payable{
    private double salary;
    private String subject;

    public Profesor(double salary, String subject) {
       this. salary = salary;
        this.subject = subject;
    }

    public Profesor(String name, int age, Gender gender, double salary, String subject) {
        super(name, age, gender);
       this .salary = salary;
        this.subject = subject;
    }


    public double getSalary() {
        return salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public  void pay (double amount){
        salary=amount;
        // salary=amount;

    }

    @Override
    public String toString() {
        return "Profesor{" +
                "salary=" + salary +
                ", subject='" + subject + '\'' +"age="+getAge()+" name =" +getName()+"\'"+
                ",gender="+getGender()+
                '}';
    }
}


