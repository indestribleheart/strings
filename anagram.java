import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
      String str1="naman";
      String str2="manan";
      int n=str1.length();
      int m=str2.length();
      String flag="";
      for(int i=0;i<n;i++){
        if (n==m){ 
          if (str2.indexOf(i)!=-1){ 
          }
          flag="anagram";
        }else{ 
          flag="not anagram";
        } 
      }
      System.out.println(flag);
  }
}
