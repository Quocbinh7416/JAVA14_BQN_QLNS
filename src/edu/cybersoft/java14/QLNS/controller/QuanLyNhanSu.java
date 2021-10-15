package edu.cybersoft.java14.QLNS.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edu.cybersoft.java14.QLNS.model.CongTy;
import edu.cybersoft.java14.QLNS.model.NhanSu;

public class QuanLyNhanSu {
	/* properties */
	private List<NhanSu> dsNhanSu;
	private CongTy congTy;
	
	/* constructors */
	public QuanLyNhanSu() {
		dsNhanSu = new ArrayList<NhanSu>();
		congTy = new CongTy();
	}
	
	/* getters/setters */
	
	/* methods */
	public boolean themNhanSu(NhanSu ns) {
		// 1. check null
		if(ns == null)
			return false;

		// 2. check duplicated
		for(NhanSu nhanSu : dsNhanSu)
			if(nhanSu.getMaSo().equals(ns.getMaSo()))
				return false;
		
		// 3. add
		return dsNhanSu.add(ns);
	}
	
	public boolean xoaNhanSu(String maSo) {
		/*
		 * TODO: xoa nhan su
		 */
		return false;
	}
	
	public void inDanhSachNhanSu() {
		System.out.println("Danh sách nhân sự:");
		for(NhanSu ns : dsNhanSu)
			ns.xuatThongTin();
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
