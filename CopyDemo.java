class Student implements Cloneable
{
    public String Name;
    public int Marks;
    public int Age;

    public Student (String str, int A, int B)
    {
        this.Name = str;
        this.Marks = A;
        this.Age = B;
    }
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}

class CopyDemo
{
    public static void main(String[] args) 
    {
        try
        {
        Student sobj = new Student("Shweta", 90, 21);
        System.out.println("Name of student is : "+sobj.Name);
        System.out.println("Marks obtained by the student is : "+sobj.Marks);
        System.out.println("Age of student is : "+sobj.Age);
        
        Student sobjX = (Student)sobj.clone();
        System.out.println("Name of student is : "+sobj.Name);
        System.out.println("Marks obtained by the student is : "+sobj.Marks);
        System.out.println("Age of student is : "+sobj.Age);
        }
        catch(Exception obj)
        {}
    }
}