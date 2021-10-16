package edu.cybersoft.java14.QLNS.model;

public class TruongPhong extends NhanSu {
	/* properties */
	private int soNhanVien ;
	private static int STT = 1;
	
	/* constructors */
	public TruongPhong() {
		maSo = "TP" + STT++;
		this.soNhanVien = 0;
		this.luongMotNgay=200f;
	}
	
	/* getters/setters */
	public String getHoTen() {
		return this.hoTen;
	}
	
	public Integer getSoNhanVien() {
		return this.soNhanVien;
	}
	
	public void setSoNhanVien(int _soNhanVien) {
		this.soNhanVien = _soNhanVien;
	}
	
	/* methods */
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
	
	@Override
	protected String getChucVu() {
		return "trưởng phòng";
	}
	@Override
	public void xuatThongTin(){
		super.xuatThongTin();
		System.out.printf("%-16s: %.2f\n", "Lương tháng", this.tinhLuong());
		System.out.printf("%-16s: %s\n", "Số NV dưới quyền", this.soNhanVien);
	}
	@Override
	public float tinhLuong() {
		return soNgayLam * luongMotNgay + 100*soNhanVien;
	}
}
