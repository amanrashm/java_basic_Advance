package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee {
    public static void main(String[] args) {
        List<Comparator_Comparble> emp = new ArrayList<>();
        emp.add(new Comparator_Comparble(40000,"Amwan"));
        emp.add(new Comparator_Comparble(50000,"Amasn"));
        emp.add(new Comparator_Comparble(60000,"Amasdsn"));
        emp.add(new Comparator_Comparble(90000,"Aman"));
        emp.add(new Comparator_Comparble(30000,"Armain"));
        Collections.sort(emp);
        /*emp.forEach(System.out::println);*/
        /*for (int i = 0; i < emp.size(); i++) {
            System.out.println(emp.get(i));
        }

        Collections.sort(emp, new sortByName());
        emp.forEach(System.out::println);*/

        // Technique two crete an anonymous class and call the class in parent one
        Collections.sort(emp, new Comparator<Comparator_Comparble>() {
            @Override
            public int compare(Comparator_Comparble comparatorComparble, Comparator_Comparble t1) {
                if(comparatorComparble.Employee_Name.equals(t1.Employee_Name)) return comparatorComparble.salary - t1.salary;
                return comparatorComparble.Employee_Name.compareTo(t1.Employee_Name);
            }
        });
        emp.forEach(System.out::println);
    }
}
// Technique one crete a class and call the class in parent one
class sortByName implements Comparator<Comparator_Comparble>{

    @Override
    public int compare(Comparator_Comparble comparatorComparble, Comparator_Comparble t1) {
        if(comparatorComparble.Employee_Name.equals(t1.Employee_Name)) return comparatorComparble.salary - t1.salary;
        return comparatorComparble.Employee_Name.compareTo(t1.Employee_Name);
    }
}