import java.time.LocalTime;

public class TimeInterval {

    //konstruktor
    public TimeInterval(LocalTime startTime, LocalTime endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public LocalTime getStartTime(){
        return startTime;
    }

    public LocalTime getEndTime(){
        return endTime;
    }

    //dlugosc odcinka czasu w minutach
    public long getDurationMinutes(){
        return startTime.until(endTime, java.time.temporal.ChronoUnit.MINUTES);
    }

    public boolean overlaps(TimeInterval otherInterval){
        return !(this.endTime.isBefore(otherInterval.startTime) || this.startTime.isAfter(otherInterval.endTime));
    }


    private LocalTime startTime;
    private LocalTime endTime;
    
}
