import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    static Student student;
    static int NUM_TESTS = 0;

    @Before
    public void actionToRunBeforeEachTest(){

        System.out.println("Running test" + (++NUM_TESTS));
        student = new Student();
    }
    @After
    public void actionToRunAfterEachTest(){
        System.out.println("Ending Test " + NUM_TESTS);
    }

    @Test
    public void firstTest(){

        assertTrue(1 == 1);
        assertFalse(1 == 2 );

        assertEquals( 10, 10);

        assertEquals(20d, 19.9, 2);

    }
    @Test
    public void testDefaultConstructorFirstName(){

        //Student student = new Student();
        assertNotNull(student.getName());
        assertEquals("Student", student.getName());
        assertTrue(student.getName().length() >= 3);
    }

    // Annotation:  @Keyword
    @Test
    public void testDefaultConstructorGetAge(){
        assertTrue(student.getAge() == 18 && student.getAge() < 100);
        assertEquals(18, student.getAge());
    }

    @ParameterizedTest
    @ValueSource(ints = {20, 25, 30, 35, 40, 50, 60, 75, 85, 90})
    // values soruces: primitive data types + string + object
    public void testSetAgeValidValues(int age){
        student.setAge(age);
        assertEquals(age, student.getAge());
    }
    @Test
    public void test3ArgConstructorHardCoded(){
        Student student1 = new Student("Ben", 20, 50d);
        assertEquals("Ben", student1.getName());
        assertEquals(20, student1.getAge());
        assertEquals(50d, student1.getGrade());

    }

    @ParameterizedTest
    @CsvSource({ "Ben,25,50.5","Blanc,80,90","Brandon,18,100","Shy,19,100"  })
    public void testing3ArgConstructorWithPassedValuesAllShouldBeValid(String name, int age, double grade){
        Student student1 = new Student(name, age, grade);
        assertEquals(name, student1.getName());
        assertEquals(age, student1.getAge());
        assertEquals(grade, student1.getGrade());
    }



}