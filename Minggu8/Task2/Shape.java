package task2;

/**
 *
 * @author GHANI
 */
public class Shape {

    // instances //
    private String color;
    private boolean filled;
    
    // constructor //
    public Shape (){
        this.color = "green";
        this.filled = true;
    }
    public Shape (String color,boolean filled){
        this.color = color;
        this.filled = filled;
    }
    
    // getter dan setter //
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    // to String //
    @Override
    public String toString(){
        return "A shape with color of "+ this.color +" and "+ this.filled;
    }
}
