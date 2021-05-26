
import java.util.Scanner;


public class Yolcu implements IYurtDisiKurallari{
    
    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;

    public Yolcu() {
        Scanner scanner=new Scanner(System.in);
        
        System.out.print("Yatırdığınız harç bedeli : ");
        this.harc=scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Herhangi bir Siyasi Ysağınız bulunuyor mu(Evet ya da Hayır) ?");
        String answer=scanner.nextLine();
        
        if (answer.equals("Evet")) {
            this.siyasiYasak=true;
        }
        else{
            this.siyasiYasak=false;
        }
        
        System.out.println("Vizeniz bulunuyor mu?(Evet ya da Hayır)");
        
        String answer2=scanner.nextLine();
        
        if (answer2.equals("Evet")) {
            
            this.vizeDurumu=true;
            
        }
        
        else{
            this.vizeDurumu=false;
        }
    }
    @Override
    public boolean yurtDisiHarciKontrol() {
        if (this.harc<15) {
            System.out.println("Lütfen yurtdışı çıkış harcını tam yatırın...");
            return false;
        }
        else{
            System.out.println("Yurt dışı harcı işlemi tamam!");
            return true;
        }
    }

    @Override
    public boolean siyasiYasagiKontrol() {
        if (this.siyasiYasak==true) {
            System.out.println("Siyasi yasağınız bulunuyor. Yurtdışına çıkamazsınız...");
            return true;
        }
        else{
            System.out.println("Yurtdışı siayasi yasağınız bulunmuyor...");
            return false;
        }
    }

    @Override
    public boolean vizeDurumu() {
        
        if (this.vizeDurumu==true) {
            
            System.out.println("Vize işlemleri tamam!");
            return true;    
        }
        else{
            System.out.println("Vizeniz gideceğiniz ülkeye bulunmamaktadır...");
            return false;
        }
    }
    
    
}
