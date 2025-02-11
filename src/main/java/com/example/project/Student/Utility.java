package com.example.project.Student;
import java.util.ArrayList;
import java.util.Arrays;

public class Utility {

    public static ArrayList<Student> sortStudents(ArrayList<Student> list){
        ArrayList<Student> tempList = new ArrayList<Student>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getLastName().compareTo(list.get(i+1).getLastName()) == 0) {
                
            }
        }
        return list;
    }

}
