import java.io.*;

class  filereadwrite
{
	public static void main(String[] args) throws IOException 
	{
		//BufferedReader br= new BufferedReader(new InputStreamReader (System.in));
	//	String name=br.readLine();
	int ch;
		FileWriter fw =new FileWriter ("readiptoopfile.doc",true);
				FileReader fr1 =new FileReader ("samba.txt");
				while ((ch=fr1.read() )!= -1)
				fw.write((char)ch);
				fr1.close();
				fw.close();
			
	}
}
