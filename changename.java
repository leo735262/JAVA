import java.io.*;
// 主類別
public class changename
{  // 主程式
   public static void main(String[] args)
   {  // 宣告File物件
      File fs = new File(args[0]);
      File fd = new File(args[1]);
      if ( fs.exists() )     // 檢查來源是否存在
      {  if ( !fd.exists() ) // 檢查目的是否不存在
         {  boolean success=fs.renameTo(fd); // 更改名稱
            System.out.println("change name seccessed!"+success);
         }
         else
            System.out.println("[" + fd + "]been existed!");
      } 
      else
         System.out.println("[" + fs + "]is not exist!"); 
   }
}
