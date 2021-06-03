
public class Wilders {
    private String firstname;
    private boolean aware;
    
    public Wilders(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }
    
    public String getFirstname() {
        return this.firstname;
    }
    
    public boolean getAware() {
        return this.aware;
    }
    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    
    public void setAware(boolean aware) {
        this.aware = aware;
    }
    
public String whoAmI() {
   return "Je m'appelle " + this.getFirstname() + " et je suis " + this.getAware();
}
        
}
