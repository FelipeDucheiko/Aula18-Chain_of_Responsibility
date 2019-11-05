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
public class Cliente {
    
    public static void main(String[] args){
        Compra compra = new Compra("Compra", 100.00);
        
        Pagamento imposto = new Imposto();
        Pagamento mercadoLivre = new MercadoLivre();
        Pagamento vendedor = new Vendedor();
        
        imposto.setSucessor(mercadoLivre);
        mercadoLivre.setSucessor(vendedor);
        
        imposto.pagar(compra);
        
        System.out.println("Valor restante a pagar - R$" + compra.getValorRestante());
        
    }
    
    

}
