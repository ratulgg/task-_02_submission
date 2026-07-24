package UniversityProject;

public class UniversityDemo {
    public static void main(String[] args) {
        Student s1 = new Student("101", "X", "Cse");
        Student s2 = new Student("102", "Y", "Swe");
        Student s3 = new Student("201", "Z", "bba");
        Student s4 = new Student("202", "B", "nfe");

        Department csDept = new Department("Computer Science", "Dr. X");
        csDept.addStudent(s1);
        csDept.addStudent(s2);

        Department sweDept = new Department("Mathematics", "Dr.Y");
       sweDept.addStudent(s3);
        sweDept.addStudent(s4);

        University uni = new University("DIU");
        uni.addDepartment(csDept);
        uni.addDepartment(sweDept);

      uni.display();
    }
}