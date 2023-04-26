enum Shape{
        TooTALL(false, "tall"),
        TooAWKWARD(false, "wizened"),
        JustRIGHT(true, "round");

        public boolean hasEasyToReachBranches;
        public String name;  //public?

        Shape(boolean hasEasyToReachBranches, String name){
            this.hasEasyToReachBranches = hasEasyToReachBranches;
            this.name = name;
        }
    }

public class Tree extends Plant {

  public Shape shape;

  public Tree() {
    super();
    this.shape = Shape.TooTALL;
  }

  public Tree(int population, String species, double preyBirthRate, double predatorStarvationRate, Shape shape) {
    super(population, species, preyBirthRate, predatorStarvationRate);
    this.shape = shape;
  }

  @Override
  public String getSpecies() {
    return (species + " General Tree.");
  }

  @Override
  public void harvest() {
    switch (this.shape) {
      case TooAWKWARD:
      case TooTALL:
        System.out.printf("This %s tree is too %s to harvest.", this.species, this.shape.name);
        break;
      case JustRIGHT:
        System.out.printf("This %s tree is just right and has been harvested.", this.species);
        break;
    }
  }
}