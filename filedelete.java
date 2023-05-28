import java.io.*;
// 主類別
public class filedelete
{  // 主程式
   public static void main(String[] args)
   {  // 宣告File物件
      File file = new File(args[0]);
      // 檔案是否存在
      if ( file.exists() )
      {  System.out.println("deleting file..." + file);
         boolean success = file.delete();  // 刪除檔案
         System.out.println("success to delete file" + success);
      } 
      else
         System.out.println("[" + file + "]file is not exist!"); 
   }
}
