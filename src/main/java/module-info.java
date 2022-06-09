module com.animalshelter.animalshelter {
	requires javafx.controls;
	requires javafx.fxml;

	opens com.animalshelter.animalshelter to javafx.fxml;
	exports com.animalshelter.animalshelter;
}