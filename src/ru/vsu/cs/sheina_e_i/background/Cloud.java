package ru.vsu.cs.sheina_e_i.background;

import java.awt.*;
import java.awt.geom.GeneralPath;

public class Cloud {
    private int x;
    private int y;
    private int width;

    public Cloud(int x, int y, int width) {
        this.x = x;
        this.y = y;
        this.width = width;
    }

    public void paint(Graphics2D g) {
        g.setColor(new Color(255, 247, 228));
        GeneralPath gp = new GeneralPath();

        gp.moveTo(x, y);
        gp.lineTo(x + width, y);
        gp.curveTo(x + width, y, x + width + width / 15f, y - width / 20f, x + width, y -  width / 10f);
        gp.curveTo(x + width, y -  width / 10f, x + 2.0 * width / 3, y - 3.0 * width / 10, x + width / 3f, y - width / 10f);
        gp.curveTo(x + width / 3f, y - width / 10f, x + width / 8.0, y - width / 10f, x + width / 20f, y - width / 20f);
        gp.curveTo(x + width / 20f, y - width / 20f, x, y - width / 30f, x, y);

        g.fill(gp);
    }
}
