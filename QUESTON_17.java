import java.util.*;
class QUESTON_17
{
     String encoded,decoded="";
     void input()
     {
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter a Encoded Message");
           encoded=sc.next();
     }
     void reverse()//Function Will reverse the inputed String
     {
           char ch;
           String str=new String();
           for(int i=0;i<encoded.length();i++)
           {
                ch=encoded.charAt(i);
                str=ch+str;
           }
           encoded=str;
     }
     void decode()//Function will convert number into Charcater
     {
           String str=new String(),x=new String();
           char ch1;
           char ch;
           int code=0;
           for(int i=0;i<encoded.length();i++)
           {
                ch=encoded.charAt(i);
                str=str+ch;
                if(str.length()==2)
                {
                     code=Integer.parseInt(str);
                     if(code>=65&&code<=90||code>=97&&code<=100)
                     {
                           ch1=(char)(code);
                           x=x+ch1;
                           str="";
                     }
                     if (code==32)
                     {
                           ch1=' ';
                           x=x+ch1;
                           str="";
                     }                   
                }
                else if(str.length()==3)
                {
                     code=Integer.parseInt(str);
                     if(code>=100&&code<=122)
                     {
                           ch1=(char)(code);
                           x=x+ch1;
                           str="";
                     }
                }
               
           }
           decoded=decoded+x;
     }
     void display()
     {
           System.out.println("Decoded Message\n"+decoded);
     }
     public static void main(String args[])
     {
        QUESTON_17 obj=new QUESTON_17();
           obj.input();
           obj.reverse();
           obj.decode();
           obj.display();
     }
}