public interface Recommended {
    public static final int DEFAULT_COUNT = 1; 
    public static final int DEFAULT_RECOMMENDED_SERVINGS = 2; 
    public int servings ();
    //public int date (); 
    public boolean does_expire(); 
}
