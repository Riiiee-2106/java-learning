public class Course {

    static int maxCapacity = 100;

    String courseName;
    int enrollments ;
    String[] enrolledStudents;

    

    Course(String courseName){
        this.courseName = courseName;
        this.enrollments =0;
        String[] enrolledStudents = new String[maxCapacity];
    }

    // Static method
    static void setMaxCapacity(int capacity) {
        Course.maxCapacity = capacity;
    }

    // Enroll student
    void enrollStudent(String studentName) {
        if (enrollments >= maxCapacity) {
            System.out.println("Course is full");
            return;
        }

        enrolledStudents[enrollments] = studentName;
        enrollments++;
        System.out.println(studentName + " enrolled successfully");
    }

    // Unenroll student
    void unenrollStudent(String studentName) {
        int index = -1;

        // Find student
        for (int i = 0; i < enrollments; i++) {
            if (enrolledStudents[i].equals(studentName)) {
                index = i;
                break;
            }
        }

        // If student not found
        if (index == -1) {
            System.out.println("Student not found");
            return;
        }

        // Shift elements left
        for (int i = index; i < enrollments - 1; i++) {
            enrolledStudents[i] = enrolledStudents[i + 1];
        }

        enrolledStudents[enrollments - 1] = null;
        enrollments--;

        System.out.println(studentName + " unenrolled successfully");
    }
}
