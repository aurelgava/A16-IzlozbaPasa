/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a16.izlozba.pasa;

import java.time.LocalDate;

/**
 *
 * @author Korisnik
 */
public class IzlozbaDO {
    int ID;
    String mesto;
    LocalDate date;
    
    @Override
    public String toString() {
        return  mesto.substring(0, 3).toUpperCase() + ID + date.getYear() + " - " + mesto + " - " + date;
    }
}
