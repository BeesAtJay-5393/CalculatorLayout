import javax.swing.*;
import java.awt.*;

public class GenericPanel extends JPanel {
    private JTextField textField;
    private JPanel buttonPanel;
    private JButton zero; private JButton one;private JButton two;private JButton three;private JButton four;
    private JButton five;private JButton six;private JButton seven;private JButton eight;private JButton nine;
    private JButton sign; private JButton decimal;
    private JButton plus; private JButton minus; private JButton multiply; private JButton divide;private JButton equal;
    private JButton rational; private JButton square; private JButton root;
    public GenericPanel() {
        super();
        setPreferredSize(new Dimension(400, 400));
        setBackground(new Color(255, 138, 19));
        setLayout(new BorderLayout());

        buttonPanel = new JPanel();
        textField = new JTextField();

        buttonPanel.setLayout(new GridLayout(5, 4));

        rational = new JButton("1/x");
        square = new JButton("x^2");
        root = new JButton("y*y");
        decimal = new JButton(".");
        nine = new JButton("9");
        sign = new JButton("+/-");
        eight = new JButton("8");
        seven = new JButton("7");
        six = new JButton("6");
        five = new JButton("5");
        four = new JButton("4");
        three = new JButton("3");
        two = new JButton("2");
        one = new JButton("1");
        zero = new JButton("0");
        plus = new JButton("+");
        minus = new JButton("-");
        multiply = new JButton("*");
        divide = new JButton("/");
        equal = new JButton("=");

        add(textField, BorderLayout.NORTH);
        add(buttonPanel);
        buttonPanel.add(rational, BorderLayout.CENTER); buttonPanel.add(square, BorderLayout.CENTER);
        buttonPanel.add(root, BorderLayout.CENTER); buttonPanel.add(divide, BorderLayout.CENTER);

        buttonPanel.add(nine, BorderLayout.CENTER);buttonPanel.add(eight, BorderLayout.CENTER);
        buttonPanel.add(seven, BorderLayout.CENTER);buttonPanel.add(multiply, BorderLayout.CENTER);

        buttonPanel.add(six, BorderLayout.CENTER);buttonPanel.add(five, BorderLayout.CENTER);
        buttonPanel.add(four, BorderLayout.CENTER);buttonPanel.add(minus, BorderLayout.CENTER);

        buttonPanel.add(three, BorderLayout.CENTER);buttonPanel.add(two, BorderLayout.CENTER);
        buttonPanel.add(one, BorderLayout.CENTER);buttonPanel.add(plus, BorderLayout.CENTER);

        buttonPanel.add(decimal, BorderLayout.CENTER);buttonPanel.add(zero, BorderLayout.CENTER);
        buttonPanel.add(sign, BorderLayout.CENTER);buttonPanel.add(equal, BorderLayout.CENTER);
    }
}
