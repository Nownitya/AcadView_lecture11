
package MiniProject1;

import java.io.File;
import java.util.ArrayList;

public class FileHandler 
{
    public static void FilesCheck(String path, ArrayList<File> a1) throws IOException 
    {
        File file1 = new File(path);
        File[] f = file1.listFiles();
        try
        {
            for (File file:f)
            {
                if (file.isFile()) 
                {
                    a1.add(file);
                                        
                }
                else if (file.isDirectory())
                {
                    FilesCheck(file.getAbsolutePath())
                    
                }
            }
        }
        
    }
}
