import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;
public class e3 extends Application{
    public void start(Stage stage){
        Label l = new Label("context menu");

        TilePane gp = new TilePane(l);
        Scene sc = new Scene(gp);

        ContextMenu c = new ContextMenu();
        l.setContextMenu(c);
        Menu New = new Menu("New");
        Menu View = new Menu("View");

        MenuItem file = new MenuItem("file");
        MenuItem folder = new MenuItem("folder");
        MenuItem image = new MenuItem("Image");

        MenuItem large = new MenuItem("Large");
        MenuItem medium = new MenuItem("Medium");
        MenuItem small = new MenuItem("Small");

        c.getItems().addAll(New,View);

        New.getItems().addAll(file,folder,image);
        View.getItems().addAll(large,medium,small);

        stage.setScene(sc);
        stage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
