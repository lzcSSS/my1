import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class ServerRun extends Thread{
	
	Map<String,String> map = new HashMap<String,String>();
	
		BufferedReader brin = null;
		OutputStream  out = null;
		private Socket s;
	
	
	
	
	public ServerRun(Socket s) {
		map.put("GET /test HTTP/1.1", "访问test");
		map.put("GET /demo HTTP/1.1", "访问demo");
		map.put("GET /hello HTTP/1.1", "访问hello");
		map.put("GET /666 HTTP/1.1", "访问666");
		map.put("GET /people HTTP/1.1", "访问people");
		this.s= s;
	}
	
	@Override
	public void run() {
		
		try {
			brin = new BufferedReader(new InputStreamReader(s.getInputStream()));
			out = s.getOutputStream();
			
			String str = brin.readLine();
			String str1 ="";
			for(String mees:map.keySet()) {
				if(mees.equals(str)) {
					str1 = str1 + map.get(mees);
				}
			}
			
			String html = "http/1.1 200 ok\n"
                    + "Content-Type:text/html;charset=UTF-8\n"
                    + "\n"
                    + "server"+str1;
			
			
			
			out.write(html.getBytes());
			out.close();
			brin.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
