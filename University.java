package UniversityProject;

import java.util.ArrayList;

public class University {
    private String uniName;
    private ArrayList<Department> departments;

    public University(String uniName) {
        this.uniName = uniName;
        departments = new ArrayList<>();
    }

    public void addDepartment(Department d) {
        departments.add(d);
    }

    public void display() {
        System.out.println("===== " + uniName + " =====");
        for (Department d : departments) {
            d.display();
            System.out.println();
        }
    }
}