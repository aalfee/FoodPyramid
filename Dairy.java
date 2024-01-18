public class Dairy extends FoodPyramid {
    private boolean expired = false; 

    public Dairy(String Food_Name){
        super(Food_Name, Recommended.DEFAULT_COUNT, Recommended.DEFAULT_RECOMMENDED_SERVINGS); 
    }

    public Dairy(String Food_Name, int count, int spd){
        super(Food_Name, count, spd); 
        System.out.println(this.toString()+" created, " +Food_Name+ " has recommended " +servings()+ " servings per day.");
    }

    public int servings(){
        return DEFAULT_RECOMMENDED_SERVINGS+1;
    }
    public boolean does_expire(){
        return expired; 
    }
    
}
