import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Application extends JFrame {
    private JPanel MainPage;
    private JLabel label1;
    private JTextField textField1;
    private JButton clickMeButton;

    String name;
    public Application(){
        setTitle("My First Java GUI");
        setSize(500,400);
        setContentPane(MainPage);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        clickMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                name = textField1.getText();
                label1.setText("HI "+name);
                textField1.setText("");
            }
        });



    }
}
