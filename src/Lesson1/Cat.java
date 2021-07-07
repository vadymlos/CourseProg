package Lesson1;

public class Cat {
        private String color;
        private int year;

     public int getAge() {
         return age;
     }

     private int age;
        private double weight;

        public Cat(String color, int year, double weight) {
            this.color = color;
            this.year = year;
            this.weight = weight;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public void getVoice() {
            System.out.println("Meow-meow-geov");
        }

        @Override
        public String toString() { return "[color=" + color + ", year=" + year + ", weight=" + weight + "]";
        }

    }
