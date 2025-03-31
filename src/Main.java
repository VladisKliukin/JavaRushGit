import Core.GUI;
import Core.PersonManager;
import Core.Poem;


public class Main {
    public static void main(String[] args) {

        GUI window = new GUI();


        PersonManager personManager = new PersonManager();
        personManager.createPoem();

        window.updateStoryDisplay(Poem.getInstance().getPoemLines());
    }
}