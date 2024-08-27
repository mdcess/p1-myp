public class Dittuu implements StrategyPower {

    private String name;
    private int healt;

    public Dittuu(String name, int healt){
        this.name=name;
        this.healt=healt;
    }

    public int viscosityDefense(){
        return 0;
    }

    public int brokenBonesAttack(){
        return 0;
    }

    public int purple(){
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