import processing.core._; 

object spiral { 
  def main(args: Array[String]) {
    PApplet.main(Array[String]("spiral"))
  }
}

class spiral extends PApplet {
  var x1 : Float = 200;
  var y1 : Float = 200;
  var doneAnimating: Boolean = false; 
  
  override def settings () {
    size(500, 500)
  }
 
  override def setup() {
    stroke(255)
    strokeWeight(8);
    background(0)
    frameRate(300)
  }
  
  override def draw {  
    val empty = false;
    
    point(x1,y1);
    if(x1<300 && y1==200) { x1+=1; point(x1,y1); }
    else if(x1==300 && y1<300) { y1+=1; point(x1,y1); }
    else if(x1>200 && y1==300) { x1-=1; point(x1,y1); }
    else if(x1==200 && y1>220) { y1-=1; point(x1,y1); }
    else if(x1<280 && y1==220) { x1+=1; point(x1,y1); }
    else if(x1==280 && y1<280) { y1+=1; point(x1,y1); }
    else if(x1>220 && y1==280) { x1-=1; point(x1,y1); }
    else if(x1==220 && y1>240) { y1-=1; point(x1,y1); }
    else if(x1<260 && y1==240) { x1+=1; point(x1,y1); }
    else if(x1==260 && y1<260) { y1+=1; point(x1,y1); }
    else if(x1>240 && y1==260) { x1-=1; point(x1,y1); }
    else { }
    
    
    /*
    point(x1,y1);
    (x1,y1) match {
      case a if (x1<300 && y1==200) => x1+=1
      case b if (x1==300 && y1<300) => y1+=1
      case c if(x1>200 && y1==300) => x1-=1
      case d if(x1==200 && y1>220) => y1-=1
      case e if(x1<280 && y1==220) => x1+=1
      case f if(x1==280 && y1<280) => y1+=1
      case g if(x1>220 && y1==280) => x1-=1
      case h if(x1==220 && y1>240) => y1-=1
      case i if(x1<260 && y1==240) => x1+=1
      case j if(x1==260 && y1<260) => y1+=1
      case k if(x1>240 && y1==260) => x1-=1
      case _ => 
    }
    */
    
  }
}