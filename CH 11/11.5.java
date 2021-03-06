package Programming_exercises;

import Tools.StackOfIntegersApp;

public class Week_5_11_5 {

/**
* other students data or code input
* from exercise 10.6 as per instructor
*/

        for (int i = 2; i < 120; i++) {
            if (isPrime(i)) {
                stack.push(i);
            }
        }
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    public static boolean isPrime(int n) {
        double range = Math.sqrt(n);
        for (int i = 2; i < range ; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

public class Week_5_11_5 {

}

class Course {
    private String courseName;
    private ArrayList<String> students = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }
    public void addStudent(String student) {
        students.add(student);
    }
    public String[] getStudents() {
        return students.toArray(new String[students.size()]);
    }
    public int getNumberOfStudents() {
        return students.size();
    }
    public String getCourseName() {
        return courseName;
    }
    public void dropStudent(String student) {
        students.remove(student);
    }
    public void clear(){
        students.clear();
    }
}
