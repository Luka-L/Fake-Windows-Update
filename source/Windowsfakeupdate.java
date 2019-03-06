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

public class Windowsfakeupdate extends PApplet {

String b = "Das Update für Windows 10 wird konfiguriert.";
int a = 0;
String c = "Schalten sie den Computer nicht aus";
 PFont myFont; 
 //String[] fonts = PFont.list();
 

public void setup(){
  
  
  
  myFont =  createFont("Segoe UI",1);
  frameRate(1);

  //printArray(fonts);
  
}

public void draw(){
  
  background(66, 134, 244);
  
  a ++;
  
  textFont(myFont);
  textSize(75);
  textAlign(CENTER);
  text(b,width/2,height/2);
  text(c,width/2,height/2 + 240);
  text(a + " % abgeschlossen.",width/2,height/2 + 120);
  
  
}
  public void settings() {  fullScreen(); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Windowsfakeupdate" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
