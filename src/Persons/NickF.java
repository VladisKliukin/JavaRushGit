package Persons;

import Core.Poem;

public class NickF extends Person {
    @Override
    public void addTextToPoem() {
        Poem.getInstance().addLineAtIndex(11, "Скажи мені, мій братику,");
        Poem.getInstance().addLineAtIndex(19, "І заплакала Лілея");
        Poem.getInstance().addLineAtIndex(36, "А вона все в’яла,");
        Poem.getInstance().addLineAtIndex(44, "Що його дитина.");
        Poem.getInstance().addLineAtIndex(86, "А Цвіт Королевий");
    }
}
