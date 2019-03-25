import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
	
	public static void main(String[] args) {
		ServerSocket ss;
		Socket s ;
		try {
			 ss = new ServerSocket(980);
			 while(true) {
				 s = ss.accept();
				 new ServerRun(s).start(); 
			 }
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
