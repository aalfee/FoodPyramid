public class Fruit extends FoodPyramid {
    private boolean expired = false; 
    public Fruit(String Food_Name){
        super(Food_Name, Recommended.DEFAULT_COUNT, Recommended.DEFAULT_RECOMMENDED_SERVINGS); 
        }
    
    public Fruit(String Food_name, int count, int spd){
        super(Food_name, count, spd);
        System.out.println(this.getClass().getName()+" created, " +Food_name+ " has recommended " +servings()+ " servings per day.");
    }    

    public int servings () {
        return DEFAULT_RECOMMENDED_SERVINGS+2; 
    }    

    public boolean does_expire (){
        return expired; 
    }
        
}
    
