package com.kh.run;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServerSocket {
	public void start()
	{
		//������ ��Ʈ��ȣ ���� 5000�̻����� 
		int port =7777;
		//������ ������ ���� ���۷���
		ServerSocket ss =null;
		//���������� ����
		
		//Ŭ���̾�Ʈ�� ��û�ϸ� �޾Ƶ��� �� �ֵ��� Ŭ���̾�Ʈ ���� ����
		Socket clientSocket =null; //Ŭ���̾�Ʈ ���� ���� ����
		
		//������ ������� �ϱ����� ���۷���
		DataOutputStream dos =null;
		try {
			ss = new ServerSocket(port);
			System.out.println("�������� ���� �Ϸ�");
			
		
			
			//Ŭ���̾�Ʈ �����ϸ� ���� �޾Ƶ��̰� accept 
			//�װ����� �ش� Ŭ���̾�Ʈ ��� ���� ����� ���
			//clientSocket �ȿ��� ������ Ŭ���̾�Ʈ �������� �������
			clientSocket =ss.accept(); //3-way-handshaking
			
			System.out.println(clientSocket.getInetAddress() + "����ڰ� �����Ͽ����ϴ�.");
			
			//�������� ��Ʈ��ũ ��θ� �������
			
			
			//������ �ְ��޴� ��� ���� InputStream OutputStream
			//��Ʈ��ũ�� ����Ʈ ��Ʈ�� �̿�
			OutputStream os = clientSocket.getOutputStream();
			//���ڸ� �ְ� �ޱ� ���� 
			 dos = new DataOutputStream(os);
			
			//�������� Ŭ���̾�Ʈ�� ��½�Ʈ���� ���� ������ ����
			dos.writeUTF("������ ���� ���� ȯ���մϴ�.");
			
			
			
			
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