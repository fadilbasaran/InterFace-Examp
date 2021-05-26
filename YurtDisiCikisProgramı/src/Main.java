
public class Main {
    
    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("Sabiha Gökçen Hava Limanı'na Hoşgelediniz...");
        
        String sartlar="Yurtdışı Çıkıs Kuralları...\n"
                        +"Herhangi bir siyasi yasağınızın bulunmaması gerekiyor...\n "
                        +"15 TL harç bedelinizi tam olarak yatırmanız gerekiyor...\n"
                        +"Gideceğiniz ülkeye vizeniz bulunması gerekiyor...";
        
        String message="Yurtdışı şartlarından hepsini sağlamanız gerekiyor";
        
        
        while(true){
            
            System.out.println("********************************************************");
            System.out.println(sartlar);
            System.out.println("********************************************************");
            
            
            
            Yolcu yolcu=new Yolcu();
            
            System.out.println("Harç Bedeli Kontrol Ediliyor...");
            
            Thread.sleep(3000);//yani 3 saniye beklemek istediğimizi belirtmek isteyeceğiz
            
            if(yolcu.yurtDisiHarciKontrol()==false){
                
                System.out.println(message);
                continue;
            }
            
            System.out.println("Siyasi Yasak Kontrol Ediliyor...");
            Thread.sleep(3000);//yani 3 saniye beklemek istediğimizi belirtmek isteyeceğiz
            
            if (yolcu.siyasiYasagiKontrol()==true) {
                
                System.out.println(message);
                continue;
            }
            
            System.out.println("Vize Durumu Kontrol Ediliyor...");
            
            if (yolcu.vizeDurumu()==false) {
                
                System.out.println(message);
                continue;   
            }
            
            System.out.println("İşlemleriniz Tamam : Yurtdışına Çıkabilirsiniz....");
            break;
        }
        
        
        
    }
    
}
