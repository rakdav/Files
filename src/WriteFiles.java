import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFiles
{
    public static void main(String[] args) {
        String path="src/dir/a.txt";
        try
        {
            //1
            FileWriter output=new FileWriter(path);
            String  s="Информация для файла\r\nНовая строка";
            //output.write(s);
            output.close();
            //2
            BufferedWriter writer=new BufferedWriter(new FileWriter(path));
            writer.write(s);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
