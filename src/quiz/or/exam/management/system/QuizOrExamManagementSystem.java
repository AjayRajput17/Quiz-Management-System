
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

//package quiz.or.exam.management.system;

class MyFrame extends JFrame implements ActionListener
{
    private JButton b;
    private JLabel lbl;
   public MyFrame()
           {
              super("Ajay Rajput");
               b = new JButton("Next");
               this.add(b,BorderLayout.SOUTH);
               b.addActionListener(this);
               
              // lbl = new JLabel("Welcome to GPA",JLabel.CENTER);
              // lbl.setFont(new Font("Gabriola",Font.BOLD+Font.ITALIC,100));
              // this.add(lbl,BorderLayout.CENTER);
               ImageIcon img = new ImageIcon("C:\\Users\\USER\\Downloads/exam.jpg");
               lbl = new JLabel(img);
               this.add(lbl);
               lbl = new JLabel("Welcome to GPA",JLabel.CENTER);
               lbl.setFont(new Font("Gabriola",Font.BOLD+Font.ITALIC,100));
               this.add(lbl,BorderLayout.CENTER);
           
               this.setVisible(true);
               this.setSize(1000,800);
           }

    @Override
    public void actionPerformed(ActionEvent e) {
        
                this.setVisible(false);
                new index().setVisible(true);
    }
   
      
   
}








/**
 *
 * @author USER
 */
public class QuizOrExamManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyFrame f = new MyFrame();
        
    }
    
}
