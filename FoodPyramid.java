
public abstract class FoodPyramid extends FoodItem implements Recommended {
    protected int servings_per_day;

    public FoodPyramid(String name, int count, int spd) {
        super(name, count);
        if(spd < 0) throw new FoodPyramidException ("Servings per day cannot be negative"); 
        else servings_per_day = spd; 
        }
    public String toString(){
        return this.getClass().getName();
        }
    
    }

