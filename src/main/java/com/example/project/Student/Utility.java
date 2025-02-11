package com.example.project.Student;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.ArrayList;

public class Utility {
    public static ArrayList<Student> sortStudents(ArrayList<Student> studentsToSort) {
        int n = studentsToSort.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                Student s1 = studentsToSort.get(j);
                Student s2 = studentsToSort.get(minIndex);
                if (s1.getLastName().compareTo(s2.getLastName()) < 0) {
                    minIndex = j;
                } 
                else if (s1.getLastName().equals(s2.getLastName()) &&
                         s1.getFirstName().compareTo(s2.getFirstName()) < 0) {
                    minIndex = j;
                } 
                else if (s1.getLastName().equals(s2.getLastName()) &&
                         s1.getFirstName().equals(s2.getFirstName()) &&
                         s1.getGpa() > s2.getGpa()) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                Student temp = studentsToSort.get(i);
                studentsToSort.set(i, studentsToSort.get(minIndex));
                studentsToSort.set(minIndex, temp);
            }
        }
        return studentsToSort;
    }
}

