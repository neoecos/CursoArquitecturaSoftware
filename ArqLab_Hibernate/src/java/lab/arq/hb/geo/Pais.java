package lab.arq.hb.geo;
// Generated 25/04/2013 05:04:32 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Pais generated by hbm2java
 */
public class Pais  implements java.io.Serializable {


     private String PId;
     private String PNombre;
     private Set<Ciudad> ciudads = new HashSet<Ciudad>(0);

    public Pais() {
    }

	
    public Pais(String PId) {
        this.PId = PId;
    }
    public Pais(String PId, String PNombre, Set<Ciudad> ciudads) {
       this.PId = PId;
       this.PNombre = PNombre;
       this.ciudads = ciudads;
    }
   
    public String getPId() {
        return this.PId;
    }
    
    public void setPId(String PId) {
        this.PId = PId;
    }
    public String getPNombre() {
        return this.PNombre;
    }
    
    public void setPNombre(String PNombre) {
        this.PNombre = PNombre;
    }
    public Set<Ciudad> getCiudads() {
        return this.ciudads;
    }
    
    public void setCiudads(Set<Ciudad> ciudads) {
        this.ciudads = ciudads;
    }




}


