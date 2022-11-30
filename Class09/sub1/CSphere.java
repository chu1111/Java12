package pack9.sub1;

import static java.lang.System.out;

public class CSphere {
    public double radius;

    public CSphere(double r) {
        radius = r;
    }

    public void show() {
        out.println(radius);
        out.println(4 / 3 * Math.PI * Math.pow(radius, 3));
    }
}
