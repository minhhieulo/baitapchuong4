
package câu1;


public class QuaTao extends HoaQua {
    public String color = " đo";
    public String xuattentao(){
        return ten="tao";
    };
    public int soluongtao(){
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
