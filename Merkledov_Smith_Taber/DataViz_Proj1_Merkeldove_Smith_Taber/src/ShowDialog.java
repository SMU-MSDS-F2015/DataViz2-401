import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShowDialog
{
  public static void showMessageSimple()
  {
    
    // create a jframe
    JFrame frame = new JFrame("JOptionPane showMessageDialog example");
    
    // show a joptionpane dialog using showMessageDialog
    JOptionPane.showMessageDialog(frame,
        "MyTestMessage");
  }
  
  public static void showInputDialog() {
	    // create a jframe
	    JFrame frame = new JFrame("JOptionPane showMessageDialog example");

	    String zipCodeString = (String)JOptionPane.showInputDialog(
            frame,
            "Input the ZipCode for Sunrise/Sunset Info:",
            "Customized Dialog",
            JOptionPane.PLAIN_MESSAGE,
            null, // Icon
            null, //Choices
            "98052"); // default
	    
	    System.out.println(zipCodeString);
  }
}