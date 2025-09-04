
package assignment;

import java.util.*;


public class Assignment {

    
    public static void main(String[] args) {
       
        int val;
        
        int answer;
                
        //Scanner
         Scanner input = new Scanner(System.in);
         
         //Array
         ArrayList<TVseries> series = new ArrayList<>();
         
         //Menu launcher
        System.out.println("LATEST SERIES - 2025");
        System.out.println("*************************************");
        System.out.println("Enter (1) to launch menu or any other key to exit");
        val = Integer.parseInt(input.nextLine());
        
        if (val == 1) {
            System.out.println("Opening Menu");
        }
        else {System.exit(0);}
        
        //Menu
        while (true) {            
            
        
        System.out.println("Choose option: ");
        System.out.println("(1) Capture a new series: ");
        System.out.println("(2) Search for a series: ");
        System.out.println("(3) Update series age restriction: ");
        System.out.println("(4) Delete a series: ");
        System.out.println("(5) Print series report: ");
        System.out.println("(6) Exit Application: ");
        answer = Integer.parseInt(input.nextLine()); 
        
        
        
        switch(answer){
            case 1:
                series.add(capture(input));
                break;
            case 2:
                showSeries(series, input);
                break;
            case 3:
                updateSeries(series, input);
                break;
            case 4:
                deleteInfo(series, input);
                break;
            case 5: 
                seriesReport(series);
                break;
            case 6: 
                closeApp();
                break;
           default:
                System.out.println("Invalid input");
        }
        }
                
        
    
    }
    //Method used to capture a new series
    public static TVseries capture(Scanner input){
        int seriesID;
        String seriesName;
        int ageRestriction;
        int NumOfEpisodes;
        
        
        System.out.println("Enter series ID: ");
        seriesID = Integer.parseInt(input.nextLine());
        System.out.println("Enter series name: ");
        seriesName = input.nextLine();
         System.out.println("Enter series age restriction: ");
        ageRestriction = Integer.parseInt(input.nextLine());
        if (ageRestriction < 2 || ageRestriction > 19){
            System.out.println("Please re-enter age restriction(2-18): ");
            ageRestriction = Integer.parseInt(input.nextLine());
        }else {System.out.print(" ");}
        System.out.println("Enter number of episodes in the series: ");
        NumOfEpisodes = Integer.parseInt(input.nextLine());
        
        System.out.println("Series processed succesfully");
        
        TVseries serieses = new TVseries(seriesID, seriesName, ageRestriction, NumOfEpisodes);
        return serieses ;
        
    }
     //Method to display the information of a selected series
     public static void showSeries(ArrayList<TVseries> series, Scanner input){
        String seriesNameToSearch;
        System.out.println("Enter series name to search: ");
        seriesNameToSearch = input.nextLine();
        
        System.out.println("********Series Information********");
        for(TVseries serieses : series){
            if(seriesNameToSearch.equalsIgnoreCase(serieses.getSeriesName())){
            System.out.println("Series ID is: " + serieses.getSeriesId());
            System.out.println("Series name is: " + serieses.getSeriesName());
            System.out.println("Series Age restriction is: " + serieses.getSeriesAge());
            System.out.println("Series number of episodes are: " + serieses.getSeriesNumberOfEpisodes());
            System.out.println("***********************************");
            }
            else{
                System.out.println("series not found");
            }
            
        }
        
    }
     //Method used to update a series
     public static void updateSeries(ArrayList<TVseries> series, Scanner input){
         int idToSearch;
         String newName;
         int newAgeRestriction;
         int newNumOfEpisodes;
         
         System.out.println("Enter the students ID you would like to delete: ");
         idToSearch = Integer.parseInt(input.nextLine());
         
         for(TVseries serieses: series){
            int i = 0;
            if(idToSearch == (serieses.getSeriesId())){
                System.out.println("Updated series name: ");         
                newName = input.nextLine();
                serieses.setSeriesName(newName);
                
                System.out.println("Updated series age restriction: ");         
                newAgeRestriction = input.nextInt();
                serieses.setSeriesAge(newAgeRestriction);
                
              
                System.out.println("Updated the number of episodes in the series: ");         
                newNumOfEpisodes = input.nextInt();
                serieses.setSeriesAge(newNumOfEpisodes);
                
                System.out.println("Series updated succesfully");
            }System.out.println("Invalid ID");
            
        }
         

     }
     //Methid used to delete a series
     public static void deleteInfo(ArrayList<TVseries> series, Scanner input){
        int idToDelete;
        System.out.println("Enter the students ID you would like to delete: ");
        idToDelete = Integer.parseInt(input.nextLine());
        for(int i = 0;i < series.size();i++){
        
        if( idToDelete ==  series.get(i).getSeriesId()){
            series.remove(i);
        }
        
        
        }
        
    }
     //Method used to display a report of all serieses
     public static void seriesReport(ArrayList<TVseries> series){
         for(int i = 0; i < series.size();i++){
             System.out.println("\nSeries " + (i+1));
             System.out.println("----------------------------");
             System.out.println("Series ID: " + series.get(i).getSeriesId());
             System.out.println("Series name: " + series.get(i).getSeriesName());
             System.out.println("Series age restriction: " + series.get(i).getSeriesAge());
             System.out.println("Number of episodes: " + series.get(i).getSeriesNumberOfEpisodes());
         }
         
     }
     //Method used to close program
      public static void closeApp(){
        System.exit(0);
    }
    
}
