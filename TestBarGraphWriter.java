import java.awt.*;
public class TestBarGraphWriter {
public static void main(String[] args) {
  BarGraphWriter e = new BarGraphWriter();
    e.setTitle("Detyra per punim seminarik"); 

  e.setAxes(100, 150, "30", 100); 
  e.setBar1("Jan", 31*3, Color.red);   //  31 days
  e.setBar2("Feb", 28*3, Color.white);   // 28 days
  e.setBar3("Mar", 31*3, Color.blue);   // 31 days
  e.setBar4("Apr", 30*3, Color.yellow);   // 30 days
  e.setBar5("May", 31*3, Color.magenta);   // 31 days
  e.setBar6("Jun", 30*3, Color.cyan);   // 30 days


  
  new Vizatuesi(e);
   }
  }