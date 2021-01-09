import java.io.*;
import java.util.logging.Logger;

public class ReadFiles
{
    public static void main(String[] args) {
        String path="src/Files/textfile.txt";
        try {
            //1
            FileInputStream in=new FileInputStream(path);
            int b=in.read();
            while (b!=-1)
            {
                System.out.print((char) b);
                b=in.read();
            }
            in.close();
            //2
            FileReader input=new FileReader(path);
            int code=input.read();
            System.out.println();
            while (code!=-1)
            {
                System.out.print((char) code);
                code=input.read();
            }
            System.out.println();
            input.close();
            //3
            input=new FileReader(path);
            char[] chars=new char[4096];
            input.read(chars);
            input.close();
            for(int i=0;i<chars.length;i++)
            {
                System.out.print(chars[i]);
            }
            System.out.println();
            //4. Буферизованные потоки
            BufferedReader reader=new BufferedReader(new FileReader(path));
            String line;
            while ((line=reader.readLine())!=null)
            {
                System.out.print(line);
            }
            reader.close();
        }
        catch (FileNotFoundException ex)
        {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
