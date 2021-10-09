package edu.cybersoft.java14.congty;

import java.util.Scanner;

import edu.cybersoft.java14.congty.nhansu.GiamDoc;
import edu.cybersoft.java14.congty.nhansu.NhanVien;
import edu.cybersoft.java14.congty.nhansu.TruongPhong;

public class NhapThongTin {
	public static void nhapCongTy() {
		// scanner
		Scanner sc = new Scanner(System.in);
		/* instance*/
		CongTy cTy = new CongTy();
	
		System.out.println("Nhập tên công ty");
		String tenCty = sc.next();
		System.out.println("Nhập mã số thuế công ty");
		String maSoThue = sc.next();
		
		cTy.setCompanyInfo(tenCty, maSoThue);
		String info = cTy.getCompanyInfo();
		
		System.out.println(info);
	}
	/* nhap thong tin nhan vien */
	public static NhanVien nhapNhanVien() {	
		// scanner
		Scanner sc = new Scanner(System.in);
		
		// nhanVien - maSo/hoTen/soDT/soNgay
		System.out.println("Nhập mã số nhân viên");
		String maSo = sc.next();
		System.out.println("Nhập tên nhân viên");
		String hoTen = sc.next();
		System.out.println("Nhập số điện thoại");
		String soDT = sc.next();
		System.out.println("Nhập số ngày làm");
		Integer soNgay = sc.nextInt();
		
		/* instance*/
		NhanVien nv = new NhanVien(maSo, hoTen, soDT, soNgay);
		return nv;
	}
	
	public static TruongPhong nhapTruongPhong() {	
		// scanner
		Scanner sc = new Scanner(System.in);
		
		// nhanVien - maSo/hoTen/soDT/soNgay
		System.out.println("Nhập mã số nhân viên");
		String maSo = sc.next();
		System.out.println("Nhập tên nhân viên");
		String hoTen = sc.next();
		System.out.println("Nhập số điện thoại");
		String soDT = sc.next();
		System.out.println("Nhập số ngày làm");
		Integer soNgay = sc.nextInt();
		
		/* instance*/
		TruongPhong tp = new TruongPhong(maSo, hoTen, soDT, soNgay);
		return tp;
	}
	
	public static GiamDoc nhapGiamDoc() {	
		// scanner
		Scanner sc = new Scanner(System.in);
		
		// nhanVien - maSo/hoTen/soDT/soNgay
		System.out.println("Nhập mã số nhân viên");
		String maSo = sc.next();
		System.out.println("Nhập tên nhân viên");
		String hoTen = sc.next();
		System.out.println("Nhập số điện thoại");
		String soDT = sc.next();
		System.out.println("Nhập số ngày làm");
		Integer soNgay = sc.nextInt();
		System.out.println("Nhập số cổ phần");
		Integer coPhan = sc.nextInt();
		
		/* instance*/
		GiamDoc gd = new GiamDoc(maSo, hoTen, soDT, soNgay, coPhan);
		return gd;
	}
}
