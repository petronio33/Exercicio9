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
public class Vaca extends Mamifero{
    
    private boolean TemLeite;

    public Vaca(String muu, int i, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean getTemLeite(){
       return this.TemLeite;
    }
    
    public void setTemLeite(boolean t){
        this.TemLeite = t;
    }
    
    public boolean isTemLeite(){
        return true;
    }
    
    public void Talk(){
        System.out.println("Muuu");
    }
    
    public Vaca(String n, int p, boolean t){
        super(n, p);
        this.setTemLeite(t);
    }

    @Override
    public void talk() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}