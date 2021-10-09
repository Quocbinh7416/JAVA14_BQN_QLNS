package edu.cybersoft.java14.congty;

import java.util.Scanner;
import java.util.ArrayList;
import edu.cybersoft.java14.congty.nhansu.NhanVien;

public class MainMenu {
	/* nhap thong tin nhan vien */
	public static NhanVien nhapNhanVien() {	
		// scanner
		// nhanVien - maSo/hoTen/soDT/soNgay
		
		Scanner sc = new Scanner(System.in);
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
	/* main */
	public static void main(String[] args) {
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
		
		/* cau 3 nhập nhân sự */
		ArrayList<NhanVien> listNhanVien =  new ArrayList<NhanVien>();
		
		NhanVien newNhanVien = nhapNhanVien();
		// tao array ao
		NhanVien nv1 = new NhanVien("A01", "Tèo", "07899988844", 28);
		NhanVien nv2 = new NhanVien("A02", "Tí", "01234568797", 26);
		listNhanVien.add(nv1);
		listNhanVien.add(nv2);
		
		/* add nhan vien vao chuoi */ 
		listNhanVien.add(newNhanVien);
		
		// show nhan vien
		for (NhanVien i : listNhanVien) {
			System.out.print("Nhân viên thứ " + listNhanVien.indexOf(i) + 1);
			System.out.println(i.toString());
		}
		// 
	}
}
