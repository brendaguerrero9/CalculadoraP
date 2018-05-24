/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui1;

import CProducts.Bin;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Brenda
 */
public class Ventana1 extends JFrame  {
    
    private JTextField resultado,numeroA;
    private JButton botonsum,botonres,botonmult,botondiv,botonbin;
    Bin bin = new Bin();
    
    public Ventana1(){
        super("    CALCULADORA    ");
        initComponent();
    }
    
    public void initComponent(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        resultado=new JTextField();
        resultado.setBounds(55,240,230,60);
        
        numeroA=new JTextField();
        numeroA.setBounds(90,10,170,60);
        
        botonsum= new JButton("+");
        botonsum.setBounds(50,90,60,60);
        
        botonres= new JButton("-");
        botonres.setBounds(140,90,60,60);
        
        botonmult= new JButton("x");
        botonmult.setBounds(235,90,60,60);
        
        botondiv= new JButton("÷");
        botondiv.setBounds(100,170,60,60);
        
        botonbin= new JButton("Bin");
        botonbin.setBounds(190,170,60,60);
        
        Container contenedor = getContentPane();
        contenedor.add(resultado);
        contenedor.add(numeroA);
        contenedor.add(botonsum);
        contenedor.add(botonres);
        contenedor.add(botonmult);
        contenedor.add(botondiv);
        contenedor.add(botonbin);
        
        botonbin.addActionListener(new ActionListener(){
           @Override
            public void actionPerformed(ActionEvent e) {
                int n;
                String val = bin.resultado();
                n = Integer.parseInt(numeroA.getText());
                bin.OperacionC(n);
                resultado.setText(val);
                
            }
    });
    setSize(400,350); 
    }
    public static void main(String[] args){
   java.awt.EventQueue.invokeLater(new Runnable() {
       @Override
       public void run() {
           new Ventana1().setVisible(true);
       }
 
});
}
}

