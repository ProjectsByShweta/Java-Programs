import java.io.*;

class BinputX
{
    public static void main(String A[])
    {
        try
            {
                BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter your name : ");
                String name = bobj.readLine();
                System.out.println("Welcome : "+name);
            }
            catch (IOException obj)
            {}
    }
}