package edu.cybersoft.java14.QLNS.model;

import edu.cybersoft.java14.QLNS.utils.MyUtils;

public class NhanVien extends NhanSu {
	/* properties */
	private String truongPhong;
	private static int STT = 1;
	
	/* constructors */
	public NhanVien() {
		maSo = "NV" + STT++;
		truongPhong = "-";
		this.luongMotNgay=100f;
	}
	/* getters/setters */
	public String getHoTen() {
		return this.hoTen;
	}
	
	public String getTruongPhong () {
		return this.truongPhong;
	}
	
	public void setTruongPhong(String _hoTen) {
		this.truongPhong = _hoTen;
	}
	/* methods */
	
	@Override
	protected String getChucVu() {
		return "nhân viên";
	}
	@Override
	public void xuatThongTin(){
		super.xuatThongTin();
		System.out.printf("%-16s: %.2f\n", "Lương tháng", this.tinhLuong());
		System.out.printf("%-16s: %s\n", "TP quản lý", this.truongPhong);
	}
}
