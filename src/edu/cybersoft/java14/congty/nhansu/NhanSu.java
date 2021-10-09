package edu.cybersoft.java14.congty.nhansu;

/**
 *  class NhanSu chua thong tin chung cua nhan vien
 * @author Administrator
 *
 */
public class NhanSu {
	/* properties */
	protected String maSo;
	protected String hoTen;
	protected String soDT;
	protected Integer soNgayLamViec;
	protected Integer luongNgay;
	
	/* constructor */
	
	/* setter/getter */
	public String getInfo() {
		return maSo + " " + hoTen + " " + soDT + " " + soNgayLamViec;
	}
	public void setInfo(String maSo, String hoTen, String soDT, Integer soNgay) {
		this.maSo = maSo;
		this.hoTen = hoTen;
		this.soDT = soDT;
		this.soNgayLamViec = soNgay;
	}
	
	/* methods */
	public Integer tinhLuong() {
		Integer luongThang = (luongNgay*soNgayLamViec);
		return luongThang;
	}
	@Override
    public String toString() {
        return " [ " + maSo + ", " + hoTen + ", " + soDT + ", " + soNgayLamViec + "]";
    }
}
