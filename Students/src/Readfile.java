import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Readfile {

	public static void main(String[] args) throws FileNotFoundException {
		try {
			File file =  new File("D:\\filename.txt");
			Scanner sc = new Scanner(file);
			if(sc.hasNextLine()) {
				String line = sc.nextLine();
				System.out.print(line);
		}
		}
	   catch(Exception ex) {
		   System.out.print(ex);
	   }
	}

}