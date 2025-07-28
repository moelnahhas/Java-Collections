import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class PhotoManager {
    private List<Photo> photos = new ArrayList<>();


    public void uploadPhoto(Photo pic){
        photos.add(pic);
    }

    public List<Photo> searchByTag(String tag){
        List<Photo> outList = new ArrayList<>();

        for(Photo photo : photos){
            Set<String> tags = photo.getTags();
            tags.forEach(item -> {
                if(item.toLowerCase().equals(tag.toLowerCase())){
                    outList.add(photo);
                }
            });
        }
        return outList;
    }

    public List<Photo> searchByDate(LocalDate date){
        List<Photo> outList = new ArrayList<>();

        for(Photo photo : photos){
            LocalDate photoDate = photo.getDate();
            if(photoDate.equals(date)){
                outList.add(photo);
            }
        }
        return outList;
    }

    public List<Photo> searchByLocation(String city){
        List<Photo> outList = new ArrayList<>();

        for(Photo photo : photos){
            if(photo.getCity().equals(city)){
                outList.add(photo);
            }
        }
        return outList;
    }

    public List<Photo> searchByMultipleTags(Set<String> tags){
        List<Photo> outList = new ArrayList<>();

        for(Photo photo : photos){
            Set<String> phototags = photo.getTags();
            if(phototags.containsAll(tags)){
                outList.add(photo);
            }
        }

        return outList;
    }
}
