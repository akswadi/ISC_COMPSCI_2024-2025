import java.util.Scanner;
public class Employee
{
    int empNo;
    String empName;
    String empDesig;
    Employee()
    {
        empNo =0;
        empName = "";
        empDesig="";
    }
    Employee(int no,String name,String des)
    {
        empNo = no;
        empName = name;
        empDesig = des;
    }
    void display()
    {
        System.out.println("No : "+empNo);
        System.out.println("Name : "+empName);
        System.out.println("Desig : "+empDesig);
    }
}