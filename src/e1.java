import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
class usernameorpasswordmismatch extends Exception{
    public String toString(){
        return "username or password mismatch";
    }
}

public class e1 extends Application{
    String name = new String("vineeth");
    String pass = new String("123456789");

    public void start(Stage stage){
        GridPane gp = new GridPane();
        gp.setHgap(10);
        gp.setVgap(10);
        Scene scene = new Scene(gp,500,200);

        Label l1 = new Label("Username :");
        gp.add(l1, 1, 1);

        Label l2 = new Label("Password :");
        gp.add(l2,1,2);

        TextField t1 = new TextField();
        gp.add(t1,2,1);

        TextField t2 = new TextField();
        gp.add(t2,2,2);

        Button b = new Button("Submit");
        gp.add(b,2,3);

        b.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e){
                GridPane gp1 = new GridPane();
                gp1.setMinSize(200, 50);
                Scene scene1 = new Scene(gp1);
                try{
                    if(name.equals(t1.getText()) && pass.equals(t2.getText())){
                        Label l2 = new Label("Welcome");
                        gp1.add(l2,1,1);
                    }
                    else
                        throw new usernameorpasswordmismatch();
                    stage.setScene(scene1);
                }catch(Exception e2){
                    System.out.println(e2);
                }
            }
        });

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args){
        launch();
    }
}