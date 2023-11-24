public class sword {
    private  double damage_base ;
    private  double damage ;
    private  int Level ;
    sword(){
        damage_base = 100 ;
        damage = damage_base*(1+0.1*Level) ;
        Level = 1;
    }
    public  void  Levelup(){
        Level++;
        damage = damage_base*(1+0.1*Level);
    }

    public int getLevel() {
        return Level;
    }

    public double getDamage() {
        return damage;
    }
}
