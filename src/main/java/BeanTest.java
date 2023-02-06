import java.util.ArrayList;

public class BeanTest {

    public static void main(String[] args) {

        Album demonDays = new Album("The", "Gorillaz", "Demon Days", 2005, 8.0, "Hip Hop, Alternative Rock, Art Rock", 0);

        System.out.println(demonDays.getAlbumName());

//       --------------------------------------------------------------------------------------

        Author douglasAdams = new Author("Douglas","Adams",1);

        Author markTwain = new Author("Mark", "Twain", 1);


        System.out.println(douglasAdams.getFirstName() + " " + douglasAdams.getLastName());
        System.out.println(markTwain.getFirstName() + " " + markTwain.getLastName());

        //       --------------------------------------------------------------------------------------

        ArrayList<Quote> quotesAL = new ArrayList<Quote>();

        Quote deadLines = new Quote("Douglas", "Adams", "I love deadlines. I love hte whoosing noise they make as they go by.", 0);

        Quote dontPanic = new Quote("Douglas", "Adams", "Don't Panic.", 1);

        Quote timeIllusion = new Quote("Douglas", "Adams", "Time is an illusion. Lunchtime doubly so.", 2);

        Quote clothesMan = new Quote("Mark", "Twain", "Clothes make the man. Naked people have little or no influence on society.", 3);


        quotesAL.add(deadLines);
        quotesAL.add(dontPanic);
        quotesAL.add(timeIllusion);
        quotesAL.add(clothesMan);
        System.out.println(quotesAL.size());

        for (Quote info:quotesAL) {
            System.out.println(info.getAuthorFirstName() + " " + info.getAuthorLastName()+ " is the author of this quote.");

        }

    }
}
