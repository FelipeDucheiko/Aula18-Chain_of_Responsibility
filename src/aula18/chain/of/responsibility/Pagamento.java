/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula18.chain.of.responsibility;

/**
 *
 * @author felip
 */
public abstract class Pagamento {
    protected Pagamento sucessor;
    
    public abstract void pagar(Compra compra);
    
    public void setSucessor(Pagamento sucessor){
        this.sucessor = sucessor;
    }
    
    public void proximo(Compra compra){
        if (this.sucessor != null){
            this.sucessor.pagar(compra);
        }
    }
    
    
}
