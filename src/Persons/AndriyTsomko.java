package Persons;

import Core.Poem;

public class AndriyTsomko extends Person{

    @Override
    public void addTextToPoem() {
        Poem.getInstance().addLineAtIndex(2, "Люде не любили?");
        Poem.getInstance().addLineAtIndex(8, "Очей не спускають");
        Poem.getInstance().addLineAtIndex(63, "А весною процвіла я");
        Poem.getInstance().addLineAtIndex(67, "Зимою люде... Боже мій!");
        Poem.getInstance().addLineAtIndex(75, "Стала в гаї, і в теплиці,");
    }
}
