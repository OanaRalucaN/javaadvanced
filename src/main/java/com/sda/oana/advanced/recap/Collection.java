package com.sda.oana.advanced.recap;

import java.util.*;

import static com.sda.oana.advanced.recap.Gender.FEMALE;
import static com.sda.oana.advanced.recap.Gender.MALE;

public class Collection {

    public static void main(String[] args) {

   Profesor  profesor1=new Profesor ("Paul",30, MALE,2500,"Mat" );
   Profesor profesor2=new Profesor("Oana",30,FEMALE,3000,"Chimie");
   Profesor profesor3=new Profesor("Dan",35,MALE,3200,"Info");


        List<Profesor> profesori=new ArrayList<>();
        profesori.add(profesor1);
        profesori.add(profesor2);
        profesori.add(profesor3);

        System.out.println(profesori);
      //  System.out.println(profesor2);
      //  System.out.println(profesor3);

        System.out.println(profesori.get(profesori.size()-1));
        profesori.remove(profesori.size()-1);
        profesori.remove(0);

        Set<Profesor> profesorSet =new HashSet<>();
        profesorSet.addAll(profesori);
        System.out.println(profesorSet);

        Map<String,Profesor>profesorMap=new HashMap<>();
        profesorMap.put("Cluj-Napoca", profesor1);
        profesorMap.put("Oradea", profesor2);
        profesorMap.put("Alba", profesor3);
        profesorMap.put("Cluj-Napoca", profesor2);

        Map<Profesor,String>cityMap=new HashMap<>();
        //profesor Map.put(prof1,"Cluj");
        profesorMap.get("Cluj-napoca");//citeste element cand stii cheia
        //cand vreau sa parcurg elementele si nu stiu ce element vreau(nu stiu cheia
        //Entry=un element din map de forma si valoare
        //De exemplu pentru elementul: "Cluj-napoca", profesor1
        //entry.getKey()="Cluj-napoca"
        //entry.getValue()=profesor1

        for (Map.Entry<String ,Profesor>entry:profesorMap.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }


      //  System.out.println(profesorMap);
    }
}
