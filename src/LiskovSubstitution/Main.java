package LiskovSubstitution;

import LiskovSubstitution.WithPrinciple.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IMaintenanceCourt> listCourt = new ArrayList<>();
        FootballCourt football = new FootballCourt(34.3,10.2);
        WinbledonCourt winbledon = new WinbledonCourt(15.2,3.2);
        MicroFootballCourt microFootball = new MicroFootballCourt(15.2,3.2);
        listCourt.add(football);
        listCourt.add(winbledon);
        listCourt.add(microFootball);


        for (IMaintenanceCourt c : listCourt ) {
            c.maintenance();
        }



    }
}
