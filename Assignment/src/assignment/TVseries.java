
package assignment;


public class TVseries {
    public int SeriesId;
    public String SeriesName;
    public int SeriesAge;
    public int SeriesNumberOfEpisodes;

    //Constructor
    public TVseries(int SeriesId, String SeriesName, int SeriesAge, int SeriesNumberOfEpisodes) {
        this.SeriesId = SeriesId;
        this.SeriesName = SeriesName;
        this.SeriesAge = SeriesAge;
        this.SeriesNumberOfEpisodes = SeriesNumberOfEpisodes;
    }
    
    //Getter
    public int getSeriesId() {
        return SeriesId;
    }

    public String getSeriesName() {
        return SeriesName;
    }

    public int getSeriesAge() {
        return SeriesAge;
    }

    public int getSeriesNumberOfEpisodes() {
        return SeriesNumberOfEpisodes;
    }

    //Setters
    public void setSeriesId(int SeriesId) {
        this.SeriesId = SeriesId;
    }

    public void setSeriesName(String SeriesName) {
        this.SeriesName = SeriesName;
    }

    public void setSeriesNumberOfEpisodes(int SeriesNumberOfEpisodes) {
        this.SeriesNumberOfEpisodes = SeriesNumberOfEpisodes;
    }

    public void setSeriesAge(int SeriesAge) {
        this.SeriesAge = SeriesAge;
    }
    
    
    
    
  
            
    
    
}
