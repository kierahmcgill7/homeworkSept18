package homework;

public class Calculator {
    public double defaultValue;



    public Calculator(double defaultValue){
        this.defaultValue = defaultValue;
    }

    public double add(double valueToAdd){
        return this.defaultValue + valueToAdd;
    }
    public double multiply(double valueToMulti){
        return this.defaultValue * valueToMulti;
    }
    public double divide(int valueToDivide){
        return this.defaultValue / valueToDivide;
    }
    double sqrt(){
        return this.defaultValue / (double) 4;
    }
    public boolean pow(double base, double exponent) {
        double result = Math.pow(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is " + result);
        return false;
    }
}
