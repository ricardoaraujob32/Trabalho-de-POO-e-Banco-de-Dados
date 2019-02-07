/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Controlador;
import controller.EstadosComboBoxModel;
import java.util.Calendar;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import model.Medico;

/**
 *
 * @author ricardobalduino
 */
public class MedicosManterJPanel extends JPanel implements TituloJanela<Medico> {
    private JTextField txtNome;
    private JTextField txtCodigo;
    private JTextField txtRg;
    private JTextField txtCpf;
    private JTextField txtCidade;
    private JTextField txtBairro;
    private JTextField txtCep;
    private JTextField txtLogradouro;
    private JTextField txtNumero;
    private JTextField txtTelefone;
    private JTextField txtCelular;
    private JTextField txtCrm;
    private JTextField txtEmail;
    private JSpinner spinDataNascimento;
    private JComboBox<String> cbxSexo;
    private JComboBox<String> cbxEstado;
    
    public MedicosManterJPanel() {
        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(10, 23, 46, 14);
        add(lblNome);

        txtNome = new JTextField();
        txtNome.setBounds(57, 20, 338, 20);
        add(txtNome);
        txtNome.setColumns(10);

        JLabel lblCodigo = new JLabel("Código:");
        lblCodigo.setBounds(444, 23, 46, 14);
        add(lblCodigo);

        txtCodigo = new JTextField();
        txtCodigo.setBounds(500, 20, 86, 20);
        add(txtCodigo);
        txtCodigo.setColumns(10);

        JLabel lblDataNascimento = new JLabel("Data de nascimento:");
        lblDataNascimento.setBounds(10, 58, 109, 14);
        add(lblDataNascimento);

        spinDataNascimento = new JSpinner();
        spinDataNascimento.setModel(new SpinnerDateModel(new Date(), null, null, Calendar.HOUR_OF_DAY));
        JSpinner.DateEditor de_spinDataNascimento = new JSpinner.DateEditor(spinDataNascimento, "dd/MM/yyyy");
        spinDataNascimento.setEditor(de_spinDataNascimento);
        spinDataNascimento.setBounds(129, 52, 86, 20);
        add(spinDataNascimento);

        JLabel lblSexo = new JLabel("Sexo:");
        lblSexo.setBounds(242, 58, 40, 14);
        add(lblSexo);

        cbxSexo = new JComboBox<String>();
        cbxSexo.setModel( new DefaultComboBoxModel<String>( new String[] {"Masculino", "Feminino", "Outro"} ) );
        cbxSexo.setBounds(280, 55, 86, 20);
        add(cbxSexo);

        JLabel lblRg = new JLabel("RG:");
        lblRg.setBounds(10, 93, 46, 14);
        add(lblRg);

        txtRg = new JTextField();
        txtRg.setBounds(57, 90, 158, 20);
        add(txtRg);
        txtRg.setColumns(10);

        JLabel lblCpf = new JLabel("CPF:");
        lblCpf.setBounds(242, 93, 33, 14);
        add(lblCpf);

        txtCpf = new JTextField();
        txtCpf.setBounds(280, 87, 176, 20);
        add(txtCpf);
        txtCpf.setColumns(10);

        JLabel lblEstado = new JLabel("Estado:");
        lblEstado.setBounds(478, 93, 46, 14);
        add(lblEstado);

        cbxEstado = new JComboBox<String>();
        cbxEstado.setModel( new EstadosComboBoxModel() );
        cbxEstado.setBounds(534, 90, 52, 20);
        add(cbxEstado);

        JLabel lblCidade = new JLabel("Cidade:");
        lblCidade.setBounds(10, 135, 46, 14);
        add(lblCidade);

        txtCidade = new JTextField();
        txtCidade.setBounds(57, 132, 193, 20);
        add(txtCidade);
        txtCidade.setColumns(10);

        JLabel lblBairro = new JLabel("Bairro:");
        lblBairro.setBounds(271, 135, 46, 14);
        add(lblBairro);

        txtBairro = new JTextField();
        txtBairro.setBounds(309, 132, 351, 20);
        add(txtBairro);
        txtBairro.setColumns(10);

        JLabel lblCep = new JLabel("CEP:");
        lblCep.setBounds(10, 177, 46, 14);
        add(lblCep);

        txtCep = new JTextField();
        txtCep.setBounds(44, 174, 128, 20);
        add(txtCep);
        txtCep.setColumns(10);

        JLabel lblLogradouro = new JLabel("Logradouro:");
        lblLogradouro.setBounds(186, 177, 64, 14);
        add(lblLogradouro);

        txtLogradouro = new JTextField();
        txtLogradouro.setBounds(259, 174, 401, 20);
        add(txtLogradouro);
        txtLogradouro.setColumns(10);

        JLabel lblNumero = new JLabel("Número:");
        lblNumero.setBounds(10, 220, 46, 14);
        add(lblNumero);

        txtNumero = new JTextField();
        txtNumero.setBounds(65, 217, 94, 20);
        add(txtNumero);
        txtNumero.setColumns(10);

        JLabel lblTelefone = new JLabel("Telefone:");
        lblTelefone.setBounds(185, 220, 46, 14);
        add(lblTelefone);

        txtTelefone = new JTextField();
        txtTelefone.setBounds(241, 217, 181, 20);
        add(txtTelefone);
        txtTelefone.setColumns(10);

        JLabel lblCelular = new JLabel("Celular:");
        lblCelular.setBounds(444, 220, 46, 14);
        add(lblCelular);

        txtCelular = new JTextField();
        txtCelular.setBounds(491, 217, 169, 20);
        add(txtCelular);
        txtCelular.setColumns(10);

        JLabel lblCrm = new JLabel("CRM:");
        lblCrm.setBounds(10, 258, 46, 14);
        add(lblCrm);

        txtCrm = new JTextField();
        txtCrm.setBounds(67, 255, 121, 20);
        add(txtCrm);
        txtCrm.setColumns(10);

        JLabel lblEmail = new JLabel("E-Mail:");
        lblEmail.setBounds(235, 258, 40, 14);
        add(lblEmail);

        txtEmail = new JTextField();
        txtEmail.setBounds(285, 255, 375, 20);
        add(txtEmail);
        txtEmail.setColumns(10);
    }
    
    @Override
    public String getTituloJanela(){
        return "Manter médicos";
    }

    @Override
    public Medico gravarNaEntidade() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void lerDaEntidade(Medico m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Controlador<Medico> getControlador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}