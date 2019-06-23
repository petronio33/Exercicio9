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
public class Papagaio extends Ave{
    
    private String Frase;
    
    public String getFrase(){
        return this.Frase;
    }
    
    public void setFrase(String f){
        this.Frase = f;
    }
    
    public void Talk(){
        System.out.println(this.getFrase());
    }
    
    public Papagaio(String n, boolean v, String f){
        super(n, v);
        this.setFrase(f);
    }
}
