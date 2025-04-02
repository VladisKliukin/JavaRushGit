package Persons;

import Core.Poem;

public class SergLW extends Person {
    @Override
    public void addTextToPoem() {
        Poem.getInstance().addLineAtIndex(66, "Аж гай звеселила.");
        Poem.getInstance().addLineAtIndex(43, "Я не знала, що байстря я,");
        Poem.getInstance().addLineAtIndex(9, "З мого цвіту? Дивуються,");
        Poem.getInstance().addLineAtIndex(23, "Ми давно вже кохаємось,");
        Poem.getInstance().addLineAtIndex(62, "Зимою під тином,");
    }
}
