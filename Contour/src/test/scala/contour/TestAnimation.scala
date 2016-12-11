package contour
import processing.core._

/*
 * Creating a test animation using the intermediate representation 
 * of animation rules
 */
object TestAnimation extends RulesIR { 
  def main(args: Array[String]) {
    PApplet.main(Array[String]("contour.TestAnimation"))
  }  
}

class TestAnimation extends PApplet {
  // Start position of the line
  var pos: Position = Position(200,200)
  
  val rules: List[RulesIR] = List(
       // Rules for creating a spiral animation
        Right(100),
        Down(100),
        Left(100),
        Up(80),
        Right(80),
        Down(60),
        Left(60),
        Up(40),
        Right(40),
        Down(20),
        Left(20)
  )
  
  // Set line color to purple
  val properties: List[RulesIR] = List(Color(128,0,128))
  
  var posMoved = TestAnimation.posRules(rules)
  var startRule = TestAnimation.startRules(rules)
    
  override def settings () {
    size(500, 500)
  }
    
  override def setup() {
    stroke(255)
    background(0)
    frameRate(300)
    
   /*
    * Set properties of the line and background
   */
    for (p <- properties) {
      p match {
        case Color(r,g,b) => stroke(r,g,b)
        case Width(w) => strokeWeight(w)
        case Speed(s) => frameRate(s)
        case Background(r,g,b) => background(r,g,b)
      }
    }
  }

  override def draw { 
    point(pos.currX, pos.currY)
    TestAnimation.runAnimation(rules, posMoved, startRule, pos)
  }
}