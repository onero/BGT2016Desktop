/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boardgametournament2016.gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author gta1
 */
public class ScoresController implements Initializable {

    @FXML
    private Label lblGame1;
    @FXML
    private Label lblGame2;
    @FXML
    private Label lblGame3;
    @FXML
    private Label lblGame4;
    @FXML
    private Label lblGame5;
    @FXML
    private Label lblGameBonus;
    @FXML
    private Label lblJoker;
    @FXML
    private Label lblPlayer1;
    @FXML
    private Label lblPlayer2;
    @FXML
    private Label lblPlayer3;
    @FXML
    private Label lblPlayer4;
    @FXML
    private Label lblPlayer5;
    @FXML
    private Label lblJoker1;
    @FXML
    private TextField PointGame1Player1;
    @FXML
    private TextField PointGame1Player2;
    @FXML
    private TextField PointGame1Player3;
    @FXML
    private TextField PointGame1Player4;
    @FXML
    private TextField PointGame1Player5;
    @FXML
    private TextField PointGame2Player1;
    @FXML
    private TextField PointGame2Player2;
    @FXML
    private TextField PointGame2Player3;
    @FXML
    private TextField PointGame2Player4;
    @FXML
    private TextField PointGame2Player5;
    @FXML
    private TextField PointGame3Player1;
    @FXML
    private TextField PointGame3Player2;
    @FXML
    private TextField PointGame3Player3;
    @FXML
    private TextField PointGame3Player4;
    @FXML
    private TextField PointGame3Player5;
    @FXML
    private TextField PointGame4Player1;
    @FXML
    private TextField PointGame4Player2;
    @FXML
    private TextField PointGame4Player3;
    @FXML
    private TextField PointGame4Player4;
    @FXML
    private TextField PointGame4Player5;
    @FXML
    private TextField PointGame5Player1;
    @FXML
    private TextField PointGame5Player2;
    @FXML
    private TextField PointGame5Player3;
    @FXML
    private TextField PointGame5Player4;
    @FXML
    private TextField PointGame5Player5;
    @FXML
    private TextField PointBonusPlayer1;
    @FXML
    private TextField PointBonusPlayer2;
    @FXML
    private TextField PointBonusPlayer3;
    @FXML
    private TextField PointBonusPlayer4;
    @FXML
    private TextField PointBonusPlayer5;
    @FXML
    private TextField JokerGamePlayer1;
    @FXML
    private TextField JokerGamePlayer2;
    @FXML
    private TextField JokerGamePlayer3;
    @FXML
    private TextField JokerGamePlayer4;
    @FXML
    private TextField JokerGamePlayer5;
    @FXML
    private TextField TotalPlayer1;
    @FXML
    private TextField TotalPlayer2;
    @FXML
    private TextField TotalPlayer3;
    @FXML
    private TextField TotalPlayer4;
    @FXML
    private TextField TotalPlayer5;
    @FXML
    private CheckBox checkGame1;

    int player1Total = 0;
    int player2Total = 0;
    int player3Total = 0;
    int player4Total = 0;
    int player5Total = 0;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    /**
     * Checks if PointGame1Player1-5 is not empty, if it is not then adds all
     * the scores to the respective players total score Then displays the score
     * under
     */
    public void addScoreGame1() {
        //TODO Make this dynamic and reusable!
        if (!PointGame1Player1.getText().isEmpty()
                && !PointGame1Player2.getText().isEmpty()
                && !PointGame1Player3.getText().isEmpty()
                && !PointGame1Player4.getText().isEmpty()
                && !PointGame1Player5.getText().isEmpty()) {

            if (!PointGame1Player1.getText().isEmpty()) {
                player1Total += Integer.parseInt(PointGame1Player1.getText());
            }
            if (!PointGame1Player2.getText().isEmpty()) {
                player2Total += Integer.parseInt(PointGame1Player2.getText());
            }
            if (!PointGame1Player3.getText().isEmpty()) {
                player3Total += Integer.parseInt(PointGame1Player3.getText());
            }
            if (!PointGame1Player4.getText().isEmpty()) {
                player4Total += Integer.parseInt(PointGame1Player4.getText());
            }
            if (!PointGame1Player5.getText().isEmpty()) {
                player5Total += Integer.parseInt(PointGame1Player5.getText());
            }
            TotalPlayer1.setText("" + player1Total);
            TotalPlayer2.setText("" + player2Total);
            TotalPlayer3.setText("" + player3Total);
            TotalPlayer4.setText("" + player4Total);
            TotalPlayer5.setText("" + player5Total);
            checkGame1.setDisable(true);
        }

    }

}
