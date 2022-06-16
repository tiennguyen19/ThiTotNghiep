package Bai2;

public class Converter {
    private double C;
    private double F;

    public Converter() {
    }

    public double getC() {
        return C;
    }

    public double getF() {
        return F;
    }

    public double convertFtoC(double F){
       return C = (F-32)/1.8;
    }

    public double convertCtoF(double C){
       return F = C*1.8 +32;
    }

}
