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
	}
	
	/*setter/getter*/
	
	/*methods*/
	@Override
	public void tinhLuong() {
		System.out.println(this.luongThang);
	}
	@Override
    public String toString() {
        return " [ " + maSo + ", " + hoTen + ", " + soDT + ", " + soNgayLamViec + "]";
    }

	
}
