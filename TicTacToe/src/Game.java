import javax.imageio.ImageIO;
import javax.imageio.ImageIO.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Game extends JFrame{
    private JButton button1;
    private JPanel GamePage;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;

    String btn="circle";

    public Game() {

        setTitle("TicTacToe");
        setSize(500,500);
        setContentPane(GamePage);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(btn.equals("circle"))
                    btn="cross";
                else
                    btn="circle";


                try {
                    Image img = ImageIO.read(getClass().getResource("img/"+btn+".png"));
                    button1.setIcon(new ImageIcon(img));
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

            }
        });
    }

}
