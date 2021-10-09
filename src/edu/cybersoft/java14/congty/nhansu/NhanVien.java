package edu.cybersoft.java14.congty.nhansu;

/**
 * class NhanVien 
 * @author Administrator
 *
 */

public class NhanVien extends NhanSu {
	/*properties*/
	protected String truongPhongQL;
	
	/*constructor*/
	public NhanVien(String maSo, String hoTen, String soDT, Integer soNgay) {
		this.maSo = maSo;
		this.hoTen = hoTen;
		this.soDT = soDT;
		this.soNgayLamViec = soNgay;
		this.luongNgay=100;
	}
	
	/*setter/getter*/
	public void setTruongPhong(String truongPhong) {
		this.truongPhongQL = truongPhong;
	}
	/*methods*/
	
	@Override
    public String toString() {
        return " [ " + maSo + ", " + hoTen + ", " + soDT + ", " + soNgayLamViec + ", " + truongPhongQL + "]";
    }

	
}
