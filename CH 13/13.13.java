package CH_13

import tools.IntegersClass

/**
* Used material from exercise 10.6
* imported as import tools.IntergersClass
*
*/


public class CH_13_13_13 {
    public static void main(String[] args) {
    Course course1 = new Course("Course1");
    course1.addStudent("student1");
    course1.addStudent("student2");
    Course course2 = (Course)course1.clone();
    System.out.println(course1 == course2);
    System.out.println(course1.getCourseName() == course2.getCourseName());
    System.out.println(course1.getStudents() == course2.getStudents());
    }
}
