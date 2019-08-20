import org.apache.commons.lang.time.DateUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;

public class Calendar extends HashSet<TimeSlot> {

    private int lengthOfWashingTimeSlotInHours = 3;

    public Calendar(){
        Date now = new Date();
        Date tomorrow = DateUtils.addDays(now, 1);
        tomorrow = DateUtils.truncate(tomorrow, java.util.Calendar.DAY_OF_MONTH);
        Date tomorrowStartTime = DateUtils.addHours(tomorrow, 7);
        for(int counter = 0; counter < 4; counter++){
            this.add(new TimeSlot(DateUtils.addHours(tomorrowStartTime, counter * lengthOfWashingTimeSlotInHours)));
        }
    }

    public TimeSlot[] availableSlots(){
        ArrayList<TimeSlot> unusedTimeSlots = new ArrayList<>();
        for(TimeSlot timeSlot : this){
            if(timeSlot.user == null){
                unusedTimeSlots.add(timeSlot);
            }
        }
        unusedTimeSlots.sort(new TimeSlot.TimeSlotStartTimeComparator());
        return unusedTimeSlots.toArray(new TimeSlot[0]);
    }
}
