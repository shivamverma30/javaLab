// Q43. Simple applet that displays "Welcome to Java Applet".
import java.applet.Applet;
import java.awt.Graphics;
@SuppressWarnings("removal")
public class a43 extends Applet {
    public void paint(Graphics g) {
        g.drawString("Welcome to Java Applet", 50, 50);

    }
}
