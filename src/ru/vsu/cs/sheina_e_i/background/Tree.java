package ru.vsu.cs.sheina_e_i.background;

import java.awt.*;
import java.awt.geom.GeneralPath;

public class Tree {
    private int x;
    private int y;
    private int heigth;

    public Tree(int x, int y, int heigth) {
        this.x = x;
        this.y = y;
        this.heigth = heigth;
    }

    public void print(Graphics2D g){
        g.setColor(new Color(72, 38, 39));
        g.setStroke(new BasicStroke(6));

        GeneralPath gp = new GeneralPath();

        gp.moveTo(x, y);
        gp.curveTo(x, y, x, y - heigth / 4f, x - heigth / 4f, y - heigth / 2f);
        gp.curveTo(x - heigth / 4f, y - heigth / 2f, x - heigth / 2f, y - 3 * heigth / 4f, x - heigth / 2f, y - heigth);
        gp.moveTo(x, y);
        gp.curveTo(x, y - heigth / 4f, x + heigth / 4f, y - 3 * heigth / 4f, x, y - heigth);
        gp.moveTo(x, y);
        gp.curveTo(x, y - heigth / 4f, x + heigth / 3f, y - 2 * heigth / 3f, x + heigth / 4f, y - heigth);
        g.draw(gp);

        g.setColor(new Color(123, 147, 55));
        int r = heigth / 2;
        g.fillOval(x - r / 2, y - heigth - r / 2, r, r);
        g.setColor(new Color(77, 93, 33));
        g.fillOval(x - heigth / 2 - r / 2, y - heigth - r / 2, r, r);
        r = heigth / 3;
        g.fillOval(x + heigth / 4 - r / 2, y - heigth - r / 2, r, r);
    }
}
