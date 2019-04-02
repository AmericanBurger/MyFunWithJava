import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class FileSize {
  public static void main(String[] args) throws FileNotFoundException{
    File plik = new File("pasta.txt");
    Scanner input = new Scanner(plik);
    int ch = 0;

    while(input.hasNext()){
      //System.out.println(input.nextLine());
      input.next().charAt(0);
      ++ch;
    }
    
    System.out.println("Ilosc znakow: " + ch);
    input.close();
  }
}