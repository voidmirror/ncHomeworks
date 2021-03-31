import com.myown.chapter1.*;
import com.myown.chapter2.Point;
import com.myown.chapter3.Employee;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        Task13 task1 = new Task13();
//        task1.execute();




        
        // Chapter 3, Task 1
        Employee[] employees = new Employee[5];
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            employees[i] = new Employee(Math.abs(random.nextInt(4000) + 6000));
        }
        System.out.println(new Employee().average(employees));
    }
}
