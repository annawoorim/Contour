import processing.core._; 

object twoSquares { 
  def main(args: Array[String]) {
    PApplet.main(Array[String]("twoSquares"))
  }
}

class twoSquares extends PApplet {
  
  var x1 : Float = 50;
  var y1 : Float = 300;
  
  var x2 : Float = 150;
  var y2 : Float = 300;
  
  override def settings () {
    size(500, 500)
  }
 
  override def setup() {
    stroke(255)
    background(0)
  }
  
  override def draw {
    if(x1<100 && y1==300) { x1+=1; x2+=1; point(x1,y1); point(x2,y2);}
    if(x1==100 && y1<350) { y1+=1; y2+=1; point(x1,y1); point(x2,y2);}
    if(x1>50 && y1==350) { x1-=1; x2-=1; point(x1,y1); point(x2,y2);}
    if(x1==50 && y1>300) { y1-=1; y2-=1; point(x1,y1); point(x2,y2);}
    else { }
  }
  
}