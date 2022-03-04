package FileClass;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		String src = "D:\\destination\\poo.jpg";
		String target = "D:\\dle.jpg";
		
		FileInputStream in = null;
		FileOutputStream out = null;
		
		int n = 0, cnt = 0, tot = 0;
		
		in = new FileInputStream(src);
		out = new FileOutputStream(target);
		
		byte[] buf = new byte[1024];
		
		while((n = in.read(buf)) != -1) {
			out.write(buf, 0, n);
			out.flush();
			cnt++;
			tot += n;
		}
		
		System.out.println("cnt : " + cnt);
		System.out.println(tot + "바이트가 복사 되었습니다.");
		
		in.close();
		out.close();
	}
}
