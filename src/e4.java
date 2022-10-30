import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.text.FontWeight;

public class e4 extends Application{
    public void start(Stage stage) throws Exception{
        stage.setTitle("Employee Registration Form");
        VBox root = new VBox();
        root.setPadding(new Insets(0,0,0,50));
        root.setSpacing(10);
        root.setAlignment(Pos.TOP_CENTER);

        Scene sc = new Scene(root,500,300);
        
        Label head = new Label("Employee Registration Form");
        head.setPadding(new Insets(0,50,0,0));
        head.setUnderline(true);
        head.setFont(Font.font("Verdana",FontWeight.BOLD,15));
        BorderPane.setAlignment(head, Pos.CENTER);

        HBox nameBox = new HBox();
        nameBox.setSpacing(10);
        nameBox.setPadding(new Insets(20,50,0,50));
        Label l1 = new Label("Enter your name : ");
        TextField t1 = new TextField();
        t1.setPromptText("Enter your name");
        t1.setMinWidth(200);
        nameBox.getChildren().addAll(l1,t1);

        HBox genderBox = new HBox();
        Label l2 = new Label("Gender : ");
        l2.setPadding(new Insets(0,0,0,50));
        RadioButton male = new RadioButton("Male");
        RadioButton female = new RadioButton("Female");
        ToggleGroup tg = new ToggleGroup();
        male.setToggleGroup(tg);
        male.setSelected(true);
        female.setToggleGroup(tg);
        genderBox.setSpacing(10);
        genderBox.setPadding(new Insets(0,50,0,50));
        genderBox.getChildren().addAll(l2,male,female);

        Label l3 = new Label("Enter date of birth : ");
        l3.setPadding(new Insets(0,0,0,42));
        DatePicker dt = new DatePicker();
        HBox date = new HBox();
        date.setSpacing(10);
        date.getChildren().addAll(l3,dt);

        Label l4 = new Label("Select your state : ");
        l4.setPadding(new Insets(0,0,0,50));
        ComboBox<String> state = new ComboBox<>();
        state.getItems().addAll("Karnataka","Andhra","Tamil Nadu","Kerala");
        state.setPromptText("Karnataka");
        HBox state1 = new HBox();
        state1.setSpacing(10);
        state1.getChildren().addAll(l4,state);

        Label l5 = new Label("Qualification : ");
        l5.setPadding(new Insets(0,0,0,70));
        CheckBox ug = new CheckBox("UG");
        CheckBox pg = new CheckBox("PG");
        CheckBox phd = new CheckBox("PHD");
        HBox qual = new HBox();
        qual.setSpacing(10);
        qual.getChildren().addAll(l5,ug,pg,phd);

        Button b = new Button("Register");

        b.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e){
                Alert Dialog = new Alert(AlertType.INFORMATION);
                Dialog.setTitle("Registration Successful");
                Dialog.setContentText("Registration is Successful");
                Dialog.setHeaderText("Registration Status");
                Dialog.showAndWait();
            }
        });

        root.getChildren().addAll(head,nameBox,genderBox,date,state1,qual,b);
        stage.setScene(sc);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}