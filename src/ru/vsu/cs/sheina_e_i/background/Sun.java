package ru.vsu.cs.sheina_e_i.background;

import java.awt.*;

public class Sun {
    private int x;
    private int y;
    private int r;

    public Sun(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public void print(Graphics2D g) {
        g.setColor(new Color(255, 229, 133));
        g.fillOval(x, y, r, r);
    }
}
