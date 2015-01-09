
package SEPackage;
import javax.swing.JApplet;

/**
 *
 * @author shubham
 */
public class SnakeJApplet extends JApplet  {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        StartGUI ar = new StartGUI();
        this.setContentPane(ar.getContentPane());
        
    }
    // TODO overwrite start(), stop() and destroy() methods
}