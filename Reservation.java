/***********************************************************************
 * Module:  Reservation.java
 * Author:  Oussama
 * Purpose: Defines the Class Reservation
 ***********************************************************************/

import java.util.*;

/** @pdOid 9b65b607-c2d4-4ed2-9507-b51057f9a5d4 */
public class Reservation {
   /** @pdOid 1b909562-fc0d-4785-ba28-4be78a47f41d */
   private Date date;
   /** @pdOid 73cd376f-9e42-4b0f-9592-2a6430065b40 */
   private double num;
   
   /** @pdRoleInfo migr=no name=Passager assc=concerne mult=1..1 */
   public Passager passager;
   /** @pdRoleInfo migr=no name=InformationVol assc=consiste mult=1..1 */
   public InformationVol informationVol;
   
   /** @pdOid 0a670e07-f354-486c-9b08-3ae514447418 */
   public void annuler() {
      // TODO: implement
   }
   
   /** @pdOid 6aaa178f-bb60-43df-ba60-99ae7150215f */
   public void confirmer() {
      // TODO: implement
   }

}