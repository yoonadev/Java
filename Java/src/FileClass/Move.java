package FileClass;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Move {
	//File.renameTo() 이용
	public void moveFile_File(File oldFile, String dest) {
		File newFile = new File(dest + oldFile.getName());
		
		System.out.println(oldFile.renameTo(newFile) ? "success" : "fail");
	}
	
	//Path, Files 이용
	public void moveFile_Path(File file, String dest) {
		Path oldFile = Paths.get(file.getPath());
		Path newFile = Paths.get(dest + file.getName());
		
		try{
			Files.move(oldFile, newFile);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Move a = new Move();
		String dirPath = "D:\\Dev\\";
		String dirPath2 = "D:\\tmp\\";
		String dest = "D:\\destination\\";
		String[] FileNM = {"aaa.txt", "aaa1.txt", "aaa2.txt", "aaa3.txt", "aaa4.txt"};
		
		for(String nm : FileNM) {
			File file = new File(dirPath + nm);
			
			//dirPath에 파일이 존재하지 않으면  dirPath2에서 찾아 이동
			if(file.exists()) {
//				a.moveFile_File(file, dest);
				a.moveFile_Path(file, dest);
			}else {
				file = new File(dirPath2 + nm);
//				a.moveFile_File(file, dest);
				a.moveFile_Path(file, dest);
			}
		}
	}
}
