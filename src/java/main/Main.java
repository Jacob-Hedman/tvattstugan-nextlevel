public class Main {



    public static void main(String[] args){

        Calendar calendar = new Calendar();

        for(TimeSlot timeSlot : calendar.availableSlots()){
            System.out.println(timeSlot.toString());
        }
        Gui gui = new Gui(calendar);
        System.out.println(gui.toHtml());
    }
}
