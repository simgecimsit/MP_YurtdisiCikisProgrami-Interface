

public class Main {
    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("Sabiha Gokcen Havalimanina Hosgeldiniz..");
        
        String sartlar="Yurtdisi Cikis Kurallari: \n"
                +"Herhangi bir siyasi yasaginizin bulunmamasi gerekiyor. \n"
                +"150 TL harc bedelini tam olarak yatirmaniz gerekiyor. \n"
                +"Gideceginiz ulkeye vizenizin bulunmasi gerekiyor.";
        
        String mesaj="Yurtdisi cikis kurallarinin hepsini saglamaniz gerekiyor";
        
        
        while(true) {
            System.out.println("*******************************************");
            System.out.println(sartlar);
            System.out.println("*******************************************");
            
            
            Yolcu yolcu = new Yolcu();
            
            System.out.println("Harc Bedeli Kontrol Ediliyor...");
            
            Thread.sleep(3000);
            if (yolcu.yurtdisiHarciKontrol() == false) {
                
                System.out.println(mesaj);
                continue;
            }
            
            System.out.println("Siyasi Yasak Kontrol Ediliyor...");
            Thread.sleep(3000);
            
            if (yolcu.siyasiYasakKontrol() == false) {
                System.out.println(mesaj);
                continue;
            }
            System.out.println("Vize Durumu Kontrol Ediliyor...");
            Thread.sleep(3000);
            
            if (yolcu.vizeDurumuKontrol() == false){
                System.out.println(mesaj);
                continue;
            }
            System.out.println("Islemleriniz Tamam ! Yurtdisina Cikabilirsiniz...");
            break;
            
            
        }
        
    }
}
