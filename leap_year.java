import java.util.*;
class leap_year
{
    public static void main(String args[])
    {
        int year;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter year : ");
        year=in.nextInt();
        if(((year%4==0) && (year%100!=0)) || (year%400==0))
        {
            System.out.println("LEAP YEAR");
        }
        else
        {
          System.out.println("COMMON YEAR");  
        }
    }
}