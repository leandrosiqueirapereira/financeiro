/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.munif.financeiro.api;

import br.com.munif.financeiro.entidades.Categoria;
import javax.servlet.annotation.WebServlet;

/**
 *
 * @author fatecie26
 */
<<<<<<< HEAD
@WebServlet(name = "CategoriaApi", urlPatterns = {"/api/categoria/*"})
=======
@WebServlet(name = "CategoriaApi", urlPatterns = {"/api/categoria"})
>>>>>>> 0d0e7c3eaacca1925ae74e99fae9139aa97b4236
public class CategoriaApi extends SuperEntidadeApi<Categoria>{

    @Override
    public Class<Categoria> getClasse() {
        return Categoria.class;
    }
    
}
