import javax.swing.*;
import java.awt.*;

public class TelaCadastro extends JFrame {

    private static final Color COR_FUNDO = new Color(51, 51, 51);
    private static final Color COR_AZUL = new Color(0, 102, 204);
    private static final Color COR_TEXTO_BRANCO = Color.WHITE;
    private static final Font FONTE_TITULO = new Font("Segoe UI Black", Font.PLAIN, 18);
    private static final Font FONTE_NORMAL = new Font("Segoe UI Black", Font.PLAIN, 12);

    public TelaCadastro() {
        setTitle("Cadastro de Instrutor");
        setSize(350, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(COR_FUNDO);

        JLabel lblTitulo = new JLabel("Cadastro de Instrutor");
        lblTitulo.setBounds(40, 10, 300, 25);
        lblTitulo.setForeground(COR_AZUL);
        lblTitulo.setFont(FONTE_TITULO);

        JLabel lblNome = new JLabel("Nome:");
        JTextField txtNome = new JTextField();
        JLabel lblCpf = new JLabel("CPF:");
        JTextField txtCpf = new JTextField();
        JLabel lblCnh = new JLabel("CNH:");
        JTextField txtCnh = new JTextField();
        JButton btnSalvar = new JButton("SALVAR");
        JButton btnVoltar = new JButton("VOLTAR");
        lblNome.setBounds(20, 50, 80, 25);
        txtNome.setBounds(100, 50, 200, 25);
        lblCpf.setBounds(20, 85, 80, 25);
        txtCpf.setBounds(100, 85, 200, 25);
        lblCnh.setBounds(20, 120, 80, 25);
        txtCnh.setBounds(100, 120, 200, 25);
        btnSalvar.setBounds(30, 170, 130, 30);
        btnVoltar.setBounds(180, 170, 130, 30);


        JLabel[] labels = {lblNome, lblCpf, lblCnh};
        for (JLabel lbl : labels) {
            lbl.setForeground(COR_TEXTO_BRANCO);
            lbl.setFont(FONTE_NORMAL);
        }

        JTextField[] textos = {txtNome, txtCpf, txtCnh};
        for (JTextField txt : textos) {
            txt.setBackground(COR_FUNDO);
            txt.setForeground(COR_TEXTO_BRANCO);
            txt.setCaretColor(COR_TEXTO_BRANCO);
            txt.setFont(FONTE_NORMAL);
        }

        JButton[] botoes = {btnSalvar, btnVoltar};
        for (JButton btn : botoes) {
            btn.setBackground(COR_AZUL);
            btn.setForeground(COR_TEXTO_BRANCO);
            btn.setFont(FONTE_NORMAL);
            btn.setFocusPainted(false);
        }

        add(lblTitulo);
        add(lblNome); add(txtNome);
        add(lblCpf);  add(txtCpf);
        add(lblCnh);  add(txtCnh);
        add(btnSalvar); add(btnVoltar);

        btnSalvar.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Instrutor cadastrado (não salvo permanentemente)!");
            txtNome.setText("");
            txtCpf.setText("");
            txtCnh.setText("");
        });

        btnVoltar.addActionListener(e -> {
            new TelaPrincipal().setVisible(true);
            dispose();
        });
    }
}
