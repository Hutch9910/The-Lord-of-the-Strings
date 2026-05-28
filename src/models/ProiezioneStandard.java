package models;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class ProiezioneStandard extends Proiezione {

    private double prezzoFinale = getPrezzoBase();

    public ProiezioneStandard() {
        calcolaPrezzo();
    }

    protected void calcolaPrezzo() {
        if (isWeekEnd()) {
            prezzoFinale += 10;
        }
        if (isSerale()) {
            prezzoFinale += 10;
        }
    }

    protected boolean isWeekEnd() {
        return getData().getDayOfWeek() == DayOfWeek.SATURDAY || getData().getDayOfWeek() == DayOfWeek.SUNDAY;
    }

    protected boolean isSerale() {
        return getOraInizio().isAfter(LocalTime.of(19, 0));
    }

    @Override
    String getTipoProiezione() {
        return "Standard";
    }
}
