import javax.swing.*;
import java.awt.*;
public class Vizatuesi extends JPanel {
   String top_label;
   int x_pos ;
   int y_pos ;
   int y_height;
   BarGraphWriter shtylla;
   public Vizatuesi(BarGraphWriter b) {
      shtylla=b;
      x_pos = shtylla.x_pos;
     y_pos = shtylla.y_pos;
     y_height = shtylla.y_height;
     top_label = shtylla.top_label;

      JFrame korniza = new JFrame();
      korniza.getContentPane().add(this);
      korniza.setTitle(shtylla.title);
      korniza.setVisible(true);
      korniza.setSize(500,500);
    }
    
  public void paintComponent(Graphics g){
  

  vizatoBoshtin(x_pos,y_pos,top_label,y_height,g);
 
   
   vizatoShtyllen1(shtylla.label1,shtylla.height1, shtylla.c1,g);
   vizatoShtyllen2(shtylla.label2,shtylla.height2, shtylla.c2,g);
   vizatoShtyllen3(shtylla.label3,shtylla.height3, shtylla.c3,g);
   vizatoShtyllen4(shtylla.label4,shtylla.height4, shtylla.c4,g);
   vizatoShtyllen5(shtylla.label5,shtylla.height5, shtylla.c5,g);
   vizatoShtyllen6(shtylla.label6,shtylla.height6, shtylla.c6,g);
   

  }
  public void vizatoBoshtin(int x_pos, int y_pos, String top_label, int y_height,Graphics g) {
   g.drawString(top_label,x_pos-20,y_pos);
   g.drawString("0", x_pos-20, y_pos+y_height);
   g.drawLine(x_pos,y_pos,x_pos,y_pos+y_height);
   g.drawLine(x_pos,y_pos+y_height,x_pos+6*40+5*5, y_pos+y_height); 
  }

   public void vizatoShtyllen1(String label, int height, Color c,Graphics g) {
   g.drawString(label, x_pos+10, y_pos+y_height+15);
   g.setColor(Color.black);
   g.fillRect(x_pos+2,y_pos+y_height-height+2,40+2,height+2);
   g.setColor(c);
   g.fillRect(x_pos,y_pos+y_height-height,40,height);
   g.setColor(Color.black);
   g.drawRect(x_pos,y_pos+y_height-height,40,height);
  }
   public void vizatoShtyllen2(String label, int height, Color c, Graphics g) {
      g.drawString(label,x_pos+40+10+10 , y_pos+y_height+15);
      g.setColor(Color.black);
      g.fillRect(x_pos+40+10+2,y_pos+y_height-height+2,40+2,height+2);
      g.setColor(c);
      g.fillRect(x_pos+40+10,y_pos+y_height-height,40,height);
      g.setColor(Color.BLACK);
      g.drawRect(x_pos+40+10,y_pos+y_height-height,40,height);  
   }
   public void vizatoShtyllen3(String label, int height, Color c, Graphics g) {
      g.drawString(label,x_pos+2*40+2*10+10 , y_pos+y_height+15);
      g.setColor(Color.black);
      g.fillRect(x_pos+2*40+2*10+2,y_pos+y_height-height+2,40+2,height+2);
      g.setColor(c);
      g.fillRect(x_pos+2*40+2*10,y_pos+y_height-height,40,height);
      g.setColor(Color.BLACK);
      g.drawRect(x_pos+2*40+2*10,y_pos+y_height-height,40,height);  
   } 
    public void vizatoShtyllen4(String label, int height, Color c, Graphics g) {
      g.drawString(label,x_pos+3*40+3*10+10 , y_pos+y_height+15);
      g.setColor(Color.black);
      g.fillRect(x_pos+3*40+3*10+2,y_pos+y_height-height+2,40+2,height+2);
      g.setColor(c);
      g.fillRect(x_pos+3*40+3*10,y_pos+y_height-height,40,height);
      g.setColor(Color.BLACK);
      g.drawRect(x_pos+3*40+3*10,y_pos+y_height-height,40,height);  
   }
    public void vizatoShtyllen5(String label, int height, Color c, Graphics g) {
      g.drawString(label,x_pos+4*40+4*10+10 , y_pos+y_height+15);
      g.setColor(Color.black);
      g.fillRect(x_pos+4*40+4*10+2,y_pos+y_height-height+2,40+2,height+2);
      g.setColor(c);
      g.fillRect(x_pos+4*40+4*10,y_pos+y_height-height,40,height);
      g.setColor(Color.BLACK);
      g.drawRect(x_pos+4*40+4*10,y_pos+y_height-height,40,height);  
   }
    public void vizatoShtyllen6(String label, int height, Color c, Graphics g) {
      g.drawString(label,x_pos+5*40+5*10+10 , y_pos+y_height+15);
      g.setColor(Color.black);
      g.fillRect(x_pos+5*40+5*10+2,y_pos+y_height-height+2,40+2,height+2);
      g.setColor(c);
      g.fillRect(x_pos+5*40+5*10,y_pos+y_height-height,40,height);
      g.setColor(Color.BLACK);
      g.drawRect(x_pos+5*40+5*10,y_pos+y_height-height,40,height);  
   }
  
 }
   