import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Internet
{
    public static void main(String[] args) {
        try {
            URL url=new URL("https://mail.ru");
            BufferedReader reader=new BufferedReader(new InputStreamReader(url.openStream()));
            String result="";
            String line;
            while ((line=reader.readLine())!=null)
            {
                result+=line+"\r\n";
            }
            reader.close();
            System.out.println(result);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
