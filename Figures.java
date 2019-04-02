import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.lang.Math.*;

interface Figure{
  public double getPerimeter();
  public double getArea();
  //public void getDane();
}
class Human{
  int age;
  int weight;
  double height;
  String name;
  boolean sex;

  public Human(int a, int w, double h, String n, boolean s){
    this.age = a;
    this.weight = w;
    this.height = h;
    this.name = n;
    this.sex = s;
  }
  public int getAge(){
    return this.age;
  } 
  public int getWeight(){
    return this.weight;
  }
  public double getHeight(){
    return this.height;
  }
  public String getName(){
    return this.name;
  }
  public boolean isMale(){
    if(this.sex) return true;
    return false;
  }
  public void getDane(){
    System.out.println("wiek: " + this.getAge());
    System.out.println("waga: " + this.getWeight());
    System.out.println("wzrost: " + this.getHeight());
    System.out.println("imie: " + this.getName());
    if(this.isMale()) System.out.println("plec: mezczyzna");
    else  System.out.println("plec: kobieta");
  }
}
class Rect{
  int a;
  int b;
  
  public Rect(){
    this.a = 1;
    this.b = 1;
  }
  public Rect(int x, int y){
    this.a = x;
    this.b = y;
  }
  public int Pole(){
    return this.a * this.b;
  }
  public int Obwod(){
    return 2 * this.a + 2 * this.b;
  }
  public double Diagonal(){
    return Math.sqrt(Math.pow(this.a, 2) + Math.pow(this.b, 2));
  }
  public void getDane(){
    System.out.println("Pole prostokatu wynosi " + this.Pole());
    System.out.println("Obwod prostokatu wynosi " + this.Obwod());
    System.out.println("Przekatna prostokatu wynosi " + this.Diagonal());
  }
}
class Circle implements Figure{
  int r;

  public Circle(int promien){
    this.r = promien;
  }
  public double getPerimeter(){
    return 2 * Math.PI * r;
  }
  public double getArea(){
    return Math.PI * Math.pow(r, 2);
  }
  public void getDane(){
    System.out.println("Obwod kola wynosi " + this.getPerimeter());
    System.out.println("Pole kola wynosi " + this.getArea());
  }
}
class Triangle implements Figure{
  int a;
  int b;
  double c;

  public Triangle(int x, int y){
    this.a = x;
    this.b = y;
    this.c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
  }
  public double getPerimeter(){
    return a + b + c;
  }
  public double getArea(){
    return (a * b) / 2;
  }
  public void getDane(){
    System.out.println("Obwod trojkata wynosi " + this.getPerimeter());
    System.out.println("Pole trojkata wynosi " + this.getArea());
  }
}
class Rectangle extends Rect implements Figure{
  public Rectangle(int x, int y){
    this.a = x;
    this.b = y;
  }
  public double getPerimeter(){
    return this.Obwod();
  }
  public double getArea(){
    return this.Pole();
  }
  public void getDane(){
    System.out.println("Obwod prostokata wynosi " + this.getPerimeter());
    System.out.println("Pole prostokata wynosi " + this.getArea());
  }
}
class Figures
{
  public static String[] rev(String[] tablica){
    String[] result = new String[tablica.length];
    for(int i = tablica.length - 1, j = 0; i >= 0; --i, ++j) result[j] = tablica[i];
    return result;
  }
  public static List<String> reverse(List<String> alist){
    List<String> rev = new ArrayList<String>();
    for(int i = alist.size() - 1; i >= 0; --i)  rev.add(alist.get(i));
    return rev;
  }
  public static void main(String[] args){
    // Human czlowiek = new Human(20, 66, 1.88, "Sebastian", true);
    // Rect prostokat = new Rect(3, 4);
    // czlowiek.getDane();
    // prostokat.getDane();

    //String[] wynik = new String[] {"Ala", "ma", "kota"};
    //wynik = rev(wynik);
    //for(String el:wynik)  System.out.println(el);

    // List<String> lista = new ArrayList<String>();
    // lista.add("Ala");
    // lista.add("ma");
    // lista.add("kota");
    // lista = reverse(lista);
    // for(String el:lista)  System.out.println(el);

    Scanner input = new Scanner(System.in);
    int r = 0, a = 0, b = 0, x = 0, y = 0;

    System.out.println("Podaj promien kola: ");
    r = input.nextInt();
    System.out.println("Podaj przyprostokatna a: ");
    a = input.nextInt();
    System.out.println("Podaj przyprostokatna b: ");
    b = input.nextInt();
    System.out.println("Podaj bok x prostokata: ");
    x = input.nextInt();
    System.out.println("Podaj bok y prostokota: ");
    y = input.nextInt();

    Circle kolo = new Circle(r);
    Triangle trujkont = new Triangle(a, b);
    Rectangle prostokont = new Rectangle(x, y);
    Figure[] tab = new Figure[] {kolo, trujkont, prostokont};
    //for(Figure el : tab)  el.getDane();
    for(Figure el:tab){
      System.out.println("Obwod: " + el.getPerimeter());
      System.out.println("Pole: " + el.getArea());
    }
    input.close();
  }
}