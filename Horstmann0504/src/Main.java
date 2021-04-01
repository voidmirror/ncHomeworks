import com.myown.chapter1.*;
import com.myown.chapter2.Point;
import com.myown.chapter3.Employee;
import com.myown.chapter3.Measurable;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        Task13 task1 = new Task13();
//        task1.execute();





        // Chapter 3, Task 1
        Employee[] employees = new Employee[5];
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            employees[i] = new Employee("Nick", Math.abs(random.nextInt(4000) + 6000));
        }
        System.out.println(new Employee().average(employees));
        System.out.println(new Employee().largest(employees));
        
    }

    public Measurable largest(Measurable[] objects) {
        if (objects.length != 0) {
            Measurable max = objects[0];
            for (Measurable m : objects) {
                if (m.getMeasure() > max.getMeasure()) {
                    max = m;
                }
            }
            return max;
        } else {
            return null;
        }
    }
}
