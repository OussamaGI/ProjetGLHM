/***********************************************************************
 * Module:  CompagnieAerienne.java
 * Author:  Oussama
 * Purpose: Defines the Class CompagnieAerienne
 ***********************************************************************/

import java.util.*;

/** @pdOid 09c993e7-1f61-454e-8d59-749c6bdae491 */
public class CompagnieAerienne {
   /** @pdOid a9803ccd-0c4c-458e-bb0e-2accb4eac7c4 */
   private String nomCompagnie;
   
   /** @pdRoleInfo migr=no name=InformationVol assc=propose coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<InformationVol> informationVol;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<InformationVol> getInformationVol() {
      if (informationVol == null)
         informationVol = new java.util.HashSet<InformationVol>();
      return informationVol;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorInformationVol() {
      if (informationVol == null)
         informationVol = new java.util.HashSet<InformationVol>();
      return informationVol.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newInformationVol */
   public void setInformationVol(java.util.Collection<InformationVol> newInformationVol) {
      removeAllInformationVol();
      for (java.util.Iterator iter = newInformationVol.iterator(); iter.hasNext();)
         addInformationVol((InformationVol)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newInformationVol */
   public void addInformationVol(InformationVol newInformationVol) {
      if (newInformationVol == null)
         return;
      if (this.informationVol == null)
         this.informationVol = new java.util.HashSet<InformationVol>();
      if (!this.informationVol.contains(newInformationVol))
         this.informationVol.add(newInformationVol);
   }
   
   /** @pdGenerated default remove
     * @param oldInformationVol */
   public void removeInformationVol(InformationVol oldInformationVol) {
      if (oldInformationVol == null)
         return;
      if (this.informationVol != null)
         if (this.informationVol.contains(oldInformationVol))
            this.informationVol.remove(oldInformationVol);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllInformationVol() {
      if (informationVol != null)
         informationVol.clear();
   }

}