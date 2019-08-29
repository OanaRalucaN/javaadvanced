package com.sda.oana.advanced;

import com.sda.oana.advanced.recap.Director;
import com.sda.oana.advanced.recap.Person;
import com.sda.oana.advanced.recap.Profesor;
import com.sda.oana.advanced.recap.Student;
import org.apache.commons.lang3.StringUtils;

import javax.xml.validation.Validator;

import java.util.ArrayList;
import java.util.List;

import static com.sda.oana.advanced.recap.Gender.MALE;

public class MavenMain {

    public static void main(String[] args) {

       Person person=new Person("Andrei",22,MALE);
       System.out.println(person);

       Person person1=new Person();
       person1.setName("Andrei");
       person1.setAge(22);
       person1.setGender(MALE);

       System.out.println(person1);

       if(person.equals(person1)) {
           System.out.println("Are egual");
       }else{
           System.out.println("Not equal");
       }

        String name="  ";

        System.out.println(name.isEmpty());


        boolean isBlank=StringUtils.isBlank(name);
        System.out.println(isBlank);

        List<Integer>studentGrades=new ArrayList<>();
        studentGrades.add(7);
        studentGrades.add(9);
        studentGrades.add(10);

        Student student=new Student ("Andrei",18,MALE,studentGrades);
        System.out.println(student);

        Profesor profesor=new Profesor("Vali",30,MALE,0,"Matematica");
        Director director=new Director ("Cristi",33,MALE,0,"Literatura");

        profesor.pay(1000);
        director.pay(2000);

        System.out.println("Salariul lunar profesor" + profesor.getSalary());
        System.out.println("Salariul lunar director"+ director.getSalary());

       // System.out.println(profesor);
    }
}
