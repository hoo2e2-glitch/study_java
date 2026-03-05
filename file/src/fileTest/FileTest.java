package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) throws IOException {
//		상대경로
//		./ -> 현재폴더
//		../ -> 상위폴더
//		/ -> 최상위폴더

//		new FileWritter(경로(+파일), 이어쓰기 여부)
//		BufferedWriter bufferedWriter = null;
//		try {
//			bufferedWriter = new BufferedWriter(new FileWriter("./text.txt", true));
//			bufferedWriter.write("오늘 점심 메뉴 리스트"); // 버퍼에 작성
//			bufferedWriter.write("김치찌개\n"); // 버퍼에 작성
//			bufferedWriter.write("양념치킨\n"); // 버퍼에 작성
//			bufferedWriter.write("라면\n"); // 버퍼에 작성
//			bufferedWriter.flush();
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				bufferedWriter.close();
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//		}
		
//		파일 읽기
//		new FileReader(경로)
		BufferedReader bufferedReader = null;
		
		try {
			bufferedReader = new BufferedReader(new FileReader("./text.txt"));
			String line = null;
			
			line = bufferedReader.readLine();
			
//		while((line = bufferedReader.readLine()) != null) {
//			System.out.println(line);
//		}
			
		bufferedReader.lines().forEach(System.out::println);
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
			e.printStackTrace();
		} finally {
			try {
	            if(bufferedReader != null) {
	               bufferedReader.close();
	            }
	         } catch (IOException e) {
	            e.printStackTrace();
	         }
	      }
	      
	      
	   }
	}












