package com.LucasProject;

import java.awt.*;
import java.util.ArrayList;

public class Snake {
    private ArrayList<com.LucasProject.Node> snakebody;

    public Snake(){
        snakebody = new ArrayList<>();
        snakebody.add(new Node(80,0)); // head
        snakebody.add(new Node(60,0));
        snakebody.add(new Node(40,0));
        snakebody.add(new Node(20,0));
    }
    public ArrayList<Node> getSnakebody(){
        return snakebody;
    }
    public void drawSnake(Graphics g){
        for (int i = 0; i < snakebody.size(); i++){
            if (i == 0){
                g.setColor(Color.GREEN);
            }else {
                g.setColor(Color.RED);
            }

            Node n = snakebody.get(i);
            if (n.x >= SnakeMain.width){
                n.x = 0;
            }
            if (n.x < 0){
                n.x = SnakeMain.width - SnakeMain.CELL_SIZE;
            }
            if (n.y >= SnakeMain.height){
                n.y = 0;
            }
            if (n.y < 0){
                n.y = SnakeMain.height - SnakeMain.CELL_SIZE;
            }
            g.fillOval(n.x, n.y, SnakeMain.CELL_SIZE, SnakeMain.CELL_SIZE);
        }
    }
}