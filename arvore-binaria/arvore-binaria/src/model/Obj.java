package model;

import java.util.Objects;

public class Obj extends ObjArvore<Obj> {
    
    Integer meuValor;
    
    public Obj(Integer meuValor) {
        this.meuValor = meuValor;
    }
    
    // Desta forma é gerada pelo VS Code:
    /* @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Obj other = (Obj) obj;
        if (meuValor == null) {
            if (other.meuValor != null)
                return false;
        } else if (!meuValor.equals(other.meuValor))
            return false;
        return true;
    }
    
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((meuValor == null) ? 0 : meuValor.hashCode());
        return result;
    } */
    
    // Desta forma adaptei para seguir de acordo com as aulas:
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Obj obj = (Obj) o;
        return Objects.equals(meuValor, obj.meuValor);
    }    
    
    @Override
    public int hashCode() {
        return Objects.hash(meuValor);
    }

    @Override
    public int compareTo(Obj outro) {
        int i = 0;
        if(this.meuValor > outro.meuValor) {
            i = 1;
        }else if(this.meuValor < outro.meuValor) {
            i = -1;
        }
        return i;
    }


    @Override
    public String toString() {
        return meuValor.toString();
    }
    
}
