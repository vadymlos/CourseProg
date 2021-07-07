package HW1;

public class Trian {
    private int one;
    private int two;
    private int three;

    public Trian(int one, int two, int three) {
        //super();
        this.one = one;
        this.two = two;
        this.three = three;
    }

    public int getOne() {
        return one;
    }
    public void setOne(int one){
        this.one = one;
    }
    public int getTwo() {
        return two;
    }
    public void setTwo(int two){
        this.two = two;
    }
    public int getThree() {
        return three;
    }
    public void setThree(int three){
        this.three = three;
    }

    public double sq(){
        int per = (one + two + three) / 2;
        double sq = Math.sqrt(per * (per - one) * (per - two) * (per - three));
        return sq;
    }

    @Override
    public String toString () {
        return "HW1.Trian [one = " + one + ", second = " + two + ", three = " + three + "]";
    }

}
