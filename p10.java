import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalTime;

public class p10 extends Applet {
    private Button btn;
    private String lt="";

    public void init() {
        btn = new Button("Click Me");
        btn.setLocation(50, 100);
        btn.setBackground(new Color(100, 150, 200));
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lt = ""+LocalTime.now().getSecond();
                repaint();
            }
        });

        add(btn);
    }

    public void paint(Graphics g) {
        int w = getWidth(), h = getHeight();
        int r, g1, b; 
        float nx, ny;

        for (int y = 0; y < h; y++) {
            for (int x = 0; x < w; x++) {
                nx = x/(float)w;
                ny = y/(float)h;

                r = (int)((1-nx)*(1-ny)*255);
                g1 = (int)(nx*(1-ny)*255);
                b = (int)(nx*ny*255);
                

                g.setColor(new Color(r, g1, b));
                g.fillRect(x, y, 1, 1);
            }
        }

        g.setColor(new Color(255, 255, 255));
        g.drawString(lt, 50, 50);
    }
}
