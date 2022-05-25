package baikiemtra;
import java.util.Scanner;
public class cauu1 {
	static Scanner sc = new Scanner(System.in);
	public static void nhapmang(int a, int arr[]) {
	 for(int i=0;i<a;i++) {
		 System.out.print("a["+ i + "]= ");
		 arr[i]=sc.nextInt();
      }
   }
  public static void xuatmang(int a, int arr[]) {
	  System.out.print("\nXuat mang: ");
	  for(int i=0;i<a;i++) {
		  System.out.print(arr[i]+ "\t");
    }
  }
  public static int tongchan(int a, int arr[]) {
	  int s=0;
	  for(int i=0;i<a;i++) {
		  if (arr[i]%2 == 0) s=s+arr[i];
		  }
	return s;
}
  public static int min(int a,int arr[]) {
	  int min = arr[0];
	  for(int i=0;i<a;i++) 
		  if(arr[i]<min) 
			  min = arr[i];
	        return min;
		  }
  public static int max(int a, int arr[]){
	    int max = arr[0];
	    for (int i = 1; i < a; i++)
	        if (max < arr[i])
	            max = arr[i];
		   return max;   	      
  }
	public static void main(String[] args) {
		  System.out.print("nhap so phan tu: ");
		  int n = sc.nextInt();
		  int [] arr = new int[n];
		  int min=arr[0];
		  nhapmang(n,arr);
		  xuatmang(n,arr);
		  System.out.print("\ntong gia tri chan trong mang: " +tongchan(n,arr));
		  System.out.print("\ngia tri lon nhat cua mang: "+max(n,arr));
		  System.out.print("\ngia tri nho nhat cua mang: "+min(n,arr));
		  }  
   }
