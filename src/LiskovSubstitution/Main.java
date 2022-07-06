package LiskovSubstitution;

import LiskovSubstitution.WithPrinciple.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Court> listCourt = new ArrayList<>();
        FootballCourt football = new FootballCourt(34.3,10.2);
        WinbledonCourt winbledon = new WinbledonCourt(15.2,3.2);
        listCourt.add(football);
        listCourt.add(winbledon);


        //Proof, we can replace any subclass that extends to Court without recieve a unexpected response.
        for (Court c : listCourt ) {
            c.cutGrass();
        }





    }
}
