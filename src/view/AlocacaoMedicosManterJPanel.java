/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import model.AlocacaoMedicos;

/**
 *
 * @author ricardobalduino
 */
public class AlocacaoMedicosManterJPanel extends JPanel implements TituloJanela<AlocacaoMedicos> {
    private JComboBox cbxClinica;
    private JComboBox cbxEspecialidade;
    private JComboBox cbxMedico;
    private JSpinner spinHorarioInicio;
    private JSpinner spinHorarioFim;
    private JButton btnVerEscalaMedico;
    
    public AlocacaoMedicosManterJPanel() {
        JLabel lblClnica = new JLabel("Clínica:");
        lblClnica.setBounds(10, 11, 46, 14);
        add(lblClnica);

        cbxClinica = new JComboBox<String>();
        cbxClinica.setBounds(66, 8, 120, 20);
        add(cbxClinica);

        JLabel lblEspecialidade = new JLabel("Especialidade:");
        lblEspecialidade.setBounds(202, 11, 74, 14);
        add(lblEspecialidade);

        cbxEspecialidade = new JComboBox<String>();
        cbxEspecialidade.setBounds(286, 8, 120, 20);
        add(cbxEspecialidade);

        JLabel lblMedico = new JLabel("Médico:");
        lblMedico.setBounds(416, 11, 46, 14);
        add(lblMedico);

        cbxMedico = new JComboBox<String>();
        cbxMedico.setBounds(472, 8, 120, 20);
        add(cbxMedico);

        JLabel lblHorarioInicio = new JLabel("Horário (Início):");
        lblHorarioInicio.setBounds(10, 51, 83, 14);
        add(lblHorarioInicio);

        spinHorarioInicio = new JSpinner();
        spinHorarioInicio.setBounds(98, 48, 93, 20);
        add(spinHorarioInicio);

        JLabel lblHorarioFim = new JLabel("Horário (Fim):");
        lblHorarioFim.setBounds(255, 51, 74, 14);
        add(lblHorarioFim);

        spinHorarioFim = new JSpinner();
        spinHorarioFim.setBounds(339, 48, 90, 20);
        add(spinHorarioFim);

        btnVerEscalaMedico = new JButton("Ver escala do médico");
        btnVerEscalaMedico.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                }
        });
        btnVerEscalaMedico.setBounds(454, 98, 138, 23);
        add(btnVerEscalaMedico);
    }    
    
    @Override
    public String getTituloJanela() {
        return "Manter alocação de médicos";
    }

    @Override
    public AlocacaoMedicos gravarNaEntidade() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void lerDaEntidade(AlocacaoMedicos a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Controlador<AlocacaoMedicos> getControlador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}