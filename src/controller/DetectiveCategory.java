package controller;

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

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DetectiveCategory extends Application implements Initializable {

        String path = null;

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
        public void select(int x) throws SQLException {
            String[] result;
            System.out.println(img);
            if (x == 17) {
                try {
                    result = object.result(17);
                    Image image = new Image("file:/E:\\toka\\third\\javafx\\java_project\\java_project\\Books_Project\\src\\images\\arif-riyanto-UD9nADGj2mc-unsplash.jpg");
                    img.setImage(image);
                    txt1.setText(result[0]);
                    txt2.setText(result[1]);
                    txt3.setText(result[2]);
                    txt4.setText(result[3]);
                    path = "file:/E:\\toka\\third\\javafx\\java_project\\java_project\\Books_Project\\src\\pdf\\a-gentleman-never-tells-regency-historical-romance.pdf";
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }

            } else if (x == 18) {
                try {
                    result = object.result(18);
                    Image image = new Image("file:/E:\\toka\\third\\javafx\\java_project\\java_project\\Books_Project\\src\\images\\9780575081406.jpg");
                    img.setImage(image);
                    txt1.setText(result[0]);
                    txt2.setText(result[1]);
                    txt3.setText(result[2]);
                    txt4.setText(result[3]);
                    path = "file:/E:\\toka\\third\\javafx\\java_project\\java_project\\Books_Project\\src\\pdf\\a-gentleman-never-tells-regency-historical-romance.pdf";
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            } else if (x == 19) {
                try {
                    result = object.result(19);
                    Image image = new Image("file:/E:\\toka\\third\\javafx\\java_project\\java_project\\Books_Project\\src\\images\\51glJgVC1IL.jpg");
                    img.setImage(image);
                    txt1.setText(result[0]);
                    txt2.setText(result[1]);
                    txt3.setText(result[2]);
                    txt4.setText(result[3]);
                    path = "file:/E:\\toka\\third\\javafx\\java_project\\java_project\\Books_Project\\src\\pdf\\a-gentleman-never-tells-regency-historical-romance.pdf";
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            } else if (x == 20) {
                try {
                    result = object.result(20);
                    Image image = new Image("file:/E:\\toka\\third\\javafx\\java_project\\java_project\\Books_Project\\src\\images\\200px-Amazingstories-1927-09-thecolouroutofspace.jpg");
                    img.setImage(image);
                    txt1.setText(result[0]);
                    txt2.setText(result[1]);
                    txt3.setText(result[2]);
                    txt4.setText(result[3]);
                    path = "file:/E:\\toka\\third\\javafx\\java_project\\java_project\\Books_Project\\src\\pdf\\a-gentleman-never-tells-regency-historical-romance.pdf";
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            } else if (x == 21) {
                try {
                    result = object.result(21);
                    Image image = new Image("file:/E:\\toka\\third\\javafx\\java_project\\java_project\\Books_Project\\src\\images\\4efcc3b4ad613a6c56102f8d6c95ce42.png");
                    img.setImage(image);
                    txt1.setText(result[0]);
                    txt2.setText(result[1]);
                    txt3.setText(result[2]);
                    txt4.setText(result[3]);
                    path = "file:/E:\\toka\\third\\javafx\\java_project\\java_project\\Books_Project\\src\\pdf\\a-gentleman-never-tells-regency-historical-romance.pdf";
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            } else if (x == 22) {
                try {
                    result = object.result(22);
                    Image image = new Image("file:/E:\\toka\\third\\javafx\\java_project\\java_project\\Books_Project\\src\\images\\0cee7e54fda8ac99ec11459448e89c7d.jpg");
                    img.setImage(image);
                    txt1.setText(result[0]);
                    txt2.setText(result[1]);
                    txt3.setText(result[2]);
                    txt4.setText(result[3]);
                    path = "file:/E:\\toka\\third\\javafx\\java_project\\java_project\\Books_Project\\src\\pdf\\a-gentleman-never-tells-regency-historical-romance.pdf";
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            } else if (x == 23) {
                try {
                    result = object.result(23);
                    Image image = new Image("file:/E:\\toka\\third\\javafx\\java_project\\java_project\\Books_Project\\src\\images\\0e5dfc58c3fcd2cfd79d3e9f1e34a042.jpg");
                    img.setImage(image);
                    txt1.setText(result[0]);
                    txt2.setText(result[1]);
                    txt3.setText(result[2]);
                    txt4.setText(result[3]);
                    path = "file:/E:\\toka\\third\\javafx\\java_project\\java_project\\Books_Project\\src\\pdf\\a-gentleman-never-tells-regency-historical-romance.pdf";
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            } else if (x == 24) {
                try {
                    result = object.result(24);
                    Image image = new Image("file:/E:\\toka\\third\\javafx\\java_project\\java_project\\Books_Project\\src\\images\\d7fbf425adee862225c9cc610c22afd5.jpg");
                    img.setImage(image);
                    txt1.setText(result[0]);
                    txt2.setText(result[1]);
                    txt3.setText(result[2]);
                    txt4.setText(result[3]);
                    path = "file:/E:\\toka\\third\\javafx\\java_project\\java_project\\Books_Project\\src\\pdf\\a-gentleman-never-tells-regency-historical-romance.pdf";
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }


        }
        @FXML
        void start(ActionEvent event) {
            HostServices hs = getHostServices();
            hs.showDocument(path);
            System.out.println(path);
        }

        @FXML
        void back(MouseEvent event) {
            try {
                FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/category3.fxml"));
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
