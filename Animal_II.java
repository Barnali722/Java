class Animal_II
{  
    void eat()
    {
        System.out.println("eating...");
    }  
}
class Dog extends Animal_II
{  
    void bark()
    {
        System.out.println("barking...");
    }  
}  
class Cat extends Animal_II
{  
    void meow()
    {
        System.out.println("meowing...");
    }  
}  
class TestInheritance3
{  
    public static void main(String args[])
    {  
        Cat c=new Cat();  
        c.meow();  
        c.eat();  
    }
}  