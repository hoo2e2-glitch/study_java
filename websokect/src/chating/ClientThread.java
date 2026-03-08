package chating;

import java.io.BufferedReader;
import java.io.IOException;

// 서버로 부터 받은 메세지를 무한으로 클라이언트 콘솔에 출력
public class ClientThread implements Runnable {
	
	private BufferedReader input;
	
	public ClientThread() {;}
	public ClientThread(BufferedReader input) {
		this.input = input;
	}
	
	
	
	@Override
	public void run() {
		String line = null;
		
		try {
			while((line = input.readLine()) != null) {
				System.out.println(line);
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}


//## 전체 흐름으로 보면
//
//Client 에서
//new ClientThread(input) 으로 생성
//        ↓
//thread1.start() 로 실행
//        ↓
//run() 시작
//        ↓
//while문으로 서버 메시지 계속 기다림
//        ↓
//메시지 오면 → 화면에 출력
//메시지 오면 → 화면에 출력
//메시지 오면 → 화면에 출력 ... 무한반복