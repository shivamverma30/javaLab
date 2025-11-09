// Q44. Applet that accepts name and age using <param> and displays them.
import java.applet.Applet;
import java.awt.Graphics;
@SuppressWarnings("removal")
public class a44 extends Applet {
    String name;
    int age;

    public void init() {
        name = getParameter("name");
        age = Integer.parseInt(getParameter("age"));
    }

    public void paint(Graphics g) {
        g.drawString("Name: " + name, 50, 50);
        g.drawString("Age: " + age, 50, 70);
    }
}
