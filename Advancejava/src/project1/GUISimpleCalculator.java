package project1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUISimpleCalculator {
    private static double num1 = 0;
    private static double num2 = 0;
    private static String operator = "";
    public static void main(String[] args) {
        calculator();
    }
    static void calculator(){
        JFrame frame = new JFrame();

        JButton one = new JButton("1");
        JButton two = new JButton("2");
        JButton three = new JButton("3");
        JButton four = new JButton("4");
        JButton five = new JButton("5");
        JButton six = new JButton("6");
        JButton seven = new JButton("7");
        JButton eight = new JButton("8");
        JButton nine = new JButton("9");
        JButton zero = new JButton("0");
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton divide = new JButton("/");
        JButton multiply = new JButton("*");
        JButton equals = new JButton("=");
        JButton clear = new JButton("cr");
        JButton dot = new JButton(".");

        JTextField value = new JTextField();

        one.setBounds(10,105,50,45);
        two.setBounds(62,105,50,45);
        three.setBounds(114,105,50,45);
        four.setBounds(10,152,50,45);
        five.setBounds(62,152,50,45);
        six.setBounds(114,152,50,45);
        seven.setBounds(10,199,50,45);
        eight.setBounds(62,199,50,45);
        nine.setBounds(114,199,50,45);
        zero.setBounds(62,246,50,45);
        plus.setBounds(10,246,50,45);
        minus.setBounds(114,246,50,45);
        divide.setBounds(166,199,50,45);
        multiply.setBounds(166,152,50,45);
        equals.setBounds(166,246,50,45);
        clear.setBounds(166,105,50,22);
        dot.setBounds(166,128,50,22);

        value.setBounds(10,10,206,93);

        frame.add(one);
        frame.add(two);
        frame.add(three);
        frame.add(four);
        frame.add(five);
        frame.add(six);
        frame.add(seven);
        frame.add(eight);
        frame.add(nine);
        frame.add(zero);
        frame.add(plus);
        frame.add(minus);
        frame.add(divide);
        frame.add(multiply);
        frame.add(equals);
        frame.add(clear);
        frame.add(value);
        frame.add(dot);

        ActionListener numberListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JButton source = (JButton) actionEvent.getSource();
                value.setText(value.getText() + source.getText());
            }
        };

        one.addActionListener(numberListener);
        two.addActionListener(numberListener);
        three.addActionListener(numberListener);
        four.addActionListener(numberListener);
        five.addActionListener(numberListener);
        six.addActionListener(numberListener);
        seven.addActionListener(numberListener);
        eight.addActionListener(numberListener);
        nine.addActionListener(numberListener);
        zero.addActionListener(numberListener);
        dot.addActionListener(numberListener);

        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                num1 =Double.parseDouble(value.getText());

                operator = "+";
                value.setText("");
                //value.setText(String.valueof((num1)));

            }
        });

        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                num1 =Double.parseDouble(value.getText());

                operator = "-";
                value.setText("");

            }
        });

        multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                num1 =Double.parseDouble(value.getText());

                operator = "*";
                value.setText("");

            }
        });

        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                num1 =Double.parseDouble(value.getText());

                operator = "/";
                value.setText("");

            }
        });

        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                num1 = 0;
                num2 = 0;
                operator = "";
                value.setText(num1 + "");

            }
        });
        equals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                num2 = Double.parseDouble(value.getText());
                double result = 0;
                switch(operator){

                    case "+":
                        result = num1 + num2;
                        value.setText(String.valueOf(result));
                        break;


                    case "-":
                        result = num1 - num2;
                        value.setText(String.valueOf(result));
                        break;

                    case "*":
                        result = num1 * num2;
                        value.setText(String.valueOf(result));
                        break;

                    case "/":
                        if(num2 == 0){
                            value.setText("not difine");
                        } else {
                            result = num1 / num2;
                            value.setText(String.valueOf(result));
                        }
                        break;
                }
                value.setText(String.valueOf(result));
            }
        });

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(240,350);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);






    }
}
