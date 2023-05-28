import java.io.*;
// 主類別
public class OutputExample1
{  // 主程式
   public static void main(String[] args)throws Exception
   {  // 建立BufferedWriter的輸出串流物件
      BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
      String str = "Hello World";
      output.write(str);   // 輸出字串
      output.close();      // 關閉串流
   }
}
