
package câu1;


public class CamCaoPhong extends HoaQua {
    public String color = "cam nhat";
    public String xuattencamcaophong(){
        return ten="cam cao phong ";
    };
     public int soluongcamcaophong(){
        super.setsoluong();
        return this.getsoluong();
    }  
      public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private int getsoluong() {
        throw new UnsupportedOperationException("Not supported yet."); 
}
}
