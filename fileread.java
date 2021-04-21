import java.io.*;
class  fileread
{
	public static void main(String[] args) throws IOException

	{
		FileInputStream fin = new FileInputStream("samba.txt");
		System.out.println("PRINT content of Samba.txt file");
		int ch ;
		while ((ch=fin.read()) != -1)
	 System.out.print((char)ch);
//		bout.write(ch);
	
		fin.close();
	}
}
