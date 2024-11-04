import java.util.Scanner;
public class Modify
{
    String Str;
    int len;
    void read()
    {
        Scanner sc = new Scanner(System.in);
        Str = sc.nextLine();
        Str = Str.toUpperCase();
        len = Str.length();
    }
    void putin(int n, char ch)
    {
        String s = "";
        for(int i = 0;i<len;i++)
        {
            if(i!=n)
            s = s+ Str.charAt(i);
            else if(i==n)
            s = s+ ch+Str.charAt(i);
        }
        Str = s;
        len = len+1;
        System.out.println(Str);
    }
    void takeout(int n)
    {
        String s = "";
        for(int i = 0;i<len;i++)
        {
            if(i!=n)
            s = s+Str.charAt(i);
            else if(i == n)
            s = s+"";
        }
        Str = s;
        len = len -1;
        System.out.println(Str);
    }
    void change()
    {
        char ch;
        int n;
        String s ="";
        for(int i = 0;i<len;i++)
        {
            ch = Str.charAt(i);
            n = (int)ch;
            if(n<=88)
            s = s+ (char)(n+2);
            else if(n == 89 || n == 90)
            {
                n = n-24;
                s = s+(char)n;
            }
        }
        Str = s;
        System.out.println(Str);
    }
    void main()
    {
        Scanner sc = new Scanner(System.in);
        Modify obj = new Modify();
        obj.read();
        char ch = sc.next().charAt(0);
        obj.putin(2,ch);
        obj.takeout(3);
        obj.change();
    }          
}