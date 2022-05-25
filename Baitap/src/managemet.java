import java.util.Scanner;
public class managemet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List list = new List();
		System.out.print("nhap so phan tu danh sach: ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.print("nhap phan tu thu "+ i +" : " );
			int m=sc.nextInt();
			list.chendau(m);
		}
	   list.printList();
	   System.out.println(" ");
	   /*list.xoadau();
	   list.printList();*/
	   System.out.print("\nnhap gia tri chen cuoi vao phan tu: ");
	   int r=sc.nextInt();
	   list.chencuoi(r);
	   list.printList();
	   System.out.print("\nnhap gia tri chen sau p: ");
	   int c = sc.nextInt();
	   list.chensaup(c);
	   list.printList();
	   System.out.print("\nnhap gia tri xoa x: ");
	   int z = sc.nextInt();
	   list.xoaGiatrx(z);
	   list.printList();
	  /*System.out.print("\ntrung binh cong cua phan tu: " +list.tbc(n));*/
	}

}
