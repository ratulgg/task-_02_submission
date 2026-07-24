package UniversityProject;

import java.util.ArrayList;

public class Department {
    private String deptName;
    private String headName;
    private ArrayList<Student> students;

    public Department(String deptName, String headName) {
        this.deptName = deptName;
        this.headName = headName;
        students = new ArrayList<>();
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void display() {
        System.out.println("Department: " + deptName + " | Head: " + headName);
        System.out.println("Students enrolled:");
        for (Student s : students) {
            s.display();
        }
    }
}