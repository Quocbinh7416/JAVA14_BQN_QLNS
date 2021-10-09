package edu.cybersoft.java14.congty.nhansu;

/**
 * class NhanVien 
 * @author Administrator
 *
 */

public class TruongPhong extends NhanSu {
	/*properties*/
	protected String truongPhongQL;
	protected Integer soNhanVienDuoiQuyen;
	
	
	/*constructor*/
	public TruongPhong(String maSo, String hoTen, String soDT, Integer soNgay) {
		this.maSo = maSo;
		this.hoTen = hoTen;
		this.soDT = soDT;
		this.soNgayLamViec = soNgay;
		luongNgay = 200f;
	}
	
	/*setter/getter*/
	
	/*methods*/
	@Override
	public void tinhLuong() {
		this.luongThang = luongNgay*soNgayLamViec+100*soNhanVienDuoiQuyen;
		System.out.println(this.luongThang);
	}

	
}
