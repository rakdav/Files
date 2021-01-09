import java.io.File;
import java.io.IOException;

public class FileInfo
{
    public static void main(String[] args) {
        File file=new File("src/Files/textfile.txt");
        System.out.println("Файл доступен для чтения - "+file.canRead());
        System.out.println("Файл доступен для записи - "+file.canWrite());
        System.out.println("Файл существует - "+file.exists());
        System.out.println("Полный путь - "+file.getAbsolutePath());
        System.out.println("Имя файла - "+file.getName());
        System.out.println("Название родительской директории - "+file.getParent());
        System.out.println("Это файл - "+file.isFile());
        System.out.println("Это директория - "+file.isDirectory());
        System.out.println("Последнее время изменения - "+file.lastModified());
        File parent=file.getAbsoluteFile().getParentFile().getParentFile();
        System.out.println(parent.getAbsolutePath());
        File[] files=parent.listFiles();
        for(File f:files)
        {
            System.out.println("----------------------");
            System.out.println(f);
            System.out.println("Размер файла:"+f.length());
            System.out.println("Это файл - "+f.isFile());
            System.out.println("Это директорий - "+f.isDirectory());
        }
        new File("src/dir").mkdir();
        File f=new File("src/dir/a.txt");
        try {
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
