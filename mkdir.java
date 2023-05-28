import java.io.*;
// 主類別
public class mkdir
{  // 主程式
   public static void main(String[] args)
   {  // 宣告File物件
      File dir = new File(args[0]);
      if ( !dir.exists() )  // 目錄是否存在
      {  boolean success = dir.mkdir(); // 建立目錄
         System.out.println("Directory ["+dir+"] make "+success);
      } 
      else
         System.out.println("[" + dir + "]Directory exist !");
   }
}
