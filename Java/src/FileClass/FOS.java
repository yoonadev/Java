package FileClass;

import java.io.FileOutputStream;
import java.io.IOException;

public class FOS {
	public static void main(String[] args) throws IOException {
		FOS o = new FOS();
		String filePath = "D:\\destination\\write.txt";
		
		o.writeFile(filePath);
	}
	
	public void writeFile(String filePath) throws IOException {
		FileOutputStream out = new FileOutputStream(filePath, true);
		int n = 0;
		
		System.out.println("내용을 입력하세요");
		while((n = System.in.read()) != -1) {
			out.write(n);
			out.flush();
		}
		System.in.close();
		out.close();
	}
}
