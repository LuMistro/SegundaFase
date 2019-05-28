package br.com.AvaliacaoPOO.Principal;

import agendaavaliacaoSwing.EditarTipoContato;
import agendaavaliacaoSwing.FrameInicial;
import agendaavaliacaoSwing.JPanelNovoContato;
import agendaavaliacaoSwing.JPanelNovoTipoContato;
import agendaavaliacaoSwing.JPanelPesquisar;
import javax.swing.JFrame;

public class Principal {

    private static FrameInicial frame;

    public static void main(String[] args) throws Exception {

        frame = new FrameInicial();
        frame.setTitle("Agenda");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void listarContatos() throws Exception {
        JPanelPesquisar panel = new JPanelPesquisar();
        frame.setContentPane(panel);
        frame.setVisible(true);
    }

    public static void adicionarPainelNovoContato() throws Exception {
        JPanelNovoContato panel = new JPanelNovoContato();
        frame.setContentPane(panel);
        frame.setVisible(true);
    }

    public static void adicionarPainelNovoTipoContato() {
        JPanelNovoTipoContato panel = new JPanelNovoTipoContato();
        frame.setContentPane(panel);
        frame.setVisible(true);
    }

    public static void adicionarPainelEditarContato() throws Exception{
        JPanelNovoContato panel = new JPanelNovoContato();
        frame.setContentPane(panel);
        frame.setVisible(true);
    }

    public static void adicionarPainelEditarTipoContato() throws Exception {
        EditarTipoContato panel = new EditarTipoContato();
        frame.setContentPane(panel);
        frame.setVisible(true);
    }

}
