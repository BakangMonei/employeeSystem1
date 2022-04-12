import javax.swing.*;

public class GUI
{
    JFrame mainFrame = new JFrame();
    public GUI()
    {
        mainFrame.setSize(600, 350);
        mainFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI();
    }
}
