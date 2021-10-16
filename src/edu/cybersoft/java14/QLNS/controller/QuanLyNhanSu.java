package edu.cybersoft.java14.QLNS.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import edu.cybersoft.java14.QLNS.model.CongTy;
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
		System.out.println("Nhân viên:");
		for(NhanVien nv : dsNhanVien) {			
			nv.xuatThongTin();
		}
	}
	
	public double tinhTongLuong() {
		double tongLuong = 0;
		for(int i = 0 ; i < dsNhanVien.size(); i++) {
			tongLuong += dsNhanVien.get(i).tinhLuong();
		}
		for(int i = 0 ; i < dsTruongPhong.size(); i++) {
			tongLuong += dsTruongPhong.get(i).tinhLuong();
		}
		return tongLuong;
	}

	public void nhapThongTinCongTy(Scanner scanner) {
		this.congTy.nhapThongTin(scanner);
	}

	public void xuatThongTinCongTy() {
		this.congTy.xuatThongTin();
	}

	public NhanVien timNhanVien(String maNV) {
		for (NhanVien nv : dsNhanVien) {
			if(nv.getMaSo().equals(maNV)) {
				return nv;
			}
		}
		return null;
	}

	public TruongPhong timTruongPhong(String maTP) {
		for (TruongPhong tp : dsTruongPhong) {
			if(tp.getMaSo().equals(maTP)) {
				return tp;
			}
		}
		return null;
	}
	
	public void xoaGiamDoc(String maGD) {
		// 1 check list
		boolean isExist = false;
		for (int i =dsGiamDoc.size() - 1; i >=0 ; i--) {
			if(dsGiamDoc.get(i).getMaSo().equals(maGD)) {
				dsGiamDoc.remove(i);
				isExist =true;
			}
		}
		// 2 thông báo kết quả
		if (isExist == true) {
			System.out.println("Xoá thành công !!!");
		} else {
			System.out.println("Không tìm thấy mã giám đốc");
		}
	}

	public void xoaTruongPhong(String maTP) {
		// 1 check list
		boolean isExist = false;
		String tenTPXoa = "";
		for (int i = dsTruongPhong.size() - 1; i >=0 ; i--) {
			if(dsTruongPhong.get(i).getMaSo().equals(maTP)) {
				tenTPXoa = dsTruongPhong.get(i).getHoTen();
				dsTruongPhong.remove(i);
				isExist =true;
			}
		}
		// 2 thông báo kết quả
		if (isExist == true) {
			// xoá danh sách nhân viên dưới quyền
			for (int i = dsNhanVien.size() - 1 ; i >=0 ; i--) {
				if(dsNhanVien.get(i).getTruongPhong().equals(tenTPXoa)) {
					
					dsNhanVien.get(i).setTruongPhong("-");
				}
			}
			System.out.println("Xoá thành công !!!");
		} else {
			System.out.println("Không tìm thấy mã trưởng phòng");
		}
		
	}
	

	public void xoaNhanVien(String maNV) {
		// 1 check list
		boolean isExist = false;
		String truongPhongQuanLy = "";
		for (int i = dsNhanVien.size() - 1; i >=0 ; i--) {
			if(dsNhanVien.get(i).getMaSo().equals(maNV)) {
				truongPhongQuanLy=dsNhanVien.get(i).getTruongPhong();
				dsNhanVien.remove(i);
				isExist =true;
			}
		}
		// 2 thông báo kết quả
		if (isExist == true) {
			// giảm SVN dưới quyền của QL
			for (int i = dsTruongPhong.size() - 1 ; i >=0 ; i--) {
				if(dsTruongPhong.get(i).getHoTen().equals(truongPhongQuanLy)) {
					int SVN = dsTruongPhong.get(i).getSoNhanVien() - 1;
					dsTruongPhong.get(i).setSoNhanVien(SVN);
				}
			}
			System.out.println("Xoá thành công !!!");
		} else {
			System.out.println("Không tìm thấy mã nhân viên");
		}
		
	}
	

	public void nvLuongCaoNhat() {
		float max = dsNhanVien.get(0).tinhLuong();
		String tenNV = dsNhanVien.get(0).getHoTen() ;
		for (int i =0 ; i < dsNhanVien.size(); i++) {
			if (max < dsNhanVien.get(i).tinhLuong()) {
				max = dsNhanVien.get(i).tinhLuong();
				tenNV = dsNhanVien.get(i).getHoTen();
			}
		}
		System.out.println("Nhân viên lương cao nhất là: " + tenNV);
		System.out.println("Với mức lương là :" + max);
		MyUtils.drawLine(20);
	}
	

	public void tpNhieuNhanVienNhat() {
		int max = dsTruongPhong.get(0).getSoNhanVien();
		String tenTP = dsTruongPhong.get(0).getHoTen() ;
		for (int i =0 ; i < dsTruongPhong.size(); i++) {
			if (max < dsTruongPhong.get(i).getSoNhanVien()) {
				max = dsTruongPhong.get(i).getSoNhanVien();
				tenTP = dsTruongPhong.get(i).getHoTen();
			}
		}
		System.out.println("Trưởng phòng có nhiều nhân viên nhất: " + tenTP);
		System.out.println("Với số nhân viên là :" + max);
		MyUtils.drawLine(20);
		
	}
	

	public void sortNhanVienabc() {
		List<String> dayHoTen = new ArrayList<String>();
		List<NhanVien> newDsNhanVien = new ArrayList<NhanVien>();
		
		for (int i = 0; i < dsNhanVien.size(); i++) {
			String name = dsNhanVien.get(i).getHoTen();
			dayHoTen.add(name);
		}
		dayHoTen.sort(null);
		for (int i = 0; i < dayHoTen.size(); i++) {
			for(int j = 0; j < dsNhanVien.size(); j++) {
				if(dayHoTen.get(i).equals(dsNhanVien.get(j).getHoTen())) {
					NhanVien nv = dsNhanVien.get(j);				
					newDsNhanVien.add(nv);
					dsNhanVien.remove(j);
				}
			}
		}
		for (int i = 0; i < newDsNhanVien.size(); i++) {
			NhanVien nv = newDsNhanVien.get(i);
			dsNhanVien.add(nv);
		}
	}
	

	public void sortNhanVienLuong() {
		List<Float> dayLuong = new ArrayList<Float>();
		List<NhanVien> newDsNhanVien = new ArrayList<NhanVien>();
		
		for (int i = 0; i < dsNhanVien.size(); i++) {
			Float luong = dsNhanVien.get(i).tinhLuong();
			dayLuong.add(luong);
		}
		dayLuong.sort(Collections.reverseOrder());
		for (int i = 0; i < dayLuong.size(); i++) {
			for(int j = 0; j < dsNhanVien.size(); j++) {
				if(dayLuong.get(i) == dsNhanVien.get(j).tinhLuong()) {
					NhanVien nv = dsNhanVien.get(j);				
					newDsNhanVien.add(nv);
					dsNhanVien.remove(j);
				}
			}
		}
		for (int i = 0; i < newDsNhanVien.size(); i++) {
			NhanVien nv = newDsNhanVien.get(i);
			dsNhanVien.add(nv);
		}
		
	}
	

	public void findMaxGD() {
		String name = dsGiamDoc.get(0).getName();
		Float maxCp = dsGiamDoc.get(0).getSoCP();
		for (int i = 0 ; i < dsGiamDoc.size(); i++) {
			if (maxCp < dsGiamDoc.get(i).getSoCP()) {
				maxCp = dsGiamDoc.get(i).getSoCP();
				name = dsGiamDoc.get(i).getName();
			}
		}
		System.out.println("Giám đốc có số cổ phần nhiều nhất là: " + name);
		System.out.println("Với số CP là: " + maxCp);
	}

	public void tinhThuThapGiamDoc() {
		// lợi nhuận công ty
		double doanhThu = congTy.getDoanhThu();
		double tongLuong = this.tinhTongLuong();
		double loiNhuan = doanhThu - tongLuong;
		System.out.println(loiNhuan);
		float luongThang;
		for (int i = 0 ; i < dsGiamDoc.size(); i++) {
			GiamDoc gd = dsGiamDoc.get(i);
			System.out.println("Giám đốc: " + gd.getName());
			luongThang = (float) (gd.tinhLuong() + loiNhuan * gd.getSoCP() / 100f);
			System.out.println("Thu nhập là: " + luongThang);
			MyUtils.drawLine(20);
		}
	}
	
}
