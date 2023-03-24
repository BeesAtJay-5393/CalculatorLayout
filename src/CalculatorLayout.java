import javax.swing.*;
import java.awt.*;

public class CalculatorLayout extends JPanel {
    private JPanel buttonPanel;
    private JButton zero; private JButton one;private JButton two;private JButton three;private JButton four;
    private JButton five;private JButton six;private JButton seven;private JButton eight;private JButton nine;
    private JButton percent; private JButton period;
    private JTextField textField;

    public CalculatorLayout() {
        super();
        setPreferredSize(new Dimension(400, 400));
        setLayout(new GridLayout(4, 3));
        setBackground(new Color(255, 138, 19));

        buttonPanel = new JPanel();

        zero = new JButton("0");
        one = new JButton("1");
        two = new JButton("2");
        three = new JButton("3");
        four = new JButton("4");
        five = new JButton("5");
        six = new JButton("6");
        seven = new JButton("7");
        eight = new JButton("8");
        percent = new JButton("+/-");
        nine = new JButton("9");
        period = new JButton(".");

        textField = new JTextField(500);

        add(textField);
        add(zero);add(one);add(two);add(three);add(four);add(five);add(six);add(seven);add(eight);
        add(percent);add(nine);add(period);
    }


}
