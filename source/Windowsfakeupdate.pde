String b = "Das Update für Windows 10 wird konfiguriert.";
int a = 0;
String c = "Schalten sie den Computer nicht aus";
 PFont myFont; 
 //String[] fonts = PFont.list();
 

void setup(){
  
  fullScreen();
  
  myFont =  createFont("Segoe UI",1);
  frameRate(1);

  //printArray(fonts);
  
}

void draw(){
  
  background(66, 134, 244);
  
  a ++;
  
  textFont(myFont);
  textSize(75);
  textAlign(CENTER);
  text(b,width/2,height/2);
  text(c,width/2,height/2 + 240);
  text(a + " % abgeschlossen.",width/2,height/2 + 120);
  
  
}
