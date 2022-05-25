package baitap1;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachSinhVien {
	private ArrayList<SinhVien> danhSach;
	
	public DanhSachSinhVien() {
		danhSach = new ArrayList<>();
	}
	
	public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
		this.danhSach = danhSach;
	}
	
	public void themSinhVien(SinhVien sv) {
		danhSach.add(sv);
	}
	
	public void xoaSinhVien(SinhVien sv) {
		danhSach.removeAll(danhSach);
	}
	
	public void inSinhVien() {
		for(SinhVien sv : danhSach) {
			System.out.println("------------------------------------");
			sv.hienThi();
		}
	}
	
	public void demSoSinhVien() {
		System.out.println("");
		System.out.println("Hien danh sach co " + danhSach.size() + " sinh vien");
	}
	
	public boolean kiemTraSinhVienTonTai(int maSV) {
		for ( SinhVien sv : danhSach) {
			if(sv.getMaSV() == maSV ) {
				return true;
			}
		}
		return false;
	}
	
	public boolean kiemTraDanhSachRong() {
		return danhSach.isEmpty();
	}
	
}
