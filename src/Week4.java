public class Week4 {

    static void example1(){
        Student s1 = new Student();
        Student s2 = new Student("blanc", 1, 1.1);
        Student s3 = new Student("ben", 5.1, 51);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }
    static void example2(){

        /*
            we want to restrict values for name, age,grade?
                code conditional statements in setters
            we want to access name, age, grade?
                code getters
         */

        Student s1 = new Student();
        System.out.println(s1);

        Student s2 = new Student("b", -10, -200d);
        System.out.println(s2);

        s1.setName("a");
    }
    static void example3(){

        Student s1 = Student.honorRollStudent();
        System.out.println(s1);

        Student s2 = Student.honorRollStudent("Joe", 20, 90d);
        Student s3 = Student.honorRollStudent("Bob", 20, 70d);
        Student s4 = Student.matureStudent();
        System.out.println(s4);
    }
    public static void main(String[] args) {
        
        
        example3();
        
    }
}
