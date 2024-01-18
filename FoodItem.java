public abstract class FoodItem {
    String Food_Name; 
    int count; 


    public FoodItem (String s, int c){
        if ( s == null || s == "") throw new InvalidFoodItemException (" Food name must be given."); 
        if (c < 0) throw new InvalidFoodItemException ("Item count cannot be negative.");
        Food_Name = s; 
        count = c;
        System.out.println(+c+" new " +Food_Name+ " added ");
    }

    public class InvalidFoodItemException extends IllegalArgumentException{
        public InvalidFoodItemException(String message){
            super(message);
        }
    }
}



