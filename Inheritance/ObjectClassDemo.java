class Student {
    // This defines a class Student with two attributes
    String name;
    int rollNo;


 // Constructor 
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    //
    // Overriding toString() method
    @Override
    public String toString() {
        return "Student{name='" + name + "', rollNo=" + rollNo + "}";
    }

    // Overriding equals() method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) //  Checks if both references point to the same object.
            return true;
        // Ensures the object is not null and belongs to the same class.
        if (obj == null || getClass() != obj.getClass()) 
            return false;

        // Is It Safe to cast the object to student?
        //Safe to cast after the class check.
        Student student = (Student) obj;
        //Compares the key fields (assuming name is not null).
        return rollNo == student.rollNo && name.equals(student.name);
    }

    // Overriding hashCode() method
    @Override
    public int hashCode() {
        return name.hashCode(); + rollNo;
    }

    // finalize() method example (called by GC before deletion)
   // @Override
    //protected void finalize() throws Throwable {
      //  System.out.println("Student object is being garbage collected: " + name);
    //}
}

public class ObjectClassDemo {
    public static void main(String[] args) {
        Student s1 = new Student("VIT-AP", 101);
        Student s2 = new Student("Univ", 101);
        Student s3 = s1;

        System.out.println("toString(): " + s1.toString()); // Student{name='VIT-AP', rollNo=101}
        System.out.println("equals(): " + s1.equals(s2));   // true
        System.out.println("hashCode(): " + s1.hashCode()); // hash value
        System.out.println("getClass(): " + s1.getClass()); // class Student

        // Testing finalize() (note: may not execute immediately)
        s1 = null;
        s3 = null;
        System.gc(); // Requesting garbage collection
    }
}