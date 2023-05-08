package Tourists;

import Locations.Bacolod;
import Locations.Bataan;
import Locations.Boracay;
import Locations.Palawan;
import Locations.Pampanga;
import Locations.Bicol;
import Locations.Locations;

public interface Tourist {

    int budget = 1000;

    void visit();

    void visit(Bacolod bacolod);

    void visit(Bataan bataan);

    void visit(Boracay boracay);

    void visit(Palawan palawan);

    void visit(Pampanga pampanga);

    void visit(Bicol siargao);

    default void visit(Locations locations) {
        System.out.println("Arrive on our location");
    };

    void checkBudget();
}
