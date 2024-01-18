public class Carbs extends FoodPyramid{
    private boolean expired = false; 
    public Carbs (String Food_Name){
        super(Food_Name, Recommended.DEFAULT_COUNT, Recommended.DEFAULT_RECOMMENDED_SERVINGS);
    }
    public Carbs (String Food_name, int count, int spd){
        super(Food_name, count, spd);
        System.out.println(this.getClass().getName()+" created, " +Food_name+ " has recommended " +servings()+ " servings per day.");
    }
    public int servings(){
        return DEFAULT_RECOMMENDED_SERVINGS+4;
    }
    public boolean does_expire(){
        return expired;                         // add logic here for when expired 
    }
}
