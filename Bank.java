interface Bank_func
{   
    float rateOfInterest();   
}   
class SBI implements Bank_func
{   
    public float rateOfInterest()
    {
        return 9.15f;
    }   
}   
class PNB implements Bank_func
{   
    public float rateOfInterest()
    {
        return 9.7f;
    }   
}   
public class Bank
{   
    public static void main(String[] args)
    {   
        Bank_func b=new SBI();   
        System.out.println("ROI: "+b.rateOfInterest());   
    }
} 