package OOP.BT5;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

    public class HangThucPham {
        private String maHang, tenHang;
        private double donGia;
        private LocalDate nsx, hsd;
        private LocalDate ngayHomNay = LocalDate.now();

        public HangThucPham(String maHang, String tenHang, double donGia, LocalDate nsx, LocalDate hsd) throws Exception {
            if(!maHang.trim().equals("")) {
                this.maHang = maHang;
            } else {
                throw new Exception("Loi ma hang");
            }
            if(!maHang.trim().equals("")) {
                this.tenHang = tenHang;
            } else {
                throw new Exception("Loi ten hang");
            }
            if (donGia >= 0) {
                this.donGia = donGia;
            } else {
                donGia = 0;
            }
            if (nsx.isBefore(ngayHomNay)) {
                this.nsx = nsx;
            } else {
                this.nsx = ngayHomNay;
            }
            if (hsd.isAfter(nsx)) {
                this.hsd = hsd;
            } else {
                this.hsd = nsx;
            }
        }
        public boolean hangHetHan() {
            if (hsd.isBefore(ngayHomNay)) {
                return true;
            } else {
                return false;
            }
        }

        public void setMaHang(String maHang) throws Exception {
            if (!maHang.trim().equals("")) {
                this.maHang = maHang;
            } else {
                throw new Exception("Loi ma hang");
            }
        }
        public void setTenHang(String tenHang) throws Exception {
            if (!tenHang.trim().equals("")) {
                this.tenHang = tenHang;
            } else {
                throw new Exception("Loi ten hang");
            }
        }
        public void setDonGia(double donGia) {
            if (donGia >= 0) {
                this.donGia = donGia;
            } else {
                donGia = 0;
            }
        }
        public void setNsx(LocalDate nsx) {
            if (nsx.isBefore(ngayHomNay)) {
                this.nsx = nsx;
            } else {
                this.nsx = ngayHomNay;
            }
        }
        public void setHsd(LocalDate hsd) {
            if (hsd.isAfter(ngayHomNay)) {
                this.hsd = hsd;
            } else {
                this.hsd = nsx;
            }
        }

        public String getMaHang() {
            return maHang;
        }
        public String getTenHang() {
            return tenHang;
        }
        public double getDonGia() {
            return donGia;
        }
        public LocalDate getNsx() {
            return nsx;
        }
        public LocalDate getHsd() {
            return hsd;
        }


        @Override
        public String toString()
        {
            DecimalFormat df = new DecimalFormat("#,###.00");
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String ghiChu = "";
            if (hangHetHan())
            {
                ghiChu = "Hang het han";
            }

            String dg = df.format(donGia);

            if (donGia == 0f)
            {
                dg = "0,00";
            }
            return String.format("%-15s %-15s %15s %-15s %-15s %-20s", maHang, tenHang, dg, nsx.format(dtf), hsd.format(dtf), ghiChu);
        }
    }
