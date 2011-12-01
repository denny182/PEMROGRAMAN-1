abstract class Shape {
  public String Color;
  public Shape() {
  } 
  public void setColor(String c) {
     Color = c ;
  }
  public String getColor() {
    return Color;	
  } 
  abstract public double area();
}