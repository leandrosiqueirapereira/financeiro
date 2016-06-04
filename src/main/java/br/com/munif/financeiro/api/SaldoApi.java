package br.com.munif.financeiro.api;

import br.com.munif.financeiro.entidades.Fisica;
import br.com.munif.financeiro.entidades.Juridica;
import br.com.munif.financeiro.entidades.Saldo;
import javax.servlet.annotation.WebServlet;

/**
 *
 * @author barizon
 */
@WebServlet(name = "SaldoApi", urlPatterns = {"/api/saldo/*"} )
public class SaldoApi extends SuperEntidadeApi<Saldo> {
    
    @Override
    public Class<Saldo> getClasse(){
        return Saldo.class;
    }
}
