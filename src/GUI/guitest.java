package GUI;


import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JComponent;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author slatz8075
 */
public class guitest {

    /**
     * @param args the command line arguments
     */
    public class jImage extends JComponent {
        //somethying to store image
        private BufferedImage image;
        
        public void paintCompenent(Graphics g){
            //there is an image to draw
            if(image != null){
                //draw the image
                g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), null);
            }
        }
        
        public void setImage(BufferedImage img){
            //store the image
            this.image = img;
            //repaint to draw
            repaint();
        }
    }
}
