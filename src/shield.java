public class shield {
    private  double base_defens;
    private  double defense;
    private  int Level ;
    shield(){
        base_defens = 100 ;
        defense = base_defens *(1+0.05*Level) ;
        Level = 1;
    }
    public  void  Levelup(){
        Level++;
        defense = base_defens *(1+0.05*Level);
    }
    public int getLevel() {
        return Level;
    }

    public double getDefense() {
        return defense;
    }
}
