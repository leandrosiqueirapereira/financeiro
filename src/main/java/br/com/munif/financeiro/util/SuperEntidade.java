package br.com.munif.financeiro.util;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class SuperEntidade implements Serializable {

    private static long ultimoCodigo;

    @Id
    private Long codigo;

    public SuperEntidade() {
        codigo = System.currentTimeMillis() * 1000;
        if (ultimoCodigo == codigo) {
            codigo++;
        }
        ultimoCodigo = codigo;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.codigo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SuperEntidade other = (SuperEntidade) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" + "codigo=" + codigo + '}';
    }

}
