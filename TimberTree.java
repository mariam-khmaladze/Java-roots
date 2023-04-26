public class TimberTree extends Tree{

    public TimberTree(){
        super();
    }

    public TimberTree(int population, String species, double preyBirthRate, double predatorStarvationRate, Shape shape){
        super(population, species, preyBirthRate, predatorStarvationRate, shape);
    }



    @Override
    public void harvest(){
        if (this.population > 20) {
            super.harvest();
        } else {
            System.out.printf("\nIt's too early to cut down the %s %ss TimberTree.\n",this.shape.name, this.species);
        }
    }
}