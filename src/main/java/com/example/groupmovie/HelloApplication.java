package com.example.groupmovie;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class HelloApplication extends Application {


    FlowPane flowPane = new FlowPane();
    AnchorPane root = new AnchorPane();
    Scene scene = new Scene(root);

    HBox menu = new HBox(20);
    HBox searchBar = new HBox(20);

    HBox Act = new HBox(20);
    HBox Hor = new HBox(20);
    HBox Ad = new HBox(20);
    HBox title1 = new HBox(20);
    HBox title2 = new HBox(20);
    HBox title3 = new HBox(20);

    ScrollPane scrollPane = new ScrollPane();

    WebView webView = new WebView();
    WebEngine engine = new WebEngine();
    WebView wv = new WebView();

    VBox vBox = new VBox();

    @Override
    public void start(Stage stage) {

        //calling the methods
        createLogo();
        createMenu();
        createScrollPanes();
        createGenre();
        scene.getStylesheets().add("/App.css"); //adding css to the scene
        stage.setTitle("Group Netflix");
        stage.setScene(scene);
        stage.show();
    }

    //creating method that manages the scrollpane and the flowpane
    public void createScrollPanes()
    {
        scrollPane.setContent(flowPane);
        scrollPane.setLayoutY(55);
        scrollPane.setLayoutX(200);
        scrollPane.setPrefViewportHeight(600);
        scrollPane.setPrefViewportWidth(1050);
        root.getChildren().add(scrollPane);
    }

    public void createLogo()
    {
        VBox sideMenu = new VBox(5);
        ImageView logo = new ImageView(new Image("/netflix-4.jpg"));
        logo.setFitHeight(50);
        logo.setFitWidth(130);
        sideMenu.setPadding(new Insets(5));
        sideMenu.getChildren().addAll(logo);
        root.getChildren().add(sideMenu);
    }

    //menu method
    public void createMenu()
    {
        Label label = new Label("Home");
        Label label1 = new Label("TV Shows");
        Label label2 = new Label("Movies");
        Label label3 = new Label("Recently");
        Label label4 = new Label("My List");

        menu.getChildren().addAll(label,label1,label2,label3,label4,searchBar);
        menu.setPadding(new Insets(20,0,0,200));
        root.getChildren().add(menu);
    }

    //creating the genres and their imageViews
    public void createGenre()
    {


        //setting the padding for the vBox
        vBox.setPadding(new Insets(10,5,10,10));


        //creating thumbnails
        HBox hBox = new HBox(20);
        ImageView imageView = new ImageView(new Image("/thehunt.jpg"));
        imageView.setFitWidth(260);
        imageView.setFitHeight(144);
        imageView.setStyle("-fx-background-color: transparent;");

        //onclick methods to redirect the user to the webengine
        imageView.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                engine = webView.getEngine();
                engine.load("https://www.youtube.com/watch?v=xoWmwsPU5cQ");
                Stage stage = new Stage();
                stage.setScene(new Scene(webView,800,600));
                stage.show();
            }
        });

        //create a hover like effect to the imageViews and the labels and then the code is the same throughout
        imageView.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                imageView.setFitWidth(255);
                imageView.setFitHeight(140);
            }
        });

        imageView.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                imageView.setFitWidth(260);
                imageView.setFitHeight(144);
            }
        });

        ImageView imageView1 = new ImageView(new Image("/iceroad.jpg"));
        imageView1.setFitWidth(260);
        imageView1.setFitHeight(144);

        imageView1.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                engine = webView.getEngine();
                engine.load("https://www.youtube.com/watch?v=SHEPdMqrWjE");
                Stage stage = new Stage();
                stage.setScene(new Scene(webView,800,600));
                stage.show();
            }
        });
        imageView1.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                imageView1.setFitWidth(255);
                imageView1.setFitHeight(140);
            }
        });

        imageView1.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                imageView1.setFitWidth(260);
                imageView1.setFitHeight(144);
            }
        });

        ImageView imageView2 = new ImageView(new Image("/m.jpg"));
        imageView2.setFitWidth(260);
        imageView2.setFitHeight(144);

        imageView2.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                engine = webView.getEngine();
                engine.load("https://m.youtube.com/watch?v=uSSy0hjySRI");
                Stage stage = new Stage();
                stage.setScene(new Scene(webView,800,600));
                stage.show();
            }
        });
        imageView2.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                imageView2.setFitWidth(255);
                imageView2.setFitHeight(140);
            }
        });

        imageView2.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                imageView2.setFitWidth(260);
                imageView2.setFitHeight(144);
            }
        });

        ImageView imageView3 = new ImageView(new Image("/extraction.jpg"));
        imageView3.setFitWidth(260);
        imageView3.setFitHeight(144);

        imageView3.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                engine = webView.getEngine();
                engine.load("https://m.youtube.com/watch?v=L6P3nI6VnlY");
                Stage stage = new Stage();
                stage.setScene(new Scene(webView,800,600));
                stage.show();
            }
        });

        imageView3.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                imageView3.setFitWidth(255);
                imageView3.setFitHeight(140);
            }
        });

        imageView3.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                imageView3.setFitWidth(260);
                imageView3.setFitHeight(144);
            }
        });

        ImageView imageView4 = new ImageView(new Image("/interceptor.jpg"));
        imageView4.setFitWidth(260);
        imageView4.setFitHeight(144);

        imageView4.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                engine = webView.getEngine();
                engine.load("https://m.youtube.com/watch?v=gqbl8SY2vLc");
                Stage stage = new Stage();
                stage.setScene(new Scene(webView,800,600));
                stage.show();
            }
        });

        imageView4.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                imageView4.setFitWidth(255);
                imageView4.setFitHeight(140);
            }
        });

        imageView4.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                imageView4.setFitWidth(260);
                imageView4.setFitHeight(144);
            }
        });

        ImageView imageView5 = new ImageView(new Image("/extinction.jpg"));
        imageView5.setFitWidth(260);
        imageView5.setFitHeight(144);

        imageView5.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                engine = webView.getEngine();
                engine.load("https://m.youtube.com/watch?v=-ePDPGXkvlw");
                Stage stage = new Stage();
                stage.setScene(new Scene(webView,800,600));
                stage.show();
            }
        });

        imageView5.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                imageView5.setFitWidth(255);
                imageView5.setFitHeight(140);
            }
        });

        imageView5.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                imageView5.setFitWidth(260);
                imageView5.setFitHeight(144);
            }
        });

        ImageView imageView6 = new ImageView(new Image("/Againsttheice.jpg"));
        imageView6.setFitWidth(260);
        imageView6.setFitHeight(144);

        imageView6.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                engine = webView.getEngine();
                engine.load("https://m.youtube.com/watch?v=J44cOSrsJWU");
                Stage stage = new Stage();
                stage.setScene(new Scene(webView,800,600));
                stage.show();
            }
        });

        imageView6.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                imageView6.setFitWidth(255);
                imageView6.setFitHeight(140);
            }
        });

        imageView6.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                imageView6.setFitWidth(260);
                imageView6.setFitHeight(144);
            }
        });

        ImageView imageView7 = new ImageView(new Image("/divergent.jpg"));
        imageView7.setFitWidth(260);
        imageView7.setFitHeight(144);

        imageView7.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                engine = webView.getEngine();
                engine.load("https://m.youtube.com/watch?v=sutgWjz10sM");
                Stage stage = new Stage();
                stage.setScene(new Scene(webView,800,600));
                stage.show();
            }
        });

        imageView7.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                imageView7.setFitWidth(255);
                imageView7.setFitHeight(140);
            }
        });

        imageView7.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                imageView7.setFitWidth(260);
                imageView7.setFitHeight(144);
            }
        });

        //adding the elements to the hBox for a horizontal view
        hBox.getChildren().addAll(imageView,imageView1,imageView2,imageView3,imageView4,imageView5,imageView6,imageView7);


        HBox hBox2 = new HBox(20);
        ImageView imageView20 = new ImageView(new Image("/mamajack.jpg"));
        imageView20.setFitWidth(260);
        imageView20.setFitHeight(144);

        imageView20.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                engine = webView.getEngine();
                engine.load("https://m.youtube.com/watch?v=_XXQuJdUOHc");
                Stage stage = new Stage();
                stage.setScene(new Scene(webView,800,600));
                stage.show();
            }
        });

        imageView20.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                imageView20.setFitWidth(255);
                imageView20.setFitHeight(140);
            }
        });

        imageView20.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                imageView20.setFitWidth(260);
                imageView20.setFitHeight(144);
            }
        });

        ImageView imageView21 = new ImageView(new Image("/spiderman.jpg"));
        imageView21.setFitWidth(260);
        imageView21.setFitHeight(144);

        imageView21.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                engine = webView.getEngine();
                engine.load("https://m.youtube.com/watch?v=wQkAfmvjWgs");
                Stage stage = new Stage();
                stage.setScene(new Scene(webView,800,600));
                stage.show();
            }
        });

        imageView21.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                imageView21.setFitWidth(255);
                imageView21.setFitHeight(140);
            }
        });

        imageView21.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                imageView21.setFitWidth(260);
                imageView21.setFitHeight(144);
            }
        });

        ImageView imageView22 = new ImageView(new Image("/kong.jpg"));
        imageView22.setFitWidth(260);
        imageView22.setFitHeight(144);

        imageView22.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                engine = webView.getEngine();
                engine.load("https://m.youtube.com/watch?v=hhzrul_MU6c");
                Stage stage = new Stage();
                stage.setScene(new Scene(webView,800,600));
                stage.show();
            }
        });

        imageView22.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                imageView22.setFitWidth(255);
                imageView22.setFitHeight(140);
            }
        });

        imageView22.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                imageView22.setFitWidth(260);
                imageView22.setFitHeight(144);
            }
        });

        ImageView imageView23 = new ImageView(new Image("/theraid.jpg"));
        imageView23.setFitWidth(260);
        imageView23.setFitHeight(144);

        imageView23.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                engine = webView.getEngine();
                engine.load("https://m.youtube.com/watch?v=PQ6yUHHfZ04");
                Stage stage = new Stage();
                stage.setScene(new Scene(webView,800,600));
                stage.show();
            }
        });

        imageView23.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                imageView23.setFitWidth(255);
                imageView23.setFitHeight(140);
            }
        });

        imageView23.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                imageView23.setFitWidth(260);
                imageView23.setFitHeight(144);
            }
        });

        ImageView imageView24 = new ImageView(new Image("/ongbak.jpg"));
        imageView24.setFitWidth(260);
        imageView24.setFitHeight(144);

        imageView24.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                engine = webView.getEngine();
                engine.load("https://m.youtube.com/watch?v=GQ5qcPsCP9A");
                Stage stage = new Stage();
                stage.setScene(new Scene(webView,800,600));
                stage.show();
            }
        });

        imageView24.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                imageView24.setFitWidth(255);
                imageView24.setFitHeight(140);
            }
        });

        imageView24.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                imageView24.setFitWidth(260);
                imageView24.setFitHeight(144);
            }
        });

        ImageView imageView25 = new ImageView(new Image("/hoealone.jpg"));
        imageView25.setFitWidth(260);
        imageView25.setFitHeight(144);

        imageView25.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                engine = webView.getEngine();
                engine.load("https://m.youtube.com/watch?v=K_mXxBj0mX4");
                Stage stage = new Stage();
                stage.setScene(new Scene(webView,800,600));
                stage.show();
            }
        });

        imageView25.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                imageView25.setFitWidth(255);
                imageView25.setFitHeight(140);
            }
        });

        imageView25.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                imageView25.setFitWidth(260);
                imageView25.setFitHeight(144);
            }
        });

        ImageView imageView26 = new ImageView(new Image("/transporter.jpg"));
        imageView26.setFitWidth(260);
        imageView26.setFitHeight(144);

        imageView26.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                engine = webView.getEngine();
                engine.load("https://m.youtube.com/watch?v=7FnbLyv2oio");
                Stage stage = new Stage();
                stage.setScene(new Scene(webView,800,600));
                stage.show();
            }
        });

        imageView26.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                imageView26.setFitWidth(255);
                imageView26.setFitHeight(140);
            }
        });

        imageView26.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                imageView26.setFitWidth(260);
                imageView26.setFitHeight(144);
            }
        });

        ImageView imageView27 = new ImageView(new Image("/f.jpg"));
        imageView27.setFitWidth(260);
        imageView27.setFitHeight(144);

        imageView27.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                engine = webView.getEngine();
                engine.load("https://m.youtube.com/watch?v=_qyw6LC5pnE");
                Stage stage = new Stage();
                stage.setScene(new Scene(webView,800,600));
                stage.show();
            }
        });

        imageView27.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                imageView27.setFitWidth(255);
                imageView27.setFitHeight(140);
            }
        });

        imageView27.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                imageView27.setFitWidth(260);
                imageView27.setFitHeight(144);
            }
        });

        hBox2.getChildren().addAll(imageView20,imageView21,imageView22,imageView23,imageView24,imageView25,imageView26,imageView27);


        HBox hBox3 = new HBox(20);
        ImageView imageView30 = new ImageView(new Image("/freddyvsjason-horror.jpg"));
        imageView30.setFitWidth(260);
        imageView30.setFitHeight(144);

        imageView30.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                engine = webView.getEngine();
                engine.load("https://www.youtube.com/watch?v=ipbCUW3umJU");
                Stage stage = new Stage();
                stage.setScene(new Scene(webView,800,600));
                stage.show();
            }
        });

        imageView30.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                imageView30.setFitWidth(255);
                imageView30.setFitHeight(140);
            }
        });

        imageView30.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                imageView30.setFitWidth(260);
                imageView30.setFitHeight(144);
            }
        });

        ImageView imageView31 = new ImageView(new Image("/noonegetsoutalive-horror.jpg"));
        imageView31.setFitWidth(260);
        imageView31.setFitHeight(144);

        imageView31.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                engine = webView.getEngine();
                engine.load("https://m.youtube.com/watch?v=2KuvxHTN3Bw");
                Stage stage = new Stage();
                stage.setScene(new Scene(webView,800,600));
                stage.show();
            }
        });

        imageView31.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                imageView31.setFitWidth(255);
                imageView31.setFitHeight(140);
            }
        });

        imageView31.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                imageView31.setFitWidth(260);
                imageView31.setFitHeight(144);
            }
        });

        ImageView imageView32 = new ImageView(new Image("/IT.png"));
        imageView32.setFitWidth(260);
        imageView32.setFitHeight(144);

        imageView32.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                engine = webView.getEngine();
                engine.load("https://m.youtube.com/watch?v=FnCdOQsX5kc");
                Stage stage = new Stage();
                stage.setScene(new Scene(webView,800,600));
                stage.show();
            }
        });

        imageView32.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                imageView32.setFitWidth(255);
                imageView32.setFitHeight(140);
            }
        });

        imageView32.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                imageView32.setFitWidth(260);
                imageView32.setFitHeight(144);
            }
        });

        ImageView imageView33 = new ImageView(new Image("/thesilence.jpg"));
        imageView33.setFitWidth(260);
        imageView33.setFitHeight(144);

        imageView33.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                engine = webView.getEngine();
                engine.load("https://m.youtube.com/watch?v=Y-ufZuqTd5c");
                Stage stage = new Stage();
                stage.setScene(new Scene(webView,800,600));
                stage.show();
            }
        });

        imageView33.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                imageView33.setFitWidth(255);
                imageView33.setFitHeight(140);
            }
        });

        imageView33.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                imageView33.setFitWidth(260);
                imageView33.setFitHeight(144);
            }
        });

        ImageView imageView34 = new ImageView(new Image("/thewholetruth-horror.jpg"));
        imageView34.setFitWidth(260);
        imageView34.setFitHeight(144);

        imageView34.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                engine = webView.getEngine();
                engine.load("https://m.youtube.com/watch?v=wNIY6wfkQxM");
                Stage stage = new Stage();
                stage.setScene(new Scene(webView,800,600));
                stage.show();
            }
        });

        imageView34.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                imageView34.setFitWidth(255);
                imageView34.setFitHeight(140);
            }
        });

        imageView34.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                imageView34.setFitWidth(260);
                imageView34.setFitHeight(144);
            }
        });

        ImageView imageView35 = new ImageView(new Image("/8thnight-horror.jpg"));
        imageView35.setFitWidth(260);
        imageView35.setFitHeight(144);

        imageView35.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                engine = webView.getEngine();
                engine.load("https://m.youtube.com/watch?v=DbYu4-XYNss");
                Stage stage = new Stage();
                stage.setScene(new Scene(webView,800,600));
                stage.show();
            }
        });

        imageView35.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                imageView35.setFitWidth(255);
                imageView35.setFitHeight(140);
            }
        });

        imageView35.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                imageView35.setFitWidth(260);
                imageView35.setFitHeight(144);
            }
        });

        ImageView imageView36 = new ImageView(new Image("/thecon2.jpg"));
        imageView36.setFitWidth(260);
        imageView36.setFitHeight(144);

        imageView36.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                engine = webView.getEngine();
                engine.load("https://m.youtube.com/watch?v=VFsmuRPClr4");
                Stage stage = new Stage();
                stage.setScene(new Scene(webView,800,600));
                stage.show();
            }
        });

        imageView36.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                imageView36.setFitWidth(255);
                imageView36.setFitHeight(140);
            }
        });

        imageView36.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                imageView36.setFitWidth(260);
                imageView36.setFitHeight(144);
            }
        });

        ImageView imageView37 = new ImageView(new Image("/harrypotter.jpg"));
        imageView37.setFitWidth(260);
        imageView37.setFitHeight(144);

        imageView37.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                engine = webView.getEngine();
                engine.load("https://m.youtube.com/watch?v=i8T6vLHusgs");
                Stage stage = new Stage();
                stage.setScene(new Scene(webView,800,600));
                stage.show();
            }
        });

        imageView37.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                imageView.setFitWidth(255);
                imageView.setFitHeight(140);
            }
        });

        imageView37.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                imageView37.setFitWidth(260);
                imageView37.setFitHeight(144);
            }
        });

        hBox3.getChildren().addAll(imageView30,imageView31,imageView32,imageView33,imageView34,imageView35,imageView36,imageView37);

        Label horror = new Label("HORROR");
        horror.setId("horror");
        Hor.getChildren().add(horror);
        Label adventure = new Label("ADVENTURE");
        adventure.setId("horror");
        Ad.getChildren().add(adventure);
        Label Action = new Label("ACTION");
        Action.setId("horror");
        Act.getChildren().add(Action);


        Label t1 = new Label("   The Hunt");
        t1.setId("horror1");
        t1.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                engine = webView.getEngine();
                engine.load("https://www.youtube.com/watch?v=xoWmwsPU5cQ");
                Stage stage = new Stage();
                stage.setScene(new Scene(webView,800,600));
                stage.show();
            }
        });
        Label t2 = new Label("Ice Road");
        t2.setId("horror1");
        t2.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                engine = webView.getEngine();
                engine.load("https://www.youtube.com/watch?v=SHEPdMqrWjE");
                Stage stage = new Stage();
                stage.setScene(new Scene(webView,800,600));
                stage.show();
            }
        });
        Label t3 = new Label("Rock Shazam");
        t3.setId("horror1");
        t3.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                engine = webView.getEngine();
                engine.load("https://m.youtube.com/watch?v=uSSy0hjySRI");
                Stage stage = new Stage();
                stage.setScene(new Scene(webView,800,600));
                stage.show();
            }
        });
        Label t4 = new Label("Extraction");
        t4.setId("horror1");
        t4.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                engine = webView.getEngine();
                engine.load("https://m.youtube.com/watch?v=L6P3nI6VnlY");
                Stage stage = new Stage();
                stage.setScene(new Scene(webView,800,600));
                stage.show();
            }
        });
        Label t5 = new Label("Interceptor");
        t5.setId("horror1");
        t5.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                engine = webView.getEngine();
                engine.load("https://m.youtube.com/watch?v=gqbl8SY2vLc");
                Stage stage = new Stage();
                stage.setScene(new Scene(webView,800,600));
                stage.show();
            }
        });
        Label t6 = new Label("Extinction");
        t6.setId("horror1");
        t6.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                engine = webView.getEngine();
                engine.load("https://m.youtube.com/watch?v=-ePDPGXkvlw");
                Stage stage = new Stage();
                stage.setScene(new Scene(webView,800,600));
                stage.show();
            }
        });
        Label t7 = new Label("Against The Ice");
        t7.setId("horror1");
        t7.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                engine = webView.getEngine();
                engine.load("https://m.youtube.com/watch?v=J44cOSrsJWU");
                Stage stage = new Stage();
                stage.setScene(new Scene(webView,800,600));
                stage.show();
            }
        });
        Label t8 = new Label("Divergent");
        t8.setId("horror1");
        t8.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                engine = webView.getEngine();
                engine.load("https://m.youtube.com/watch?v=sutgWjz10sM");
                Stage stage = new Stage();
                stage.setScene(new Scene(webView,800,600));
                stage.show();
            }
        });

        Label t11 = new Label(" Freddy And Jason");
        t11.setId("horror1");
        t11.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                engine = webView.getEngine();
                engine.load("https://www.youtube.com/watch?v=ipbCUW3umJU");
                Stage stage = new Stage();
                stage.setScene(new Scene(webView,800,600));
                stage.show();
            }
        });
        Label t12 = new Label("No one Gets Out Alive");
        t12.setId("horror1");
        t12.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                engine = webView.getEngine();
                engine.load("https://m.youtube.com/watch?v=2KuvxHTN3Bw");
                Stage stage = new Stage();
                stage.setScene(new Scene(webView,800,600));
                stage.show();
            }
        });
        Label t13 = new Label("IT");
        t13.setId("horror1");
        t13.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                engine = webView.getEngine();
                engine.load("https://m.youtube.com/watch?v=FnCdOQsX5kc");
                Stage stage = new Stage();
                stage.setScene(new Scene(webView,800,600));
                stage.show();
            }
        });
        Label t14 = new Label("The Silence");
        t14.setId("horror1");
        t14.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                engine = webView.getEngine();
                engine.load("https://m.youtube.com/watch?v=Y-ufZuqTd5c");
                Stage stage = new Stage();
                stage.setScene(new Scene(webView,800,600));
                stage.show();
            }
        });
        Label t15 = new Label("The Whole Truth");
        t15.setId("horror1");
        t15.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                engine = webView.getEngine();
                engine.load("https://m.youtube.com/watch?v=wNIY6wfkQxM");
                Stage stage = new Stage();
                stage.setScene(new Scene(webView,800,600));
                stage.show();
            }
        });
        Label t16 = new Label("The 8th Night");
        t16.setId("horror1");
        t16.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                engine = webView.getEngine();
                engine.load("https://m.youtube.com/watch?v=DbYu4-XYNss");
                Stage stage = new Stage();
                stage.setScene(new Scene(webView,800,600));
                stage.show();
            }
        });
        Label t17 = new Label("The Conjuring 2");
        t17.setId("horror1");
        t17.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                engine = webView.getEngine();
                engine.load("https://m.youtube.com/watch?v=VFsmuRPClr4");
                Stage stage = new Stage();
                stage.setScene(new Scene(webView,800,600));
                stage.show();
            }
        });
        Label t18 = new Label("Harry Potter");
        t18.setId("horror1");
        t18.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                engine = webView.getEngine();
                engine.load("https://m.youtube.com/watch?v=i8T6vLHusgs");
                Stage stage = new Stage();
                stage.setScene(new Scene(webView,800,600));
                stage.show();
            }
        });

        Label t111 = new Label(" Mama Jack");
        t111.setId("horror1");
        t111.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                engine = webView.getEngine();
                engine.load("https://m.youtube.com/watch?v=_XXQuJdUOHc");
                Stage stage = new Stage();
                stage.setScene(new Scene(webView,800,600));
                stage.show();
            }
        });
        Label t112 = new Label("Spiderman");
        t112.setId("horror1");
        t112.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                engine = webView.getEngine();
                engine.load("https://m.youtube.com/watch?v=wQkAfmvjWgs");
                Stage stage = new Stage();
                stage.setScene(new Scene(webView,800,600));
                stage.show();
            }
        });
        Label t113 = new Label("King Kong");
        t113.setId("horror1");
        t113.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                engine = webView.getEngine();
                engine.load("https://m.youtube.com/watch?v=hhzrul_MU6c");
                Stage stage = new Stage();
                stage.setScene(new Scene(webView,800,600));
                stage.show();
            }
        });
        Label t114 = new Label("The Raid 2");
        t114.setId("horror1");
        t114.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                engine = webView.getEngine();
                engine.load("https://m.youtube.com/watch?v=PQ6yUHHfZ04");
                Stage stage = new Stage();
                stage.setScene(new Scene(webView,800,600));
                stage.show();
            }
        });
        Label t115 = new Label("ONG BAK");
        t115.setId("horror1");
        t115.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                engine = webView.getEngine();
                engine.load("https://m.youtube.com/watch?v=GQ5qcPsCP9A");
                Stage stage = new Stage();
                stage.setScene(new Scene(webView,800,600));
                stage.show();
            }
        });
        Label t116 = new Label("Home Alone");
        t116.setId("horror1");
        t116.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                engine = webView.getEngine();
                engine.load("https://m.youtube.com/watch?v=K_mXxBj0mX4");
                Stage stage = new Stage();
                stage.setScene(new Scene(webView,800,600));
                stage.show();
            }
        });
        Label t117 = new Label("The Transporter");
        t117.setId("horror1");
        t117.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                engine = webView.getEngine();
                engine.load("https://m.youtube.com/watch?v=7FnbLyv2oio");
                Stage stage = new Stage();
                stage.setScene(new Scene(webView,800,600));
                stage.show();
            }
        });
        Label t118 = new Label("Fast and Furious 9");
        t118.setId("horror1");
        t118.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                engine = webView.getEngine();
                engine.load("https://m.youtube.com/watch?v=_qyw6LC5pnE");
                Stage stage = new Stage();
                stage.setScene(new Scene(webView,800,600));
                stage.show();
            }
        });


//setting the paddings and getting the children for the vboxes and the hboxes
        title1.setSpacing(230);
        title1.getChildren().addAll(t1,t2,t3,t4,t5,t6,t7,t8);
        title2.setSpacing(230);
        title2.getChildren().addAll(t111,t112,t113,t114,t115,t116,t117,t118);
        title3.setSpacing(210);
        title3.getChildren().addAll(t11,t12,t13,t14,t15,t16,t17,t18);
        hBox.setPadding(new Insets(10));
        hBox2.setPadding(new Insets(10));
        hBox3.setPadding(new Insets(10));
        vBox.getChildren().addAll(Act,hBox,title1,Ad,hBox2,title2,Hor,hBox3,title3);
        flowPane.getChildren().add(vBox);

    }

    public static void main(String[] args) {
        launch();
    }
}