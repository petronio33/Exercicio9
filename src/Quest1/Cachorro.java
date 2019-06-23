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
public class Cachorro extends Mamifero{
    
    private boolean LateAlto;

    public Cachorro(String auAu, int i, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean getLateAlto(){
        return this.LateAlto;
    }
    
    public void setLateAlto(boolean l){
        this.LateAlto = l;
    }
    
    public void Talk(){
        System.out.println("Au,au");
    }
    
    public boolean isLateAlto(){
        return true;
    }
    
    public Cachorro(String n, int p, boolean l){
        super(n, p);
        this.setLateAlto(l);
    }
}
