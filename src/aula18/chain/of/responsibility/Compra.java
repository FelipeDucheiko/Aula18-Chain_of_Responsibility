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
public class Compra {
    private String descricao;
    private double valorTotal;
    private double valorRestante;
    
    public Compra(String descricao, double valorTotal){
        this.descricao = descricao;
        this.valorTotal = valorTotal;
        this.valorRestante = valorTotal;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the valorTotal
     */
    public double getValorTotal() {
        return valorTotal;
    }

    /**
     * @param valorTotal the valorTotal to set
     */
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    /**
     * @return the valorAtual
     */
    public double getValorRestante() {
        return valorRestante;
    }

    /**
     * @param valorAtual the valorAtual to set
     */
    public void setValorRestante(double valorRestante) {
        this.valorRestante = valorRestante;
    }

   
    
        
}
