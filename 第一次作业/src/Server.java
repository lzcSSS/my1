import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;



public class Server {
	public static void main(String[] args) {
		ServerSocket ss;
		Socket s;
		OutputStream  out = null;
		
		int n = 0;
		try {
			ss = new ServerSocket(789);
			
			while(true) {
				s = ss.accept();
				String html = "http/1.1 200 ok\n"
	                    + "Content-Type:text/html;charset=UTF-8\n"
	                    + "\n"
	                    + "server";
				out = s.getOutputStream();
				out.write(html.getBytes());
	            
				n++;
				System.out.println("第"+n+"次连接");
				System.out.println(html);
				s.close();
				out.close();
				
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}
}
		
		


