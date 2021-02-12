package com.kh.run;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServerSocket {
	public void start()
	{
		//서버의 포트번호 설정 5000이상으로 
		int port =7777;
		//서버를 구성할 소켓 레퍼런스
		ServerSocket ss =null;
		//서버소켓을 생성
		
		//클라이언트가 요청하면 받아들일 수 있도록 클라이언트 소켓 생성
		Socket clientSocket =null; //클라이언트 마다 소켓 생성
		
		//데이터 입출력을 하기위한 레퍼런스
		DataOutputStream dos =null;
		try {
			ss = new ServerSocket(port);
			System.out.println("서버소켓 생성 완료");
			
		
			
			//클라이언트 접속하면 서버 받아들이고 accept 
			//그것으로 해당 클라이언트 통신 소켓 만들어 사용
			//clientSocket 안에는 접속한 클라이언트 정보들이 담겨있음
			clientSocket =ss.accept(); //3-way-handshaking
			
			System.out.println(clientSocket.getInetAddress() + "사용자가 접속하였습니다.");
			
			//이전에는 네트워크 통로만 만들어줌
			
			
			//데이터 주고받는 통로 생성 InputStream OutputStream
			//네트워크는 바이트 스트림 이용
			OutputStream os = clientSocket.getOutputStream();
			//문자를 주고 받기 위한 
			 dos = new DataOutputStream(os);
			
			//서버에서 클라이언트로 출력스트림을 통한 데이터 전송
			dos.writeUTF("서버에 오신 것을 환영합니다.");
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				clientSocket.close();
				dos.close();
				ss.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
}
