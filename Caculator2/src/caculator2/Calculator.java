package caculator2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {

    double number, answer;
    int calculation;
    JFrame jframe;
    JLabel label = new JLabel();
    JTextField textField = new JTextField();
    JRadioButton onRadioButton = new JRadioButton("On");
    JRadioButton offRadioButton = new JRadioButton("Off");
    JButton buttonZero = new JButton("0");
    JButton buttonOne = new JButton("1");
    JButton buttonTwo = new JButton("2");
    JButton buttonThree = new JButton("3");
    JButton buttonFour = new JButton("4");
    JButton buttonFive = new JButton("5");
    JButton buttonSix = new JButton("6");
    JButton buttonSeven = new JButton("7");
    JButton buttonEight = new JButton("8");
    JButton buttonNine = new JButton("9");

    JButton btnEqual = new JButton("=");
    JButton btnDiv = new JButton("/");
    JButton btnMul = new JButton("*");
    JButton btnMinus = new JButton("-");
    JButton btnPlus = new JButton("+");
    JButton btnDot = new JButton(".");
    JButton btnDelete = new JButton("DEL");
    JButton btnClear = new JButton("C");
    JButton btnSqrt = new JButton("\u221A");
    JButton btnSquare = new JButton("x\u00B2");
    JButton btnReciprocal = new JButton("1/x");
    private JFrame frame;

    public Calculator() {
        prepareGUI();
        addActionEvents();
        addComponents();
    }

    public void prepareGUI() {
        frame = new JFrame();
        frame.setTitle("Caculator");
        frame.setSize(300, 490);
        frame.getContentPane().setLayout(null);
        frame.setResizable(true);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void addComponents() {
        label.setBounds(250, 0, 50, 50);
        label.setForeground(Color.white);
        frame.add(label);
        textField.setBounds(10, 120, 60, 40);
        textField.setFont(new Font("Arial", Font.BOLD, 14));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);
        onRadioButton.setBounds(10, 95, 60, 40);
        onRadioButton.setSelected(true);
        onRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
        onRadioButton.setForeground(Color.white);
        frame.add(offRadioButton);
        offRadioButton.setBounds(10, 120, 60, 40);
        offRadioButton.setSelected(false);
        offRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
        offRadioButton.setForeground(Color.white);
        frame.add(offRadioButton);
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(onRadioButton);
        buttonGroup.add(offRadioButton);
        buttonSeven.setBounds(10, 230, 60, 40);
        buttonSeven.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonSeven);
        buttonEight.setBounds(80, 230, 60, 40);
        buttonEight.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonEight);
        buttonNine.setBounds(150, 230, 60, 40);
        buttonNine.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonNine);
        buttonFive.setBounds(80, 290, 60, 40);
        buttonFive.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonFive);
        buttonFour.setBounds(10, 290, 60, 40);
        buttonFour.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonFour);
        buttonSix.setBounds(150, 290, 60, 40);
        buttonSix.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonSix);
        buttonOne.setBounds(10, 350, 60, 40);
        buttonOne.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonOne);
        buttonTwo.setBounds(80, 350, 60, 40);
        buttonTwo.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonTwo);
        buttonThree.setBounds(150, 350, 60, 40);
        buttonThree.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonThree);
        buttonZero.setBounds(10, 410, 60, 40);
        buttonZero.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonZero);
        btnDot.setBounds(150, 410, 60, 40);
        btnDot.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(btnDot);
        btnEqual.setBounds(220, 350, 60, 100);
        btnEqual.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(btnEqual);
        btnDiv.setBounds(220, 110, 60, 40);
        btnDiv.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(btnDiv);
        btnSqrt.setBounds(10, 170, 60, 40);
        btnSqrt.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(btnSqrt);
        btnMul.setBounds(220, 230, 60, 40);
        btnMul.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(btnMul);
        btnMinus.setBounds(220, 170, 60, 40);
        btnMinus.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(btnMinus);
        btnPlus.setBounds(220, 290, 60, 40);
        btnPlus.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(btnPlus);
        btnSquare.setBounds(80, 170, 60, 40);
        btnSquare.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(btnSquare);
        btnReciprocal.setBounds(150, 170, 60, 40);
        btnReciprocal.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(btnReciprocal);
        btnDelete.setBounds(150, 110, 60, 40);
        btnDelete.setFont(new Font("Arial", Font.BOLD, 20));
        btnDelete.setForeground(Color.white);
        frame.add(btnDelete);
        btnClear.setBounds(80, 110, 60, 40);
        btnClear.setFont(new Font("Arial", Font.BOLD, 20));
        btnClear.setForeground(Color.white);
        frame.add(btnClear);

    }

    public void addActionEvents() {
        buttonEight.addActionListener(this);
        buttonFive.addActionListener(this);
        buttonFour.addActionListener(this);
        buttonNine.addActionListener(this);
        buttonOne.addActionListener(this);
        buttonSeven.addActionListener(this);
        buttonSix.addActionListener(this);
        buttonThree.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonZero.addActionListener(this);
        btnEqual.addActionListener(this);
        btnClear.addActionListener(this);
        btnDelete.addActionListener(this);
        btnDot.addActionListener(this);
        btnDiv.addActionListener(this);
        btnMul.addActionListener(this);
        btnMinus.addActionListener(this);
        btnPlus.addActionListener(this);
        btnSqrt.addActionListener(this);
        btnReciprocal.addActionListener(this);
        onRadioButton.addActionListener(this);
        offRadioButton.addActionListener(this);
    }

    private void enableButtons(boolean enable) {
        Iterable<JButton> numberButtons = null;
        for (JButton button : numberButtons) {
            button.setEnabled(enable);
        }
        btnEqual.setEnabled(enable);
        btnClear.setEnabled(enable);
        btnDelete.setEnabled(enable);
        btnDot.setEnabled(enable);
        btnDiv.setEnabled(enable);
        btnMul.setEnabled(enable);
        btnMinus.setEnabled(enable);
        btnPlus.setEnabled(enable);
        btnSqrt.setEnabled(enable);
        btnReciprocal.setEnabled(enable);
        textField.setEnabled(enable);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == onRadioButton) {
            enable();
        } else if (source == offRadioButton) {
            disable();
        } else if (source == btnClear) {
            label.setText("");
            textField.setText("");
        } else if (source == btnDelete) {
            int length = textField.getText().length();
            int number = length - 1;
            if (length > 0) {
                StringBuilder back = new StringBuilder(textField.getText());
                back.deleteCharAt(number);
                textField.setText(back.toString());

            }
            if (textField.getText().endsWith("")) {
                label.setText("");
            }
        } else if (source == buttonZero) {
            if (textField.getText().equals("0")) {
                return;
            } else {
                textField.setText(textField.getText() + "0");
            }
        } else if (source == buttonOne) {
            textField.setText(textField.getText() + "1");
        } else if (source == buttonTwo) {
            textField.setText(textField.getText() + "2");
        } else if (source == buttonThree) {
            textField.setText(textField.getText() + "3");
        } else if (source == buttonFour) {
            textField.setText(textField.getText() + "4");
        } else if (source == buttonFive) {
            textField.setText(textField.getText() + "5");
        } else if (source == buttonSix) {
            textField.setText(textField.getText() + "6");
        } else if (source == buttonSeven) {
            textField.setText(textField.getText() + "7");
        } else if (source == buttonEight) {
            textField.setText(textField.getText() + "8");
        } else if (source == buttonNine) {
            textField.setText(textField.getText() + "9");
        } else if (source == btnDot) {
            if (textField.getText().contains(".")) {
                return;
            } else {
                textField.setText(textField.getText() + ".");
            }
        } else if (source == btnPlus) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "+");
            calculation = 1;
        } else if (source == btnMinus) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "-");
            calculation = 2;
        } else if (source == btnMul) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "X");
            calculation = 3;
        } else if (source == btnDiv) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "/");
            calculation = 4;
        } else if (source == btnSqrt) {
            number = Double.parseDouble(textField.getText());
            Double sqrt = Math.sqrt(number);
            textField.setText(Double.toString(sqrt));
            try {
                number = Double.parseDouble(textField.getText());
                if (number < 0) {
                    textField.setText("Error: Negative number");
                } else {
                    sqrt = Math.sqrt(number);
                    textField.setText(Double.toString(sqrt));
                }
            } catch (NumberFormatException ex) {
                textField.setText("Type number first !");
            }
        } else if (source == btnSquare) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            double square = Math.pow(number, 2);
            String string = Double.toString(square);
            if (string.endsWith(".0")) {
                textField.setText(string.replace(".0", ""));
            } else {
                textField.setText(string);
            }
            label.setText("(sqr)" + str);
        } else if (source == btnReciprocal) {
            number = Double.parseDouble(textField.getText());
            double reciprocal = 1 / number;
            String string = Double.toString(reciprocal);
            if (string.endsWith(".0")) {
                textField.setText(string.replace(".0", ""));
            } else {
                textField.setText(string);
            }
        } else if (source == btnEqual) {
            switch (calculation) {
                case 1:
                    answer = number + Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                case 2:
                    answer = number - Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                case 3:
                    answer = number - Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                case 4:
                    answer = number - Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
            }
        }
    }

    public void enable() {
        onRadioButton.setEnabled(false);
        offRadioButton.setEnabled(true);
        textField.setEditable(true);
        label.setEnabled(true);
        btnClear.setEnabled(true);
        btnDelete.setEnabled(true);
        btnDiv.setEnabled(true);
        btnDot.setEnabled(true);
        btnEqual.setEnabled(true);
        btnMinus.setEnabled(true);
        btnMul.setEnabled(true);
        btnPlus.setEnabled(true);
        btnReciprocal.setEnabled(true);
        btnSqrt.setEnabled(true);
        btnSquare.setEnabled(true);
        buttonEight.setEnabled(true);
        buttonFive.setEnabled(true);
        buttonFour.setEnabled(true);
        buttonNine.setEnabled(true);
        buttonOne.setEnabled(true);
        buttonSeven.setEnabled(true);
        buttonSix.setEnabled(true);
        buttonThree.setEnabled(true);
        buttonTwo.setEnabled(true);
        buttonZero.setEnabled(true);

    }

    public void disable() {
        onRadioButton.setEnabled(true);
        offRadioButton.setEnabled(false);
        textField.setText("");
        label.setText(" ");
        btnClear.setEnabled(false);
        btnDelete.setEnabled(false);
        btnDiv.setEnabled(false);
        btnDot.setEnabled(false);
        btnEqual.setEnabled(false);
        btnMinus.setEnabled(false);
        btnMul.setEnabled(false);
        btnPlus.setEnabled(false);
        btnReciprocal.setEnabled(false);
        btnSqrt.setEnabled(false);
        btnSquare.setEnabled(false);
        buttonEight.setEnabled(false);
        buttonFive.setEnabled(false);
        buttonFour.setEnabled(false);
        buttonNine.setEnabled(false);
        buttonOne.setEnabled(false);
        buttonSeven.setEnabled(false);
        buttonSix.setEnabled(false);
        buttonThree.setEnabled(false);
        buttonTwo.setEnabled(false);
        buttonZero.setEnabled(false);
    }
}
