package KeThuasrc;

public class Management {
	public static void main(String args) {
		Hinh Ht = new HinhTron();
		Ht.ChuVi();
		Ht.DienTich();
		Hinh TG = new HinhTamGiac(3, 7, 9);
		TG.ChuVi();
		TG.DienTich();
	}
}
