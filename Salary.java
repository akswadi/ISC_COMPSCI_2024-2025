import java.util.Scanner;
class Salary extends Employee
{
    float basic;
    Salary(int no,String name, String des, float bas)
    {
        super(no,name,des);
        basic = bas;
    }
    void calculate()
    {
        float salary;
        float DA = 0.10f*basic;
        float HRA = 0.15f*basic;
        salary = basic + DA + HRA;
        float PF = salary*0.08f;
        float NetSalary = salary - PF;
        super.display();
        System.out.println("Salary = "+NetSalary);
    }
}
        