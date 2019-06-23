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
public abstract class Ave extends Animal{
    
    private boolean Voa;
    
    public boolean getVoa(){
        return this.Voa;
    }
    
    public void setVoa(boolean v){
        this.Voa = v;
    }
    
    public Ave(String n, boolean v){
        super(n);
        this.setVoa(v);
    }
    
    public void talk(){
        System.out.println("Piu-Piu");
    }
}
