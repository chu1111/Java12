package pack9.sub2;

import static java.lang.System.out;
public class CTrapezoid {
    int upper, base, height;

    public CTrapezoid(int u, int b, int h) {
        upper = u;
        base = b;
        height = h;
    }
    
    public void show() {
        out.println((double)(upper+base)*height/2);
    }
}
