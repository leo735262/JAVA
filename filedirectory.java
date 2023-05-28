import java.io.*;

public class filedirectory
{  
   public static void main(String[] args)
   {  
      String[] filenames;
      
      File file = new File(args[0]);
      
      if ( file.isDirectory() )//檢查file物件是否是資料夾
      {  filenames = file.list();  // 取得檔案和目錄清單
         
         for ( int i = 0; i < filenames.length; i++ )
           System.out.println(filenames[i]);
      }
      else
         System.out.println("[" + file + "]is not a Directory!");
   }
}
