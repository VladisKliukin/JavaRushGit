package Persons;

import Core.Poem;

public class Jerry extends Person {

    @Override
    public void addTextToPoem() {
        Poem.getInstance().addLineAtIndex(82, "Тих самих, що вбили");
//        Poem.getInstance().addLineAtIndex(22, "");
//        Poem.getInstance().addLineAtIndex(24, "");
    }
}
