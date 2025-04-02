package Persons;

import Core.Poem;

public class Stalgen extends Person{

    @Override
    public void addTextToPoem() {
        Poem.getInstance().addLineAtIndex(38,  "Кляла-проклинала.");
        Poem.getInstance().addLineAtIndex(25,  "Як була я людиною,");
//        Poem.getInstance().addLineAtIndex(34,  "Я була дитина,");
//        Poem.getInstance().addLineAtIndex(13,  "«Я не знаю, моя сестро».");
//        Poem.getInstance().addLineAtIndex(68,  "В хату не пустили.");
    }
}
