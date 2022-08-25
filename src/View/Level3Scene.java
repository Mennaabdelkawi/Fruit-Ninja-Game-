package View;

import javafx.animation.AnimationTimer;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;


public class Level3Scene {

    Scene scene;
    AnchorPane anchorPane = new AnchorPane();
    Stage window;
    HomeScene homeScene;
    AnimationTimer timer;
    AnimationTimer timer1;
    ArrayList<ImageView> drop = new ArrayList<>();
    ArrayList<ImageView> bombs = new ArrayList<>();
    SwordImage swordImage = new SwordImage();
    Timeline timeline1;
    Timeline timeline2;
    Timeline timeline3;
    Timeline timeline4;
    Timeline timeline5;
    Timeline timeline6;
    Timeline timeline7;
    Timeline timeline8;
    Timeline timeline9;
    Timeline timeline10;
    ImageView imv3;
    ImageView imv4;
    ImageView imv5;
    ImageView gameOver;
    ImageView exit;
    ImageView play;
    ImageView resume;
    ImageView replay;
    double mouseX;
    double mousey;
    ImageView cont;
    double speed;
    double falling;
    double falling1;
    double falling2;
    double falling3;
    double falling4;
    double falling5;
    double falling6;
    double falling7;
    double falling8;
    double falling9;
    double falling10;
    int missed;
    int scored  = 0 ;
    Label lblScored;


    public Level3Scene(Stage stage)
    {
        this.window=stage;
    }

    public void prepareScene() throws FileNotFoundException {

        missed = 0;
        speed = 1;
        falling = 9050;
        falling1 = 10050;
        falling2 = 50000;
        falling3 = 6050;
        falling4 = 6550;
        falling5 = 7000;
        falling6 = 8050;
        falling7 = 9050;
        falling8 = 6850;
        falling9 = 9050;
        falling9 = 7000;


        scene = new Scene(anchorPane,1023,637);


        FileInputStream input = new FileInputStream("E:\\Fruit Ninja Game  Project 2\\src\\View\\Images\\groundedit.png");
        Image image = new Image(input);
        BackgroundImage backgroundimage = new BackgroundImage(image,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        Background background = new Background(backgroundimage);



        final ImageView imv1 = new ImageView();
        final Image image1 = new Image("View/Images/back.png",true);
        imv1.setImage(image1);
        imv1.setFitHeight(60);
        imv1.setFitWidth(60);
        imv1.setLayoutY(550);
        imv1.setLayoutX(70);
        imv1.setOnMouseClicked(e->window.setScene(homeScene.getScene()));


        final ImageView imv2 = new ImageView();
        final Image image2 = new Image("View/Images/HalfWatermelonLogo.png",true);
        imv2.setImage(image2);
        imv2.setFitHeight(70);
        imv2.setFitWidth(70);
        imv2.setLayoutY(0);
        imv2.setLayoutX(0);


        imv3 = new ImageView();
        final Image image3 = new Image("View/Images/red.png",true);
        imv3.setImage(image3);
        imv3.setFitHeight(50);
        imv3.setFitWidth(50);
        imv3.setLayoutY(10);
        imv3.setLayoutX(852);


        imv4 = new ImageView();
        final Image image4 = new Image("View/Images/red.png",true);
        imv4.setImage(image4);
        imv4.setFitHeight(60);
        imv4.setFitWidth(60);
        imv4.setLayoutY(10);
        imv4.setLayoutX(890);


        imv5 = new ImageView();
        final Image image5 = new Image("View/Images/red.png",true);
        imv5.setImage(image5);
        imv5.setFitHeight(70);
        imv5.setFitWidth(70);
        imv5.setLayoutY(10);
        imv5.setLayoutX(930);


        timeline1 = new Timeline(new KeyFrame(Duration.millis(falling1), event -> {
            speed += falling1 / 80000;
            drop.add(orange());
            anchorPane.getChildren().add((drop.get(drop.size() - 1)));
        }));
        timeline1.setCycleCount(20);


        timeline2 = new Timeline(new KeyFrame(Duration.millis(falling2), event -> {
            speed += falling2 / 80600;
            drop.add(kiwi());
            anchorPane.getChildren().add(( drop.get(drop.size() - 1)));
        }));
        timeline2.setCycleCount(20);


        timeline3 = new Timeline(new KeyFrame(Duration.millis(falling3), event -> {
            speed += falling3 / 80000;
            drop.add(watermelon());
            anchorPane.getChildren().add(( drop.get(drop.size() - 1)));
        }));
        timeline3.setCycleCount(20);


        timeline4 = new Timeline(new KeyFrame(Duration.millis(falling4), event -> {
            speed += falling4 / 87000;
            drop.add(specialFruit1());
            anchorPane.getChildren().add(( drop.get(drop.size() - 1)));
        }));
        timeline4.setCycleCount(3);


        timeline5 = new Timeline(new KeyFrame(Duration.millis(falling5), event -> {
            speed += falling5 / 80400;
            drop.add(specialFruit2());
            anchorPane.getChildren().add(( drop.get(drop.size() - 1)));
        }));
        timeline5.setCycleCount(3);


        timeline6 = new Timeline(new KeyFrame(Duration.millis(falling6), event -> {
            speed += falling6 / 80300;
            bombs.add(bomb1());
            anchorPane.getChildren().add(( bombs.get(bombs.size() - 1)));
        }));
        timeline6.setCycleCount(11);


        timeline7 = new Timeline(new KeyFrame(Duration.millis(falling7), event -> {
            speed += falling7 / 80300;
            bombs.add(bomb2());
            anchorPane.getChildren().add(( bombs.get(bombs.size() - 1)));
        }));
        timeline7.setCycleCount(11);


        timeline8 = new Timeline(new KeyFrame(Duration.millis(falling8), event -> {
            speed += falling8 / 80300;
            drop.add(pineApple());
            anchorPane.getChildren().add(( drop.get(drop.size() - 1)));
        }));
        timeline8.setCycleCount(20);


        timeline9 = new Timeline(new KeyFrame(Duration.millis(falling9), event -> {
            speed += falling9 / 80300;
            bombs.add(bomb2());
            anchorPane.getChildren().add(( bombs.get(bombs.size() - 1)));
        }));
        timeline9.setCycleCount(11);


        timeline10 = new Timeline(new KeyFrame(Duration.millis(falling10), event -> {
            speed += falling10 / 80300;
            drop.add(banana());
            anchorPane.getChildren().add(( drop.get(drop.size() - 1)));
        }));
        timeline10.setCycleCount(20);


        gameOver = new ImageView();
        Image gameOverImage = new Image("View/Images/Game Over.png",true);
        gameOver.setImage(gameOverImage);
        gameOver.setFitHeight(400);
        gameOver.setFitWidth(800);
        gameOver.setLayoutY(100);
        gameOver.setLayoutX(100);
        gameOver.setVisible(false);


        exit = new ImageView();
        Image exitImage = new Image("View/Images/exit game.png",true);
        exit.setImage(exitImage);
        exit.setFitWidth(60);
        exit.setFitHeight(60);
        exit.setLayoutY(400);
        exit.setLayoutX(500);
        exit.setVisible(false);

        replay = new ImageView();
        Image replayImage = new Image("View/Images/repeat.png",true);
        replay.setImage(replayImage);
        replay.setFitWidth(60);
        replay.setFitHeight(60);
        replay.setLayoutY(400);
        replay.setLayoutX(400);
        replay.setVisible(false);
        replay.setOnMouseClicked(e->{
            gameOver.setVisible(false);
            exit.setVisible(false);
            replay.setVisible(false);
            scored=0;
            lblScored.setText("Score : " +scored);
            timeline1.playFromStart();
            timeline2.playFromStart();
            timeline3.playFromStart();
            timeline4.playFromStart();
            timeline5.playFromStart();
            timeline6.playFromStart();
            timeline7.playFromStart();
            timeline8.playFromStart();
            timeline9.playFromStart();
            timeline10.playFromStart();
            timer.start();
            timer1.start();
        });

        resume = new ImageView();
        Image resumeImage = new Image("View/Images/pause.png",true);
        resume.setImage(resumeImage);
        resume.setFitWidth(60);
        resume.setFitHeight(60);
        resume.setLayoutY(550);
        resume.setLayoutX(150);
        resume.setVisible(true);
        resume.setOnMouseClicked(e->{
            resume.setVisible(false);
            play.setVisible(true);
            timeline1.stop();
            timeline2.stop();
            timeline3.stop();
            timeline4.stop();
            timeline5.stop();
            timeline6.stop();
            timeline7.stop();
            timeline8.stop();
            timeline9.stop();
            timeline10.stop();
            timer.stop();
            timer1.stop();
        });



        play = new ImageView();
        Image playImage = new Image("View/Images/play.png",true);
        play.setImage(playImage);
        play.setFitWidth(60);
        play.setFitHeight(60);
        play.setLayoutY(550);
        play.setLayoutX(150);
        play.setVisible(false);
        play.setOnMouseClicked(e->{
            play.setVisible(false);
            resume.setVisible(true);
            timeline1.play();
            timeline2.play();
            timeline3.play();
            timeline4.play();
            timeline5.play();
            timeline6.play();
            timeline7.play();
            timeline8.play();
            timeline9.play();
            timeline10.play();
            timer.start();
            timer1.start();
        });


        timer1 = new AnimationTimer() {
            @Override
            public void handle(long now) {
                for (int i = 0; i < bombs.size(); i++) {
                    (bombs.get(i)).setLayoutY(( bombs.get(i)).getLayoutY() + speed + ( bombs.get(i)).getLayoutY() / 150);
                }
            }
        };


        timer = new AnimationTimer() {
            @Override
            public void handle(long arg0) {
                cont.setLayoutX(mouseX);
                cont.setLayoutY(mousey);
                for (int i = 0; i < drop.size(); i++) {
                    ( drop.get(i)).setLayoutY(( drop.get(i)).getLayoutY() + speed + ( drop.get(i)).getLayoutY() / 150);

                    if (( drop.get(i)).getLayoutY() >= 590 && (drop.get(i)).getId().equals("Notfruit"))
                    {
                        anchorPane.getChildren().remove((drop.get(i)));
                        drop.remove(i);
                        missed += 1;
                        if (missed ==  1)
                        {
                            imv3.setVisible(false);
                        } else if (missed ==  2)
                        {
                            imv4.setVisible(false);
                        } else if (missed ==  3)
                        {
                            imv5.setVisible(false);
                            gameOver.setVisible(true);
                            exit.setVisible(true);
                            replay.setVisible(true);
                            timeline1.stop();
                            timeline2.stop();
                            timeline3.stop();
                            timeline4.stop();
                            timeline5.stop();
                            timeline6.stop();
                            timeline7.stop();
                            timeline8.stop();
                            timeline9.stop();
                            timeline10.stop();
                            timer.stop();
                            timer1.stop();
                            exit.setOnMouseClicked(e->System.exit(0));
                        }
                    }
                }
            }
        };

        cont = swordImage.sword();
        scene.setOnMouseMoved(e -> {
            mouseX = e.getX();
            mousey=e.getY();
        });


        lblScored = new Label("Score : " +scored);
        lblScored.setLayoutX(120);
        lblScored.setLayoutY(10);
        lblScored.setTextFill(Color.web("Yellow"));
        lblScored.setFont(new Font("Bold",30));


        anchorPane.setBackground(background);
        anchorPane.getChildren().addAll(imv1,imv2,imv3,imv4,imv5,play,resume,replay,exit,gameOver,lblScored,cont);

    }

    public Scene getScene() {
        return this.scene;
    }

    public void setHomeScene(HomeScene homeScene) {
        this.homeScene = homeScene;
    }

    public ImageView watermelon(){

        ImageView imv6 = new ImageView();
        Image image6 = new Image("View/Images/Watermelonfruit.png",true);
        Image image7 = new Image("View/Images/cuttedmelon.png",true);
        imv6.setImage(image6);
        imv6.setId("Notfruit");
        imv6.setLayoutX(rand(200, 700));
        imv6.setFitWidth(130);
        imv6.setFitHeight(130);
        imv6.setOnMouseClicked(e->
        {
            imv6.setImage(image7);
            imv6.setId("fruit");
            scored+=1;
            lblScored.setText("Score : " +scored);
            final Media media = new Media(new File("E:\\Fruit Ninja Game  Project 2\\src\\View\\Sound\\cut_fruit4.mp3").toURI().toString());
            final MediaPlayer mediaPlayer = new MediaPlayer(media);
            mediaPlayer.play();
            Timeline applerotation = new Timeline(
                    new KeyFrame(Duration.millis(10), event-> imv6.setRotate(imv6.getRotate() + 1))
            );
            applerotation.setCycleCount(Timeline.INDEFINITE);
            applerotation.play();
        });
        return imv6;

    }


    public ImageView orange()
    {
        ImageView imv6 = new ImageView();
        Image image6 = new Image("View/Images/orange.png",true);
        Image image7 = new Image("View/Images/cuttedOrange.png",true);
        imv6.setImage(image6);
        imv6.setId("Notfruit");
        imv6.setLayoutX(rand(200, 700));
        imv6.setFitWidth(130);
        imv6.setFitHeight(130);
        imv6.setOnMouseClicked(e->
        {
            imv6.setImage(image7);
            scored+=1;
            imv6.setId("fruit");
            lblScored.setText("Score : " +scored);
            final Media media = new Media(new File("E:\\Fruit Ninja Game  Project 2\\src\\View\\Sound\\cut_fruit4.mp3").toURI().toString());
            final MediaPlayer mediaPlayer = new MediaPlayer(media);
            mediaPlayer.play();
            Timeline applerotation = new Timeline(
                    new KeyFrame(Duration.millis(10), event-> imv6.setRotate(imv6.getRotate() + 1))
            );
            applerotation.setCycleCount(Timeline.INDEFINITE);
            applerotation.play();
        });
        return imv6;

    }


    public ImageView specialFruit1()
    {
        ImageView imv7 = new ImageView();
        Image image7 = new Image("View/Images/bananaSpecial1.png",true);
        Image image8 = new Image("View/Images/bouns10.png",true);
        imv7.setImage(image7);
        imv7.setId("Notfruit");
        imv7.setLayoutX(rand(200, 700));
        imv7.setFitWidth(100);
        imv7.setFitHeight(100);
        imv7.setOnMouseClicked(e->
        {
            imv7.setImage(image8);
            scored+=10;
            imv7.setId("fruit");
            lblScored.setText("Score : " +scored);
            final Media media = new Media(new File("E:\\Fruit Ninja Game  Project 2\\src\\View\\Sound\\cut_fruit1.mp3").toURI().toString());
            final MediaPlayer mediaPlayer = new MediaPlayer(media);
            mediaPlayer.play();
            Timeline applerotation = new Timeline(
                    new KeyFrame(Duration.millis(10), event-> imv7.setRotate(imv7.getRotate() + 1))
            );
            applerotation.setCycleCount(Timeline.INDEFINITE);
            applerotation.play();
        });
        return imv7;
    }

    public ImageView specialFruit2()
    {
        ImageView imv7 = new ImageView();
        Image image7 = new Image("View/Images/Starfruit1.png",true);
        Image image8 = new Image("View/Images/bouns5.png",true);
        imv7.setImage(image7);
        imv7.setId("Notfruit");
        imv7.setLayoutX(rand(200, 700));
        imv7.setFitWidth(100);
        imv7.setFitHeight(100);
        imv7.setOnMouseClicked(e->
        {
            imv7.setImage(image8);
            imv7.setId("fruit");
            scored+=5;
            lblScored.setText("Score : " +scored);
            final Media media = new Media(new File("E:\\Fruit Ninja Game  Project 2\\src\\View\\Sound\\cut_fruit1.mp3").toURI().toString());
            final MediaPlayer mediaPlayer = new MediaPlayer(media);
            mediaPlayer.play();
            Timeline applerotation = new Timeline(
                    new KeyFrame(Duration.millis(10), event-> imv7.setRotate(imv7.getRotate() + 1))
            );
            applerotation.setCycleCount(Timeline.INDEFINITE);
            applerotation.play();
        });
        return imv7;
    }


    public ImageView kiwi()
    {
        ImageView imv8 = new ImageView();
        Image image8 = new Image("View/Images/kiwi1.png",true);
        Image image9 = new Image("View/Images/kiwiCutted.png",true);
        imv8.setImage(image8);
        imv8.setLayoutX(rand(200,700));
        imv8.setId("Notfruit");
        imv8.setFitWidth(100);
        imv8.setFitHeight(100);
        imv8.setOnMouseClicked(e->
        {
            imv8.setImage(image9);
            imv8.setId("fruit");
            scored+=1;
            lblScored.setText("Score : " +scored);
            final Media media = new Media(new File("E:\\Fruit Ninja Game  Project 2\\src\\View\\Sound\\cut_fruit4.mp3").toURI().toString());
            final MediaPlayer mediaPlayer = new MediaPlayer(media);
            mediaPlayer.play();
            Timeline applerotation = new Timeline(
                    new KeyFrame(Duration.millis(10), event-> imv8.setRotate(imv8.getRotate() + 1))
            );
            applerotation.setCycleCount(Timeline.INDEFINITE);
            applerotation.play();
        });
        return imv8;
    }


    public ImageView pineApple()
    {
        ImageView imv8 = new ImageView();
        Image image8 = new Image("View/Images/Pineapple1.png",true);
        Image image9 = new Image("View/Images/pineappleCutted.png",true);
        imv8.setImage(image8);
        imv8.setLayoutX(rand(200,700));
        imv8.setId("Notfruit");
        imv8.setFitWidth(140);
        imv8.setFitHeight(140);
        imv8.setOnMouseClicked(e->
        {
            imv8.setImage(image9);
            imv8.setId("fruit");
            scored+=1;
            lblScored.setText("Score : " +scored);
            final Media media = new Media(new File("E:\\Fruit Ninja Game  Project 2\\src\\View\\Sound\\cut_fruit4.mp3").toURI().toString());
            final MediaPlayer mediaPlayer = new MediaPlayer(media);
            mediaPlayer.play();
            Timeline applerotation = new Timeline(
                    new KeyFrame(Duration.millis(10), event-> imv8.setRotate(imv8.getRotate() + 1))
            );
            applerotation.setCycleCount(Timeline.INDEFINITE);
            applerotation.play();
        });
        return imv8;
    }

    public ImageView banana()
    {
        ImageView imv8 = new ImageView();
        Image image8 = new Image("View/Images/banana.png",true);
        Image image9 = new Image("View/Images/cuttedBanana.png",true);
        imv8.setImage(image8);
        imv8.setLayoutX(rand(200,700));
        imv8.setId("Notfruit");
        imv8.setFitWidth(100);
        imv8.setFitHeight(100);
        imv8.setOnMouseClicked(e->
        {
            imv8.setImage(image9);
            imv8.setId("fruit");
            scored+=1;
            lblScored.setText("Score : " +scored);
            final Media media = new Media(new File("E:\\Fruit Ninja Game  Project 2\\src\\View\\Sound\\cut_fruit4.mp3").toURI().toString());
            final MediaPlayer mediaPlayer = new MediaPlayer(media);
            mediaPlayer.play();
            Timeline applerotation = new Timeline(
                    new KeyFrame(Duration.millis(10), event-> imv8.setRotate(imv8.getRotate() + 1))
            );
            applerotation.setCycleCount(Timeline.INDEFINITE);
            applerotation.play();
        });
        return imv8;
    }


    public ImageView bomb1()
    {
        ImageView imv8 = new ImageView();
        Image image8 = new Image("View/Images/bomb1.png",true);
        imv8.setImage(image8);
        imv8.setLayoutX(rand(200,700));
        imv8.setFitWidth(100);
        imv8.setFitHeight(100);
        imv8.setOnMouseClicked(e ->{
                    if(!imv3.isVisible() && imv4.isVisible())
                    {
                        imv4.setVisible(false);
                    }
                    else if (imv3.isVisible())
                    {
                        imv3.setVisible(false);
                    }
                    else
                    {
                        imv5.setVisible(false);
                    }
                    if(!imv5.isVisible())
                    {
                        gameOver.setVisible(true);
                        exit.setVisible(true);
                        exit.setOnMouseClicked(event->System.exit(0));
                        replay.setVisible(true);
                    }
                    final Media media = new Media(new File("E:\\Fruit Ninja Game  Project 2\\src\\View\\Sound\\cut_bomb.mp3").toURI().toString());
                    final MediaPlayer mediaPlayer = new MediaPlayer(media);
                    mediaPlayer.play();
                }
        );
        return imv8;
    }


    public ImageView bomb2()
    {
        ImageView imv8 = new ImageView();
        Image image8 = new Image("View/Images/bomblives1.png",true);
        imv8.setImage(image8);
        imv8.setLayoutX(rand(150,800));
        imv8.setFitWidth(100);
        imv8.setFitHeight(100);
        imv8.setOnMouseClicked(e-> {
            gameOver.setVisible(true);
            exit.setVisible(true);
            exit.setOnMouseClicked(event->System.exit(0));
            replay.setVisible(true);
            timeline1.stop();
            timeline2.stop();
            timeline3.stop();
            timeline4.stop();
            timeline5.stop();
            timeline6.stop();
            timeline7.stop();
            timeline8.stop();
            timeline9.stop();
            timeline10.stop();
            timer.stop();
            timer1.stop();
            final Media media = new Media(new File("E:\\Fruit Ninja Game  Project 2\\src\\View\\Sound\\cut_bomb.mp3").toURI().toString());
            final MediaPlayer mediaPlayer = new MediaPlayer(media);
            mediaPlayer.play();
        });
        return imv8;
    }


    public int rand(int min, int max) {
        return (int)(Math.random() * max + min);
    }

}
