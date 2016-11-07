import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class cityscape_line_animation extends PApplet {

float x, y, s;
 
public void setup(){
  
  s = 19;
  stroke(255);
  reset();
}
 
public void reset(){
  background(0);
  x = 0;
  y = 300;
}
 
public void draw(){
  // First building
  if(x<50 && y==300) { point(x++,y); }
  else if(x==50 && y>150) { point(x,y--); }
  else if (x<100 && y==150) { point(x++,y); }
  else if (x==100 && y<300) { point(x,y++); }
  
  // Second building
  else if (x<120 && y==300) { point(x++,y); }
  else if (x==120 && y>100) { point(x,y--); }
  else if (x<140 && y>60) { point(x=x+0.5f, y--); }
  else if (x<160 && y<100) { point(x=x+0.5f, y++); }
  else if (x==160 && y<300) { point(x,y++); }
  
  // Third building - experimenting with line() vs. point()
  else if (x<180 && y==300) { line(160, 300, x++, 300); }
  else if (x==180 && y>120) { line(180, 300, 180, y--); }
  else if (x<190 && y==120) { line(180, 120, x++, 120); }
  else if (x==190 && y>110) { line(190, 120, 190, y--); }
  else if (x<250 && y==110) { line(190, 110, x++, 110); }
  else if (x==250 && y<120) { line(250, 110, 250, y++); }
  else if (x<260 && y==120) { line(250, 120, x++, 120); }
  else if (x==260 && y<300) { line(260, 120, 260, y++); }
  
  // Fourth building
  else if (x<280 && y==300) { point(x++, y); }
  else if (x==280 && y>180) { point(x, y--); }
  else if (x<290 && y==180) { point(x++, y); }
  else if (x==290 && y>110) { point(x, y--); }
  else if (x<295 && y==110) { point(x++, y); }
  else if (x<300 && y>30) { point(x=x+0.0625f, y--); }
  else if (x<305 && y<110) { point(x=x+0.0625f, y++); }
  else if (x<310 && y==110) { point(x++, y); }
  else if (x==310 && y<180) { point(x, y++); }
  else if (x<320 && y==180) { point(x++, y); }
  else if (x==320 && y<300) { point(x, y++); }
  
  // Fifth building
  else if (x<340 && y==300) { point(x++, y); }
  else if (x==340 && y>100) { point(x, y--); }
  else if (x<450 && y==100) { point(x++, y); }
  else if (x==450 && y<300) { point(x, y++); }
  else { point(x++,y); } 
}
  public void settings() {  size(500,500); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "cityscape_line_animation" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
