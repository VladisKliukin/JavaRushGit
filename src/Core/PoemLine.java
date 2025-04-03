package Core;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PoemLine {
    private int lineNumber;
    private String lineText;

    public PoemLine(int lineNumber, String lineText) {
        this.lineNumber = lineNumber;
        this.lineText = lineText;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public String getLineText() {
        return lineText;
    }

    public static List<PoemLine> getPoemLinesByUser(String filePath, String userName, String separSign) {
        List<PoemLine> poemLines = new ArrayList<>();
        Path path = Paths.get(filePath);

        try (BufferedReader br = new BufferedReader(new FileReader(path.toFile()))) {
            String line;

            br.readLine();

            while ((line = br.readLine()) != null) {

                String[] data = line.split(separSign);

                if (data.length >= 3) {
                    try {

                        String rawLineNumber = data[0].replaceAll("[^\\d]", "").trim();
                        int lineNumber = Integer.parseInt(rawLineNumber);

                        String textLine = data[1].replaceAll("\"", "").trim();
                        String currentUserClass = data[2].replaceAll("\"", "").trim();

                        if (currentUserClass.equals(userName)) {
                            poemLines.add(new PoemLine(lineNumber, textLine));
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Невірний формат номера рядка: " + data[0]);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return poemLines;
    }
}