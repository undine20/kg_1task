package ru.vsu.cs.sheina_e_i.animals;

import java.awt.*;
import java.awt.geom.GeneralPath;

public class Elephant {
    private int x;
    private int y;
    private int r;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public Elephant(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public void paint(Graphics2D g) {
        int rHead = r * 4 / 5;
        int rEar = r * 5 / 4;
        g.setStroke(new BasicStroke(4));

        g.setColor(new Color (127, 127, 127));//trunk
        GeneralPath gh = new GeneralPath();
        gh.moveTo(x - r/2 + r, y - r/2);
        gh.curveTo(x - r/2 + r, y - r, x - r/2 + r * 7/4, y - r/2  + r/4, x - r/2 + r * 7 / 4, y - r/2 - r * 3/4);
        gh.lineTo(x - r/2f + r * 7 / 4f + r / 7f, y - r/2f - r * 3/4f + r / 7f);
        gh.curveTo(x - r/2f + r * 7 / 4f + r / 7f, y - r/2f - r * 3/4f + r / 7f, x - r/2 + r * 7/4 + r / 7, y - r/2  + r/4 + + r / 7, x - r/2 + r + r / 7, y - r / 2 + r / 7);
        gh.lineTo(x - r/2 + r, y - r/2);
        g.fill(gh);
        g.setColor(new Color (63, 63, 63));
        g.draw(gh);

        gh.moveTo(x, y + r/6); //tail
        gh.curveTo(x, y + r/6, x - r * 3 / 4 , y + r * 2 / 6, x - r, y + r/6);
        g.draw(gh);

        g.setColor(new Color (127, 127, 127));
        g.fillOval(x - r / 2, y - r / 2, r, r); //body
        g.setColor(new Color (63, 63, 63));
        g.drawOval(x - r / 2, y - r / 2, r, r);

        g.setColor(new Color (127, 127, 127));
        g.fillOval(x + r - rHead / 2 - r / 2, y -  r * 7 / 6 - rHead / 2 + r / 2, rHead, rHead); //head
        g.setColor(new Color (63, 63, 63));
        g.drawOval(x + r - rHead / 2 - r / 2, y -  r * 7 / 6 - rHead / 2 + r / 2, rHead, rHead);

        g.setColor(Color.WHITE);
        g.fillOval(x - r/2 + r * 10 / 9, y - r * 6 / 7, r / 5, r / 5);
        g.setColor(Color.black);
        g.fillOval(x - r/2 + r * 12 /10, y - r * 6 / 7, r/7, r/7);

        g.setColor(new Color (127, 127, 127));
        g.fillOval(x - r * 1/3 - rEar / 2, y - 3 * r / 4 - rHead, rEar, rEar); //ear
        g.setColor(new Color (63, 63, 63));
        g.drawOval(x - r * 1/3 - rEar / 2, y - 3 * r / 4 - rHead, rEar, rEar);

        g.setColor(new Color (127, 127, 127));
        GeneralPath gh1 = new GeneralPath();// legL
        gh1.moveTo(x - r * 5 / 4 + r / 2, y + 2 * r - r);
        gh1.curveTo(x - r * 5 / 4 + r / 2, y + 2 * r - r, x - r * 3 / 4 + r/2, y + r / 4 - r, x - r * 3 / 4 + r/2, y + 2 * r - r);
        gh1.curveTo(x - r * 3 / 4 + r / 2, y + 2 * r - r, x - r * 3 / 4 + r/2, y + 2 * r + r / 8 - r, x - r * 5 / 4 + r/2, y + 2 * r - r);
        g.fill(gh1);
        g.setColor(new Color (63, 63, 63));
        g.setStroke(new BasicStroke(4));
        g.draw(gh1);

        g.setColor(new Color (127, 127, 127)); // legR
        gh1.moveTo(x + r * 5 / 4 - r / 2, y + 2 * r - r);
        gh1.curveTo(x + r * 5 / 4 - r / 2, y + 2 * r - r, x + r * 3 / 4 - r/2, y + r / 4 - r, x + r * 3 / 4 - r/2, y + 2 * r - r);
        gh1.curveTo(x + r * 3 / 4 - r / 2, y + 2 * r - r, x + r * 3 / 4 - r/2, y + 2 * r + r / 8 - r, x + r * 5 / 4 - r/2, y + 2 * r - r);
        g.fill(gh1);
        g.setColor(new Color (63, 63, 63));
        g.draw(gh1);
    }
}
