/***********************************************************************
 * Module:  Compagnie.java
 * Author:  Oussama
 * Purpose: Defines the Class Compagnie
 ***********************************************************************/

import java.util.*;

/** @pdOid 85e92a2c-ea64-4c66-abc9-5bb6e8ac68e9 */
public class Compagnie {
   /** @pdOid 63e417f6-3565-4879-87d2-16d87e217c9a */
   private String idCompagnie;
   /** @pdOid 1b4bfc8c-33a2-46b3-9ba1-393fe31413aa */
   private String nomCompagnie;
   
   /** @pdRoleInfo migr=no name=Vol assc=lancer mult=1..1 */
   public Vol vol;

}