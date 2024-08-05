package org.example.oops_1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Ramesh";
        student1.age = 23;

        student1.changeBatch();
        student1.joinClass();

        System.out.println(student1);


        Student student2 = new Student();
        student2.name = "Rs";
        student2.age =24;

        student2.joinClass();
    }
}