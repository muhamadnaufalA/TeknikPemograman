
package task2;

/**
 *
 * @author GHANI
 */
public class Circle extends Shape{
    // instances //
    private double radius;
    
    // consturctor //
    public Circle (){
        super();
        this.radius = 1.0;
    }
    public Circle (double radius){
        super();
        this.radius = radius;
    }
    public Circle (String color,boolean filled, double radius){
        super(color,filled);
        this.radius = radius;
    }
    
    // getter dan setter //
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    // Methods //
    public double getArea (){
        return radius*radius*Math.PI;
    }
    public double getPerimeter(){
        return Math.PI*(radius + radius);
    }
    // to string //
    @Override
    public String toString (){
        return "A Circle with radius = "+radius+", which is a subclass of "+super.toString();
    }
}
