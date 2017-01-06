/***********************************************************************
 * Module:  Aeroport.java
 * Author:  Oussama
 * Purpose: Defines the Class Aeroport
 ***********************************************************************/

import java.util.*;

/** @pdOid 810ad584-ff00-457d-8957-5ffbd9555e84 */
public class Aeroport {
   /** @pdOid 6f09ada9-3ea6-4b22-9ca7-edc0ba90ce47 */
   private String nomAeroport;
   
   /** @pdOid 759db1fe-9dc3-4a78-8b2a-e0726b55de2d */
   protected void finalize() {
      // TODO: implement
   }
   
   /** @pdRoleInfo migr=no name=Ville assc=dessere coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Ville> ville;
   
   /** @pdOid 01e36b2b-76e4-41d2-9b35-e698ad108cd2 */
   public Aeroport() {
      // TODO: implement
   }
   
   /** @param oldAeroport
    * @pdOid 5d411960-dafe-47dc-ac7d-de9d40ccb6f4 */
   public Aeroport(Aeroport oldAeroport) {
      nomAeroport = oldAeroport.nomAeroport;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Ville> getVille() {
      if (ville == null)
         ville = new java.util.HashSet<Ville>();
      return ville;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorVille() {
      if (ville == null)
         ville = new java.util.HashSet<Ville>();
      return ville.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newVille */
   public void setVille(java.util.Collection<Ville> newVille) {
      removeAllVille();
      for (java.util.Iterator iter = newVille.iterator(); iter.hasNext();)
         addVille((Ville)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newVille */
   public void addVille(Ville newVille) {
      if (newVille == null)
         return;
      if (this.ville == null)
         this.ville = new java.util.HashSet<Ville>();
      if (!this.ville.contains(newVille))
         this.ville.add(newVille);
   }
   
   /** @pdGenerated default remove
     * @param oldVille */
   public void removeVille(Ville oldVille) {
      if (oldVille == null)
         return;
      if (this.ville != null)
         if (this.ville.contains(oldVille))
            this.ville.remove(oldVille);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllVille() {
      if (ville != null)
         ville.clear();
   }

}