import domain.Drink;

import java.io.PrintStream;

class Bottles {
    public static void main(String args[]) {
        writeLyrics(System.out);
    }

    public static void writeLyrics(PrintStream out) {
        for (int number = 99; number > -1; number--) {
            verse(out, number);
        }
    }

    private static void verse(PrintStream out, int number) {
        final Drink drink = new Drink(number);
        out.print(drink.number() + drink.container() + " of beer on the wall,");
        out.println(drink.number() + drink.container() + " of beer,");
        out.print(drink.action());
        out.println(drink.next().number() + drink.next().container() + " of beer on the wall.\r\n");
    }

}