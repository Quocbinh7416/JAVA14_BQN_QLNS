package edu.cybersoft.java14.QLNS.model;
import edu.cybersoft.java14.QLNS.utils.*;
import java.util.Scanner;


public class CongTy implements NhapXuat {
	/* properties */
	private String maSoThue;
	private String ten;
	private double doanhThuThang;
	
	/* constructors */
	
	/* getters/setters */
	public double getDoanhThu() {
		return this.doanhThuThang;
	}
	
	/* methods */
	@Override
	public void nhapThongTin(Scanner scanner) {
		System.out.println("Nhập thông tin công ty:");
		System.out.print("Mã số thuế: ");
		this.maSoThue = scanner.nextLine();
		System.out.print("Tên công ty: ");
		this.ten = scanner.nextLine();
		System.out.print("Doanh thu tháng: ");
		this.doanhThuThang = Double.parseDouble(scanner.nextLine());
	}
	@Override
	public void xuatThongTin() {
		System.out.println("Thông tin công ty:");
		System.out.printf("%-16s: %s\n", "Mã số thuế", maSoThue);
		System.out.printf("%-16s: %s\n", "Tên công ty", ten);
		System.out.printf("%-16s: %.0f\n", "Doanh thu tháng", doanhThuThang);
	}
}
