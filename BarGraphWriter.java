import java.awt.*;
public class BarGraphWriter {
   String title;
   String top_label;
   int x_pos;
   int y_pos ;
   int y_height;
   
   String label1;
   int height1;
   Color c1;
   
   String label2;
   int height2;
   Color c2;
   
  
   
   String label3;
   int height3;
   Color c3;
   
   String label4;
   int height4;
   Color c4;
   
   String label5;
   int height5;
   Color c5;
   
    String label6;
   int height6;
   Color c6;
   
    public void setAxes(int x, int y, String label, int height) {
       x_pos = x;
       y_pos =y;
       top_label=label;
       y_height = height;     
    }
   public void setBar1(String label,int h, Color c) {
      label1=label;
      height1 = h;
      c1=c;
   }   
     public void setBar2(String label,int h, Color c) {
      label2=label;
      height2 = h;
      c2=c;
   }
     public void setBar3(String label,int h, Color c) {
      label3=label;
      height3 = h;
      c3=c;
   }
     public void setBar4(String label,int h, Color c) {
      label4=label;
      height4 = h;
      c4=c;
   }
     public void setBar5(String label,int h, Color c) {
      label5=label;
      height5 = h;
      c5=c;
   }
     public void setBar6(String label,int h, Color c) {
      label6=label;
      height6 = h;
      c6=c;
   }
   public void setTitle(String s) {
      title = s;
   }
   
}  