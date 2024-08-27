public class Megaman implements StrategyPower {
    String name;
    int healt;

    public Megaman(String name, int healt){
        this.name=name;
        this.healt=healt;
    }

    public int chestDefense(){
        return 0;
    }

    public int fistOfRageAttack(){
        return 0;
    }

    public int fatallity(){
        return 0;
    }
    @Override
    public String powerDefense() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'powerDefense'");
    }

    @Override
    public String powerAttack() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'powerAttack'");
    }

    @Override
    public String fullPower() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fullPower'");
    }
}