/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author PC-1
 */
public class Ventana030102 extends JFrame {
    
     private JPanel jPanel1;
    private List<JLabel> jLabelList;
    
   public Ventana030102(String title) {
        super(title);
        this.setSize(1020, 1020);
        this.setLocation(50, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
    }

   public void iniciarComponentes(){
        this.iniciarPanel();
        this.iniciarEtiquetas();
   }
   
   public void iniciarPanel(){
       this.jPanel1 = new JPanel();
       this.jPanel1.setBackground(Color.YELLOW);
       this.jPanel1.setBorder(BorderFactory.createTitledBorder("Panel Principal"));
       this.setLayout(new FlowLayout());
   }
   
   public void iniciarEtiquetas(){
       this.jLabelList = new ArrayList<>();
       this.jLabelList.add(new JLabel());
       this.jLabelList.add(new JLabel());
       this.jLabelList.add(new JLabel());
       this.jLabelList.get(0).setBackground(Color.ORANGE);
       this.jLabelList.get(0).setOpaque(true);
       this.jLabelList.get(1).setBackground(Color.CYAN);
       this.jLabelList.get(1).setOpaque(true);
        this.jLabelList.get(2).setBackground(Color.GREEN);
       this.jLabelList.get(2).setOpaque(true);
       this.jLabelList.get(1).setText("COMPUTACION");
       this.jPanel1.add(this.jLabelList.get(1));
       this.jLabelList.get(2).setText("ELECTRONICA ");
       this.jPanel1.add(this.jLabelList.get(2));
       this.jLabelList.get(0).setText("TELECOMUNICACIONES");
       this.jPanel1.add(this.jLabelList.get(0));
        var telecomunicaciones = new ImageIcon("C:\\Users\\PC-1\\Documents\\NetBeansProjects\\Unidad03\\src\\main\\java\\ups\\edu\\ec\\P-Da-Mundial-de-las-Telecomunicaciones-y-la-Sociedad-de-la-Informacin.jpg");
        this.jLabelList.get(0).setIcon(telecomunicaciones);
        this.jLabelList.get(0).setBackground(Color.RED);
        this.jLabelList.get(0).setOpaque(true);
        var computacion = new ImageIcon ("C:\\Users\\PC-1\\Documents\\NetBeansProjects\\Unidad03\\src\\main\\java\\ups\\edu\\ec\\Computación-4.jpg");
        this.jLabelList.get(1).setIcon(computacion);
        this.jLabelList.get(1).setBackground(Color.CYAN);
        this.jLabelList.get(1).setOpaque(true);
        var electronica = new ImageIcon ("C:\\Users\\PC-1\\Documents\\NetBeansProjects\\Unidad03\\src\\main\\java\\ups\\edu\\ec\\Arduino_ftdi_chip-1.jpg");
        this.jLabelList.get(2).setIcon(electronica);
        this.jLabelList.get(2).setBackground(Color.PINK);
        this.jLabelList.get(2).setOpaque(true);
   }
    
}
