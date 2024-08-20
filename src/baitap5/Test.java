package baitap5;

public class Test {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Mai",1000);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Hoa",1000,6);

        System.out.println("Luong cua NV pt la:"+partTimeEmployee.calculateSalary());
        System.out.println("Luong cua NV ft la:"+fullTimeEmployee.calculateSalary());

    }
}
