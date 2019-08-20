import org.apache.commons.lang.time.DateUtils;

import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class TimeSlot {

    public User user;
    public Date startTime;
    public Date endTime;

    public TimeSlot(Date givenStartTime){
        startTime = givenStartTime;
        endTime = DateUtils.addHours(givenStartTime, 3);
        user = null;
    }

    public void bookTimeSlot(User user){
        this.user = user;
    }

    public void unBookTimeSlot(){
        this.user = null;
    }


    @Override
    public String toString(){
        return new SimpleDateFormat("yyyyMMdd HH").format(startTime).toString();
    }


    public static class TimeSlotStartTimeComparator implements Comparator<TimeSlot> {

        @Override
        public int compare(TimeSlot o1, TimeSlot o2) {
            return (int) (o1.startTime.getTime() - o2.startTime.getTime());
        }
    }
}
