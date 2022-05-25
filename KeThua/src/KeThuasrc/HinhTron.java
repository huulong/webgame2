package KeThuasrc;

public class HinhTron extends Hinh {
		protected double r;

		public void Hinhtron(double r) {
			this.r = r;

		}
		void DienTich() {
			double dt = r * r * 3.14;
			System.out.println("dien tich la : " + dt);
		}
		void ChuVi() {
			double cv = r * 2 * 3.14;
			System.out.println("chu vi la :" + cv);
		}

	}
