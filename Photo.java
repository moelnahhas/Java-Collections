import java.time.LocalDate;
import java.util.Set;

public class Photo {
    private String id;
    private String name;
    private LocalDate date;
    private String city;
    private Set<String> tags;

    public Photo(String num, String name, LocalDate date, String city, Set<String> tags){
        this.id = num;
        this.name = name;
        this.date = date;
        this.city = city;
        this.tags = tags;
    }

    public String getName(){
        return this.name;
    }

    public Set<String> getTags(){
        return this.tags;
    }

    public LocalDate getDate(){
        return this.date;
    }

    public String getID(){
        return this.id;
    }

    public String getCity(){
        return this.city;
    }

    @Override
    public String toString(){
        return getName();
    }
}
