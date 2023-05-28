import java.io.*;
// 主類別
public class OutputExample2
{  // 主程式
   public static void main(String[] args)  throws Exception
   {  // 建立BufferedReader的輸入串流物件
      BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
      String str;
      System.out.print("Please input data: ");
      System.out.flush();      // 清除緩衝區
      str = input.readLine();  // 讀取一列
      input.close();           // 關閉串流
      System.out.println("input data is: " + str);
   }
}

