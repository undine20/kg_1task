package ru.vsu.cs.sheina_e_i;

import ru.vsu.cs.sheina_e_i.animals.Elephant;
import ru.vsu.cs.sheina_e_i.background.Cloud;
import ru.vsu.cs.sheina_e_i.background.MainPicture;
import ru.vsu.cs.sheina_e_i.background.Sun;
import ru.vsu.cs.sheina_e_i.background.Tree;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class DrawPanel extends JPanel implements ActionListener {

    Sun sun = new Sun(240, 180, 150);
    Cloud firstCloud = new Cloud(370, 120, 410);
    Cloud secondCloud = new Cloud(50, 220, 350);
    Cloud thirdCloud = new Cloud(450, 260, 200);
    Tree firstTree = new Tree(650, 420, 180);
    Tree secondTree = new Tree(240, 400, 120);
    Tree thirdTree = new Tree(110, 380, 90);
    Elephant elephant = new Elephant(-100, 450, 100);
    Timer timer = new Timer(20, this);

    public DrawPanel() {
        timer.start();
    }

    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        MainPicture.sky(g);

        sun.print(g);

        MainPicture.land(g);
        MainPicture.mountains(g);

        firstCloud.paint(g);
        secondCloud.paint(g);
        thirdCloud.paint(g);


        firstTree.print(g);
        secondTree.print(g);
        thirdTree.print(g);

        elephant.paint(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(secondCloud.getX() >= 800) {
            secondCloud.setX(-350);
        } else if (firstCloud.getX() >= 800){
            firstCloud.setX(-410);
        } else if (thirdCloud.getX() >= 800) {
            thirdCloud.setX(-200);
        }

        firstCloud.setX(firstCloud.getX() + 1);
        secondCloud.setX(secondCloud.getX() + 1);
        thirdCloud.setX(thirdCloud.getX() + 1);

        if (elephant.getX() >= 900) {
            elephant.setX(-190);
        }
        elephant.setX(elephant.getX() + 3);

        repaint();
    }
}
