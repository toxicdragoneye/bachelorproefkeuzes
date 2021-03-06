/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bachelorproefkeuzes;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class FXMLDocumentController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    
    @FXML
    private AnchorPane anchorpane_student;
    
    @FXML
    private Label label_student_BPselected;
    
    @FXML
    private Label label_student_BPwarning;
    
    @FXML
    private Label label_student_BP;

    @FXML
    private TextArea label_student_beschrijving;
    
    @FXML
    private TableView<Bachelorproef> tableview_student_BPaanvraag;

    @FXML
    private TableColumn<Bachelorproef, String> tablecolumn_AanvraagBP_titel;

    @FXML
    private TableColumn<Bachelorproef, String> tablecolumn_AanvraagBP_beschrijving;

    @FXML
    private Button button_student_BPaanvragen;
    
    @FXML
    private Button button_student_uitloggen;
    
    @FXML
    private Label label_student_studentID;

    @FXML
    private Label label_student_name;
    
    @FXML
    private TextField textfield_student_Wveranderen;

    @FXML
    private TextField textfield_student_HWveranderen;

    @FXML
    private Button button_student_Wveranderen;
    
    @FXML
    private AnchorPane anchorpane_login;

    @FXML
    private TextField textfield_login_studentID;

    @FXML
    private TextField textfield_login_paswoord;

    @FXML
    private Button button_login_login;

    @FXML
    private Label label_login_Wfout;

    @FXML
    private Button button_login_Wvergeten;

    @FXML
    private CheckBox checkbox_admin;
    
    @FXML
    private AnchorPane anchorpane_admin;
    
    @FXML
    private Button button_admin_Uitloggen;
   
    @FXML
    private AnchorPane anchorpane_bp;
    
    @FXML
    private TextField textfield_BP_verwijderen;

    @FXML
    private Button button_BP_verwijderen;

    @FXML
    private Label label;

    @FXML
    private TextField titel;

    @FXML
    private TextArea beschrijvingen;

    @FXML
    private Button voegBPtoe;
    
    @FXML
    private Button button_GoToMenu_bp;
    
    @FXML
    private AnchorPane anchorpane_admin_student;
    
    @FXML
    private Button button_haalWop;
    
    @FXML
    private TextField textfield_studentID_deleteS;

    @FXML
    private TextField textfield_wachtwoord_deleteS;
    
    @FXML
    private Button button_verwijderStudent;
    
    @FXML
    private TextField textfield_naamStudent;
    
    @FXML
    private TextField textfield_wachtwoord;

    @FXML
    private TextField textfield_herhaalWachtwoord;
    
    @FXML
     private TextField textfield_studentID_getW;
    
    @FXML
    private Button voegStudenttoe;

    @FXML
    private Label label_foutWachtwoord;

    @FXML
    private Button button_goToMenu_student;

    @FXML
    private AnchorPane anchorpane_menu;
    
    @FXML
    private Button button_admin_goToPunten;

    @FXML
    private Button button_goToStudent;

    @FXML
    private Button button_goToBP;
    
    @FXML
    private AnchorPane anchorpane_tableview;
    
    @FXML
    private TableView<Bachelorproef> bachelorproeven;

    @FXML
    private TableColumn<Bachelorproef, String> titel_column;

    @FXML
    private TableColumn<Bachelorproef, String> beschrijving_column;
    
    @FXML
    private TableView<Student> studenten;

    @FXML
    private TableColumn<Student, Number> column_id;

    @FXML
    private TableColumn<Student, String> column_naam;
    
    @FXML
    private AnchorPane anchorpane_admin_punten;

    @FXML
    private Button button_admin_punten_back;

    @FXML
    private TableView<Keuze> tableview_keuzes;

    @FXML
    private TableColumn<Keuze, Number> tablecolumn_Keuzes_student;

    @FXML
    private TableColumn<Keuze, Number> tablecolumn_keuzes_BP;

    @FXML
    private TableColumn<Keuze, Number> tablecolumn_keuzes_punten;
    
    @FXML
    private TextField textfield_admin_punten_SID;

    @FXML
    private TextField textfield_admin_punten_naam;

    @FXML
    private TextField textfield_admin_punten_BPID;

    @FXML
    private TextField textfield_admin_punten_BPtitel;

    @FXML
    private TextArea textfield_admin_punten_beschijving;

    @FXML
    private Button button_admin_punten_toekennen;
    
    @FXML
    private TextField textfield_admin_punten_punten;
    
    @FXML
    private Button button_admin_punten_BPaanvraagAfkeuren;
    
    @FXML
    private Button button_admin_punten_hoogste;

    @FXML
    private Button button_admin_punten_laagste;
    
    @FXML
    private Button button_admin_punten_gemPunt;

    
    private BachelorproevenDB modelBP;
    private StudentenDB modelStudent;

    @FXML
    void initialize() {
        modelBP = new BachelorproevenDB();
        modelStudent = new StudentenDB();
        
        voegBPtoe.setOnAction(event -> voegBPToe());
        voegStudenttoe.setOnAction(event -> voegStudentToe());
        
        button_goToStudent.setOnAction(event -> gaNaarStudentScherm());
        button_goToBP.setOnAction(event -> gaNaarBachelorproefScherm());
        button_goToMenu_student.setOnAction(event -> gaNaarMenu_Student());
        button_GoToMenu_bp.setOnAction(event -> gaNaarMenu_BP());
        button_haalWop.setOnAction(event -> haalWachtwoordOp());
        button_verwijderStudent.setOnAction(event -> verwijderStudent());
        button_BP_verwijderen.setOnAction(event -> verwijderBP());
        button_login_login.setOnAction(event -> login());
        button_login_Wvergeten.setOnAction(event -> wachtwoordVergeten());
        button_student_uitloggen.setOnAction(event -> studentUitloggen());
        button_admin_Uitloggen.setOnAction(event -> adminUitloggen());
        button_student_Wveranderen.setOnAction(event -> wachtwoordVeranderen());
        button_student_BPaanvragen.setOnAction(event -> aanvraagBP());
        button_admin_goToPunten.setOnAction(event -> gaNaarPuntenScherm());
        button_admin_punten_back.setOnAction(event -> gaNaarMenu_punten());
        button_admin_punten_toekennen.setOnAction(event -> puntenToekennen());
        button_admin_punten_BPaanvraagAfkeuren.setOnAction(event -> bpAanvraagAfkeuren());
        button_admin_punten_laagste.setOnAction(event -> laagstePuntZoeken());
        button_admin_punten_hoogste.setOnAction(event -> hoogstePuntZoeken());
        button_admin_punten_gemPunt.setOnAction(event -> gemiddeldePuntZoeken());
        
        
        vulTabellen();
        vulKeuzeTabel();
        
        //ChangeListeners -> dienen om items te selecteren in de tabellen van bachelorproef aanvragen en keuzes
        tableview_student_BPaanvraag.getSelectionModel().selectedItemProperty()
                    .addListener((observable,oud,nieuw) -> toonGeselecteerdeBP(nieuw));
        tableview_keuzes.getSelectionModel().selectedItemProperty()
                .addListener((observable,oud,nieuw) -> toonKeuze(nieuw));
    }
    
    /////////////////  Methodes die bij het Login scherm horen  ////////////////
    
    public void login() {
        String text = textfield_login_studentID.getText();
        Integer studentID = Integer.parseInt(text); 
        String paswoord = textfield_login_paswoord.getText();
        if( paswoord.equals(modelStudent.getWachtwoord(studentID)) ){
               if(checkbox_admin.isSelected()){
                   anchorpane_login.setVisible(false);
                   anchorpane_admin.setVisible(true);
                   textfield_login_paswoord.clear();
               } else {
                   anchorpane_login.setVisible(false);
                   anchorpane_student.setVisible(true);
                   vulBPaanvraagTabel();
                   label_student_studentID.setText(textfield_login_studentID.getText());
                   label_student_name.setText(modelStudent.getNaam(studentID));
                   
                   label_student_BP.setText(modelBP.getBPkeuze(studentID));
                   label_student_beschrijving.setText(modelBP.getBPbeschrijvingKeuze(studentID));
                   
                   textfield_login_paswoord.clear();
               }
        
        } else {
            label_login_Wfout.setText("het wachtwoord is fout of de student ID bestaat niet");
            textfield_login_paswoord.clear();
        }
    }   
    public void wachtwoordVergeten() {
        String text = textfield_login_studentID.getText();
        Integer studentID = Integer.parseInt(text);
        String paswoord = modelStudent.getWachtwoord(studentID);
        button_login_Wvergeten.setText(paswoord);
    }
    
    
    ///////////////  Methodes die bij het studentenscherm horen  ///////////////
    
    public void vulBPaanvraagTabel() {
        tablecolumn_AanvraagBP_titel.setCellValueFactory(cel -> cel.getValue().titelProperty());
        tablecolumn_AanvraagBP_beschrijving.setCellValueFactory(cel -> cel.getValue().beschrijvingProperty());
        tableview_student_BPaanvraag.setItems(modelBP.getBeschikbareProeven());
    } 
    public void wachtwoordVeranderen() {
        String paswoord = textfield_student_Wveranderen.getText();
        String herhalingPaswoord = textfield_student_HWveranderen.getText();
        String text = label_student_studentID.getText();
        Integer studentID = Integer.parseInt(text);
        if(paswoord.equals(herhalingPaswoord)){
            modelStudent.wachtwoordVeranderen(studentID, paswoord);
            textfield_student_Wveranderen.clear();
            textfield_student_HWveranderen.clear();
        } else {
            textfield_student_Wveranderen.setStyle("-fx-text-inner-color: red;");
            textfield_student_HWveranderen.setStyle("-fx-text-inner-color: red;");
        }
    }    
    public void aanvraagBP() {
        if(label_student_BP.getText()== null && label_student_beschrijving.getText() == null){
            Integer bpID = modelBP.getID(label_student_BPselected.getText());
            String text = label_student_studentID.getText();
            Integer studentID = Integer.parseInt(text);
            
            modelStudent.voegKeuzeToe(studentID, bpID);
            label_student_BP.setText(modelBP.getBPkeuze(studentID));
            label_student_beschrijving.setText(modelBP.getBPbeschrijvingKeuze(studentID));   
        } else {
            label_student_BPwarning.setText("u heeft al een bachelorproef!");    
        }
    }  
    private void toonGeselecteerdeBP(Bachelorproef nieuw) { //hoort bij de ChangeListener
        String titel = nieuw.getTitel();
        label_student_BPselected.setText(titel);
    }   
    public void studentUitloggen() {
        anchorpane_student.setVisible(false);
        anchorpane_login.setVisible(true);
        label_student_BPwarning.setText("");
        label_student_BPselected.setText("");
    }
    
    
    ///////////////  Methodes die bij het administratiescherm horen  ///////////
    
    public void vulTabellen(){
        titel_column.setCellValueFactory(cel -> cel.getValue().titelProperty());
        beschrijving_column.setCellValueFactory(cel -> cel.getValue().beschrijvingProperty());
        bachelorproeven.setItems(modelBP.getProeven());
        
        column_id.setCellValueFactory(cel -> cel.getValue().idProperty());
        column_naam.setCellValueFactory(cel -> cel.getValue().naamProperty() );
        studenten.setItems(modelStudent.getStudenten());    
    }
    
    // Methodes die bij het administratiescherm_Menu horen
    
    public void gaNaarStudentScherm() {
       anchorpane_menu.setVisible(false);
       anchorpane_admin_student.setVisible(true);
    }
    public void gaNaarBachelorproefScherm() {
        anchorpane_menu.setVisible(false);
        anchorpane_bp.setVisible(true);
    }
    public void adminUitloggen() {
        anchorpane_admin.setVisible(false);
        anchorpane_login.setVisible(true);
    } 
    public void gaNaarPuntenScherm() {
        anchorpane_admin.setVisible(false);
        anchorpane_admin_punten.setVisible(true);
        vulKeuzeTabel();
    }
    
    
    // Methodes die bij het administratiescherm_Student horen
    
    public void voegStudentToe() {     
        if(textfield_wachtwoord.getText().equals(textfield_herhaalWachtwoord.getText())){
            label_foutWachtwoord.setText("");
            Student nieuw = new Student(textfield_naamStudent.getText(),textfield_wachtwoord.getText());
            modelStudent.voegToe(nieuw);
            ObservableList<Student> alles = modelStudent.getStudenten();
            voegStudenttoe.setText(alles.size() + " studenten");
            textfield_naamStudent.clear();
            textfield_wachtwoord.clear();
            textfield_herhaalWachtwoord.clear();
            vulTabellen();
        } else {
            label_foutWachtwoord.setText("wachtwoorden komen niet overeen");
            textfield_wachtwoord.clear();
            textfield_herhaalWachtwoord.clear();
        }    
    }    
    public void haalWachtwoordOp() {
        String text = textfield_studentID_getW.getText();
        Integer studentID = Integer.parseInt(text);
        String wachtwoord = modelStudent.getWachtwoord(studentID);
        button_haalWop.setText(wachtwoord);
    } 
    public void verwijderStudent() {
        String text = textfield_studentID_deleteS.getText();
        Integer studentID = Integer.parseInt(text);
        String paswoord= textfield_wachtwoord_deleteS.getText();
        if(paswoord.equals(modelStudent.getWachtwoord(studentID))){
            modelStudent.verwijderStudent(studentID);
            vulTabellen();
            textfield_studentID_deleteS.clear();
            textfield_wachtwoord_deleteS.clear();
        } else {
            
        }      
    }
    public void gaNaarMenu_Student() {
        anchorpane_admin_student.setVisible(false);
        anchorpane_menu.setVisible(true);    
    }
    
    
    // Methodes die bij het administratiescherm_Bachelorproef horen
    
    public void voegBPToe(){
        if(titel.getText().equals(modelBP.getTitelBP(titel.getText()))){
            titel.setText("//deze BP bestaat al");
        }
        else{
        Bachelorproef nieuw = new Bachelorproef(titel.getText(), 
                                                beschrijvingen.getText());
        modelBP.voegToe(nieuw);
        ObservableList<Bachelorproef> alles = modelBP.getProeven();
        voegBPtoe.setText(alles.size() + " proeven");
        titel.clear();
        beschrijvingen.clear();
        vulTabellen();
        }
    }
    public void verwijderBP() {
        String titelBP = textfield_BP_verwijderen.getText();
        modelBP.verwijderBP(titelBP);
        vulTabellen();
        textfield_BP_verwijderen.clear();
    }
    public void gaNaarMenu_BP() {
        anchorpane_bp.setVisible(false);
        anchorpane_menu.setVisible(true);
    } 
    
    
    //Methodes die bij het administratiescherm_PuntenToekennen horen
     
    public void vulKeuzeTabel(){
        tablecolumn_Keuzes_student.setCellValueFactory(cel -> cel.getValue().studentProperty());
        tablecolumn_keuzes_BP.setCellValueFactory(cel -> cel.getValue().bachelorproefProperty());
        tablecolumn_keuzes_punten.setCellValueFactory(cel -> cel.getValue().puntenProperty());
        tableview_keuzes.setItems(modelStudent.getKeuzes());
    }
    public void puntenToekennen() {
        int punten = Integer.parseInt(textfield_admin_punten_punten.getText());
        int student = Integer.parseInt(textfield_admin_punten_SID.getText());
        int bachelorproef = Integer.parseInt(textfield_admin_punten_BPID.getText());
        
        if (punten > 20){
            textfield_admin_punten_punten.setStyle("-fx-text-inner-color: red;");
        }
        else {
            Keuze keuze = new Keuze(student,bachelorproef,punten);
            modelStudent.puntenToekennen(keuze);
            vulKeuzeTabel();
        }
    }
    private void toonKeuze(Keuze nieuw){ //hoort bij de ChangeListener
        int studentID = nieuw.getStudent();
        String studentIDtext = Integer.toString(studentID);
        textfield_admin_punten_SID.setText(studentIDtext);
        textfield_admin_punten_naam.setText(modelStudent.getNaam(studentID));
        
        int bachelorproefID = nieuw.getBachelorproef();
        String bachelorproefIDtext = Integer.toString(bachelorproefID);
        textfield_admin_punten_BPID.setText(bachelorproefIDtext);
        textfield_admin_punten_BPtitel.setText(modelBP.getTitelBP_id(bachelorproefID));
        textfield_admin_punten_beschijving.setText(modelBP.getBeschrijvingBP(bachelorproefID));
    }  
    public void gaNaarMenu_punten() {
        anchorpane_admin_punten.setVisible(false);
        anchorpane_admin.setVisible(true);
    }
    public void bpAanvraagAfkeuren() {
        int studentID = Integer.parseInt(textfield_admin_punten_SID.getText());
        int bpID = Integer.parseInt(textfield_admin_punten_BPID.getText());
        modelStudent.keuzeVerwijderen(studentID, bpID);
        vulKeuzeTabel();
    }
    public void laagstePuntZoeken() {
        int laagstePunt = modelStudent.getLaagstePunt();
        String laagstePuntString = String.valueOf(laagstePunt);
        button_admin_punten_laagste.setText(laagstePuntString);
    }
    public void hoogstePuntZoeken() {
        int hoogstePunt = modelStudent.getHoogstePunt();
        String hoogstePuntString = String.valueOf(hoogstePunt);
        button_admin_punten_hoogste.setText(hoogstePuntString);
    }
    public void gemiddeldePuntZoeken() {
        int gemPunt = modelStudent.getGemiddeldePunt();
        String gemPuntString = String.valueOf(gemPunt);
        button_admin_punten_gemPunt.setText(gemPuntString);
    }   
}

