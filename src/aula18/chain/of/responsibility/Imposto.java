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
public class Imposto extends Pagamento{

    @Override
    public void pagar(Compra compra) {
        double valor= compra.getValorTotal();
        
        valor = compra.getValorRestante() - valor*0.05;
        
        compra.setValorRestante(valor);
        
        System.out.println("Imposto Pago - R$" +  compra.getValorTotal()*0.05);
        
        this.proximo(compra);
    }
    
}
