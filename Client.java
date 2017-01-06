/***********************************************************************
 * Module:  Client.java
 * Author:  Oussama
 * Purpose: Defines the Class Client
 ***********************************************************************/

import java.util.*;

/** @pdOid af9770ae-cd04-4076-85a1-afecb000ff49 */
public class Client {
   /** @pdOid 6c5064be-ea71-40d4-a81f-7f1fde92e028 */
   private String nomClient;
   /** @pdOid 17f4c263-9ef0-4431-88ac-b6b677a41331 */
   private String prenom;
   /** @pdOid 26034636-b500-46f1-acf4-aa7e65336bb2 */
   private String adresse;
   /** @pdOid 61e6d69d-c243-47fe-8420-50027d584f70 */
   private double numtel;
   /** @pdOid 7d928bf0-22a8-4928-9f58-535aaed2e387 */
   private double numfax;
   
   /** @pdOid d142445a-b479-4a47-828a-8ea4640b574d */
   protected void finalize() {
      // TODO: implement
   }
   
   /** @pdRoleInfo migr=no name=Reservation assc=effectuer coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Reservation> reservation;
   
   /** @pdOid ea6560c5-75c1-49c6-9edc-c79df44516c1 */
   public String getNomClient() {
      return nomClient;
   }
   
   /** @param newNomClient
    * @pdOid 2b7aed82-7b6e-4833-aaea-7f9e82cb60ce */
   public void setNomClient(String newNomClient) {
      nomClient = newNomClient;
   }
   
   /** @pdOid d4f85542-38f8-4641-9393-64472d7bd2aa */
   public Client() {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Reservation> getReservation() {
      if (reservation == null)
         reservation = new java.util.HashSet<Reservation>();
      return reservation;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorReservation() {
      if (reservation == null)
         reservation = new java.util.HashSet<Reservation>();
      return reservation.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newReservation */
   public void setReservation(java.util.Collection<Reservation> newReservation) {
      removeAllReservation();
      for (java.util.Iterator iter = newReservation.iterator(); iter.hasNext();)
         addReservation((Reservation)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newReservation */
   public void addReservation(Reservation newReservation) {
      if (newReservation == null)
         return;
      if (this.reservation == null)
         this.reservation = new java.util.HashSet<Reservation>();
      if (!this.reservation.contains(newReservation))
         this.reservation.add(newReservation);
   }
   
   /** @pdGenerated default remove
     * @param oldReservation */
   public void removeReservation(Reservation oldReservation) {
      if (oldReservation == null)
         return;
      if (this.reservation != null)
         if (this.reservation.contains(oldReservation))
            this.reservation.remove(oldReservation);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllReservation() {
      if (reservation != null)
         reservation.clear();
   }

}