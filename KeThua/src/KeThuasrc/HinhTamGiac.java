package KeThuasrc;

public class HinhTamGiac extends Hinh {
	private double a;
	private double b;
	private double c;

	public HinhTamGiac(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	void DienTich() {
		double p = (a + b + c) / 2;
		double DT = Math.sqrt(p) * (p - a) * (p - b) * (p - c);
		System.out.println("Dien Tich Hinh Tam Giac: " + DT);
	}
	void ChuVi() {
		{
			double CV = a + b + c;
			System.out.println("Chu Vi Tam Giac: " + CV);
		}
	}
}
