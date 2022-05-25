import java.util.Scanner;
public class List {
 
    private Node First;
    public List() {
    	First=null;
    }
  public void printList() {
	  Node p = First;
	  System.out.print("gia tri cac phan tu: ");
	  while(p!=null) {
		  p.printNode();
		  p=p.next;
	    }
   }
   public void chencuoi(int r) {
	   Node t=First;
	   Node p=t;
	   while(t!=null) {
		   p=t;
		   t=t.next;
   }   
       Node q= new Node(r);
          p.next=q;
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
  public void chendau(int k) {
	  Node nut =new Node(k);
	  nut.next=First;
	  First=nut;
  }
  public void xoaNutnpsauq(Node p,Node q) {
	 q.next=p.next;
	 p.next=null;
	 p=null;
  }
  public void chensaup(int v) {
	 Node p=First;
	 Node q= new Node(v);
	 q.next=p.next;
	 p.next=q;
  }
 /* public void ptule() {
	 Node p = First;
	 System.out.print("\nCac phan tu co gia tri le: ");
	 while(p!=null) {
		 if(p.sn%2!=0) System.out.print(p.sn+ "  ");
		 p=p.next;
	 }
  }
 public double tbc(double n) {
	  Node p=First;
	  double s =0;
	  while(p!=null) {
		s+=p.sn;
		p=p.next;
	  }
	return s/(n);
	}*/
  	public void xoaGiatrx(int x) {
  		if(!IsEmpty()) {
  			if(First.sn==x) {
  				Node t=First;
  				First=First.next;
  				t.next=null;
  				t=null;
  	  }else {
  		  Node  p = First.next;
  		  Node q= First;
  		  while(p!=null) {
  		 if(p.sn==x) {
  		     q.next=p.next;
  		     p.next=null;
  		     p=null;
  		   System.out.println("da xoa");
  		return;
  	    }else {
  		     q=p;
  		     p=p.next;
  		}
  		}
  		}
  		}
     	}
 }


