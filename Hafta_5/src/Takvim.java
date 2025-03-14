public class Takvim {
    int yil;
    int ay;
    int gun;

    Takvim(int yil,int ay,int gün) {
        this.yil=yil; this.ay=ay; this.gun=gün;
    }
    Takvim() {
        this.yil=0; this.ay=1; this.gun=1;
    }

     void ilerle() {
        gun++;
        if(gun == 31) {
            ay++;
            gun=1;
            if(ay == 13) {
                yil++;
                ay=1;
            }
        }
        System.out.println(gun + "." + ay + "." + yil);
        ilerle();
    }
}
