package dk.easv.gui;

import dk.easv.bll.WordsLogic;
import dk.easv.dal.WordsData;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
   //FXML referencer
   @FXML
   private ListView lstAllWords;

    @FXML
    private Label lblTotalWordCount;

    @FXML
    private ListView lstWordsWithA;

    @FXML
    private ListView lstWordsWithN;

    @FXML
    private TextField txtWordSearch;

    @FXML
    private Label lblSearchResult;

    @FXML
    private Label lblSelectedWord;

    @FXML
    private ListView lstHistory;

    private WordsLogic wordsLogic = new WordsLogic();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        for(String w : wordsLogic.getWords())
        {
            lstAllWords.getItems().add(w);
        }
    }

    public void onSearchClick(ActionEvent actionEvent) {

    }

    public void rbtnWholeWordOnAction(ActionEvent actionEvent) {

    }

    public void rbtnPartOfWordOnAction(ActionEvent actionEvent) {

    }

    public void onClearSearchResult(ActionEvent actionEvent) {

    }

    public void lstAllWordsOnMouseClick(MouseEvent mouseEvent) {

    }

    public void onClearHistoryClick(ActionEvent actionEvent) {

    }

    public void onBtnReadNClick(ActionEvent actionEvent) {

    }

    public void onBtnReadAClick(ActionEvent actionEvent) {

    }
}
