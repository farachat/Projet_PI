package bestdeal.esprit.util;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import javax.swing.JPanel; 
import java.awt.Color;
import java.awt.Graphics;


/**
 *
 * @author waysso
 */
public class TransparentPanel extends JPanel {
    private int red;
    private int green;
    private int blue;
    private int alpha;

    /**
     * @return the red
     */
    public int getRed() {
        return red;
    }

    /**
     * @param red the red to set
     */
    public void setRed(int red) {
        this.red = red;
    }

    /**
     * @return the green
     */
    public int getGreen() {
        return green;
    }

    /**
     * @param green the green to set
     */
    public void setGreen(int green) {
        this.green = green;
    }

    /**
     * @return the blue
     */
    public int getBlue() {
        return blue;
    }

    /**
     * @param blue the blue to set
     */
    public void setBlue(int blue) {
        this.blue = blue;
    }

    /**
     * @return the alpha
     */
    public int getAlpha() {
        return alpha;
    }

    /**
     * @param alpha the alpha to set
     */
    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }
    public TransparentPanel(int red,int green,int blue,int alpha){
        super();
        this.setOpaque(false);
        this.setLayout(null);
    }
    public TransparentPanel(){
        this(233,238,238,100);
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Color c = new Color(red,green, blue, alpha);
        g.setColor(c);
        g.fillRect(0, 0, this.getWidth(),this.getHeight());
        
    }
     
    
    
}
