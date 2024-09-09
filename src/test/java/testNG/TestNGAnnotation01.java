package testNG;

import org.testng.annotations.Test;

public class TestNGAnnotation01 {

    public static void main(String[] args) {
        System.out.println("This is not the TestNG test 01");

        // Creating an object of TestNGAnnotation01
        TestNGAnnotation01 testNGAnnotation01 = new TestNGAnnotation01();
        testNGAnnotation01.notATestNGMethod();
    }

    // Method not associated with TestNG
    public void notATestNGMethod() {
        System.out.println("This is not a TestNG test 02");
    }

    // TestNG test method
    @Test
    public void test() {
        System.out.println("Test 01");
    }
}
