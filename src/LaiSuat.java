public class LaiSuat {
    public boolean kiemTraKyHan (int kyHan){
        if(kyHan == 0 || kyHan == 1 || kyHan == 3 || kyHan == 6 || kyHan == 12){
            return true;
        }
        return false;
    }

    public double tinhKyHan(long soTien, int kyHan, int thoiGianGui, double laiSuat){
        double soTienLai = soTien * laiSuat * thoiGianGui / 360;
        return soTienLai;
    }

    public double tongTienLai (long soTien, int kyHan, int thoiGianGui){
        if(soTien < 500000 || thoiGianGui <= 0 ||(!kiemTraKyHan(kyHan))){
            return -1;
        }
        double tienLai = 0;
        double laiSuat = 0.008;
        if (kyHan == 0){
            tienLai = soTien * laiSuat * thoiGianGui / 360;
        } else if(kyHan == 1){
            laiSuat = 0.03;
            thoiGianGui = 30;
            tienLai = tinhKyHan(soTien, kyHan, thoiGianGui, laiSuat);
        } else if (kyHan == 3){
            laiSuat = 0.042;
            thoiGianGui = 90;
            tienLai = tinhKyHan(soTien, kyHan, thoiGianGui, laiSuat);
        } else if (kyHan == 6){
            laiSuat = 0.054;
            thoiGianGui = 180;
            tienLai = tinhKyHan(soTien, kyHan, thoiGianGui, laiSuat);
        } else {
            laiSuat = 0.066;
            thoiGianGui = 365;
            tienLai = tinhKyHan(soTien, kyHan, thoiGianGui, laiSuat);
        }
        return tienLai;
    }
}
