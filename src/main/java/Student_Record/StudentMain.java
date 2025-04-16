package Student_Record;

public class StudentMain {
    public static void main(String[] args) {

        Student student1 = new Student("Mustafa","Tavusbay",17685);
        Student student2 = new Student("Ahmet","Yılmaz",18942);
        Student student3 = new Student("Mustafa","Tavusbay",17685);


        System.out.println("Student 1 = " + student1);
        System.out.println("Student 2 = " + student2);
        System.out.println("Student 3 = " + student3);

        System.out.println("student1 equals student3: " + student1.equals(student3));
        System.out.println("student1 hashCode == student3 hashCode: " + (student1.hashCode() == student3.hashCode()));
    }

}

