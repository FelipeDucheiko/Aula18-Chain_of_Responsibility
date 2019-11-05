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
public class MercadoLivre extends Pagamento{

    @Override
    public void pagar(Compra compra) {
        double valor= compra.getValorTotal();
        
        valor = compra.getValorRestante() - valor*0.1;
        
        compra.setValorRestante(valor);
        
        this.proximo(compra);
        
        System.out.println("Mercado Livre Pago - R$" +  compra.getValorTotal()*0.1);
    }
    
}
