import java.io.*;
class CreateFileAndWrite{
public static void main(String [] args){
try {
FileWriter fw = new FileWriter ("co6exp1.txt");
fw.write ("this is experiment1 of c06.this is my file content to be written to the text file");
fw.close();
System.out.println("\n file write done");
char c;
FileReader fr = new FileReader("co6exp1.txt");
BufferedReader in = new BufferedReader(fr);
String line=in.readLine();
while(line!=null)
{
System.out.println(line);
line = in.readLine();
}
in.close();
fr.close();
}
catch (IOException e){
System.out.println("there are some ioexception");
}
}
}
