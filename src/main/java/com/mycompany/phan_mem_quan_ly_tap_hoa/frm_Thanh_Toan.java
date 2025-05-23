/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.phan_mem_quan_ly_tap_hoa;

import Backend.In_Hoa_Don;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.util.Date;



public class frm_Thanh_Toan extends javax.swing.JFrame {

    /**
     * Creates new form frm_Hoa_Don
     */
    
    public frm_Thanh_Toan() {
        initComponents();
        setLocationRelativeTo(this);
        loadDataFromCSV();
    }

    private void loadDataFromCSV() {
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream("data/sanpham.csv"), "UTF-8"))) {

            String line;
            DefaultTableModel model = (DefaultTableModel) tblTatCa.getModel();
            model.setRowCount(0);  // Làm sạch bảng trước khi thêm dữ liệu mới

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                model.addRow(data); // Thêm dữ liệu vào bảng
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi đọc file CSV", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }
        private void saveInvoiceToCSV() {
         DefaultTableModel modelHoaDon = (DefaultTableModel) tblHoaDon.getModel();
        String filename = "data/hoadon.csv";

        String currentTime = new SimpleDateFormat(""
                + "MM/dd/yyyy HH:mm:ss").format(new Date());

        String maHoaDon = "HD" + new SimpleDateFormat("MMddyyyyHHmmss").format(new Date());

        try (BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(filename, true), "UTF-8"))) {

            File file = new File(filename);
            if (file.length() == 0) {
                writer.write("Mã hóa đơn,Ngày giờ,Mã món,Tên món,Giá tiền,Số lượng,Thành tiền");
                writer.newLine();
            }

            for (int i = 0; i < modelHoaDon.getRowCount(); i++) {
                String maMon = modelHoaDon.getValueAt(i, 0).toString();
                String tenMon = modelHoaDon.getValueAt(i, 1).toString();
                String giaTien = modelHoaDon.getValueAt(i, 2).toString();
                String soLuong = modelHoaDon.getValueAt(i, 3).toString();
                String thanhTien = modelHoaDon.getValueAt(i, 4).toString();

                writer.write(maHoaDon + "," + currentTime + "," + maMon + "," + tenMon + "," + giaTien + "," + soLuong + "," + thanhTien);
                writer.newLine();
            }

            JOptionPane.showMessageDialog(this, "Hóa đơn đã được lưu thành công vào file!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);

        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi lưu hóa đơn vào file CSV", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
}


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tblThucDon = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTatCa = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMaMon = new javax.swing.JTextField();
        txtGiaTien = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtThanhTien = new javax.swing.JTextField();
        txtTimSanPham = new javax.swing.JButton();
        btnThemMon = new javax.swing.JButton();
        txtMaMon1 = new javax.swing.JTextField();
        btnXoaSanPham = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblHoaDon = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtTongTien = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxphuongThucThanhToan = new javax.swing.JComboBox<>();
        btnThanhToan = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tblThucDon.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tblTatCa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Loại sản phẩm", "Giá bán", "Số lượng", "Ngày nhập", "Ngày hết hạn"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblTatCa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTatCaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTatCa);

        tblThucDon.addTab("Giỏ Hàng", jScrollPane1);

        jLabel1.setText("Tên sản phẩm :");

        jLabel2.setText("Mã sản phẩm :");

        jLabel4.setText("Đơn giá :");

        jLabel5.setText("Số lượng:");

        txtMaMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaMonActionPerformed(evt);
            }
        });

        jLabel6.setText("Thành tiền:");

        txtThanhTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtThanhTienActionPerformed(evt);
            }
        });

        txtTimSanPham.setText("Tìm sản phẩm");
        txtTimSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimSanPhamActionPerformed(evt);
            }
        });

        btnThemMon.setText("Thêm sản phẩm");
        btnThemMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemMonActionPerformed(evt);
            }
        });

        txtMaMon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaMon1ActionPerformed(evt);
            }
        });

        btnXoaSanPham.setText("Xóa sản phẩm");
        btnXoaSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaSanPhamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tblThucDon)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtTimSanPham)
                                .addGap(30, 30, 30)
                                .addComponent(btnThemMon)
                                .addGap(0, 87, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMaMon, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                    .addComponent(txtMaMon1)
                                    .addComponent(txtSoLuong, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(12, 12, 12))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnXoaSanPham)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtGiaTien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                .addComponent(txtThanhTien, javax.swing.GroupLayout.Alignment.TRAILING))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tblThucDon, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtMaMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtGiaTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMaMon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTimSanPham)
                    .addComponent(btnThemMon)
                    .addComponent(btnXoaSanPham)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tblHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã món", "Tên món", "Giá tiền", "Số lượng", "Thành tiền"
            }
        ));
        jScrollPane4.setViewportView(tblHoaDon);

        jLabel3.setText("Tổng tiền:");

        txtTongTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTongTienActionPerformed(evt);
            }
        });

        jLabel8.setText("Phương thức thanh toán");

        jComboBoxphuongThucThanhToan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tiền Mặt", "Chuyển Khoản" }));
        jComboBoxphuongThucThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxphuongThucThanhToanActionPerformed(evt);
            }
        });

        btnThanhToan.setText("Thanh Toán");
        btnThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTongTien)
                            .addComponent(jComboBoxphuongThucThanhToan, 0, 154, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThanhToan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxphuongThucThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnThanhToan)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Trở về");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtThanhTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtThanhTienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtThanhTienActionPerformed
    private int getTongTien() {
        try {
            return Integer.parseInt(txtTongTien.getText());
        } catch (NumberFormatException e) {
            return 0;
        }
    }
    private void updateTotalAmount() {
    int totalAmount = 0;
    DefaultTableModel model = (DefaultTableModel) tblHoaDon.getModel(); // Lấy dữ liệu bảng giỏ hàng

    // Duyệt qua từng hàng trong bảng giỏ hàng và tính tổng tiền
    for (int i = 0; i < model.getRowCount(); i++) {
        totalAmount += (int) model.getValueAt(i, 4); // Cột Thành tiền
    }

    // Cập nhật tổng tiền vào ô txtTongTien
    txtTongTien.setText(String.valueOf(totalAmount));
}
    private void btnThemMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemMonActionPerformed
        String maMon = txtMaMon1.getText(); // Lấy mã sản phẩm từ ô nhập
    String giaTienStr = txtGiaTien.getText(); // Lấy giá tiền từ ô nhập
    String soLuongStr = txtSoLuong.getText(); // Lấy số lượng từ ô nhập

    if (maMon.isEmpty() || giaTienStr.isEmpty() || soLuongStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return; // Nếu không đủ thông tin, dừng lại
    }

    try {
        int giaTien = Integer.parseInt(giaTienStr); // Chuyển giá tiền thành số nguyên
        int soLuong = Integer.parseInt(soLuongStr); // Chuyển số lượng thành số nguyên
        int thanhTien = giaTien * soLuong; // Tính thành tiền

        DefaultTableModel modelTatCa = (DefaultTableModel) tblTatCa.getModel(); // Lấy model của bảng tất cả sản phẩm
        String tenMon = ""; // Tạo biến lưu tên món

        // Duyệt qua tất cả các hàng trong bảng tblTatCa để tìm tên món tương ứng với mã sản phẩm
        for (int i = 0; i < modelTatCa.getRowCount(); i++) {
            String maMonTrongBang = modelTatCa.getValueAt(i, 0).toString(); // Lấy mã sản phẩm trong bảng
            if (maMonTrongBang.equals(maMon)) {
                tenMon = modelTatCa.getValueAt(i, 1).toString(); // Lấy tên món từ bảng tblTatCa
                break; // Dừng vòng lặp khi đã tìm thấy món
            }
        }

        // Thêm sản phẩm vào giỏ hàng (bảng tblHoaDon)
        DefaultTableModel modelHoaDon = (DefaultTableModel) tblHoaDon.getModel();
        modelHoaDon.addRow(new Object[]{maMon, tenMon, giaTien, soLuong, thanhTien});

        // Cập nhật tổng tiền vào ô txtTongTien
        updateTotalAmount(); // Gọi phương thức cập nhật tổng tiền

        // Làm mới các trường nhập liệu sau khi thêm món
        txtMaMon1.setText("");
        txtGiaTien.setText("");
        txtSoLuong.setText("");
        txtThanhTien.setText("");

        // Cập nhật lại bảng sản phẩm để phản ánh các thay đổi sau khi thêm sản phẩm mới
        loadDataFromCSV(); // Hoặc nếu không sử dụng file CSV, bạn có thể làm mới bảng theo cách khác
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Giá tiền và số lượng phải là số!", "Lỗi", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnThemMonActionPerformed

    private void txtMaMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaMonActionPerformed

    }//GEN-LAST:event_txtMaMonActionPerformed

    private void txtMaMon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaMon1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaMon1ActionPerformed

    private void txtTimSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimSanPhamActionPerformed
        String searchTerm = txtMaMon.getText().toLowerCase().trim(); // Lấy từ khóa tìm kiếm từ ô nhập mã sản phẩm
    if (searchTerm.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Vui lòng nhập mã hoặc tên sản phẩm để tìm!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return; // Dừng lại nếu không nhập gì vào ô tìm kiếm
    }

    DefaultTableModel model = (DefaultTableModel) tblTatCa.getModel();
    DefaultTableModel newModel = new DefaultTableModel(new Object[]{"Mã sản phẩm", "Tên sản phẩm", "Loại sản phẩm", "Giá bán", "Số lượng", "Ngày nhập", "Ngày hết hạn"}, 0);
    boolean found = false;

    // Tìm kiếm sản phẩm trong bảng tblTatCa
    for (int i = 0; i < model.getRowCount(); i++) {
        String maMon = model.getValueAt(i, 0).toString().toLowerCase();
        String tenMon = model.getValueAt(i, 1).toString().toLowerCase();

        // Kiểm tra xem mã sản phẩm hoặc tên sản phẩm có chứa từ khóa tìm kiếm không
        if (maMon.contains(searchTerm) || tenMon.contains(searchTerm)) {
            // Thêm sản phẩm vào bảng tìm kiếm mới
            newModel.addRow(new Object[]{
                model.getValueAt(i, 0), // Mã sản phẩm
                model.getValueAt(i, 1), // Tên sản phẩm
                model.getValueAt(i, 2), // Loại sản phẩm
                model.getValueAt(i, 3), // Giá bán
                model.getValueAt(i, 4), // Số lượng
                model.getValueAt(i, 5), // Ngày nhập
                model.getValueAt(i, 6) // Ngày hết hạn
            });
            found = true;

            // Điền thông tin sản phẩm vào các ô nhập liệu
            txtMaMon1.setText(model.getValueAt(i, 0).toString());  // Mã sản phẩm
            txtGiaTien.setText(model.getValueAt(i, 3).toString());  // Giá tiền
            txtSoLuong.setText(model.getValueAt(i, 4).toString());  // Số lượng
            int giaTien = Integer.parseInt(model.getValueAt(i, 3).toString());
            int soLuong = Integer.parseInt(model.getValueAt(i, 4).toString());
            txtThanhTien.setText(String.valueOf(giaTien * soLuong));  // Tính thành tiền
            break;  // Dừng lại khi tìm thấy sản phẩm
        }
    }

    // Cập nhật bảng tblTatCa với dữ liệu đã tìm kiếm
    tblTatCa.setModel(newModel);

    // Nếu không tìm thấy sản phẩm, hiển thị thông báo
    if (!found) {
        JOptionPane.showMessageDialog(this, "Sản phẩm không tìm thấy!", "Lỗi", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_txtTimSanPhamActionPerformed

    private void btnXoaSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaSanPhamActionPerformed
        int row = tblHoaDon.getSelectedRow();
        if (row != -1) {
            DefaultTableModel model = (DefaultTableModel) tblHoaDon.getModel();
            model.removeRow(row);
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn sản phẩm để xóa!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnXoaSanPhamActionPerformed

    private void txtTongTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTongTienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTongTienActionPerformed

    private void tblTatCaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTatCaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblTatCaMouseClicked

    private void updateCSVFile(DefaultTableModel modelTatCa) {
    try (BufferedWriter writer = new BufferedWriter(
            new OutputStreamWriter(new FileOutputStream("data/sanpham.csv"), "UTF-8"))) {

        for (int i = 0; i < modelTatCa.getRowCount(); i++) {
            String maMon = modelTatCa.getValueAt(i, 0).toString();
            String tenMon = modelTatCa.getValueAt(i, 1).toString();
            String loaiMon = modelTatCa.getValueAt(i, 2).toString();
            String giaTien = modelTatCa.getValueAt(i, 3).toString();
            String soLuong = modelTatCa.getValueAt(i, 4).toString();
            String ngayNhap = modelTatCa.getValueAt(i, 5).toString();
            String ngayHetHan = modelTatCa.getValueAt(i, 6).toString();

            writer.write(maMon + "," + tenMon + "," + loaiMon + "," + giaTien + "," + soLuong + "," + ngayNhap + "," + ngayHetHan);
            writer.newLine(); // Xuống dòng
        }

    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Lỗi khi ghi vào tệp CSV", "Lỗi", JOptionPane.ERROR_MESSAGE);
    }
}

    private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanActionPerformed
        // Kiểm tra phương thức thanh toán
    if (jComboBoxphuongThucThanhToan.getSelectedIndex() == -1) {
        JOptionPane.showMessageDialog(this, "Vui lòng chọn phương thức thanh toán!", "Lỗi", JOptionPane.WARNING_MESSAGE);
        return;
    }
    

    String phuongThuc = jComboBoxphuongThucThanhToan.getSelectedItem().toString();
    
    // Nếu phương thức thanh toán là "Chuyển khoản"
    if (phuongThuc.equalsIgnoreCase("Chuyển khoản")) {
        int tongTien = 0;
        try {
            tongTien = Integer.parseInt(txtTongTien.getText().trim()); // Lấy tiền từ ô txtTongTien
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Không thể lấy tổng tiền!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String noiDung = "Thanh Toan " + System.currentTimeMillis();

        // Tạo form QRCodeViewer và hiển thị mã QR
        QRCodeViewer qrViewer = new QRCodeViewer(tongTien, noiDung, new QRCodeViewer.QRPaymentCallback() {
            @Override
            public void onPaymentCompleted() {
                xuLyThanhToanSauKhiChuyenKhoan();  // Gọi phương thức xử lý thanh toán khi chuyển khoản hoàn tất
            }
        });
        qrViewer.show();  // Hiển thị QRCodeViewer
    }

    // Cập nhật thông tin trong giỏ hàng
    DefaultTableModel modelHoaDon = (DefaultTableModel) tblHoaDon.getModel();
    DefaultTableModel modelTatCa = (DefaultTableModel) tblTatCa.getModel();

    for (int i = 0; i < modelHoaDon.getRowCount(); i++) {
        String maMon = modelHoaDon.getValueAt(i, 0).toString();
        int soLuong = Integer.parseInt(modelHoaDon.getValueAt(i, 3).toString());

        for (int j = 0; j < modelTatCa.getRowCount(); j++) {
            String maMonTrongBang = modelTatCa.getValueAt(j, 0).toString();
            int soLuongTrongBang = Integer.parseInt(modelTatCa.getValueAt(j, 4).toString());

            if (maMon.equals(maMonTrongBang)) {
                int soLuongMoi = soLuongTrongBang - soLuong;
                if (soLuongMoi <= 0) {
                    modelTatCa.removeRow(j);
                    j--;
                } else {
                    modelTatCa.setValueAt(soLuongMoi, j, 4);
                }
                break;
            }
        }
    }

    // Cập nhật file CSV
    
    updateCSVFile(modelTatCa);

    // Chỉ hiển thị thông báo "Thanh toán thành công!" nếu phương thức thanh toán là "Tiền mặt"
    if (phuongThuc.equalsIgnoreCase("Tiền mặt")) {
        JOptionPane.showMessageDialog(this, "Thanh toán thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        saveInvoiceToCSV();

        

    // Xóa giỏ hàng và cập nhật lại tổng tiền
    modelHoaDon.setRowCount(0);  // Xóa giỏ hàng
    updateTotalAmount();  // Cập nhật lại tổng tiền
    }
    }//GEN-LAST:event_btnThanhToanActionPerformed
    private void xuLyThanhToanSauKhiChuyenKhoan() {
    DefaultTableModel modelHoaDon = (DefaultTableModel) tblHoaDon.getModel();
    DefaultTableModel modelTatCa = (DefaultTableModel) tblTatCa.getModel();

    for (int i = 0; i < modelHoaDon.getRowCount(); i++) {
        String maMon = modelHoaDon.getValueAt(i, 0).toString();
        int soLuong = Integer.parseInt(modelHoaDon.getValueAt(i, 3).toString());

        for (int j = 0; j < modelTatCa.getRowCount(); j++) {
            String maMonTrongBang = modelTatCa.getValueAt(j, 0).toString();
            int soLuongTrongBang = Integer.parseInt(modelTatCa.getValueAt(j, 4).toString());

            if (maMon.equals(maMonTrongBang)) {
                int soLuongMoi = soLuongTrongBang - soLuong;
                if (soLuongMoi <= 0) {
                    modelTatCa.removeRow(j);
                    j--;
                } else {
                    modelTatCa.setValueAt(soLuongMoi, j, 4);
                }
                break;
            }
        }
    }

    updateCSVFile(modelTatCa);
    JOptionPane.showMessageDialog(this, "Thanh toán thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
    saveInvoiceToCSV();
    modelHoaDon.setRowCount(0); // Xóa giỏ hàng
    updateTotalAmount(); // Cập nhật lại tổng tiền
}

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        frm_Trang_Chu trangChuForm = new frm_Trang_Chu();  // Tạo lại frm_Trang_Chu
        trangChuForm.setVisible(true);  // Mở lại frm_Trang_Chu
        trangChuForm.setLocationRelativeTo(null);  // Đặt cửa sổ mới ở giữa màn hình
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBoxphuongThucThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxphuongThucThanhToanActionPerformed
         
    }//GEN-LAST:event_jComboBoxphuongThucThanhToanActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_Thanh_Toan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThanhToan;
    private javax.swing.JButton btnThemMon;
    private javax.swing.JButton btnXoaSanPham;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxphuongThucThanhToan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tblHoaDon;
    private javax.swing.JTable tblTatCa;
    private javax.swing.JTabbedPane tblThucDon;
    private javax.swing.JTextField txtGiaTien;
    private javax.swing.JTextField txtMaMon;
    private javax.swing.JTextField txtMaMon1;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtThanhTien;
    private javax.swing.JButton txtTimSanPham;
    private javax.swing.JTextField txtTongTien;
    // End of variables declaration//GEN-END:variables
}
