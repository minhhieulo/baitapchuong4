
package câu3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Circle cr=new Circle();
        System.out.print("Nhap radius: ");
        Scanner sc=new Scanner(System.in);
        cr.setradius(sc.nextDouble());
        System.out.println("Dien tich= "+cr.getarea());
        System.out.println("Chu vi= "+cr.getperimter());
        System.out.println("Mau`: "+cr.getcolor());
        System.out.println("Filled: "+cr.isfilled());

        Rectangle rc=new Rectangle();
        System.out.print("Nhap chieu dai: ");
        rc.setlength(sc.nextDouble());
        System.out.print("Nhap chieu rong: ");
        rc.setwidth(sc.nextDouble());
        System.out.println("Dien tich= "+rc.getarea());
        System.out.println("Chu vi= "+rc.perimeter());
        System.out.println("Mau`: "+rc.getcolor());
        System.out.println("Filled: "+rc.isfilled());

        Square square= new Square();
        System.out.print("Nhap side: ");
        square.setside(sc.nextDouble());
        System.out.println("Dien tich= "+square.getarea());
        System.out.println("Mau`: "+square.getcolor());
        System.out.println("Filled: "+square.isfilled());
    }
}
    

    

