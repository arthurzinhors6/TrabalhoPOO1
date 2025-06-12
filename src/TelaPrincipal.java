import javax.swing.*;
import java.awt.*;

public class TelaPrincipal extends JFrame {

    private static final Color COR_FUNDO = new Color(51, 51, 51);       // #333333
    private static final Color COR_AZUL = new Color(0, 102, 204);       // #0066CC
    private static final Color COR_TEXTO_BRANCO = Color.WHITE;         // #FFFFFF
    private static final Font FONTE_BOTAO = new Font("Segoe UI Black", Font.PLAIN, 12);

    public TelaPrincipal() {
        setTitle("Menu Principal");
        setSize(320, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(COR_FUNDO);

        JButton btnCadastro = new JButton("Cadastrar Instrutor");
        JButton btnListar = new JButton("Listar Instrutores");
        JButton btnEditar = new JButton("Editar Instrutor");
        JButton btnDetalhes = new JButton("Excluir Instrutor");

        btnCadastro.setBounds(50, 30, 220, 30);
        btnListar.setBounds(50, 70, 220, 30);
        btnEditar.setBounds(50, 110, 220, 30);
        btnDetalhes.setBounds(50, 150, 220, 30);

        JButton[] botoes = {btnCadastro, btnListar, btnEditar, btnDetalhes};
        for (JButton b : botoes) {
            b.setBackground(COR_AZUL);
            b.setForeground(COR_TEXTO_BRANCO);
            b.setFocusPainted(false);
            b.setBorderPainted(false);
            b.setFont(FONTE_BOTAO);
        }

        add(btnCadastro);
        add(btnListar);
        add(btnEditar);
        add(btnDetalhes);

        btnCadastro.addActionListener(e -> {
            new TelaCadastro().setVisible(true);
            dispose();
        });

        btnListar.addActionListener(e -> {
            new TelaListagem().setVisible(true);
            dispose();
        });

        btnEditar.addActionListener(e -> {
            new TelaEdicao().setVisible(true);
            dispose();
        });

        btnDetalhes.addActionListener(e -> {
            new TelaExcluirInstrutor().setVisible(true);
            dispose();
        });
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {}

        new TelaPrincipal().setVisible(true);
    }
}
