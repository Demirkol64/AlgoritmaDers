import java.security.SecureRandom;

public class AlgoritmaDers {
    //değiskenler
    int numara;
    String ad;
    String soyad;
    String bolum;
    String sınıf;
    double vizaNotu;
    double finalNotu;
    double ort;
    String harfNotu;
    //constructer (yapılandırıcı) methad
    AlgoritmaDers(int numara,String ad,String soyad,String bolum,String sınıf,double vizaNotu,double finalNotu) {
        this.numara = numara;
        this.ad = ad;
        this.soyad = soyad;
        this.bolum = bolum;
        this.sınıf = sınıf;
        this.vizaNotu = vizaNotu;
        this.finalNotu = finalNotu;
    }
    AlgoritmaDers() {
        this.numara = 0;
        this.ad = "";
        this.soyad = "";
        this.bolum = "";
        this.sınıf = "";
        this.vizaNotu = 0;
        this.finalNotu = 0;
    }
    void ortHesapla() {
        ort = vizaNotu * 0.4 + finalNotu * 0.6;
    }
    void harfNotHesapla() {
        if(ort > 90) {
            harfNotu = "AA";
        }
        else if(ort > 85) {
            harfNotu = "BA";
        }
        else if(ort > 80) {
            harfNotu = "BB";
        }
        else if(ort > 70) {
            harfNotu = "CB";
        }
        else if(ort > 60) {
            harfNotu = "CC";
        }
        else if(ort > 55) {
            harfNotu = "DC";
        }
        else if(ort > 50) {
            harfNotu = "DD";
        }
        else if(ort > 40) {
            harfNotu = "FD";
        }
        else {
            harfNotu = "FF";
        }
    }
}
