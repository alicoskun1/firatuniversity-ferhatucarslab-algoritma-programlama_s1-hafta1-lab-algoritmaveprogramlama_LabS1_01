public class SaatDonusturme {
    public static void main(String[] args) {
        int toplamSaniye = 7384;
        
        int saat = toplamSaniye / 3600;
        int dakika = (toplamSaniye % 3600) / 60;
        int saniye = toplamSaniye % 60;
        
        System.out.println(saat + " saat " + dakika + " dakika " + saniye + " saniye");
    }
}