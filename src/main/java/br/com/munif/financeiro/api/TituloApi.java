/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.munif.financeiro.api;

import br.com.munif.financeiro.entidades.Titulo;
import javax.servlet.annotation.WebServlet;

@WebServlet(name = "TituloApi", urlPatterns = {"/api/titulo/*"})
public class TituloApi extends SuperEntidadeApi<Titulo> {

    @Override
    public Class<Titulo> getClasse() {
        return Titulo.class;
    }

 
   

}
