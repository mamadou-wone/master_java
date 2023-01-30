package lambda;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Student david = new Student("David", 8);
        Student amir = new Student("Zoro Boss", 32);
        Student houleye = new Student("Houleye WONE", 12);
        Student omzo = new Student("Omar", 38);

        List<Student> studentList = new ArrayList<>();
        studentList.add(amir);
        studentList.add(houleye);
        studentList.add(omzo);
        studentList.add(david);

        studentList
                .forEach(student -> {
                    if (student.getAge() > 30){
                        System.out.println(student);
                    }
                });
               // .sorted()
                //.sorted((o1, o2) -> String.valueOf(o1.getAge()).compareTo(String.valueOf(o2.getAge())))
//                .forEach(student -> {
//                    System.out.println(student.getName());
//                });


//        Collections.sort(studentList, (student1, student2) ->
//                    student1.getName().compareTo(student2.getName()));
//
//        for(Student student: studentList){
//            System.out.println(student.getName());
//        }


    }

}

interface StudentInterface{}
class Student implements Comparable{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

class CodeToRun implements Runnable{
    @Override
    public void run() {
        System.out.println("Printing from the Runnable ");
    }
}