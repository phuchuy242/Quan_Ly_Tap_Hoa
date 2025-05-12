package Backend;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class In_Hoa_Don {

    private DefaultTableModel modelHoaDon;  // Bảng giỏ hàng
    private String totalAmount;  // Tổng tiền
    private String paymentMethod;  // Phương thức thanh toán

    public In_Hoa_Don(DefaultTableModel modelHoaDon, String totalAmount, String paymentMethod) {
        this.modelHoaDon = modelHoaDon;
        this.totalAmount = totalAmount;
        this.paymentMethod = paymentMethod;
    }

    // Phương thức để hiển thị hóa đơn trên màn hình
    public void displayBill() {
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);  // Không cho phép chỉnh sửa

        // Thiết lập phần đầu của hóa đơn
        textArea.append("HÓA ĐƠN\n");
        textArea.append("==========================================\n");

        // Thêm các món trong giỏ hàng
        for (int i = 0; i < modelHoaDon.getRowCount(); i++) {
            String maMon = modelHoaDon.getValueAt(i, 0).toString();
            String tenMon = modelHoaDon.getValueAt(i, 1).toString();
            String soLuong = modelHoaDon.getValueAt(i, 3).toString();
            String thanhTien = modelHoaDon.getValueAt(i, 6).toString();

            textArea.append(tenMon + " (" + maMon + ") x" + soLuong + " = " + thanhTien + "\n");
        }

        // Thêm tổng tiền và phương thức thanh toán
        textArea.append("Tổng tiền: " + totalAmount + "\n");
        textArea.append("Phương thức thanh toán: " + paymentMethod + "\n");

        // Phần cuối của hóa đơn
        textArea.append("==========================================\n");
        textArea.append("Cảm ơn quý khách!\n");

        // Hiển thị hóa đơn trong một JScrollPane để dễ cuộn
        JScrollPane scrollPane = new JScrollPane(textArea);
        JOptionPane.showMessageDialog(null, scrollPane, "Hóa Đơn", JOptionPane.INFORMATION_MESSAGE);
    }
}
