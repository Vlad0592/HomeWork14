import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


        Set<Product> menu = new HashSet<>();

        menu.add(new Product("Пыво", 15, 3));
        menu.add(new Product("Пыво", 15, 3));
        menu.add(new Product("Пыво", 15, 3));
        menu.add(new Product("Колбаса", 65.50, 2));
        menu.add(new Product("Сосиски", 165.20, 5));
        menu.add(new Product("Макароны", 15.70, 20));


        for (Object prod : menu) {
            System.out.println(prod);
        }

        Set<Product> menu1 = new HashSet<>();

        menu1.add(new Product("Чай", 15.70, 2));
        menu1.add(new Product("Сахар", 1.30, 10));
        menu1.add(new Product("Лимон", 5.50, 5));
        menu1.add(new Product("Мед", 135.70, 4));

        for (Object prod : menu1) {
            System.out.println(prod);
        }

        Recipe obed = new Recipe("Обед дня", menu);
        Recipe tea = new Recipe("Чай, Индийский чай", menu1);

        RecipeBook bookCook = new RecipeBook();
        bookCook.addProduct(obed);
        bookCook.addProduct(tea);


        var passp = new Passport("45676767 56756545454", "Нестеров", "Владислав", "Валерьевич", "1990.11.01");
        var passp1 = new Passport("0221 123456", "Петкин", "Виталий", "", "1981.12.01");
        var passp2 = new Passport("0722 177456", "Лебедева", "Лена", "Алексеевна", "1999.12.21");
        var passp3 = new Passport("0722 177456", "Сидоров", "Лебедь", "Лисинск", "1987.10.21");
        var passpKeeper = new PassportKeeper();
        passpKeeper.addPassport(passp2);
        passpKeeper.addPassport(passp3);
        passpKeeper.addPassport(passp1);
        passpKeeper.addPassport(passp);
        System.out.print(passpKeeper);
        System.out.println(passpKeeper.getPassport("0222 125556"));
        System.out.println(passpKeeper.getPassport("0222 "));


    }


}
