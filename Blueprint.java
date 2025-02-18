interface Circle
{
    public float Radius = 10.5f;
    public float PI = 3.14f;

    public float Area();
    public float Circumfarance();
}

class Marvellous implements Circle
{
    public float Area()
    {
        return PI * Radius * Radius;
    }
    public float Circumfarance()
    {
        return 2 * PI * Radius;
    }
}

class Blueprint
{
    public static void main(String[] args) 
    {
       Marvellous mobj = new Marvellous();
       
       System.out.println("Area is : "+mobj.Area());
       System.out.println("Cicumfarance is :"+mobj.Circumfarance());

       System.out.println("Value of Radius is : "+Circle.Radius);
       System.out.println("Value of PI is :"+Circle.PI);

     //  Circle.PI = 7.12;
    }
}