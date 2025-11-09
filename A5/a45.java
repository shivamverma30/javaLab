// Q45. Applet that draws and fills a circle with color.
import java.applet.Applet;
import java.awt.*;
@SuppressWarnings("removal")
public class a45 extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.fillOval(50, 50, 100, 100);
    }
}
