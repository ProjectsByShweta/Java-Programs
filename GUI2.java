import java.awt.*;

class MarvellousFrame
{
    public MarvellousFrame(String title)
    {
        Frame fobj = new Frame("PPA50");
        fobj.setSize(300,300);
        fobj.setVisible(true);
    }
}
class GUI2
{
    public static void main(String[] args) 
    {
        MarvellousFrame mobj = new MarvellousFrame("PPA50");
    }
}