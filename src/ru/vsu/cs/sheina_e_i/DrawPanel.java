package ru.vsu.cs.sheina_e_i;

import ru.vsu.cs.sheina_e_i.background.Cloud;
import ru.vsu.cs.sheina_e_i.background.MainPicture;
import ru.vsu.cs.sheina_e_i.background.Sun;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    public DrawPanel() {
    }

    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;

        MainPicture.sky(g);

        Sun sun = new Sun(240, 180, 150);
        sun.print(g);

        MainPicture.land(g);
        MainPicture.mountains(g);

        Cloud firstCloud = new Cloud(370, 120, 410);
        Cloud secondCloud = new Cloud(50, 220, 350);
        Cloud firdCloud = new Cloud(450, 260, 200);
        firstCloud.paint(g);
        secondCloud.paint(g);
        firdCloud.paint(g);
    }

}
