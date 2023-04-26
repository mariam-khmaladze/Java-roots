public class NotATree extends Plant implements HighMaintenance{
    
    public NotATree(){
        super();
    }

    public NotATree(double population, String species, double preyBirthRate, double predatorStarvationRate){
        super(population, species, preyBirthRate, predatorStarvationRate);
    }

    @Override
    public void harvest(){
        System.out.printf("Why bother harvesting the %s? It's not even a tree!\n", species);
    }

    //overloaded NotATree methods go here:
    //method 1
    //method 2
    //method 3

    //1 method from HighMaintenance (also maintain() is default):
    public void fertilise(){
        System.out.printf("The %s non-tree has been fed.\n", species);
    }

    public void maintain(String support){
        System.out.printf("Don't encourage the %s non-tree please!\n", species);
    }
}
