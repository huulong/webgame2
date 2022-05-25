package baitap1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Management {
	public static void main(String[] args) {
		int kt = 0;
		Scanner sc = new Scanner(System.in);
		
		DanhSachSinhVien dssv = new DanhSachSinhVien();
		do {
			SinhVien sv = new SinhVien();
			try {
				sv.nhap();
				
				System.out.print("Ban co muon nhap tiep khong? (Bam 0 de thoat)");
				kt = sc.nextInt();
				System.out.println("");
			}
			catch (InputMismatchException e) {
				System.out.println(e.getMessage());
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			dssv.themSinhVien(sv);
		} while(kt != 0);
		
		dssv.inSinhVien();
		dssv.demSoSinhVien();
		
		System.out.print("Nhap ma sinh vien ban muon tim kiem: ");
		int masv = sc.nextInt();
		SinhVien sv = new SinhVien(masv);
		System.out.println("Kiem tra sinh vien co trong danh sach: " + dssv.kiemTraSinhVienTonTai(masv));;
	}
}
