package edu.cybersoft.java14.QLNS.model;

public class NhanVien extends NhanSu {
	/* properties */
	private TruongPhong truongPhong;

	/* constructors */
	
	/* getters/setters */
	
	/* methods */
	@Override
	protected String getChucVu() {
		return "nhân viên";
	}
}
