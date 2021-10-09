package edu.cybersoft.java14.congty;

import java.util.Scanner;
import java.util.ArrayList;

import edu.cybersoft.java14.congty.nhansu.*;


public class MainMenu {

	/* main */
	public static void main(String[] args) {
		// scanner
		Scanner sc = new Scanner(System.in);
		
		/* cau 1 nhập nhân sự */
		NhapThongTin.nhapCongTy();
		
		/* cau 3 nhập nhân sự */
		ArrayList<NhanVien> listNhanVien =  new ArrayList<NhanVien>();
		ArrayList<TruongPhong> listTruongPhong =  new ArrayList<TruongPhong>();
		ArrayList<GiamDoc> listGiamDoc =  new ArrayList<GiamDoc>();
		
		// tao array ao
		NhanVien nv1 = new NhanVien("A01", "Tèo", "07899988844", 28);
		NhanVien nv2 = new NhanVien("A02", "Tí", "01234568797", 26);
		TruongPhong tp1 = new TruongPhong("B01", "TP A", "12345", 26);
		GiamDoc gd1 = new GiamDoc("C01", "GD1", "8797", 26 , 3);
		// tạo liên kết nhân viên với trưởng phòng
		nv1.setTruongPhong(tp1.getHoTen());
		nv2.setTruongPhong(tp1.getHoTen());
		tp1.setNhanVien(nv1);
		tp1.setNhanVien(nv2);
		
		listNhanVien.add(nv1);
		listNhanVien.add(nv2);
		listTruongPhong.add(tp1);
		listGiamDoc.add(gd1);
		
		/* add nhan su vao chuoi */ 
		boolean tiepTuc = true;

		while(tiepTuc) {
			System.out.println("Nhập nhân sự mới ?? true/false");
			tiepTuc = sc.nextBoolean();
			if(!tiepTuc) {
				return;
			}
			System.out.println("Nhập loại nhân sự 1 - nhân viên/2 - trưởng phòng/3-giám đốc");
			Byte type =sc.nextByte();
			switch (type) {
			case 1: {
				NhanVien newNhanVien = NhapThongTin.nhapNhanVien();
				listNhanVien.add(newNhanVien);
				break;
			}
			case 2: {
				TruongPhong newNhanVien = NhapThongTin.nhapTruongPhong();
				listTruongPhong.add(newNhanVien);
				break;
			}
			case 3: {
				GiamDoc newNhanVien = NhapThongTin.nhapGiamDoc();
				listGiamDoc.add(newNhanVien);
				break;
			}

			default:
				break;
			}
			
			System.out.println("Tiếp tục nhập hay không? (true - có)/(false - không)");
			tiepTuc = sc.nextBoolean();
		}
		
		
		// show danh sach nhan su
		for (NhanVien i : listNhanVien) {
			int thuTu = listNhanVien.indexOf(i) + 1;
			System.out.print("Nhân viên thứ " + thuTu);
			System.out.println(i.toString());
		}
		for (TruongPhong i : listTruongPhong) {
			int thuTu = listTruongPhong.indexOf(i) + 1;
			System.out.print("Nhân viên thứ " + thuTu);
			System.out.println(i.toString());
		}
		for (GiamDoc i : listGiamDoc) {
			int thuTu = listGiamDoc.indexOf(i) + 1;
			System.out.print("Nhân viên thứ " + thuTu);
			System.out.println(i.toString());
		}
		// tinh doanh thu
		Integer tongLuongNV = 0;
		for (NhanVien i : listNhanVien) {
			tongLuongNV += i.tinhLuong();
		}
		Integer tongLuongTP = 0;
		for (TruongPhong i : listTruongPhong) {
			tongLuongTP += i.tinhLuong();
		}
		Integer tongLuongGD = 0;
		for (GiamDoc i : listGiamDoc) {
			tongLuongGD += i.tinhLuong();
		}
		Integer tongLuong = tongLuongNV + tongLuongTP + tongLuongGD;
		System.out.println("Tổng lương toàn công ty là "+tongLuong);
	}
}
