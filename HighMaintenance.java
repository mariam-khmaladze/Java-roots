public interface HighMaintenance{

    String message = "A HighMaintenance Attribute endorses this message to";
    
    void fertilise();

    default void maintain(String name){
        System.out.printf("\n%s %s!\n", message, name);
    }
}