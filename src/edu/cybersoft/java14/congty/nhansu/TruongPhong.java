package edu.cybersoft.java14.congty.nhansu;

import java.util.ArrayList;

/**
 * class TruongPhong 
 * @author Administrator
 *
 */

public class TruongPhong extends NhanSu {
	/*properties*/
	protected Integer soNVDuoiQuyen;
	ArrayList<NhanVien> dSNVDuoiQuyen =new ArrayList<NhanVien>();
	
	
	/*constructor*/
	public TruongPhong(String maSo, String hoTen, String soDT, Integer soNgay) {
		this.maSo = maSo;
		this.hoTen = hoTen;
		this.soDT = soDT;
		this.soNgayLamViec = soNgay;
		luongNgay = 200;
	}
	
	/*setter/getter*/
	public String getHoTen() {
		return hoTen;
	}
	public void setNhanVien(NhanVien nv) {
		this.dSNVDuoiQuyen.add(nv);
	}
	public void getDanhSach() {
		System.out.println(dSNVDuoiQuyen);
	}
	/*methods*/
	@Override
	public Integer tinhLuong() {
		if(dSNVDuoiQuyen == null) {
			soNVDuoiQuyen = 0;
		} else {
			soNVDuoiQuyen = dSNVDuoiQuyen.size();
		}
		
		Integer luongThang = luongNgay*soNgayLamViec+100*soNVDuoiQuyen;
		return luongThang;
	}
	
}
