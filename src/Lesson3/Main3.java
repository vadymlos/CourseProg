package Lesson3;
import Lesson3.Exeption.NegativeValueExeption;

import javax.swing.*;

public class Main3 {
        public static void main(String[] args) {
            double a;

            for (; ; ) {
                try {
                    a = Double.valueOf(JOptionPane.showInputDialog("Input double number"));
                    if (a<0){
                       NegativeValueExeption err= new NegativeValueExeption(a);
                        throw err;
//                        throw  new NegativeValueExeption(a);
                    }

                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error number format");
                } catch (NullPointerException e) {
                    a = 0;
                    JOptionPane.showMessageDialog(null, "Cancel");
                    break;
                } catch (NegativeValueExeption e){
                    JOptionPane.showMessageDialog(null, "Negative value " + e.getNumber());
                }
            }
            System.out.println(a);
        }
    }
