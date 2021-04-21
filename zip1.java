import java.io.*;
import java.util.zip.*;

class zip1  
{
	public static void main(String[] args)  throws IOException
	{ FileInputStream fin =new FileInputStream("samba.txt");
	FileOutputStream fos= new FileOutputStream("newzip");
	DeflaterOutputStream dos =new DeflaterOutputStream(fos);
	int ch;
	while ((ch=fin.read()) != -1)
	dos.write(ch);
	fin.close();
	dos.close();
	
	}
}
