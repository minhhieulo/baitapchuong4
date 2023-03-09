
package câu1;

public class CamSanh extends HoaQua {
    public String color = "xanh";
    public String xuattencamsanh(){
        return ten="cam sanh";
    };
    public int soluongcamsanh(){
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