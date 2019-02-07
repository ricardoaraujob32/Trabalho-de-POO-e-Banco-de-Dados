/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Controlador;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.Convenio;

/**
 *
 * @author ricardobalduino
 */
public class ConveniosManterJPanel extends JPanel implements TituloJanela<Convenio> {
    private JTextField txtCodigo;
    private JTextField txtNomeFantasia;
    private JTextField txtCnpj;
    private JTextField txtContato;
    private JTextField txtRazaoSocial;
    private JTextField txtTelefone;
    private JTextField txtSite;
    
    public ConveniosManterJPanel() {
        JLabel lblCodigo = new JLabel("C�digo");
        lblCodigo.setBounds(40, 73, 46, 14);
        add(lblCodigo);
        
        txtCodigo = new JTextField();
        txtCodigo.setBounds(96, 70, 89, 20);
        add(txtCodigo);
        txtCodigo.setColumns(10);

        JLabel lblNomeFantasia = new JLabel("Nome fantasia");
        lblNomeFantasia.setBounds(12, 104, 74, 35);
        add(lblNomeFantasia);

        txtNomeFantasia = new JTextField();
        txtNomeFantasia.setColumns(10);
        txtNomeFantasia.setBounds(96, 111, 160, 20);
        add(txtNomeFantasia);

        JLabel lblCpnj = new JLabel("CPNJ");
        lblCpnj.setBounds(40, 150, 46, 14);
        add(lblCpnj);

        txtCnpj = new JTextField();
        txtCnpj.setColumns(10);
        txtCnpj.setBounds(96, 147, 101, 20);
        add(txtCnpj);

        JLabel lblContato = new JLabel("Contato");
        lblContato.setBounds(40, 198, 46, 14);
        add(lblContato);

        txtContato = new JTextField();
        txtContato.setColumns(10);
        txtContato.setBounds(96, 195, 160, 20);
        add(txtContato);

        JLabel lblRazaoSocial = new JLabel("Raz�o Social");
        lblRazaoSocial.setBounds(280, 73, 68, 14);
        add(lblRazaoSocial);

        txtRazaoSocial = new JTextField();
        txtRazaoSocial.setColumns(10);
        txtRazaoSocial.setBounds(358, 70, 174, 20);
        add(txtRazaoSocial);

        JLabel lblTelefone = new JLabel("Telefone");
        lblTelefone.setBounds(302, 107, 46, 14);
        add(lblTelefone);

        txtTelefone = new JTextField();
        txtTelefone.setColumns(10);
        txtTelefone.setBounds(358, 104, 125, 20);
        add(txtTelefone);

        JLabel lblSite = new JLabel("Site");
        lblSite.setBounds(319, 150, 29, 14);
        add(lblSite);

        txtSite = new JTextField();
        txtSite.setColumns(10);
        txtSite.setBounds(358, 144, 174, 20);
        add(txtSite);
    }
    
    @Override
    public String getTituloJanela() {
        return "Manter convênios";
    }

    @Override
    public Convenio gravarNaEntidade() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void lerDaEntidade(Convenio c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Controlador<Convenio> getControlador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
