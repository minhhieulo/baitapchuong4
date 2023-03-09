
package câu1;

public class QuaCam extends HoaQua{
    public String color = " cam ";
    public String xuattencam(){
        return ten="cam";
    }; public int soluongcam(){
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
