package Persons;

import Core.Poem;

public class Jerry extends Person {

    @Override
    public void addTextToPoem() {
        Poem.getInstance().addLineAtIndex(82, "Тих самих, що вбили");
        Poem.getInstance().addLineAtIndex(10, "Не знають, де діти!");
        Poem.getInstance().addLineAtIndex(28, "Вона все журилась");
        Poem.getInstance().addLineAtIndex(26, "Як я мордувалась.");
//        Poem.getInstance().addLineAtIndex(24, "");
    }
}
