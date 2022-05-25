package Cau2;

public class Node {
	 public int sn1;
	 public int sn2;
	  public Node next;
	  public Node(int sn1, int sn2) {
		 this.sn1=sn1;
		 this.sn2=sn2;
	 }
	  public void printNode() {
		  System.out.print(sn1 +"  , "+ sn2 + "\t  ");
	 }
}