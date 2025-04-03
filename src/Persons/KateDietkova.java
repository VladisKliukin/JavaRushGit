package Persons;

import Core.Poem;

public class KateDietkova extends Person{
    @Override
    public void addTextToPoem() {
        Poem.getInstance().addLineAtIndex(1, "«За що мене, як росла я,");
        Poem.getInstance().addLineAtIndex(7, "Царівною називають,");
        Poem.getInstance().addLineAtIndex(76, "І в білих палатах.");
        Poem.getInstance().addLineAtIndex(81, "Щоб людей я веселила,");
        Poem.getInstance().addLineAtIndex(87, "Схилив свою головоньку");
    }
}
