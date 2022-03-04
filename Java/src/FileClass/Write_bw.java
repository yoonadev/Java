package FileClass;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write_bw {
	public static void main(String[] args) throws IOException {
		//파일 쓰기
		String filePath = "D:\\destination\\write.txt";
		
		File file = new File(filePath);
		
		if(!file.exists()) {
			file.createNewFile();
		}

		BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
		
		bw.append("안녕\n");
		bw.append("안녕하세요!!");
		
		bw.flush();
		bw.close();
	}
}
