import java.net.*;
import java.io.*;
public class SocketServer3{
	public static void main(String[] args){
		ServerSocket SocketServer = null;
		Socket SocketConnector = null;
		try{
			SocketServer = new ServerSocket(8888);
			System.out.println("Listening at port 8888...");
			while(true){
				SocketConnector = SocketServer.accept();
			        	BufferedReader rd = new BufferedReader(new InputStreamReader(SocketConnector.getInputStream()));
				BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(SocketConnector.getOutputStream()));
				String str;
				int ch;
				while(true){
				        	while((str = rd.readLine()) != null){
				        		if(str.length() > 0 ){
				        			System.out.println(str);
			        				break;
			        			}
			        		}
					System.out.print(">");
					StringBuffer sb = new StringBuffer();
					while ( (ch = System.in.read()) != 13)
						sb.append( (char) ch );
					sb.append((char)13);
					wr.write(sb.toString());
					wr.flush();
				}
			}
		}
		catch(Exception e){
			System.out.println(e.toString());
		}
	}
}