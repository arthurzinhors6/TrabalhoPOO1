import javax.swing.*;
import java.awt.*;

public class TelaListagem extends JFrame {

    // Cores e fontes padronizadas (estilo NetBeans)
    private static final Color COR_FUNDO = new Color(51, 51, 51);
    private static final Color COR_AZUL = new Color(0, 102, 204);
    private static final Color COR_TEXTO_BRANCO = Color.WHITE;
    private static final Font FONTE_NORMAL = new Font("Segoe UI Black", Font.PLAIN, 12);
    private static final Font FONTE_TITULO = new Font("Segoe UI Black", Font.PLAIN, 18);

    public TelaListagem() {
        setTitle("Lista de Instrutores");
        setSize(350, 330);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(COR_FUNDO);

        JLabel lblTitulo = new JLabel("Lista de Instrutores");
        lblTitulo.setFont(FONTE_TITULO);
        lblTitulo.setForeground(COR_AZUL);
        lblTitulo.setBounds(80, 10, 250, 25);

        JTextArea area = new JTextArea();
        area.setEditable(false);
        area.setFont(FONTE_NORMAL);
        area.setBackground(COR_FUNDO);
        area.setForeground(COR_TEXTO_BRANCO);
        area.setCaretColor(COR_TEXTO_BRANCO);
        area.setBounds(20, 50, 300, 200);

        // Simula dados (sem BancoInstrutores)
        area.setText("Exemplo de Instrutor:\nNome: Maria Silva\nCPF: 123.456.789-00\nCNH: 99999999999\n");

        JButton btnVoltar = new JButton("VOLTAR");
        btnVoltar.setBounds(110, 260, 120, 30);
        btnVoltar.setBackground(COR_AZUL);
        btnVoltar.setForeground(COR_TEXTO_BRANCO);
        btnVoltar.setFont(FONTE_NORMAL);
        btnVoltar.setFocusPainted(false);

        add(lblTitulo);
        add(area);
        add(btnVoltar);

        btnVoltar.addActionListener(e -> {
            new TelaPrincipal().setVisible(true);
            dispose();
        });
    }
}
