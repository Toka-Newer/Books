package controller;

import com.sun.glass.ui.CommonDialogs;
import connection.sqlConnection;
import javafx.application.Application;
import javafx.application.HostServices;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class Romance extends Application implements Initializable {

    String path;

    @FXML
    private AnchorPane book;

    @FXML
    private ImageView img;

    @FXML
    private Text txt4;

    @FXML
    private Text txt1;

    @FXML
    private Text txt3;

    @FXML
    private Text txt2;

    @FXML
    private Button start;

    connection.sqlConnection object = new sqlConnection();
    public void choose(int x) throws SQLException {
        String[] result;
        System.out.println(img);
        if (x == 1){
            try {
                result = object.result(1);
                Image image = new Image("file:/E:\\toka\\third\\javafx\\java_project\\java_project\\Books_Project\\src\\images\\268a5a55fc90fb09367310c0945c977c(2).jpg");
                img.setImage(image);
                txt1.setText(result[0]);
                txt2.setText(result[1]);
                txt3.setText(result[2]);
                txt4.setText(result[3]);
                path = "file:/E:\\toka\\third\\javafx\\java_project\\java_project\\Books_Project\\src\\pdf\\a-gentleman-never-tells-regency-historical-romance.pdf";
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        } else if (x == 2){
            try {
                result = object.result(2);
                Image image = new Image("file:/E:\\toka\\third\\javafx\\java_project\\java_project\\Books_Project\\src\\images\\a937d5c4ed5031d133c93fe0b2fee1b37174a505__300x0.jpg");
                img.setImage(image);
                txt1.setText(result[0]);
                txt2.setText(result[1]);
                txt3.setText(result[2]);
                txt4.setText(result[3]);
                path = "file:/E:\\toka\\third\\javafx\\java_project\\java_project\\Books_Project\\src\\pdf\\all-of-me-a-small-town-romance.pdf";
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        else if (x == 3){
            try {
                result = object.result(3);
                Image image = new Image("file:/E:\\toka\\third\\javafx\\java_project\\java_project\\Books_Project\\src\\images\\8ac80c8ac5f3ab62e714241257f9898aacddac14__300x0.jpg");
                img.setImage(image);
                txt1.setText(result[0]);
                txt2.setText(result[1]);
                txt3.setText(result[2]);
                txt4.setText(result[3]);
                path = "file:/E:\\toka\\third\\javafx\\java_project\\java_project\\Books_Project\\src\\pdf\\all-of-me-a-small-town-romance.pdf";
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        else if (x == 4){
            try {
                result = object.result(4);
                Image image = new Image("file:/E:\\toka\\third\\javafx\\java_project\\java_project\\Books_Project\\src\\images\\98c79697e854704d6c24169357d8d25e.jpg");
                img.setImage(image);
                txt1.setText(result[0]);
                txt2.setText(result[1]);
                txt3.setText(result[2]);
                txt4.setText(result[3]);
                path = "file:/E:\\toka\\third\\javafx\\java_project\\java_project\\Books_Project\\src\\pdf\\all-of-me-a-small-town-romance.pdf";
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        else if (x == 9){
            try {
                result = object.result(9);
                Image image = new Image("file:/E:\\toka\\third\\javafx\\java_project\\java_project\\Books_Project\\src\\images\\3cdfe46be1b901417dcdbc540f68192a5311b311__300x0.jpg");
                img.setImage(image);
                txt1.setText(result[0]);
                txt2.setText(result[1]);
                txt3.setText(result[2]);
                txt4.setText(result[3]);
                path = "file:/E:\\toka\\third\\javafx\\java_project\\java_project\\Books_Project\\src\\pdf\\all-of-me-a-small-town-romance.pdf";
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }


        else if (x == 10){
            try {
                result = object.result(10);
                Image image = new Image("file:/E:\\toka\\third\\javafx\\java_project\\java_project\\Books_Project\\src\\images\\290dfb95ff38b0be073b753736ab45f28aa541c6__300x0.jpg");
                img.setImage(image);
                txt1.setText(result[0]);
                txt2.setText(result[1]);
                txt3.setText(result[2]);
                txt4.setText(result[3]);
                path = "file:/E:\\toka\\third\\javafx\\java_project\\java_project\\Books_Project\\src\\pdf\\all-of-me-a-small-town-romance.pdf";
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        else if (x == 11){
            try {
                result = object.result(11);
                Image image = new Image("file:/E:\\toka\\third\\javafx\\java_project\\java_project\\Books_Project\\src\\images\\45b67b02181cee4dd728ad602c6ecc9a9b137fbc__300x0.jpg");
                img.setImage(image);
                txt1.setText(result[0]);
                txt2.setText(result[1]);
                txt3.setText(result[2]);
                txt4.setText(result[3]);
                path = "file:/E:\\toka\\third\\javafx\\java_project\\java_project\\Books_Project\\src\\pdf\\all-of-me-a-small-town-romance.pdf";
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        else if (x == 12){
            try {
                result = object.result(12);
                Image image = new Image("file:/E:\\toka\\third\\javafx\\java_project\\java_project\\Books_Project\\src\\images\\6e04107cbc4aa8ba9f562b275183c5b47aca7f3a__300x0.jpg");
                img.setImage(image);
                txt1.setText(result[0]);
                txt2.setText(result[1]);
                txt3.setText(result[2]);
                txt4.setText(result[3]);
                path = "file:/E:\\toka\\third\\javafx\\java_project\\java_project\\Books_Project\\src\\pdf\\all-of-me-a-small-town-romance.pdf";
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        else if (x == 17){
            try {
                result = object.result(17);
                Image image = new Image("file:/E:\\toka\\third\\javafx\\java_project\\java_project\\Books_Project\\src\\images\\arif-riyanto-UD9nADGj2mc-unsplash.jpg");
                img.setImage(image);
                txt1.setText(result[0]);
                txt2.setText(result[1]);
                txt3.setText(result[2]);
                txt4.setText(result[3]);
                path = "file:/E:\\toka\\third\\javafx\\java_project\\java_project\\Books_Project\\src\\pdf\\all-of-me-a-small-town-romance.pdf";
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        else if (x == 18){
            try {
                result = object.result(18);
                Image image = new Image("file:/E:\\toka\\third\\javafx\\java_project\\java_project\\Books_Project\\src\\images\\9780575081406.jpg");
                img.setImage(image);
                txt1.setText(result[0]);
                txt2.setText(result[1]);
                txt3.setText(result[2]);
                txt4.setText(result[3]);
                path = "file:/E:\\toka\\third\\javafx\\java_project\\java_project\\Books_Project\\src\\pdf\\all-of-me-a-small-town-romance.pdf";
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        else if (x == 19){
            try {
                result = object.result(19);
                Image image = new Image("file:/E:\\toka\\third\\javafx\\java_project\\java_project\\Books_Project\\src\\images\\51glJgVC1IL.jpg");
                img.setImage(image);
                txt1.setText(result[0]);
                txt2.setText(result[1]);
                txt3.setText(result[2]);
                txt4.setText(result[3]);
                path = "file:/E:\\toka\\third\\javafx\\java_project\\java_project\\Books_Project\\src\\pdf\\all-of-me-a-small-town-romance.pdf";
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        else if (x == 20){
            try {
                result = object.result(20);
                Image image = new Image("file:/E:\\toka\\third\\javafx\\java_project\\java_project\\Books_Project\\src\\images\\200px-Amazingstories-1927-09-thecolouroutofspace.jpg");
                img.setImage(image);
                txt1.setText(result[0]);
                txt2.setText(result[1]);
                txt3.setText(result[2]);
                txt4.setText(result[3]);
                path = "file:/E:\\toka\\third\\javafx\\java_project\\java_project\\Books_Project\\src\\pdf\\all-of-me-a-small-town-romance.pdf";
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        else if (x == 13){
            try {
                result = object.result(13);
                Image image = new Image("file:/E:\\toka\\third\\javafx\\java_project\\java_project\\Books_Project\\src\\images\\a55787b4abfbc3ce9d70e5af4ee6937c15e728e6__300x0.jpg");
                img.setImage(image);
                txt1.setText(result[0]);
                txt2.setText(result[1]);
                txt3.setText(result[2]);
                txt4.setText(result[3]);
                path = "file:/E:\\toka\\third\\javafx\\java_project\\java_project\\Books_Project\\src\\pdf\\all-of-me-a-small-town-romance.pdf";
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        else if (x == 23){
            try {
                result = object.result(23);
                Image image = new Image("file:/E:\\toka\\third\\javafx\\java_project\\java_project\\Books_Project\\src\\images\\0e5dfc58c3fcd2cfd79d3e9f1e34a042.jpg");
                img.setImage(image);
                txt1.setText(result[0]);
                txt2.setText(result[1]);
                txt3.setText(result[2]);
                txt4.setText(result[3]);
                path = "file:/E:\\toka\\third\\javafx\\java_project\\java_project\\Books_Project\\src\\pdf\\all-of-me-a-small-town-romance.pdf";
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        else if (x == 12){
            try {
                result = object.result(12);
                Image image = new Image("file:/E:\\toka\\third\\javafx\\java_project\\java_project\\Books_Project\\src\\images\\8ac80c8ac5f3ab62e714241257f9898aacddac14__300x0.jpg");
                img.setImage(image);
                txt1.setText(result[0]);
                txt2.setText(result[1]);
                txt3.setText(result[2]);
                txt4.setText(result[3]);
                path = "file:/E:\\toka\\third\\javafx\\java_project\\java_project\\Books_Project\\src\\pdf\\all-of-me-a-small-town-romance.pdf";
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }


    }

    @FXML
    void start(ActionEvent event) {
        HostServices hs = getHostServices();
        hs.showDocument(path);
    }

    @FXML
    void back(MouseEvent event) {
        try {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/home.fxml"));
            AnchorPane pane = Loader.load();
            book.getChildren().setAll(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void start(Stage stage) throws Exception {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
