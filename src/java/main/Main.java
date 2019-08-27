public class Main {



    public static void main(String[] args) throws InterruptedException {

        System.out.println("Welcome");


        User user = new User();



        Calendar calendar = new Calendar();
        Thread.sleep(1000);
        System.out.println("Available Time Slots");
        for(TimeSlot timeSlot : calendar.availableSlots()){

            System.out.println(timeSlot.toString());
        }
        Gui gui = new Gui(calendar);
        System.out.println(gui.toHtml());


    }


}
