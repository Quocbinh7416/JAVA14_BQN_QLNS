package edu.cybersoft.java14.QLNS.model;

import edu.cybersoft.java14.QLNS.utils.MyUtils;

public class NhanVien extends NhanSu {
	/* properties */
	private String truongPhong;
	private static int STT = 1;
	
	/* constructors */
	public NhanVien() {
		maSo = "NV" + STT++;
		truongPhong = "";
		this.luongMotNgay=100f;
	}
	/* getters/setters */
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
		MyUtils.drawLine(10);
		System.out.printf("%s %s:\n","Thông tin", getChucVu());
		System.out.printf("%-16s: %s\n","Mã số", this.maSo);
		System.out.printf("%-16s: %s\n", "Họ tên", this.hoTen);
		System.out.printf("%-16s: %s\n", "Số điện thoại", this.soDienThoai);
		System.out.printf("%-16s: %.2f\n", "Số ngày làm", this.soNgayLam);
		System.out.printf("%-16s: %.2f\n", "Lương một ngày", this.luongMotNgay);
		System.out.printf("%-16s: %.2f\n", "Lương tháng", this.tinhLuong());
		System.out.printf("%-16s: %s\n", "TP quản lý", this.truongPhong);
	}
}
