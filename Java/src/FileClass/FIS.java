package FileClass;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FIS {
	public static void main(String[] args) throws IOException {
		String filePath = "D:\\destination\\write.txt";
		
		FIS c = new FIS();
		
//		int cnt = c.readFile(filePath);
		int cnt = c.readFile_array(filePath);
		System.out.println("\ncnt : " + cnt + "바이트를 읽었습니다");
	}
	
	public int readFile(String filePath) throws IOException {
//		BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "UTF-8"));
		FileInputStream in = new FileInputStream(filePath);
		int cnt = 0;
		int n;
		while((n = in.read()) != -1) {
			System.out.print((char)n);
			cnt++;
		}
		in.close();
		return cnt;
	}
	
	public int readFile_array(String filePath) throws IOException {
		FileInputStream in = new FileInputStream(filePath);
		int cnt = 0, n = 0;
		byte[] bb = new byte[1024];
		
		while((n = in.read(bb)) != -1) {
			System.out.write(bb, 0, n);
			
			cnt += n;
		}
		in.close();
		return cnt;
	}
}
