public class Explosion {
    int x, y;
    int ex_cnt;
    int damage;
    Explosion(int x, int y, int damage) {
        this.x = x;
        this.y = y;
        this.damage = damage;
        ex_cnt = 0;
    }
    public void effect() {
        ex_cnt++;
    }
}
