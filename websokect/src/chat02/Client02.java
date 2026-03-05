package chat02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client02 {
	public static void main(String[] args) {
		
//		ip, port
		
		String severId = "192.168.161.245";
		int port = 1100;
		String serverMessage = null, clientMessage = null;
		
		try(
				Socket socket = new Socket(severId, port);
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream())); //읽음
				BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())); //작석
				Scanner sc = new Scanner(System.in);
		){
				System.out.println("서버가 연결되었습니다.");
				
				while(true) {
					System.out.println("서버로 메세지 보내기 >>");
					clientMessage = sc.nextLine();
					bufferedWriter.write(clientMessage + "\n");
					bufferedWriter.flush();
					System.out.println("[클라이언트] :" + clientMessage);
					
					serverMessage = bufferedReader.readLine();
					System.out.println("[서버]: " + serverMessage);
					
					
				}
				
				
			} catch (IOException e) {
				e.printStackTrace();
		}
		
		
		
	}

}
