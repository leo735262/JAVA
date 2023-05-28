import java.io.*;
// 主類別
public class write
{  // 主程式
   public static void main(String[] args) throws Exception
   {  String file = "a.txt";
      String str = "Hello world!";
     // 建立BufferedWriter的輸出串流物件
      BufferedWriter output = new BufferedWriter(new FileWriter(file));
      System.out.println("writing file..." + file);
      output.write(str);     // 寫入字串
      output.close();         // 關閉串流
      System.out.println("write file seccess..." + file);
   }
}

