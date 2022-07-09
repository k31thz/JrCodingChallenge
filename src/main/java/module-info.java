module com.example.jrcodingchallenge {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
                        requires org.kordamp.bootstrapfx.core;
            
    opens com.example.jrcodingchallenge to javafx.fxml;
    exports com.example.jrcodingchallenge;
}