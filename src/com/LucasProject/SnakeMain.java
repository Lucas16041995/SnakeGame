import javax.swing.*;
import java.awt.*;

public class SnakeMain extends JPanel {
    public static int width = 400;
    public static int height = 400;

    public  SnakeMain(){

    }

    @Override
    public Dimension getPreferredSize(){
        return  new Dimension(width,height);
    }
    public static void main(String[] args) {
        JFrame window = new JFrame("Snake Game");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(new SnakeMain());
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        window.setResizable(false);
    }
}
