package ru.vsu.cs.sheina_e_i;

import ru.vsu.cs.sheina_e_i.background.MainPicture;

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
        MainPicture.land(g);
    }

}
