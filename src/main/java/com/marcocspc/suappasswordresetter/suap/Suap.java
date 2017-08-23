/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marcocspc.suappasswordresetter.suap;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author marcocspc
 */
public class Suap {

    private Servidor servidor;

    public Suap() {
    }

    public Suap(Servidor servidor) {
        this.servidor = servidor;
    }

    public boolean verificarCredenciais() throws Exception {
        SuapConnection sp = SuapConnectionFactory.getConnection(servidor.getMatricula(), servidor.getSenha());
        return sp.validate(servidor.getMatricula(), servidor.getSenha());
    }
    
    public void redefinirSenha(String matricula, String senha) throws Exception {
        SuapConnection sp = SuapConnectionFactory.getConnection(servidor.getMatricula(), servidor.getSenha());
        
        sp.resetADPassword(matricula, senha);
    }

    public Servidor getServidor() {
        return servidor;
    }

    public void setServidor(Servidor servidor) {
        this.servidor = servidor;
    }

}
