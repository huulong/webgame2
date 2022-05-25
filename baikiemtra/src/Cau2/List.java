package Cau2;
import java.util.Scanner;
public class List {
    private Node First;
    public List() {
    	First=null;
    }
  public void printList() {
	  Node p = First;
	  System.out.print("gia tri cac phan tu cua sn1,sn2: ");
	  while(p!=null) {
		  p.printNode();
		  p=p.next;
	    }
  }
  public void chendau(int k, int k2) {
	  Node nut =new Node(k, k2);
	  nut.next=First;
	  First=nut;
  }
  public void snbangnhau() {
	  Node p=First;
	  System.out.print("\ncac gia tri cua phan tu co 2 sn bang nhau: ");
	  while(p!=null) {
		  if(p.sn1==p.sn2) {
			  p.printNode();
		  }
	    p=p.next;
	  }
  }
  public boolean IsEmpty() {
	   return false;
  }
  public void xoadau() {
	   if(!IsEmpty()) {
	   Node t = First;
	   First=First.next;
	   t.next=null;
	   t=null;
    }
  else System.out.print("Ds rong: ");
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List list = new List();
		System.out.print("nhap so phan tu danh sach: ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.print("nhap phan tu thu "+ i +" : " );
			int m=sc.nextInt();
			list.chendau(i, m);
	   }
       list.printList();
       System.out.println(" ");
       list.xoadau();
	   list.printList();
	   list.snbangnhau();
  }
}
