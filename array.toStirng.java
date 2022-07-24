import java.util.Scanner;
import java.uti.Arrays;
public class Arrays_to_String{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    String str[]  = new String[4];
    for(int i = 0 ; i<str.lenght; i++){
      str [i] = s.next();
    }
    System.out.println(Arrays.toString(str));
  }
}
