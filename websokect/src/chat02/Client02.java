package chat02;

// 클라이언트: 보내기 → 받기 → 보내기 → 받기
// 서버:     받기  → 보내기 → 받기  → 보내기
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

// 클라이언트는 Socket(ip, port)으로 바로 연결한다
public class Client02 {
	public static void main(String[] args) {
		
//		ip, port 서버에 연결 요청
		
		String serverIp = "192.168.161.245";
		int port = 1100;
		String serverMessage = null, clientMessage = null;
		
//		보낼 때: getOutputStream() → PrintWriter
//		받을 때: getInputStream() → InputStreamReader → BufferedReader
		
		try(
				Socket socket = new Socket(serverIp, port); // 바로연결
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 메세지 받기
				BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())); // 보내기
				BufferedReader keyboardInput = new BufferedReader(new InputStreamReader(System.in));
//				Scanner sc = new Scanner(System.in);
		){
			
				System.out.println("서버가 연결되었습니다.");
				
				while(true) {
					// 보내기
					System.out.println("서버로 메세지 보내기 >>");
//					clientMessage = sc.nextLine(); // 키보드 입력
					clientMessage = keyboardInput.readLine(); // 키보드 입력
					bufferedWriter.write(clientMessage + "\n"); // 메세지 작성
					bufferedWriter.flush(); // .flush() 안쓰면 데드락에 걸림/ 없으면 메세지 안감
					System.out.println("[클라이언트]: " + clientMessage); // 출력
					// 받기
					serverMessage = bufferedReader.readLine();
					System.out.println("[서버]: " + serverMessage);
					
					
				}
				
				
			} catch (IOException e) {
				e.printStackTrace();
				
		}
		
		
		
	}

}



