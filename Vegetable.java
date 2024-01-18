public class Vegetable extends FoodPyramid{
    private boolean expired = false; 
    public Vegetable (String Food_Name){
        super(Food_Name, Recommended.DEFAULT_COUNT, Recommended.DEFAULT_RECOMMENDED_SERVINGS);
    }
    public Vegetable (String Food_name, int count, int spd){
        super(Food_name, count, spd);
        System.out.println(this.getClass().getName()+" created, " +Food_name+ " has recommended " +servings()+ " servings per day.");
    }
    public int servings(){
        return DEFAULT_RECOMMENDED_SERVINGS+3;           // based off of recommended default servings per day 
                                                         // plus whatever the FoodPyramid says is needed in addition to default;
    }
    public boolean does_expire(){
        return expired;                                  // add timed logic for expiration here
    }  
}
    
