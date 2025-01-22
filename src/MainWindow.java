import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame{
    private JTextField textField1;
    private JTextField textField2;
    private JButton resultButton;
    private JTextField textField5;
    private JPanel panel;
    private JTextField textField4;


    public MainWindow()
    {
        setContentPane(panel);
        setSize(500, 250);
        setDefaultCloseOperation(MainWindow.EXIT_ON_CLOSE);

        resultButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                double UserInput1 = 0;
                double UserInput2 = 0;

                try
                {
                    UserInput1 = Double.parseDouble(textField1.getText());
                    UserInput2 = Double.parseDouble(textField2.getText());
                }
                catch (Exception err)
                {
                    JOptionPane.showMessageDialog(null, "Вы ввели не коректные данные!");
                }

                textField4.setText("Square: " + String.valueOf(2 * Math.PI * UserInput2 * UserInput2));
                textField5.setText("Volume: " + String.valueOf(Math.pow(UserInput2, 2) * Math.PI * UserInput1));
            }
        });

        setVisible(true);
    }
}
