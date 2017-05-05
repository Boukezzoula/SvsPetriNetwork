package gui;

import logic.Arc;
import logic.Petrinet;
import logic.Place;
import logic.Transition;


public class ImWechsel {

    public static void main(String[] args) {
        Petrinet pn = new Petrinet("Wechsel");
        Transition t1 = pn.transition("t1");
        Transition t2 = pn.transition("t2");
        Transition t3 = pn.transition("t3");

        Place p1 = pn.place("p1", 1);
        Place p2 = pn.place("p2");
        Place p3 = pn.place("p3");
        Place p4 = pn.place("p4");
        
        Arc a1 = pn.arc("a1", p1, t1);
        Arc a2 = pn.arc("a2", t1, p2);
        Arc a3 = pn.arc("a3", t1, p3);        
        Arc a4 = pn.arc("a4", p2, t2);
        Arc a5 = pn.arc("a5", p3, t2);
        Arc a6 = pn.arc("a6", t2, p4);
        Arc a7 = pn.arc("a7", p4, t3);
        Arc a8 = pn.arc("a8", t3, p1);

        PetrinetGUI.displayPetrinet(pn);
    }
    
}
