package edu.cybersoft.java14.QLNS.view;

import java.util.Scanner;

import edu.cybersoft.java14.QLNS.controller.QuanLyNhanSu;
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
		themNhanSu();
		quanLyNhanSuCore.inDanhSachNhanSu();
		
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
		System.out.println("6. ");
		System.out.println("7. ");
		System.out.println("8. ");
		System.out.println("9. ");
		System.out.println("10. ");
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
			keepGoing();
			break;
		case 2: // xuất thông tin công ty
			quanLyNhanSuCore.xuatThongTinCongTy();
			keepGoing();
			break;
		case 3: // thêm nhân sự
			themNhanSu();
			keepGoing();
			break;
		case 4: // xóa nhân sự
			xoaNhanSu();
			keepGoing();
			break;
		case 5: // in danh sách nhân sự
			quanLyNhanSuCore.inDanhSachNhanSu();
			keepGoing();
			break;
		case 6:
			
			break;
		case 7:
			
			break;
		case 8:
			
			break;
		case 9:
			
			break;
		case 10:
			
			break;
		default:
			System.out.println("Lựa chọn không hợp lệ.");
			break;
		}
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
		
	}

	private static void keepGoing() {
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
