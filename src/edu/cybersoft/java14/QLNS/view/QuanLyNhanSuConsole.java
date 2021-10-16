package edu.cybersoft.java14.QLNS.view;

import java.util.Scanner;

import edu.cybersoft.java14.QLNS.controller.QuanLyNhanSu;
import edu.cybersoft.java14.QLNS.model.CongTy;
import edu.cybersoft.java14.QLNS.model.GiamDoc;
import edu.cybersoft.java14.QLNS.model.NhanVien;
import edu.cybersoft.java14.QLNS.model.TruongPhong;
import edu.cybersoft.java14.QLNS.utils.MyUtils;

public class QuanLyNhanSuConsole {
	/* properties */
	private static QuanLyNhanSu quanLyNhanSuCore = new QuanLyNhanSu();
	private static Scanner scanner = new Scanner(System.in);
	/* constructors */
	
	/* getters/setters */
	
	/* methods */
	public static void test() {
		GiamDoc gd1 = new GiamDoc();
		gd1.nhapThongTinTest("GiamDoc1", "1234", 23);
		gd1.setCoPhanTest(50f);
		GiamDoc gd2 = new GiamDoc();
		gd2.nhapThongTinTest("GiamDoc2", "4444", 21);
		gd2.setCoPhanTest(3.5f);
		TruongPhong tp1 = new TruongPhong();
		tp1.nhapThongTinTest("TruongPhong B", "4321", 25);
		TruongPhong tp2 = new TruongPhong();
		tp2.nhapThongTinTest("TruongPhong A", "1234", 24);
		NhanVien nv1 = new NhanVien();
		nv1.nhapThongTinTest("Nguyen Van Z", "111", 27);
		nv1.setTruongPhong(tp1.getHoTen());
		tp1.setSoNhanVien(1);
		
		NhanVien nv2 = new NhanVien();
		nv2.nhapThongTinTest("Ly Thi B", "222", 26);
		NhanVien nv3 = new NhanVien();
		nv3.nhapThongTinTest("Phan Van X", "333", 25);
		quanLyNhanSuCore.themGiamDoc(gd1);
		quanLyNhanSuCore.themGiamDoc(gd2);
		quanLyNhanSuCore.themTruongPhong(tp1);
		quanLyNhanSuCore.themTruongPhong(tp2);
		quanLyNhanSuCore.themNhanVien(nv1);
		quanLyNhanSuCore.themNhanVien(nv2);
		quanLyNhanSuCore.themNhanVien(nv3);
		
//		themNhanSu();
//		quanLyNhanSuCore.inDanhSachNhanSu();
		
	}
	
	public static void start() {
		
		int luaChon = 0;
		do {
			inMenu();
			luaChon = Integer.parseInt(scanner.nextLine());
			MyUtils.drawLine(50);
			xuLyLuaChon(luaChon);
			scanner.nextLine();
		} while(luaChon != 0);
		System.out.println("Chương trình đã kết thúc.\nHẹn gặp lại lần sau!");
	}
	
	public static void inMenu() {
		MyUtils.drawLine(50);
		System.out.println("Chức năng:");
		System.out.println("1. Nhập thông tin công ty");
		System.out.println("2. Xuất thông tin công ty");
		System.out.println("3. Thêm nhân sự");
		System.out.println("4. Xoá nhân sự");
		System.out.println("5. In danh sách nhân sự");
		System.out.println("6. Phân bổ nhân viên vào trưởng phòng");
		System.out.println("7. Tính tổng lương");
		System.out.println("8. Nhân viên thường lương cao nhất");
		System.out.println("9. Trưởng phòng có nhiều nhân viên dưới quyền nhất");
		System.out.println("10. Sắp xếp nhân viên theo thứ tự ABC");
		System.out.println("11. Sắp xếp nhân viên theo thứ tự lương giảm dần");
		System.out.println("12. Giám đốc có số cổ phần nhiều nhất");
		System.out.println("13. Thu nhập của giám đốc");
		System.out.println("0. Thoát");
		System.out.print("Lựa chọn: ");
	}
	
	public static void xuLyLuaChon(int luaChon) {
		switch (luaChon) {
		case 0:
			System.out.println("Đang thoát chương trình.");
			break;
		case 1: // nhập thông tin công ty
			quanLyNhanSuCore.nhapThongTinCongTy(scanner);
			break;
		case 2: // xuất thông tin công ty
			quanLyNhanSuCore.xuatThongTinCongTy();
			break;
		case 3: // thêm nhân sự
			themNhanSu();
			break;
		case 4: // xóa nhân sự
			xoaNhanSu();
			break;
		case 5: // in danh sách nhân sự
			quanLyNhanSuCore.inDanhSachNhanSu();
			break;
		case 6: // Phân bổ nhân viên vào trưởng phòng
			phanBoNhanVien();
			break;
		case 7: // tinh tong luong
			double tongLuong = quanLyNhanSuCore.tinhTongLuong();
			System.out.println("Tổng lương là: " + tongLuong);
			break;
		case 8: // nhan vien luong cao nhat
			quanLyNhanSuCore.nvLuongCaoNhat();
			break;
		case 9: // truong phong co nhieu nv nhat
			quanLyNhanSuCore.tpNhieuNhanVienNhat();
			break;
		case 10: // sx nhan vien theo ABC
			quanLyNhanSuCore.sortNhanVienabc();
			break;
		case 11: // sx nhan vien theo luong giam dan
			quanLyNhanSuCore.sortNhanVienLuong();
			break;
		case 12: // gd có số cp nhiều nhất
			quanLyNhanSuCore.findMaxGD();
			break;
		case 13: // thu nhập của giám đốc
			quanLyNhanSuCore.tinhThuThapGiamDoc();
			break;
		default:
			System.out.println("Lựa chọn không hợp lệ.");
			break;
		}
		keepGoing();
	}

	private static void phanBoNhanVien() {
		// lua chon nhan vien
		System.out.println("Nhập mã nhân viên cần phân bổ:");
		String maNV = scanner.nextLine();
		NhanVien foundNV = quanLyNhanSuCore.timNhanVien(maNV);
		if (foundNV==null) {
			System.out.println("Không tìm thấy nhân viên");
			return;
		}
		// lua chon truong phong
		System.out.println("Nhập mã trưởng phòng quản lý:");
		String maTP = scanner.nextLine();
		TruongPhong foundTP = quanLyNhanSuCore.timTruongPhong(maTP);
		if (foundTP==null) {
			System.out.println("Không tìm thấy trưởng phòng");
			return;
		}
		
		foundNV.setTruongPhong(foundTP.getHoTen());
		foundTP.setSoNhanVien(foundTP.getSoNhanVien()+1);
		
		System.out.println("Phân bổ trưởng phòng thành công");
		
	}

	private static void xoaNhanSu() {
		int loaiNhanSu = 0;
		boolean isSuccess = false;
		System.out.println("Loại nhân sự cần xoá:");
		System.out.println("1. Nhân viên");
		System.out.println("2. Trưởng phòng");
		System.out.println("3. Giám đốc");
		System.out.print("Lựa chọn: ");
		loaiNhanSu = Integer.parseInt(scanner.nextLine());
		switch (loaiNhanSu) {
		case 1:
			xoaNhanVien();
			break;
		case 2:
			xoaTruongPhong();
			break;
		case 3:
			xoaGiamDoc();
			break;
		default:
			System.out.println("Lựa chọn không hợp lệ.");
			break;
		}
	}

	private static void xoaGiamDoc() {
		System.out.println("Nhập mã giám đốc");
		String maGD = scanner.nextLine();
		quanLyNhanSuCore.xoaGiamDoc(maGD);
	}

	private static void xoaTruongPhong() {
		System.out.println("Nhập mã trưởng phòng");
		String maTP = scanner.nextLine();
		quanLyNhanSuCore.xoaTruongPhong(maTP);
	}

	private static void xoaNhanVien() {
		System.out.println("Nhập mã nhân viên");
		String maNV = scanner.nextLine();
		quanLyNhanSuCore.xoaNhanVien(maNV);		
	}

	private static void keepGoing() {
		MyUtils.drawLine(30);
		System.out.println("Tiếp tục hay không?");
		System.out.println("1. Tiếp tục");
		System.out.println("2. Không");
		int selectNumber= Integer.parseInt(scanner.nextLine());
		switch (selectNumber) {
		case 1:
			MyUtils.drawLine(50);
			start();
			break;
		case 2:
			System.out.println("Chương trình đã kết thúc.\nHẹn gặp lại lần sau!");
		default:
			System.out.println("Lựa chọn không hợp lệ.");
			break;
		}
	}

	private static void themNhanSu() {
		int loaiNhanSu = 0;
		boolean isSuccess = false;
		System.out.println("Loại nhân sự cần thêm:");
		System.out.println("1. Nhân viên");
		System.out.println("2. Trưởng phòng");
		System.out.println("3. Giám đốc");
		System.out.print("Lựa chọn: ");
		loaiNhanSu = Integer.parseInt(scanner.nextLine());
		switch (loaiNhanSu) {
		case 1:
			NhanVien nv = new NhanVien();
			nv.nhapThongTin(scanner);
			isSuccess = quanLyNhanSuCore.themNhanVien(nv);
			break;
		case 2:
			TruongPhong tp = new TruongPhong();
			tp.nhapThongTin(scanner);
			isSuccess = quanLyNhanSuCore.themTruongPhong(tp);
			break;
		case 3:
			GiamDoc gd = new GiamDoc();
			gd.nhapThongTin(scanner);
			isSuccess = quanLyNhanSuCore.themGiamDoc(gd);
			break;

		default:
			System.out.println("Loại nhân sự không hợp lệ.");
			break;
		}
		if(isSuccess)
			System.out.println("Thêm nhân sự thành công.");
		else
			System.out.println("Thêm nhân sự thất bại.");
	}
	
}
