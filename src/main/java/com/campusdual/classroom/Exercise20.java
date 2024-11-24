package com.campusdual.classroom;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;

public class Exercise20 {

    public static List<Person> getPeopleList() {
        List<Person> personas = new ArrayList<>();
        personas.add(new Person("John", "Smith"));
        personas.add(new Teacher("María", "Montessori", "Educación"));
        personas.add(new PoliceOfficer("Jake", "Peralta", "B-99"));
        personas.add(new Doctor("Gregory", "House", "Nefrología e Infectología"));
        return personas;
    }

    public static void showPeopleDetails(List<Person> stringList) {
        for(Person persona :stringList){
            persona.getDetails();
        }
    }

    public static void main(String[] args) {
        List<Person> stringList = getPeopleList();
        showPeopleDetails(stringList);
    }



}
