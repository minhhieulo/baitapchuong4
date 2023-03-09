
package câu3;
public class Rectangle extends Shape {
private double width=1.0;
private double length=1.0;
public Rectangle() {
}
public Rectangle(double width, double length) {
this.width = width;
this.length = length;
}
public double getWidth() {
return width;
}
public void setWidth(double width) {
this.width = width;
}
public double getLength() {
return length;
}
public void setLength(double length) {
this.length = length;
}
public Rectangle(String color, boolean filled,double width, double length) {
super.getcolor();
super.setfilled(filled);
this.width = width;
this.length = length;
}
public double Arena() {
return this.width*this.length;
}
public double Perimeter() {
return (this.length+this.width)*2;
}
@Override
public String toString() {
return(super.toString() +"width = "+this.width+", length = "+this.length);
}

    void setColor(String color) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setFilled(boolean filled) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setlength(double nextDouble) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setwidth(double nextDouble) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getarea() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String perimeter() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
