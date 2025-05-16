package com.mycompany.phan_mem_quan_ly_tap_hoa;
import javax.swing.*;
import java.awt.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class QRCodeViewer extends JFrame {
    private boolean paymentCompleted = false;
    private JButton doneButton;
    private JButton cancelButton; // Nút hủy
    private JLabel paymentStatusLabel;
    private QRPaymentCallback callback; // Gọi ngược về frm_Hoa_Don

    public QRCodeViewer(int donGia, String noiDung, QRPaymentCallback callback) {
        this.callback = callback;

        setTitle("VietQR Display");
        setSize(570, 750);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Panel QR
        JPanel qrPanel = new JPanel();
        qrPanel.setLayout(new BoxLayout(qrPanel, BoxLayout.Y_AXIS));

        try {
            String encodedNoiDung = URLEncoder.encode(noiDung, StandardCharsets.UTF_8.toString());
            String url = "https://img.vietqr.io/image/970422-0796791500-compact2.png"
                       + "?amount=" + donGia
                       + "&addInfo=" + encodedNoiDung
                       + "&accountName=TapHoaVuiVe";

            BufferedImage image = ImageIO.read(new URL(url));
            if (image != null) {
                JLabel qrLabel = new JLabel(new ImageIcon(image));
                qrLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
                qrPanel.add(qrLabel);
            } else {
                throw new IOException("Không thể tải ảnh từ URL.");
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi tải ảnh QR: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }

        // Panel thông báo + nút
        JPanel messagePanel = new JPanel();
        messagePanel.setLayout(new BoxLayout(messagePanel, BoxLayout.Y_AXIS));

        paymentStatusLabel = new JLabel("Đang xử lý thanh toán...", JLabel.CENTER);
        paymentStatusLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        messagePanel.add(paymentStatusLabel);

        doneButton = new JButton("Đã xong");
        doneButton.setPreferredSize(new Dimension(120, 40));
        doneButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        doneButton.setEnabled(true);
        doneButton.addActionListener(e -> {
            showPaymentSuccessMessage();
            if (callback != null) {
                callback.onPaymentCompleted(); // Gọi về frm_Hoa_Don
            }
            luuThongTinChuyenKhoan(donGia, noiDung); // Lưu thông tin thanh toán
            dispose(); // Đóng cửa sổ
        });

        // Nút hủy
        cancelButton = new JButton("Hủy bỏ");
        cancelButton.setPreferredSize(new Dimension(120, 40));
        cancelButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        cancelButton.addActionListener(e -> {
            dispose(); // Đóng cửa sổ khi hủy bỏ
        });

        // Thêm nút vào panel, sắp xếp chúng ngang hàng
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(doneButton);
        buttonPanel.add(cancelButton);

        messagePanel.add(Box.createRigidArea(new Dimension(0, 10)));
        messagePanel.add(buttonPanel);

        add(qrPanel, BorderLayout.CENTER);
        add(messagePanel, BorderLayout.SOUTH);
        setVisible(true);
    }

    private void showPaymentSuccessMessage() {
        paymentStatusLabel.setText("Thanh toán thành công!");
        doneButton.setEnabled(false);
        paymentCompleted = true;
    }

    // Thêm phương thức lưu thông tin thanh toán
    private void luuThongTinChuyenKhoan(int donGia, String noiDung) {
        String filePath = "data/thongtinchuyenkhoan.csv"; // Đường dẫn tới file CSV

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            // Lấy thời gian hiện tại
            String thoiGian = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(new Date());

            // Ghi vào file CSV với thứ tự: thời gian, số tiền, nội dung
            writer.append(thoiGian + "," + donGia + "," + noiDung); // Ghi thời gian, số tiền, nội dung
            writer.newLine(); // Chuyển sang dòng mới
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi lưu thông tin chuyển khoản!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace(); // In chi tiết lỗi để bạn kiểm tra
        }
    }

    // Giao diện callback
    public interface QRPaymentCallback {
        void onPaymentCompleted();
    }
}