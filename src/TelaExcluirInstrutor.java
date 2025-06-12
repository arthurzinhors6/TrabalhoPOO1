import javax.swing.*;
import java.awt.*;

public class TelaExcluirInstrutor extends JFrame {

    private static final Color COR_FUNDO = new Color(51, 51, 51);
    private static final Color COR_AZUL = new Color(0, 102, 204);
    private static final Color COR_BRANCO = Color.WHITE;
    private static final Font FONTE_PADRAO = new Font("Segoe UI Black", Font.PLAIN, 12);

    private DefaultListModel<String> model;
    private JList<String> lista;
    private JTextArea mensagem;

    public TelaExcluirInstrutor() {
        setTitle("Excluir Instrutor");
        setSize(320, 330);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(COR_FUNDO);

        model = new DefaultListModel<>();
        for (Instrutor i : BancoInstrutores.instrutores) {
            model.addElement(i.nome);
        }

        lista = new JList<>(model);
        lista.setBounds(20, 20, 260, 80);
        lista.setBackground(COR_FUNDO);
        lista.setForeground(COR_AZUL);
        lista.setFont(FONTE_PADRAO);
        lista.setSelectionBackground(new Color(70, 70, 70));
        lista.setSelectionForeground(COR_AZUL);

        mensagem = new JTextArea();
        mensagem.setBounds(20, 110, 260, 60);
        mensagem.setEditable(false);
        mensagem.setBackground(COR_FUNDO);
        mensagem.setForeground(COR_AZUL);
        mensagem.setFont(FONTE_PADRAO);
        mensagem.setLineWrap(true);
        mensagem.setWrapStyleWord(true);

        JButton btnExcluir = new JButton("Excluir");
        btnExcluir.setBounds(100, 180, 100, 30);
        btnExcluir.setBackground(COR_AZUL);
        btnExcluir.setForeground(COR_BRANCO);
        btnExcluir.setFont(FONTE_PADRAO);
        btnExcluir.setFocusPainted(false);
        btnExcluir.setBorderPainted(false);

        JButton btnVoltar = new JButton("Voltar");
        btnVoltar.setBounds(100, 220, 100, 30);
        btnVoltar.setBackground(COR_AZUL);
        btnVoltar.setForeground(COR_BRANCO);
        btnVoltar.setFont(FONTE_PADRAO);
        btnVoltar.setFocusPainted(false);
        btnVoltar.setBorderPainted(false);

        btnExcluir.addActionListener(e -> {
            int idx = lista.getSelectedIndex();
            if (idx >= 0) {
                BancoInstrutores.instrutores.remove(idx);
                model.remove(idx);
                mensagem.setText("Instrutor excluído com sucesso!");
            } else {
                mensagem.setText("Selecione um instrutor para excluir.");
            }
        });

        btnVoltar.addActionListener(e -> {
            new TelaPrincipal().setVisible(true);
            dispose();
        });

        add(lista);
        add(mensagem);
        add(btnExcluir);
        add(btnVoltar);
    }
}
