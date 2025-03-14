public class Dikdortgen {
    int uzunKenar;
    int kısaKenar;

    Dikdortgen(int uzunKenar,int kısaKenar){
        this.uzunKenar = uzunKenar;
        this.kısaKenar = kısaKenar;
    }

    int alanHesapla() {
        return uzunKenar * kısaKenar;
    }
    int cevreHesapla() {
        return 2 * (uzunKenar + kısaKenar);
    }
}
