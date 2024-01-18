import java.time.*; 
public class Meat extends FoodPyramid{
    private boolean expired = false; 
    LocalDate current_date = LocalDate.now();

    public Meat (String Food_Name){
        super(Food_Name, Recommended.DEFAULT_COUNT, Recommended.DEFAULT_RECOMMENDED_SERVINGS);
    }
    public Meat (String Food_name, int count, int date){
        super(Food_name, count, date);
        System.out.println(this.getClass().getName()+" created, " +Food_name+ " has recommended " +servings()+ " servings per day.");
    }
    public int servings(){
        return DEFAULT_RECOMMENDED_SERVINGS+1;
    }
    public boolean does_expire(){
        return expired; 
    }
}
    

