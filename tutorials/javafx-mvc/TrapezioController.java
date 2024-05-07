import javafx.stage.Stage;
import javafx.event.Event;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class TrapezioController {
    TrapezioView trapezioView;
    Stage stage;
    public TextField textFieldBaseMaior;
    public TextField textFieldBaseMenor;
    public TextField textFieldAltura;
    public Label labelResultado;

    public TrapezioController() {
        this.stage = new Stage();
        this.trapezioView = new TrapezioView();
        this.trapezioView.setController(this);
    }

    public void iniciar() throws Exception {
        this.trapezioView.start(this.stage);
        this.stage.show();
    }

    public void botaoCalcularClicado(Event e) {
        try {
            double baseMaior = Double.parseDouble(textFieldBaseMaior.getText());
            double baseMenor = Double.parseDouble(textFieldBaseMenor.getText());
            double altura = Double.parseDouble(textFieldAltura.getText());
            double area = calcularAreaTrapezio(baseMaior, baseMenor, altura);
            labelResultado.setText("A área do trapézio é: " + area + " cm².");
        } catch (NumberFormatException exception) {
            labelResultado.setText("Dados de entrada incompletos ou inválidos");
        }
    }

    public void botaoLimparClicado(Event e) {
        textFieldBaseMaior.setText("");
        textFieldBaseMenor.setText("");
        textFieldAltura.setText("");
        labelResultado.setText("");
    }

    private double calcularAreaTrapezio(double baseMaior, double baseMenor, double altura) {
        return (baseMaior + baseMenor) * altura / 2.0;
    }
}
