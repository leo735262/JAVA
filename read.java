import java.io.*;
// 主類別
public class read
{  // 主程式
   public static void main(String[] args) throws Exception
   {  String path = "b.txt";
      File file = new File(path);  // 建立File物件
      if (file.exists() )
      {  // 建立BufferedReader的輸入串流物件
         BufferedReader input = new BufferedReader(new FileReader(file));
         String str;
         // 讀取資料
         while ( (str = input.readLine()) != null )
            System.out.println(str);  
         input.close();      // 關閉串流
      }
      else
         System.out.println("file[" + file + "is not exist!");
   }
}

