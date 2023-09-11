package th.mfu;

import java.util.Date;

public class Concert {

    //TODO: add attributes
    private String title;
    private String description;
    private Date date;
    private String performer;
    private int id;
    

    public Concert() {
    }
    public Concert(String title, String description) {
        //TODO: set attributes
        this.title = title;
        this.description = description;
    }
 
    public String getTitle() {
        //TODO: return title
        return title;
    }
    public String getDescription() {
        //TODO: return description
        return description;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getPerformer() {
        return performer;
    }
    public void setPerformer(String performer) {
        this.performer = performer;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    //TODO: add getters and setters
    
}
