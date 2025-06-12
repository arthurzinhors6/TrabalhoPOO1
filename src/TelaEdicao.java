import javax.swing.*;
import java.awt.Color;
import java.awt.Font;

public class TelaEdicao extends JFrame {

    private static final Color COR_FUNDO = new Color(51, 51, 51);
    private static final Color COR_TEXTO = new Color(0, 102, 204);
    private static final Font FONTE_PADRAO = new Font("Segoe UI", Font.PLAIN, 14);

    public TelaEdicao() {
        setTitle("Editar Instrutor");
        setSize(300, 230);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(COR_FUNDO);

        DefaultListModel<String> model = new DefaultListModel<>();
        for (Instrutor i : BancoInstrutores.instrutores) {
            model.addElement(i.nome);
        }

        JList<String> lista = new JList<>(model);
        lista.setBounds(10, 10, 260, 60);
        lista.setBackground(COR_FUNDO);
        lista.setForeground(COR_TEXTO);
        lista.setSelectionBackground(new Color(70, 70, 70));
        lista.setSelectionForeground(COR_TEXTO);
        lista.setFont(FONTE_PADRAO);

        JTextField txtNome = new JTextField();
        txtNome.setBounds(10, 80, 260, 25);
        txtNome.setBackground(Color.DARK_GRAY);
        txtNome.setForeground(COR_TEXTO);
        txtNome.setCaretColor(COR_TEXTO);
        txtNome.setFont(FONTE_PADRAO);

        JButton btnSalvar = new JButton("Salvar");
        JButton btnVoltar = new JButton("Voltar");

        btnSalvar.setBounds(10, 120, 120, 25);
        btnVoltar.setBounds(150, 120, 120, 25);

        JButton[] botoes = { btnSalvar, btnVoltar };
        for (JButton b : botoes) {
            b.setBackground(COR_FUNDO);
            b.setForeground(COR_TEXTO);
            b.setFocusPainted(false);
            b.setBorderPainted(false);
            b.setFont(FONTE_PADRAO);
        }

        add(lista);
        add(txtNome);
        add(btnSalvar);
        add(btnVoltar);

        lista.addListSelectionListener(e -> {
            int idx = lista.getSelectedIndex();
            if (idx >= 0) {
                txtNome.setText(BancoInstrutores.instrutores.get(idx).nome);
            }
        });

        btnSalvar.addActionListener(e -> {
            int idx = lista.getSelectedIndex();
            if (idx >= 0) {
                BancoInstrutores.instrutores.get(idx).nome = txtNome.getText();
                JOptionPane.showMessageDialog(this, "Nome atualizado!");
            }
        });

        btnVoltar.addActionListener(e -> {
            new TelaPrincipal().setVisible(true);
            dispose();
        });
    }
}
