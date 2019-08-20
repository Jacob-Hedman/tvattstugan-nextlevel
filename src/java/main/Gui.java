public class Gui{

    private Calendar calendar;

    public Gui(Calendar calendar){
        this.calendar = calendar;
    }

    public String toHtml(){
        StringBuilder sb = new StringBuilder();
        sb.append("<html><head>");
        sb.append("</head><body>");
        sb.append("<h1>Tvättstugebokning</h1>");
        sb.append("<div>");
        sb.append("<select>");
        for(TimeSlot timeSlot : calendar){
            sb.append("<option value='").append(timeSlot.toString()).append("'>").append(timeSlot.toString()).append("</option>");
        }
        sb.append("</select>");
        sb.append("</div>");
        sb.append("</body></html>");
        return sb.toString();
    }
}