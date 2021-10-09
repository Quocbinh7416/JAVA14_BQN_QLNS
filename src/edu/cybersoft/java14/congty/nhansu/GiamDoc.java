package edu.cybersoft.java14.congty.nhansu;

/**
 * class GiamDoc 
 * @author Administrator
 *
 */

public class GiamDoc extends NhanSu {
	/*properties*/
	protected Integer coPhanCongTy;
	
	
	/*constructor*/
	public GiamDoc(String maSo, String hoTen, String soDT, Integer soNgay,Integer coPhan ) {
		this.maSo = maSo;
		this.hoTen = hoTen;
		this.soDT = soDT;
		this.soNgayLamViec = soNgay;
		this.coPhanCongTy=coPhan;
		luongNgay = 300;
	}
	
	/*setter/getter*/
	
	/*methods*/
	@Override
	public Integer tinhLuong() {
		Integer luongThang = luongNgay*soNgayLamViec;
		return luongThang;
	}
	
}