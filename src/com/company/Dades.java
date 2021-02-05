package Lambda;

import java.time.LocalDate;
import java.time.Period;

public class Dades implements Comparable<Lambda.Dades> {

    private String nompersona;
    private LocalDate naixementpersona;
    private Generepersona generepersona;

    public enum Generepersona {DONA,HOME;}

    public Dades(String nompersona, Generepersona generepersona, LocalDate naixementpersona) {
        this.nompersona = nompersona;
        this.generepersona = generepersona;
        this.naixementpersona = naixementpersona;
    }

    public String getNompersona() {
        return nompersona;
    }


    public void setNompersona(String nompersona) {
        this.nompersona = nompersona;
    }


    public LocalDate getNaixementpersona() {
        return naixementpersona;
    }


    public void setNaixementpersona(LocalDate naixementpersona) {
        this.naixementpersona = naixementpersona;
    }


    public Generepersona getGenerepersona() {
        return generepersona;
    }


    public void setGenerepersona(Generepersona generepersona) {
        this.generepersona = generepersona;
    }


    @Override
    public int compareTo(Lambda.Dades o) {
        if(getAge() > o.getAge()) return -1;
        else if(getAge() < o.getAge()) return 1;
        else return 0;
    }

    public int getAge() {
        LocalDate today = LocalDate.now();
        if ((naixementpersona != null) && (today != null)) {
            return Period.between(naixementpersona, today).getYears();
        } else {
            return 0;
        }
    }


    @Override
    public String toString() {
        return nompersona + '\t' + generepersona.toString() + '\t' + getAge();
    }





}
