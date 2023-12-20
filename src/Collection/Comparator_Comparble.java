package Collection;

public class Comparator_Comparble implements Comparable<Comparator_Comparble> {
    int salary;

    String Employee_Name;

    public Comparator_Comparble(int salary, String employee_Name) {
        this.salary = salary;
        Employee_Name = employee_Name;
    }

    @Override
    public String toString() {
        return "Comparator_Comparble{" +
                "salary=" + salary +
                ", Employee_Name='" + Employee_Name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Comparator_Comparble comparatorComparble) {
        if(this.salary > comparatorComparble.salary)return 1;
        else if (this.salary < comparatorComparble.salary) return -1;
        return 0;
    }
}