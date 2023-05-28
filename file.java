import java.io.*;
// 主類別
public class file
{  // 主程式
   public static void main(String[] args)
   {  // 宣告File物件
      File file = new File(args[0]);
      // 檔案是否存在
      if ( file.exists() )
      { if ( file.isFile() )
           System.out.println("["+file+"]is a file");
        else if ( file.isDirectory() )
                System.out.println("["+file+"]is a Directory");
        // 顯示檔案資訊
        System.out.println("Absolute Path :" +file.getAbsolutePath());
        System.out.println("Absolute File Path :" +file.getAbsoluteFile());
        System.out.println("name:"+file.getName());
        System.out.println("Parent Path:"+file.getParent());
        System.out.println("File Path:"+file.getPath());
        System.out.println("size:"+file.length());
        System.out.println("can read?:"+file.canRead());
        System.out.println("can write?:"+file.canWrite());
      } 
      else
        System.out.println("[" + file + "]is not exist!"); 
   }
} 
