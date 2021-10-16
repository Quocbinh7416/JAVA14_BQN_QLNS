package edu.cybersoft.java14.QLNS.model;

public class GiamDoc extends NhanSu {
	/* properties */
	private float soCoPhan;
	private static int STT = 1;
	
	/* constructors */
	public GiamDoc() {
		maSo = "GD" + STT++;
		this.luongMotNgay=300f;
	}
	
	/* getters/setters */
	
	/* methods */
	@Override
	protected String getChucVu() {
		return "giám đốc";
	}
}
