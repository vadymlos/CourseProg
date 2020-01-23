package Lesson3.Exeption;

public class NegativeValueExeption extends Exception{

    private double number;

    public NegativeValueExeption(double number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "NegativeValueExeption{" + "number=" + number + '}';
    }
}
