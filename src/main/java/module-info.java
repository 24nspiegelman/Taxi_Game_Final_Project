module com.example.taxi_game_final_project {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.taxigame to javafx.fxml;
    exports com.example.taxigame;
}