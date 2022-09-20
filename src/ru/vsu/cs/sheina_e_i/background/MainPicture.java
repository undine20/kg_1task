package ru.vsu.cs.sheina_e_i.background;

import java.awt.*;
import java.awt.geom.GeneralPath;

public class MainPicture {
    public static void sky(Graphics2D g) {
        g.setPaint(new LinearGradientPaint(0, 0, 0, 600,
                new float[] {0.1f, 0.2f, 0.4f},
                new Color[] {new Color (134, 188, 226), new Color (161, 204, 236), new Color (184, 225, 243)}));
        g.fillRect(0, 0, 800, 350);
    }

    public static void land(Graphics2D g) {
        g.setPaint(new LinearGradientPaint(0, 350, 0, 600,
                new float[] {0.1f, 0.2f, 0.3f, 0.4f},
                new Color[] {new Color (239, 186, 90), new Color (197, 191, 53), new Color (147, 143, 13), new Color (78, 115, 39)}));
        g.fillRect(0, 350, 800, 250);
    }

    public static void mountains(Graphics2D g) {
        g.setPaint(new Color(155, 179, 186));

        GeneralPath gp = new GeneralPath();
        gp.moveTo(0, 300);
        gp.lineTo(0, 350);
        gp.lineTo(800, 350);
        gp.lineTo(800, 300);
        gp.curveTo(800, 300, 600, 250, 500, 300);
        gp.curveTo(500, 300, 450, 340, 400, 300);
        gp.curveTo(400, 300, 300, 250, 200, 340);
        gp.curveTo(200, 340, 100, 340, 0, 300);

        g.fill(gp);
    }
}
