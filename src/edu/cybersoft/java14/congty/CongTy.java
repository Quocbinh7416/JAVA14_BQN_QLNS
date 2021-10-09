package edu.cybersoft.java14.congty;
/**
 * Class CongTy
 * @author Administrator
 * @date October 09th, 2021
 * 
 */

public class CongTy {
	/* properties */
	private String tenCongTy;
	private String maSoThue;
	private Float doanhThuThang;
	
	/* constructor */
	public CongTy() {
		tenCongTy = "ABC";
		maSoThue = "123";
		doanhThuThang= 0f;
	}
	
	/* getter/setter */
	public String getCompanyInfo() {
		return tenCongTy + " " +maSoThue+ " " + doanhThuThang;
	}
	public void setDoanhThu(Float doanhThu) {
		this.doanhThuThang=doanhThu;
	}
	public void setCompanyInfo(String tenCT, String maSoThue) {
		this.tenCongTy=tenCT;
		this.maSoThue = maSoThue;
	}
	/* methods */
}
