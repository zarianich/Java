package ObjectsLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String homeTown;
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public Student (String firstName, String lastName, int age, String homeTown){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.homeTown = homeTown;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Student> students = new ArrayList<>();

        while (!input.equals("end")){

            String[] data = input.split(" ");

            if (doesStudentAlreadyExist(students, data[0], data[1])){
                Student student = getStudent(students, data[0], data[1]);

                student.setAge(Integer.parseInt(data[2]));
                student.setHomeTown(data[3]);
            }
            else{
                Student newStudent = new Student(data[0], data[1], Integer.parseInt(data[2]), data[3]);
                students.add(newStudent);
            }

            input = scanner.nextLine();
        }

        String filterTown = scanner.nextLine();

        List<Student> filtered = students.stream().filter(e -> e.getHomeTown().equals(filterTown)).collect(Collectors.toList());

        for (Student student:filtered
             ) {
            System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getLastName(), student.getAge());
        }
    }

    private static boolean doesStudentAlreadyExist(List<Student> students, String firstName, String lastName){
        for (Student student:students
             ) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName))
                return true;
        }

        return false;
    }

    private static Student getStudent(List<Student> students, String firstName, String lastName){
        Student existingStudent = null;

        for (Student student:students
             ) {
            if (student.getFirstName().equals(firstName)&&student.getLastName().equals(lastName))
                existingStudent = student;
        }

        return existingStudent;
    }

}
