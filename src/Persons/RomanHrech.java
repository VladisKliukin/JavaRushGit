package Persons;

import Core.Poem;

public class RomanHrech extends Person {
    @Override
    public void addTextToPoem() {

        Poem.getInstance().addLineAtIndex(12, "Королевий Цвіте!");
        Poem.getInstance().addLineAtIndex(69, "Люди добрі! Чи правдиво");
        Poem.getInstance().addLineAtIndex(53, "А весною я процвіла");
        Poem.getInstance().addLineAtIndex(65, "Царівною називають,");
        Poem.getInstance().addLineAtIndex(70, "Те, що говорила");
    }
}
