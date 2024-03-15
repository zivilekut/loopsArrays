import java.sql.SQLOutput;
import java.util.List;
import java.util.Random;

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


        String pirmosRaides1 = vardas.charAt(0) + "" + pavarde.charAt(0);
        System.out.println(pirmosRaides1);

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

        System.out.println(movie.replaceAll("[aeiouyAEIOUY]", ""));

        String movie2 = "Breakfast at Tiffany's";
        String movie3 = "2001: A Space Odyssey";
        String movie4 = "It's a Wonderful Life";

        System.out.println(movie2.replaceAll("[aeiouyAEIOUY]", ""));
        System.out.println(movie3.replaceAll("[aeiouyAEIOUY]", ""));
        System.out.println(movie4.replaceAll("[aeiouyAEIOUY]", ""));

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

//7. Stringe, kurį generuoja toks kodas: "Star Wars: Episode "+ " ".repeat( (int) (Math.random() * 10))+((int)
// (Math.random() * 7)+1) + " - A New Hope" Surasti ir atspausdinti epizodo numerį.

        String episode = "Star Wars: Episode " + " ".repeat((int) (Math.random() * 10)) + ((int) (Math.random() * 7) + 1) + " - A New Hope";
        System.out.println(episode);

        System.out.println(episode.replaceAll("[a-zA-Z :-]", ""));

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

//8. Suskaičiuoti kiek stringe “Don't Be a Menace to South Central While Drinking Your Juice in the Hood” yra žodžių trumpesnių arba lygių
// nei 5 raidės. Pakartokite kodą su stringu “Tik nereikia gąsdinti Pietų Centro, geriant sultis pas save kvartale”.

        String sentence1 = "Don't Be a Menace to South Central While Drinking Your Juice in the Hood";
        String sentence2 = "Tik nereikia gąsdinti Pietų Centro, geriant sultis pas save kvartale";

       String[] englishWords = sentence1.split(" ");
        int countEnglish = 0;
        for (String englishWord : englishWords) {
            if (englishWord.length() < 5) {
                countEnglish++;
            }

        }

        System.out.println("Number of words in sentence1 with less than 5 characters: " + countEnglish);

        String[] lithuanianWords = sentence2.split(" ");
        int countELithuanian = 0;
        for (String lithuanianWord : lithuanianWords) {
            if (lithuanianWord.length() < 5) {
                countELithuanian++;
            }

        }

        System.out.println("Number of words in sentence2 with less than 5 characters: " + countELithuanian);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//9. Parašyti kodą, kuris generuotų atsitiktinį stringą iš lotyniškų mažųjų raidžių. Stringo ilgis 3 simboliai.

        String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        Random random = new Random();

        for (int l = 0; l < 3; l++) {
            String randomElement = letters[random.nextInt(letters.length)];

            System.out.print(randomElement + "");
        }
        System.out.println("");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

//10. Parašykite kodą, kuris generuotų atsitiktinį stringą su 10 atsitiktine tvarka išdėliotų žodžių, o žodžius generavimui imtų iš 8-me
// uždavinyje pateiktų dviejų stringų. Žodžiai neturi kartotis. (reikės masyvo)

        String[] words = {"Don't", "Be", "a", "Menace", "to", "South", "Central", "While", "Drinking", "Your", "Juice", "in", "the", "Hood", "Tik", "nereikia", "gąsdinti", "Pietų", "Centro", "geriant", "sultis", "pas", "save", "kvartale"};


        for (int i = 0; i < 10; i++) {
            String randomElement = words[random.nextInt(words.length)];

            System.out.print(randomElement + " ");
        }

        System.out.println("");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");






    }
}