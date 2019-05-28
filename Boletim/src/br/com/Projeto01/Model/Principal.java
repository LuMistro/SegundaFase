/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Projeto01.Model;

import br.com.Projeto01.view.NewJFramePrincipal;
import java.awt.Frame;
import javax.swing.JFrame;

/**
 *
 * @author Luiza Mistro
 */
public class Principal {

    private static NewJFramePrincipal frame;

    public static void main(String[] args) throws Exception {

        frame = new NewJFramePrincipal();
        frame.setTitle("Agenda");
        frame.setExtendedState(JFrame.NORMAL);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
