import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  public void setup() {
    background(0, 255, 0);
  }

  public void draw() {

    // sky 
    fill(0, 255, 255);
    rect(0, 0, 400, 230);

    // house 
    fill(255, 205, 180);
    rect(170, 220, 70, 45);

    // roof
    fill(165, 42, 42);
    triangle(170, 220, 205, 195, 240, 220);

    // window
    fill(0, 0, 255);
    rect(179, 230, 10, 12);
    rect(220, 230, 10, 12);
    
    // door 
    fill(165, 42, 42);
    rect(200, 242, 10, 12);

    // sun 
    fill(255, 255, 0);
    ellipse(0, 0, 150, 150);

  }

}