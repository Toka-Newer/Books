package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

import java.io.IOException;
import java.sql.SQLException;

public class Category3 {

    @FXML
    private AnchorPane category3;

    @FXML
    private ImageView img9;

    @FXML
    private ImageView img10;

    @FXML
    private ImageView img11;

    @FXML
    private ImageView img12;

    @FXML
    private ImageView img13;

    @FXML
    private ImageView img14;

    @FXML
    private ImageView img15;

    @FXML
    private ImageView img16;

    @FXML
    void back(MouseEvent event) {
        try {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/home.fxml"));
            AnchorPane pane = Loader.load();
            category3.getChildren().setAll(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void click1(MouseEvent event) {
        try {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/detective_category.fxml"));
            AnchorPane pane = Loader.load();
            DetectiveCategory obj1 = (DetectiveCategory) Loader.getController();
            obj1.select(17);
            category3.getChildren().setAll(pane);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void click2(MouseEvent event) {
        try {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/detective_category.fxml"));
            AnchorPane pane = Loader.load();
            DetectiveCategory obj1 = (DetectiveCategory) Loader.getController();
            obj1.select(18);
            category3.getChildren().setAll(pane);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void click3(MouseEvent event) {
        try {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/detective_category.fxml"));
            AnchorPane pane = Loader.load();
            DetectiveCategory obj1 = (DetectiveCategory) Loader.getController();
            obj1.select(19);
            category3.getChildren().setAll(pane);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void click4(MouseEvent event) {
        try {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/detective_category.fxml"));
            AnchorPane pane = Loader.load();
            DetectiveCategory obj1 = (DetectiveCategory) Loader.getController();
            obj1.select(20);
            category3.getChildren().setAll(pane);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void click5(MouseEvent event) {
        try {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/detective_category.fxml"));
            AnchorPane pane = Loader.load();
            DetectiveCategory obj1 = (DetectiveCategory) Loader.getController();
            obj1.select(21);
            category3.getChildren().setAll(pane);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void click6(MouseEvent event) {
        try {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/detective_category.fxml"));
            AnchorPane pane = Loader.load();
            DetectiveCategory obj1 = (DetectiveCategory) Loader.getController();
            obj1.select(22);
            category3.getChildren().setAll(pane);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void click7(MouseEvent event) {
        try {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/detective_category.fxml"));
            AnchorPane pane = Loader.load();
            DetectiveCategory obj1 = (DetectiveCategory) Loader.getController();
            obj1.select(23);
            category3.getChildren().setAll(pane);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void click8(MouseEvent event) {
        try {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/detective_category.fxml"));
            AnchorPane pane = Loader.load();
            DetectiveCategory obj1 = (DetectiveCategory) Loader.getController();
            obj1.select(24);
            category3.getChildren().setAll(pane);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void signout(ActionEvent event) {
        try {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/sample.fxml"));
            GridPane pane = Loader.load();
            category3.getChildren().setAll(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
