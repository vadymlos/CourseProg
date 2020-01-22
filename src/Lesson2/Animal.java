package Lesson2;

public class Animal {
        private int age;
        private double weigt;
        private boolean sex;
        private String ration;

        public Animal(int age, double weigt, boolean sex, String ration) {
            super();
            this.age = age;
            this.weigt = weigt;
            this.sex = sex;
            this.ration = ration;
        }

        public Animal() {
            super();
        }
        public void getVoice() {
        }
        public int getAge(){
            return age;
        }
        public void setAge(int age){
            this.age = age;
        }

        public String toString() {
            return " age=" + age + ", weigt=" + weigt + ", sex=" + sex + ", ration=" + ration + "]";
        }
    }

