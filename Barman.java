class Ingredient{
  String nazwa;
  int amount;
  
  public Ingredient(String n, int a){
    this.nazwa = n;
    this.amount = a;
  }
}
class Drink{
  Ingredient skladnik1;
  Ingredient skladnik2;
  Ingredient skladnik3;
  
  public Drink(Ingredient s1, Ingredient s2, Ingredient s3){
    this.skladnik1 = s1;
    this.skladnik2 = s2;
    this.skladnik3 = s3;
  }
}
class Barman{
  public static Drink createDrink(Ingredient sk1, Ingredient sk2, Ingredient sk3){
    return new Drink(sk1, sk2, sk3);
  }
  public static void printDrink(Drink dr){
    Ingredient[] tab = new Ingredient[] {dr.skladnik1, dr.skladnik2, dr.skladnik3};
    String recipe = String.format("Skladniki drinka to: %s, %s, %s w proporcjach %d, %d, %d", tab[0].nazwa, tab[1].nazwa, tab[2].nazwa, tab[0].amount, tab[1].amount, tab[2].amount);
    System.out.println(recipe);
  }

  public static void main(String[] args){
    Ingredient ananas = new Ingredient("Sok ananasowy", 100);
    Ingredient malibu = new Ingredient("Likier malibu", 50);
    Ingredient kokos = new Ingredient("Mleko kokosowe", 100);

    Drink taa = createDrink(ananas, malibu, kokos);
    printDrink(taa);
  }
}