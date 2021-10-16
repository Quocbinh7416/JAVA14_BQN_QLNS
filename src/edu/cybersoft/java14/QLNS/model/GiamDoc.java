package edu.cybersoft.java14.QLNS.model;

import java.util.Scanner;

public class GiamDoc extends NhanSu {
	/* properties */
	private float soCoPhan;
	private float thuNhap;
	private static int STT = 1;
	
	/* constructors */
	public GiamDoc() {
		maSo = "GD" + STT++;
		this.luongMotNgay=300f;
	}
	
	/* getters/setters */
	public String getName() {
		return this.hoTen;
	}
	
	public Float getSoCP() {
		return this.soCoPhan;
	}
	
	public Float getThuNhap() {
		return this.thuNhap;
	}
	
	public void setCoPhanTest(Float _soCP) {
		if(_soCP < 0 || _soCP >100) {
			System.out.println("Số cổ phần từ 0 - 100");
			return;
		}
		this.soCoPhan= _soCP;
	}
	
	public void setThuNhap(Float _thuNhap) {
		this.thuNhap = _thuNhap;
	}
	/* methods */
	@Override
	protected String getChucVu() {
		return "giám đốc";
	}
	@Override
	public void nhapThongTin(Scanner scanner) {
		super.nhapThongTin(scanner);
		System.out.print("Số cổ phần: ");
		this.soCoPhan = Float.parseFloat(scanner.nextLine());
	}
	@Override
	public void xuatThongTin() {
		super.xuatThongTin();
		System.out.printf("%-16s: %.2f\n", "Số cổ phần", this.soCoPhan);
	}
}
