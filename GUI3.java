import java.awt.*;
import java.awt.event.*;

class MarvellousFrame
{
    public MarvellousFrame(String title)
    {
        Frame fobj = new Frame("PPA50");
        fobj.setSize(300,300);
        fobj.setVisible(true);
        fobj.addWindowListener(new MarvellousListener());
    }
}
class MarvellousListener implements WindowListener
{
    public void windowDeactivated(WindowEvent obj){}
    public void  windowActivated(WindowEvent obj) {}
    public void windowDeiconified(WindowEvent obj) {}
    public void  windowIconified(WindowEvent obj) {}
    public void windowClosed(WindowEvent obj) {}
    public void  windowClosing(WindowEvent obj) 
    {
        System.exit(0);
        //System.out.println("Ala re...");
    }
    public void  windowOpened(WindowEvent obj ) {}
}
class GUI3
{
    public static void main(String[] args) 
    {
        MarvellousFrame mobj = new MarvellousFrame("PPA50");
    }
}