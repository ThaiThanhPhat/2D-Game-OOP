package Main;

import java.awt.Color;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable {
    final int originalTitleSize = 16;
    final int scale = 3;

    final int titelSize = originalTitleSize * scale;
    final int maxScreenCol=16;
    final int maxScreenRow=12;
    final int screenWidth=titelSize*maxScreenCol;
    final int screenHeight=titelSize*maxScreenRow;

    Thread gameThread;
    public GamePanel(){
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
    }
    public void startGameThread(){
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run(){

    }
}
