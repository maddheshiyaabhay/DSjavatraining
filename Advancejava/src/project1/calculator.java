package project1;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class calculator {

        private static double num1;
        private static double num2;
        private static String operator = "";
        public static void main(String[] args){
            SimpleCalculator();
        }
        public static void SimpleCalculator() {

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
            JButton multiply = new JButton("*");
            JButton divide = new JButton("/");
            JButton modulo = new JButton("%");
            JButton equals = new JButton("=");
            JButton clear = new JButton("AC");
            JButton dot = new JButton(".");


            JTextField value = new JTextField();

            one.setBounds(10, 105, 50, 45);
            two.setBounds(62, 105, 50, 45);
            three.setBounds(114, 105, 50, 45);
            four.setBounds(10, 152, 50, 45);
            five.setBounds(62, 152, 50, 45);
            six.setBounds(114, 152, 50, 45);
            seven.setBounds(10, 199, 50, 45);
            eight.setBounds(62, 199, 50, 45);
            nine.setBounds(114, 199, 50, 45);
            zero.setBounds(62, 246, 50, 45);
            plus.setBounds(10, 246, 50, 45);
            minus.setBounds(114, 246, 50, 45);
            divide.setBounds(166, 199, 50, 45);
            multiply.setBounds(166, 155, 50, 22);
            equals.setBounds(166, 178, 50, 22);
            clear.setBounds(166, 107, 50, 22);
            dot.setBounds(166, 130, 50, 22);
            modulo.setBounds(166, 246, 50, 45);


            value.setBounds(10, 20, 306, 88);


            frame.add(one);
            frame.add(two);
            frame.add(three);
            frame.add(four);
            frame.add(five);
            frame.add(seven);
            frame.add(six);
            frame.add(eight);
            frame.add(nine);
            frame.add(zero);
            frame.add(plus);
            frame.add(minus);
            frame.add(modulo);
            frame.add(multiply);
            frame.add(divide);
            frame.add(clear);
            frame.add(dot);
            frame.add(equals);
            frame.add(value);


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
                public void actionPerformed(ActionEvent e) {
                    num1 = Double.parseDouble(value.getText());
                    operator = "+";
                    value.setText(String.valueOf("+"));
//                  value.setText(String.valueOf(num1));
                }
            });

            minus.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {


                    num1 = Double.parseDouble(value.getText());
                    operator = "-";
                    value.setText("-");
                }
            });
            multiply.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {


                    double num1 = Double.parseDouble((value.getText()));
                    operator = "*";
                    value.setText("*");
                }
            });
            divide.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    num1 = Double.parseDouble(value.getText());
                    operator = "/";
                    value.setText("/");
                }
            });
            clear.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    num1 = 0;
                    num2 = 0;
                    operator = "";
                    value.setText("");
                }
            });
            modulo.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {


                    num1 = Double.parseDouble(value.getText());
                    String operator = "%";
                    value.setText("%");
                }
            });

            equals.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    num2 = Double.parseDouble(value.getText());
                    double    result = 0;
                    switch (operator){

                        case "+":
                            result = num1 + num2;
                            value.setText(String.valueOf(result));
                            break;

                        case "-":
                            result = num2 - num1;
                            value.setText(String.valueOf(result));
                            break;

                        case "*":
                            result = num1 * num2;
                            value.setText(String.valueOf(result));
                            break;
                        case "%":
                            result = num1 % num2;
                            value.setText(String.valueOf(result));
                        case "/":
                            if(num2 == 0){
                                value.setText("not define");
                            } else {
                                result = num1 / num2;
                                value.setText(String.valueOf(result));
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unexpected value: " + operator);
                    }
                    value.setText(String.valueOf(result));
                }
            });



            frame.setLayout(null);
            frame.setVisible(true);
            frame.setSize(350, 450);
        }

    }

