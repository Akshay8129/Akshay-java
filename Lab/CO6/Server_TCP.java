import java.net.*;
import java.io.*;

public class Server_TCP
{
private Socket  socket=null;
private ServerSocket server = null;
private DataInputStream in = null;
public Server_TCP(int port)
{
try
{
server = new ServerSocket(port);
System.out.println("server started");
System.out.println("writing for a client");
socket=server.accept();
System.out.println("client accepted");
in =new DataInputStream(new BufferedInputStream(socket.getInputStream()));
String line="";
while (!line.equals("Over"))
{
try
{
line=in.readUTF();
System.out.println(line);
}
catch (IOException i)
{
System.out.println(i);
}
}
System.out.println("cloasing connection");
socket.close();
in.close();
}
catch(IOException i)
{
System.out.println(i);
}
}
public static void main(String args[])
{
Server_TCP serverTCP = new Server_TCP(5000);
}
}