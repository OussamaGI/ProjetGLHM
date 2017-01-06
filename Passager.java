/***********************************************************************
 * Module:  Passager.java
 * Author:  Oussama
 * Purpose: Defines the Class Passager
 ***********************************************************************/

import java.util.*;

/** @pdOid 7399e3a8-97ba-4aba-811d-b86c7848b1ae */
public class Passager {
   /** @pdOid 93f890f4-a983-4aaa-adeb-c91a53ab8d0a */
   private String nom;
   /** @pdOid 11f9a6da-dd6e-481c-8e28-68b39f5151b6 */
   private String prenom;
   
   /** @pdOid 54dc14a4-da5a-42a9-bd64-ce6d2c0b00bf */
   protected void finalize() {
      // TODO: implement
   }
   
   /** @param oldPassager
    * @pdOid 9742f0a4-0989-4d3f-96d4-3298275f3804 */
   public Passager(Passager oldPassager) {
      nom = oldPassager.nom;
      prenom = oldPassager.prenom;
   }
   
   /** @pdOid bb01299a-a155-4577-a623-ba779bc15679 */
   public Passager() {
      // TODO: implement
   }

}