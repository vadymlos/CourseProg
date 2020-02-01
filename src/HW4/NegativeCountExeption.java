package HW4;

public class NegativeCountExeption extends Exception{
    private int counter;

    public NegativeCountExeption(int counter) {
        this.counter = counter;
        System.out.println(this.toString());
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    @Override
    public String toString() {
        return "Vadim NegativeCountExeption{" + "counter=" + counter + '}';
    }
}
