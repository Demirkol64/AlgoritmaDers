import java.util.concurrent.TimeUnit;

public class Saat {
    int saat , dakika , saniye;

    Saat(int saat, int dakika, int saniye) {
        this.saat = saat;
        this.dakika = dakika;
        this.saniye = saniye;
    }
    void ilerle() throws InterruptedException {
        saniye++;
        if (saniye == 60) {
            dakika++;
            saniye = 0;
            if (dakika == 60) {
                saat++;
                dakika = 0;
                if (saat == 24) {
                    saat = 0;
                }
            }
        }
        System.out.println(saat + ":" + dakika + ":" + saniye);
        TimeUnit.SECONDS.sleep(1);
        ilerle();
    }
}
