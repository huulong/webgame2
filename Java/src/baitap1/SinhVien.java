package baitap1;

import java.util.Scanner;

public class SinhVien {
	private int maSV, namSinh;
	private String hoTen;
	private float diemTB;

	public SinhVien() {

	}
	public SinhVien(int masv) {
		this.maSV = masv;
	}

	public SinhVien(int maSV, int namSinh, String hoTen, float diemTB) {
		super();
		this.maSV = maSV;
		this.namSinh = namSinh;
		this.hoTen = hoTen;
		this.diemTB = diemTB;
	}

	public int getMaSV() {
		return maSV;
	}

	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public float getDiemTB() {
		return diemTB;
	}

	public void setDiemTB(float diemTB) {
		this.diemTB = diemTB;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap thong tin sinh vien");
		System.out.print("Nhap ma sinh vien: ");
		this.maSV = sc.nextInt();
		System.out.print("Nhap ho ten: ");
		this.hoTen = sc.next();
		System.out.print("Nhap nam sinh: ");
		this.namSinh = sc.nextInt();
		System.out.print("Nhap diem trung binh: ");
		this.diemTB = sc.nextFloat();
	}

	public void hienThi() {
		System.out.println("Ma sinh vien: " + maSV);
		System.out.println("Ho ten: " + hoTen);
		System.out.println("Nam sinh: " + namSinh);
		System.out.println("Diem trung binh: " + diemTB);
	}
}
