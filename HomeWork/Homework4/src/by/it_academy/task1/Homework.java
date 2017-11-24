package by.it_academy.task1;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Patient[] p = new Patient[3];
        p[0] = new Patient();
        p[1] = new Patient();
        p[2] = new Patient();
        Scanner scanner = new Scanner(System.in);
        for(Patient pat:p){
            pat.addPatient();
        }
        for(Patient pat:p){
            pat.infoPatient();
        }

    }
}
