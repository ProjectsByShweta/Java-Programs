class Base
{
    public int A,B;
    public Base()
    {
        System.out.println("Base constructor");
    }
    void Fun()
    {
        System.out.println("Inside Base fun");
    }
}
class Derived extends Base              //class Derived : public Base(c++ syntax)
{
    public int X,Y;
    public Derived()
    {
        System.out.println("Derived constructor");  
    }
    void Gun()
    {
        System.out.println("Inside Derived Gun");
    }
}
class Single
{
    public static void main(String [] Args)
    {
      Derived dobj = new Derived();
      dobj.Fun();
      dobj.Gun();  
    }
}