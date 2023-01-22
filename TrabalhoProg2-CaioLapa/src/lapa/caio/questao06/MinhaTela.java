package lapa.caio.questao06;

import javax.swing.*;
import java.awt.*;

public class MinhaTela extends JFrame {

    public MinhaTela(){
        // Cria o JFrame
        setTitle("Minha Tela");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 100);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(new FlowLayout(FlowLayout.CENTER, 30, 10));

        // Cria os JLabel
        JLabel label1 = new JLabel("No...");
        JLabel label2 = new JLabel("Telefone:");

        // Cria os JTextField
        JTextField campoTexto1 = new JTextField(12);
        JTextField campoTexto2 = new JTextField(12);

        // Cria o JButton
        JButton botao = new JButton("Salvar");

        // Adiciona os componentes ao JFrame
        add(label1);
        add(campoTexto1);
        add(label2);
        add(campoTexto2);

        add(botao, BorderLayout.SOUTH);

        // Exibe o JFrame
        setVisible(true);
    }
}
