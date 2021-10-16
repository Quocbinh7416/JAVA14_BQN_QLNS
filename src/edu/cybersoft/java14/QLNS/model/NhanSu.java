package edu.cybersoft.java14.QLNS.model;

import java.util.Scanner;

import edu.cybersoft.java14.QLNS.utils.MyUtils;

public abstract class NhanSu {
	/* properties */
	protected String maSo;
	protected String hoTen;
	protected String soDienThoai;
	protected float soNgayLam;
	protected float luongMotNgay;
	private static int STT = 1;
	
	/* constructors */
	public NhanSu() {
		maSo = "NS" + STT++;
	}
	
	/* getters/setters */
	public String getMaSo() {
		return this.maSo;
	}
	
	/* methods */
	public void nhapThongTin(Scanner scanner) {
		MyUtils.drawLine(20);
		System.out.printf("Nhập thông tin %s:\n", getChucVu());
		System.out.print("Họ tên: ");
		this.hoTen = scanner.nextLine();
		System.out.print("Số điện thoại: ");
		this.soDienThoai = scanner.nextLine();
		System.out.print("Số ngày làm: ");
		this.soNgayLam = Float.parseFloat(scanner.nextLine());
		System.out.print("Lương một ngày: ");
		this.luongMotNgay = Float.parseFloat(scanner.nextLine());
	}
	
	abstract protected String getChucVu();

	public void xuatThongTin() {
		MyUtils.drawLine(10);
		System.out.printf("%s %s:\n","Thông tin", getChucVu());
		System.out.printf("%-16s: %s\n","Mã số", this.maSo);
		System.out.printf("%-16s: %s\n", "Họ tên", this.hoTen);
		System.out.printf("%-16s: %s\n", "Số điện thoại", this.soDienThoai);
		System.out.printf("%-16s: %.2f\n", "Số ngày làm", this.soNgayLam);
		System.out.printf("%-16s: %.2f\n", "Lương một ngày", this.luongMotNgay);
		System.out.printf("%-16s: %.2f\n", "Lương tháng", this.tinhLuong());
	}
	/**
	 * Tính lương cơ bản của nhân sự.
	 * Lương cơ bản: số ngày làm x lương một ngày
	 * @return lương cơ bản
	 */
	public float tinhLuong() {
		return soNgayLam * luongMotNgay;
	}
}
