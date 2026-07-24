package UniversityProject;



public class Student {
    private String id;
    private String name;
    private String deptName;

    public Student(String id, String name, String deptName) {
        this.id = id;
        this.name = name;
        this.deptName = deptName;
    }

    public String getId() { 
        return id; 

    }
    public String getName() { 
        return name; 
    }

    public String getDeptName() { 
        return deptName; 
    }

    public void display() {
        System.out.println("   Student ID: " + id + ", Name: " + name + ", Dept: " + deptName);
    }
}