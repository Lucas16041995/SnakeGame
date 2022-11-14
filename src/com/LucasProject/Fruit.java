package com.LucasProject;

import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Fruit {
    //水果出現的位置
    private int x;
    private int y;
    private ImageIcon image;


    //constructer
    public Fruit(){
//        image = new ImageIcon("fruit.png.jpeg");
        image = new ImageIcon(getClass().getResource("fruit.png"));
        this.x = (int)(Math.floor(Math.random() * SnakeMain.column) * SnakeMain.CELL_SIZE);
        this.y = (int)(Math.floor(Math.random() * SnakeMain.row) * SnakeMain.CELL_SIZE);
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void drawFruit(Graphics g){
//        g.setColor(Color.GREEN);
//        g.fillOval(this.x, this.y , SnakeMain.CELL_SIZE, SnakeMain.CELL_SIZE);
        image.paintIcon(null, g,this.x, this.y);
    }
    public void setNewLocation(Snake s){
        int new_x;
        int new_y;
        boolean overlapping;
        do {
            new_x = (int)(Math.floor(Math.random() * SnakeMain.column) * SnakeMain.CELL_SIZE);
            new_y = (int)(Math.floor(Math.random() * SnakeMain.row) * SnakeMain.CELL_SIZE);
            overlapping = check_overlap(new_x, new_y, s);
        }while (overlapping);
        this.x = new_x;
        this.y = new_y;
    }

    private boolean check_overlap(int x, int y, Snake s){
        ArrayList<Node> snake_body = s.getSnakebody();
        for (int j = 0 ; j < s.getSnakebody().size(); j++){
            if (x == snake_body.get(j).x && y == snake_body.get(j).y){
                return true;
            }
        }
        return false;
    }
}
