
package câu3;
public class Square extends Rectangle{
public Square() {
}
public Square(double side) {
super.setWidth(side);
super.setLength(side);
}
public Square(String color, boolean filled, double side) {
super.setColor(color);
super.setFilled(filled);
super.setWidth(side);
super.setLength(side);
}
public double getSide() {
return super.getWidth();
}
public void setSide(double Side) {
super.setWidth(Side);
super.setLength(Side);
}
@Override
public void setWidth(double side) {
super.setWidth(side);
}
public void setLenght(double side) {
super.setLength(side);
}
@Override
public String toString() {
return (super.toString() + ", width = lenght = side = "+this.getSide());
}

    void setside(double nextDouble) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getarea() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


