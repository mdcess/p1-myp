public class Korby implements StrategyPower{

    String name;
    int healt;

    public Korby(String name, int healt){
        this.name=name;
        this.healt=healt;
    }

    public int whirlwindDefense(){
        return 0;
    }

    public int bBNP(){
        return 0;
    }

    public int domainexpansion(){
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
