import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        String name = "Zivile";
        System.out.println(name.contains("i"));
        System.out.println(name.contains("a"));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.length());
        System.out.println(name.repeat(5));
        System.out.println(name.charAt(0));

        // lygina tekstus ar vienodi, tas pats kaip ==
        System.out.println(name.equals("Zivile"));

        // Ištrina tarpus is pradzios ir galo, jei yra
        System.out.println(name.trim());

        // Isima dali zodzio
        System.out.println(name.substring(3)); //iškerpa pradzia
        System.out.println(name.substring(1, 5)); // iskerpa nuo norimos vietos iki galo

        // pakeicia nurodytas raides
        System.out.println(name.replace("i", "a"));


        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

//1. Sukurti du kintamuosius. Jiems priskirti savo mylimo aktoriaus vardą ir pavardę kaip stringus
// (Jonas Jonaitis). Atspausdinti trumpesnį stringą.

        String vardas = "Henry";
        String pavarde = "Cavill";

        System.out.println(vardas + " " + pavarde);

        if (vardas.length() < pavarde.length()) {
            System.out.println("Trumpesnis: " + vardas);
        } else if (vardas == pavarde) {
            System.out.println("Vienodas ilgis");
        } else {
            System.out.println("Trumpesnis: " + pavarde);
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

//2. Sukurti du kintamuosius. Jiems priskirti savo mylimo aktoriaus vardą ir pavardę kaip stringus.
// Vardą atspausdinti tik didžiosiom raidėm, o pavardę tik mažosioms. (LEONARDO dicaprio)

        System.out.println(vardas.toUpperCase() + " " + pavarde.toLowerCase());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

//3. Sukurti du kintamuosius. Jiems priskirti savo mylimo aktoriaus vardą ir pavardę kaip stringus.
// Sukurti trečią kintamąjį ir jam priskirti stringą, sudarytą iš pirmų vardo ir pavardės kintamųjų raidžių.
// Jį atspausdinti.


        //String pirmosRaides1 = vardas.charAt(0) + pavarde.charAt(0);
        //System.out.println(pirmosRaides1);

        String pirmosRaides2 = vardas.substring(0, 1) + pavarde.substring(0, 1);
        System.out.println(pirmosRaides2);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

//4. Sukurti du kintamuosius. Jiems priskirti savo mylimo aktoriaus vardą ir pavardę kaip stringus.
// Sukurti trečią kintamąjį ir jam priskirti stringą, sudarytą iš trijų paskutinių vardo ir pavardės
// kintamųjų raidžių. Jį atspausdinti.

        String paskutinesRaides = vardas.substring(vardas.length() - 3) + pavarde.substring(pavarde.length() - 3);
        System.out.println(paskutinesRaides);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

//5. Sukurti kintamąjį su stringu: “An American in Paris”. Jame visas “a” (didžiąsias ir mažąsias)
// pakeisti žvaigždutėm “*”.  Rezultatą atspausdinti.

        String movie = "An American in Paris";
        System.out.println(movie.replace("a", "*").replace("A", "*"));

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

//6. Sukurti kintamąjį su stringu: “An American in Paris”. Jame ištrinti visas balses. Rezultatą atspausdinti.
// Kodą pakartoti su stringais: “Breakfast at Tiffany's”, “2001: A Space Odyssey” ir “It's a Wonderful Life”.

        System.out.println(movie.replaceAll("[aeiouyAEIOUY]",""));

        String movie2 = "Breakfast at Tiffany's";
        String movie3 = "2001: A Space Odyssey";
        String movie4 = "It's a Wonderful Life";

        System.out.println(movie2.replaceAll("[aeiouyAEIOUY]",""));
        System.out.println(movie3.replaceAll("[aeiouyAEIOUY]",""));
        System.out.println(movie4.replaceAll("[aeiouyAEIOUY]",""));

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

//7. Stringe, kurį generuoja toks kodas: "Star Wars: Episode "+ " ".repeat( (int) (Math.random() * 10))+((int)
// (Math.random() * 7)+1) + " - A New Hope" Surasti ir atspausdinti epizodo numerį.

        String episode = "Star Wars: Episode "+ " ".repeat( (int) (Math.random() * 10))+((int) (Math.random() * 7)+1) + " - A New Hope";
        System.out.println(episode);

        System.out.println(episode.replaceAll("[a-zA-Z:-]","").trim());


    }
}