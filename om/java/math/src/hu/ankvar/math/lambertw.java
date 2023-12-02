package hu.ankvar.math;

public class lambertw {
    public static void main(String[] args) {
        Complex x = new Complex(5.0, 2.0);  

        Complex result = lambertW(x);

        System.out.println("Az eredmény: " + result);
    }

    public static Complex lambertW(Complex x) {

        Complex w = x;
        for (int i = 0; i < 10; i++) {
            Complex numerator = x.multiply(Math.exp(-w.getReal()));
            Complex denominator = w.add(1.0);
            Complex fraction = numerator.divide(denominator);
            w = w.subtract(fraction);
        }
        return w;
    }
}
