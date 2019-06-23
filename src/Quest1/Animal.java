/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quest1;

/**
 *
 * @author Petrônio
 */
public abstract class Animal {
    private String Nome_Animal;
    
    public String getNome_Animal(){
        return this.Nome_Animal;
    }
    
    public void setNome_Animal(String n){
        this.Nome_Animal = n;
    }
    
    public Animal(String n){
        this.setNome_Animal(n);
    }
    
    public void Imprime(){
        System.out.println("Nome:" + this.getNome_Animal());
    }
    
    public abstract void talk();
}
