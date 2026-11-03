import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Main {
    static int i = 1;
    public static void main(String[] args) {

        JFrame frame = new JFrame("Event Example");
        frame.setSize(300,200);



        JButton button = new JButton("Click me");
        frame.add(button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // button =  source
        // ActionListener = object
        // new ActionListener() {...} = Event Listener
        //actionPerformed(ActionEvent e) = Event Handler Method

        button.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {

                 System.out.println(i);
                 i++;
             }
         }
        ) ;

//    button.addActionListener((event)-> {
//        System.out.println("click");
//    });



    }
}
