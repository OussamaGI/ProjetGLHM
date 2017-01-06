/***********************************************************************
 * Module:  InformationVol.java
 * Author:  Oussama
 * Purpose: Defines the Class InformationVol
 ***********************************************************************/

import java.util.*;

/** @pdOid 8d2425c2-9b1c-465f-bc64-8107a07ebcd8 */
public class InformationVol {
   /** @pdOid b0265adf-6085-4855-a1a4-3f8dec3087c3 */
   private double numV;
   /** @pdOid 9e129e52-82f8-4177-924f-006dbead6478 */
   private Date dateDepart;
   /** @pdOid 94467bb0-e54d-4f95-815c-b81a4b4ac08d */
   private double heureDepart;
   /** @pdOid 4b5391fa-393d-4efb-8ad8-67800fdb3cc0 */
   private Date dateArrive;
   /** @pdOid babc8785-6804-45eb-9648-2be358502430 */
   private double heureArrive;
   
   /** @pdOid 2ddc4bb3-8e6c-4209-b7e3-303b3497cafa */
   protected void finalize() {
      // TODO: implement
   }
   
   /** @pdRoleInfo migr=no name=Aeroport assc=depart mult=1..1 */
   public Aeroport aeroport;
   /** @pdRoleInfo migr=no name=Aeroport assc=arrive mult=1..1 */
   public Aeroport aeroport;
   
   /** @pdOid 1ee1dac9-d928-40f0-80ca-3d35d61242e7 */
   public void ouvrirReservation() {
      // TODO: implement
   }
   
   /** @pdOid 473d8516-be9c-465a-9280-fa2c6ddfeac8 */
   public void fermerReservation() {
      // TODO: implement
   }
   
   /** @pdOid c32e7f3e-d3d0-437a-9ccb-25bd1b62a07d */
   public InformationVol() {
      // TODO: implement
   }

}