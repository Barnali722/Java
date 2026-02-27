import java.util.*;
class Odd_no_cube
{
    public static void main(String args[])
    {
        int sum = 0,cube=0;
        for(int i=1;i<10;i+=2)
        {
            cube =(i*i*i);
            System.out.println("Cube of"+i+":"+cube);
            sum +=cube;
            System.out.println("Sum of cubes of odd numbers till 1.."+i+":"+sum);
        }
    }
}