package Persons;

import Core.Poem;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class OsartemVik extends Person {
    @Override
    public void addTextToPoem() {
        Path path = Path.of("src\\Lilea.txt");
        try {
            List<String> list = Files.readAllLines(path);
            for (int i = 0; i < list.size(); i++) {
                if (i == 36 || i == 39 || i == 47 || i == 71 || i == 76)
                    Poem.getInstance().addLineAtIndex((i + 1), list.get(i));
            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
