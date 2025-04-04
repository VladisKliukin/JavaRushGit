package Persons;
import Core.Poem;

public class Shatroffsky extends Person{

    @Override
    public void addTextToPoem() {
        Poem.getInstance().addLineAtIndex(3, "За що мене, як виросла");
        Poem.getInstance().addLineAtIndex(14, "І Цвіт Королевий");
        Poem.getInstance().addLineAtIndex(41, "Я виросла, викохалась");
        Poem.getInstance().addLineAtIndex(73, "Лілеєю-снігоцвітом;");
        Poem.getInstance().addLineAtIndex(79, "Нащо мене Бог поставив");
    }
}
