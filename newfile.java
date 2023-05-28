import java.io.*;
public class newfile {

 public static void main(String[] args)
   {  
   File f = new File("D:/JAVA/file1.txt");
   System.out.println("檔案是否存在?"+ f.exists());
   
   if(!f.exists()){
   System.out.println("利用 creatFile()建立新檔案"+"是否建立成功?");
  try{
  System.out.println(f.createNewFile());
  }catch (IOException e){
  System.out.println(e);
  }
  
  System.out.println("檢查新建檔案是否存在?"+f.exists());
  }  }  }
