/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marcocspc.suappasswordresetter.main;

import com.marcocspc.suappasswordresetter.gui.Login;
import com.marcocspc.suappasswordresetter.gui.Principal;
import com.marcocspc.suappasswordresetter.suap.Servidor;
import com.marcocspc.suappasswordresetter.suap.Suap;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author marcocspc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<String> arguments = new LinkedList<>();

        if (args.length > 0) {
            arguments.addAll(Arrays.asList(args));
        }

        if (arguments.contains("--no-gui")) {
            //TODO fazer versão de linha de comando
            String termo = "", usuario = "", pass = "", passToReset = "";
            File arquivo = null;

            termo = "--user";
            if (arguments.contains(termo)) {
                usuario = arguments.get(arguments.indexOf(termo) + 1);
            } else {
                System.out.println(termo + " não indicado, saindo.");
                System.exit(0);
            }

            termo = "--pass";
            if (arguments.contains(termo)) {
                pass = arguments.get(arguments.indexOf(termo) + 1);
            }

            termo = "--file";
            if (arguments.contains(termo)) {
                arquivo = new File(arguments.get(arguments.indexOf(termo) + 1));
            } else {
                System.out.println(termo + " não indicado, saindo.");
                System.exit(0);
            }

            termo = "--pass-to-reset";
            if (arguments.contains(termo)) {
                passToReset = arguments.get(arguments.indexOf(termo) + 1);
            }

            if (pass.equals("")) {
                System.out.println("Senha para " + usuario + ": ");
                pass = new String(System.console().readPassword());
            }

            Suap s = new Suap(new Servidor(usuario, pass));

            System.out.println("Verificando credenciais...\n"
                    + "Aguarde, o processo é um pouco demorado.");
            try {
                if (s.verificarCredenciais()) {
                    System.out.println("Credenciais válidas.");

                    System.out.println("Lendo arquivo de matrículas.");

                    FileReader fr;

                    fr = new FileReader(arquivo);
                    BufferedReader reader = new BufferedReader(fr);

                    LinkedList<String> lista = new LinkedList<>();
                    String line = "";

                    while ((line = reader.readLine()) != null) {
                        lista.add(line);
                    }
                    reader.close();

                    System.out.println("Iniciando redefinição de senhas.");

                    String newpass = "";
                    if (passToReset.equals("")) {
                        SimpleDateFormat sdf = new SimpleDateFormat("YYYY");
                        Date d = new Date();
                        newpass = "Ifrn." + sdf.format(d);
                    } else {
                        newpass = passToReset;
                    }

                    for (String matr : lista) {
                        s.redefinirSenha(matr, newpass);
                        System.out.println("Senha para " + matr + " redefinida com sucesso.");
                    }

                } else {
                    System.out.println("Credenciais inválidas.");
                }
            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            } catch (IOException ex2) {
                System.out.println(ex2.getMessage());
            } catch (Exception ex3) {
                System.out.println(ex3.getMessage());
            }

        } else {
            System.out.println("Executando em modo GUI.\n"
                    + "Se deseja usar o modo de linha de comando, use '--no-gui'.");

            JOptionPane.showMessageDialog(null, "Você precisa fazer login no SUAP para poder continuar.", "Atenção", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(Toolkit.getDefaultToolkit().getImage("icon/64.png")));

            Login janelaLogin = new Login(null, true);

            janelaLogin.setLocationRelativeTo(null);
            janelaLogin.setVisible(true);

            Principal p = new Principal();
            p.setServidor(new Servidor(janelaLogin.getCampoUsuario().getText(), String.valueOf(janelaLogin.getCampoSenha().getPassword())));

            p.setLocationRelativeTo(null);
            p.setVisible(true);
        }
    }
}
