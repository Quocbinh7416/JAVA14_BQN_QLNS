package edu.cybersoft.java14.QLNS.model;

public class TruongPhong extends NhanSu {
	/* properties */
	private int soNhanVien;
	
	/* constructors */
	
	/* getters/setters */
	
	/* methods */
	@Override
	protected String getChucVu() {
		return "trưởng phòng";
	}
	
	public boolean themNhanVien(NhanVien nv) {
		/*
		 * TODO: them nhan vien
		 */
		return false;
	}
	
	public boolean xoaNhanVien(String maSo) {
		/*
		 * TODO: xoa nhan vien
		 */
		return false;
	}
}
