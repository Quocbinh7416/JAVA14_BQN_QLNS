package edu.cybersoft.java14.QLNS.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edu.cybersoft.java14.QLNS.model.CongTy;
import edu.cybersoft.java14.QLNS.model.NhanSu;
import edu.cybersoft.java14.QLNS.model.NhanVien;
import edu.cybersoft.java14.QLNS.model.TruongPhong;
import edu.cybersoft.java14.QLNS.utils.MyUtils;
import edu.cybersoft.java14.QLNS.model.GiamDoc;

public class QuanLyNhanSu {
	/* properties */
	private List<NhanVien> dsNhanVien;
	private List<TruongPhong> dsTruongPhong;
	private List<GiamDoc> dsGiamDoc;
	private CongTy congTy;
	
	/* constructors */
	public QuanLyNhanSu() {
		dsNhanVien = new ArrayList<NhanVien>();
		dsTruongPhong = new ArrayList<TruongPhong>();
		dsGiamDoc = new ArrayList<GiamDoc>();
		congTy = new CongTy();
	}
	
	/* getters/setters */
	
	/* methods */
	public boolean themNhanVien(NhanVien nv) {
		// 1. check null
		if(nv == null)
			return false;

		// 2. check duplicated
		for(NhanVien nhanVien : dsNhanVien)
			if(nhanVien.getMaSo().equals(nv.getMaSo()))
				return false;
		
		// 3. add
		return dsNhanVien.add(nv);
	}
	
	public boolean themTruongPhong(TruongPhong tp) {
		// 1. check null
		if(tp == null)
			return false;

		// 2. check duplicated
		for(TruongPhong truongPhong : dsTruongPhong)
			if(truongPhong.getMaSo().equals(tp.getMaSo()))
				return false;
		
		// 3. add
		return dsTruongPhong.add(tp);
	}
	
	public boolean themGiamDoc(GiamDoc gd) {
		// 1. check null
		if(gd == null)
			return false;

		// 2. check duplicated
		for(GiamDoc giamDoc : dsGiamDoc)
			if(giamDoc.getMaSo().equals(gd.getMaSo()))
				return false;
		
		// 3. add
		return dsGiamDoc.add(gd);
	}
	
	public boolean xoaNhanSu(String maSo) {
		/*
		 * TODO: xoa nhan su
		 */
		return false;
	}
	
	public void inDanhSachNhanSu() {
		System.out.println("Danh sách nhân sự:");
		MyUtils.drawLine(20);
		System.out.println("Giám đốc:");
		for(GiamDoc gd : dsGiamDoc) {			
			gd.xuatThongTin();
		}
		MyUtils.drawLine(20);
		System.out.println("Trưởng phòng:");
		for(TruongPhong tp : dsTruongPhong) {			
			tp.xuatThongTin();
		}
		MyUtils.drawLine(20);
		System.out.println("Danh sách nhân sự:");
		for(NhanVien nv : dsNhanVien) {			
			nv.xuatThongTin();
		}
	}
	
	public double tinhTongLuong() {
		/*
		 * TODO: tinh tong luong cho toan bo nhan su
		 */
		return 0;
	}

	public void nhapThongTinCongTy(Scanner scanner) {
		this.congTy.nhapThongTin(scanner);
	}

	public void xuatThongTinCongTy() {
		this.congTy.xuatThongTin();
	}
}
