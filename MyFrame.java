import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
public class MyFrame extends JFrame implements MouseListener{
    

    MyFrame(){


        this.addMouseListener(this);

        this.setSize(800,800);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    long startTime = java.lang.System.nanoTime();
    int counter = 0;
    int maxCount = 0;
    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        long diff = System.nanoTime()-startTime;
        if(diff<66000000){
            counter++;
            System.out.println(diff + " " + counter);
            if(maxCount<counter) maxCount = counter;
            startTime=System.nanoTime();
        } else {
            counter = 0;
            System.out.println(diff/1000000 + "<- bad " + maxCount);
            startTime=System.nanoTime();
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
}
