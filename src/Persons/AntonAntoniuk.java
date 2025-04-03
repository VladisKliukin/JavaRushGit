package Persons;

import Core.Poem;
import Core.PoemLine;

import java.util.List;

import static Core.PoemLine.getPoemLinesByUser;

public class AntonAntoniuk extends Person {
    String filePath = "src\\poem_user_data.csv";
    String separSign = ";";
    String userName = "AntonAntoniuk";

    @Override
    public void addTextToPoem() {

        List<PoemLine> poemLines = getPoemLinesByUser(filePath, userName, separSign);

        if (poemLines.isEmpty()) {
            System.out.println("Не знайдено рядків для користувача: " + userName);
        } else {

            for (PoemLine poemLine : poemLines) {
                Poem.getInstance().addLineAtIndex(poemLine.getLineNumber(), poemLine.getLineText());
            }
        }

    }
}