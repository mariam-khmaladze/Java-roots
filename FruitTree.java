public class FruitTree extends Tree implements HighMaintenance{

    public FruitTree(){
        super();
    }

    public FruitTree(int population, String species, double preyBirthRate, double predatorStarvationRate, Shape shape){
        super(population, species, preyBirthRate, predatorStarvationRate, shape);
    }

    @Override
    public String getSpecies(){
        return (species + " FruitTree");
    }

    //1 method from HighMaintenance (also maintain() is default):
    public void fertilise(){
        System.out.printf("\nThe %s %s fruit tree has been fed.\n", shape, this.getSpecies());
    }
}