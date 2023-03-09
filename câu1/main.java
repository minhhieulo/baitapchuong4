
package câu1;

import java.util.Scanner;

public class main {
    public static void main( String[] args){
        System.out.println("cam ");
        System.out.println("tao ");
        System.out.println("can sanh ");
        System.out.println("cam cao phong ");
        Scanner scanner = new Scanner(System.in);
        int lay = scanner.nextInt();
        switch(lay){
            case 1:  
                QuaCam Qc = new QuaCam();
                System.out.println(""+Qc.xuattencam());
                System.out.println("so luong cam la : "+Qc.soluongcam());
            
            
            case 2:
                QuaTao Qt = new QuaTao();
                System.out.println(""+Qt.xuattentao());
                System.out.println("so luong qua tao la : "+Qt.soluongtao());
            
            case 3:
                CamSanh Cs = new CamSanh();
                System.out.println(""+Cs.xuattencamsanh());
                System.out.println("so luong qua cam sanh la : "+Cs.soluongcamsanh());
            
            case 4:
                CamCaoPhong Ccp = new CamCaoPhong();
                System.out.println(""+Ccp.xuattencamcaophong());
                System.out.println("so luong qua tao la : "+Ccp.soluongcamcaophong());
            
            default:
                System.out.println("phai nhap tu 1 den 4");
                
                
                    
        }
        
    }
}