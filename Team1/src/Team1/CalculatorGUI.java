package Team1;

import javax.swing.*;
import java.awt.*;

public class CalculatorGUI extends JFrame {
    private JTextField txtSo1, txtSo2, txtKetQua;
    private JButton btnCong, btnTru, btnNhan, btnChia;

    public CalculatorGUI() {
        setTitle("Máy tính đơn giản");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 2, 10, 10));

        // Thành phần giao diện
        add(new JLabel("Số thứ nhất:"));
        txtSo1 = new JTextField();
        add(txtSo1);

        add(new JLabel("Số thứ hai:"));
        txtSo2 = new JTextField();
        add(txtSo2);

        btnCong = new JButton("Cộng");
        btnTru = new JButton("Trừ");
        btnNhan = new JButton("Nhân");
        btnChia = new JButton("Chia");

        add(btnCong);
        add(btnTru);
        add(btnNhan);
        add(btnChia);

        add(new JLabel("Kết quả:"));
        txtKetQua = new JTextField();
        txtKetQua.setEditable(false);
        add(txtKetQua);

        // Gắn sự kiện
        btnCong.addActionListener(e -> cong());
        btnTru.addActionListener(e -> tru());
        btnNhan.addActionListener(e -> nhan());
        btnChia.addActionListener(e -> chia());
    }

    private int getSo1() throws NumberFormatException {
        return Integer.parseInt(txtSo1.getText());
    }

    private int getSo2() throws NumberFormatException {
        return Integer.parseInt(txtSo2.getText());
    }

    private void cong() {
        
    }

    private void tru() {
        try {
            int a = getSo1();
            int b = getSo2();
            int kq = a - b;
            txtKetQua.setText(String.valueOf(kq));
        } catch (NumberFormatException e) {
            txtKetQua.setText("Nhập sai định dạng số");
        }
    }

    private void nhan() {
    	try {
            int a = getSo1();
            int b = getSo2();
            int kq = a * b;
            txtKetQua.setText(String.valueOf(kq));
        } catch (NumberFormatException e) {
            txtKetQua.setText("ERROR");
        }
    	
    }

    private void chia() {
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CalculatorGUI().setVisible(true));
    }
}
