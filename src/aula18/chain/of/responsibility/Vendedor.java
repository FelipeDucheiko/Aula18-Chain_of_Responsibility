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
public class Vendedor extends Pagamento{

    @Override
    public void pagar(Compra compra) {
        double valor= compra.getValorTotal();
        
        valor = compra.getValorRestante() - valor*0.85;
        
        compra.setValorRestante(valor);
        
        this.proximo(compra);
        
        System.out.println("Vendedor Pago - R$" +  compra.getValorTotal()*0.85);
    }
    
}
