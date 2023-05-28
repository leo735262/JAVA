import java.net.Socket;
import java.io.*;
public class SocketClient3{
	public static void main(String[] args){
		Socket SocketClient = null;
		try{
			SocketClient = new Socket("localhost",8888);
			System.out.println("Connected to Server...");
			BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(SocketClient.getOutputStream()));
	        		BufferedReader rd = new BufferedReader(new InputStreamReader(SocketClient.getInputStream()));
			int ch;
			String str;
			while (true) {
				System.out.print(">");
				StringBuffer sb = new StringBuffer();
				while ( (ch = System.in.read()) != 13)
					sb.append( (char) ch );
				sb.append((char)13);
				wr.write(sb.toString());
				wr.flush();
		        		while((str = rd.readLine()) != null){
		        			if(str.length() > 0 ){
		        				System.out.println(str);
		        				break;
		        			}
		        		}
			}
		}
		catch(Exception e){
			System.out.println(e.toString());
		}
		finally{        if(SocketClient != null){
			try{        SocketClient.close();        }
			catch(Exception e){        System.out.println(e.toString());        }
			}        System.out.println("Client disconnected...");
		}
	}
}