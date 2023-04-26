public abstract class Plant{

    protected double population;
    protected String species;
    protected double preyBirthRate;
    protected double predatorStarvationRate;

    public Plant(){
        this.population = 0;
        this.species = "unknown plant species";
        this.preyBirthRate = 0;
        this.predatorStarvationRate = 0;
    }

    public Plant(double population, String species, double preyBirthRate, double predatorStarvationRate){
        this.population = population;
        this.species = species;
        this.preyBirthRate = preyBirthRate;
        this.predatorStarvationRate = predatorStarvationRate;
    }

    public double getPopulation() {
        return population;
    }

    public double getPreyBirthRate() {
        return preyBirthRate;
    }

    public double getPredatorStarvationRate() {
        return predatorStarvationRate;
    }

    public String getSpecies() {
        return species;
    }

    public void setPopulation (double population) {
        this.population = population;
    }

    public void setSpecies(String species){
        this.species = species;
    }

    public void setPreyBirthRate(double preyBirthRate) {
        this.preyBirthRate = preyBirthRate;
    }

    public void setPredatorStarvationRate(double predatorStarvationRate) {
        this.predatorStarvationRate = predatorStarvationRate;
    }

    public void LotkaVolterraIncrement(Plant predator, Plant prey, double preyEatenRate, double predatorEatingRate, int time) throws Exception{
        if (preyEatenRate < 0) {
            throw new Exception("preyEatenRate can't be negative.");
        } else if (predatorEatingRate < 0){
            throw new Exception("predatorEatingRate can't be negative.");
        } else if (time <= 0){
            throw new Exception("time can't be negative or 0.");
        }
        for (int i = 0; i < time; i++){
            prey.population += prey.preyBirthRate * prey.population - preyEatenRate * prey.population * predator.population;
            predator.population += - predator.predatorStarvationRate * predator.population + predatorEatingRate * prey.population * predator.population;
        }
    }

    //implemented in Tree and NotATree, also overriden in TimberTree
    public abstract void harvest();

    public void display(){
        System.out.printf("Species: %n\nPopulation: %d\n",this.species,this.population);
    }
}