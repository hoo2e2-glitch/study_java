package chat02;

//서버:     받기  → 보내기 → 받기  → 보내기
//클라이언트: 보내기 → 받기 → 보내기 → 받기
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

// 서버는 ServerSocket으로 열고 accept()로 기다린다
public class Server02 {
	public static void main(String[] args) {
		
//		보낼 때: getOutputStream() → PrintWriter
//		받을 때: getInputStream() → InputStreamReader → BufferedReader
		
		String clientMessage = null, serverMessage = null; // 작성할 메세지 변수 만들기
		System.out.println("서버가 시작되었습니다. 클라이언트를 기다리는 중...");
		try(
				ServerSocket serverSocket = new ServerSocket(1100); // 소켓포트 열어둠 대기중
				Socket socket = serverSocket.accept(); // 클라이언트 기달중 한명만 받을 수 있음
//				 날것을 한줄씩 읽기 편하게 포장
				BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())); // 적어서 보내기
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 받기
				BufferedReader keybordInput = new BufferedReader(new InputStreamReader(System.in));
//				BufferedWriter keybordInput = new BufferedWriter(new OutputStreamWriter(System.in)); // 못씀 - 안되는 코드
//				Scanner sc = new Scanner(System.in);
				
			){
			
	         	System.out.println("클라이언트가 연결되었습니다.");
	         	// 반복돌면서 채팅
				while(true) {
					System.out.println("클라이언트로 메세지 보내기 >>");
//					serverMessage = sc.nextLine(); // 입력
					serverMessage = keybordInput.readLine(); // 입력
					bufferedWriter.write(serverMessage + "\n");
					bufferedWriter.flush(); // .flush() 안쓰면 데드락에 걸림/ 없으면 메세지 안감
					System.out.println("[서버]: " + serverMessage);
					
					clientMessage = bufferedReader.readLine();
					System.out.println("[클라이언트]: " + clientMessage);
					
					
					
				}
				

			
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		
		
		
	}
		
		

}
