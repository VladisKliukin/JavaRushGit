package Core;

import Persons.Person;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PersonManager {
    private Person[] persons;

    public PersonManager() {
        List<String> classNames = readParticipantsFromFile("src/participants.txt");
        persons = new Person[classNames.size()];
        initializeParticipants(classNames);
    }


    private List<String> readParticipantsFromFile(String fileName) {
        List<String> classNames = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                classNames.add(line.trim());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return classNames;
    }


    private void initializeParticipants(List<String> classNames) {
        for (int i = 0; i < classNames.size(); i++) {
            try {

                Class<?> participantClass = Class.forName(classNames.get(i));

                persons[i] = (Person) participantClass.getDeclaredConstructor().newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void createPoem() {
        for (Person person : persons) {
            if (person != null) {
                person.addTextToPoem();
            }
        }
    }
}