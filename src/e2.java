import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyCombination;
import javafx.scene.control.Menu;
import javafx.scene.layout.GridPane;

public class e2 extends Application{
    /* (non-Javadoc)
     * @see javafx.application.Application#start(javafx.stage.Stage)
     */
    /* (non-Javadoc)
     * @see javafx.application.Application#start(javafx.stage.Stage)
     */
    /* (non-Javadoc)
     * @see javafx.application.Application#start(javafx.stage.Stage)
     */
    public void start(Stage stage){
        GridPane gp = new GridPane();
        gp.setPadding(new Insets(0,0,0,0));
        gp.setHgap(5);
        gp.setVgap(5);
        gp.setMinSize(200, 200);
        Scene scene = new Scene(gp);

        MenuBar m = new MenuBar();
        gp.add(m, 0, 0);
        Menu file = new Menu("File");
        Menu edit = new Menu("Edit");
        Menu help = new Menu("Help");

        MenuItem n = new MenuItem("New");
        MenuItem open = new MenuItem("Open");
        MenuItem save = new MenuItem("Save");

        file.setMnemonicParsing(true);
        n.setAccelerator(KeyCombination.keyCombination("shortcut+n"));
        open.setAccelerator(KeyCombination.keyCombination("shortcut+o"));
        save.setAccelerator(KeyCombination.keyCombination("shortcut+s"));
        file.getItems().addAll(n,open,save);

        MenuItem cut = new MenuItem("Cut");
        MenuItem copy = new MenuItem("Copy");
        MenuItem paste = new MenuItem("Paste");

        edit.setMnemonicParsing(true);
        cut.setAccelerator(KeyCombination.keyCombination("shortcut+x"));
        copy.setAccelerator(KeyCombination.keyCombination("shortcut+c"));
        paste.setAccelerator(KeyCombination.keyCombination("shortcut+v"));
        edit.getItems().addAll(cut,copy,paste);

        MenuItem helpCenter = new MenuItem("Help Center");
        MenuItem aboutUs = new MenuItem("About Us");

        help.setMnemonicParsing(true);
        helpCenter.setAccelerator(KeyCombination.keyCombination("shortcut+h"));
        aboutUs.setAccelerator(KeyCombination.keyCombination("shortcut+a"));
        help.getItems().addAll(helpCenter,aboutUs);
        m.getMenus().addAll(file,edit,help);
        
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
