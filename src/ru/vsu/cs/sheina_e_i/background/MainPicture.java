package ru.vsu.cs.sheina_e_i.background;

import java.awt.*;

public class MainPicture {
    public static void sky(Graphics2D g) {
        g.setPaint(new LinearGradientPaint(0, 0, 0, 600,
                new float[] {0.1f, 0.2f, 0.4f},
                new Color[] {new Color (134, 188, 226), new Color (161, 204, 236), new Color (184, 225, 243)}));
        g.fillRect(0, 0, 800, 350);
    }

    public static void land(Graphics2D g) {
        g.setPaint(new LinearGradientPaint(0, 350, 0, 600,
                new float[] {0.1f, 0.3f, 0.4f},
                new Color[] {new Color (239, 186, 90), new Color (197, 191, 53), new Color (147, 143, 13)}));
        g.fillRect(0, 350, 800, 250);
    }
}
