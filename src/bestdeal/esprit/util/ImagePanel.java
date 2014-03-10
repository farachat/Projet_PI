package bestdeal.esprit.util;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

/**
 *
 * @author waysso
 */
public class ImagePanel extends javax.swing.JPanel {
    private Image backgroundImage;
    
    public ImagePanel(){      
    }
    public Image getImage(){
        return backgroundImage;
    }
    public void setImage(Image image){
        this.backgroundImage = image;
        Dimension size = new Dimension(this.getWidth(),this.getHeight());
        this.setPreferredSize(size);
        this.setMinimumSize(size);
        this.setMaximumSize(size);
        this.setSize(size);
        this.setOpaque(false);
    }
    public static void main(String[] args){
        //TODO
    }
    public void paintComponent(Graphics g){
        if(this.backgroundImage!=null){
        g.drawImage(backgroundImage, 0, 0, this.getWidth(),this.getHeight(),null);
        
        }
    }
}
