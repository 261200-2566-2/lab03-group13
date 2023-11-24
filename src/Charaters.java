class Charaters {
    private double Max_hp ;
    private double hp ;
    private double mana ;
    private double Max_mana ;
    private double base_speed ;
    private double Max_bs;
    private double speed ;
    private int Level ;
    private shield e1 ;
    private sword e2 ;





    public Charaters(){
        this.Level = 1 ;
        this.Max_hp = 100 + 10 * Level;
        this.Max_mana = 50 +2 * Level;
        this.base_speed = 100 ;
        this.Max_bs = base_speed*(0.1+0.03*Level) ;
        this.hp = Max_hp ;
        this.mana = Max_mana ;
        this.speed = 100 ;
    }
    public void LevelUp(){
        Level++;
        Max_hp = 100+10*Level;
        Max_mana = 50+2*Level;
        Max_bs = base_speed*(0.1+0.03*Level);
    }
    public void  equipItem(sword s){
        speed = speed - speed*(0.1+0.04 * s.getLevel());
    }
    public void  equipItem(shield d){
        speed = speed - speed*(0.1+0.08 * d.getLevel());
    }

    public void  unequipItem(sword s){
        speed = speed + speed*(0.1+0.04 * s.getLevel());
    }
    public void  unequipItem(shield d){
        speed = speed + speed*(0.1+0.08 * d.getLevel());
    }
    public  void beAttcked(Charaters p){
        double hit  = p.e2.getDamage() - this.e1.getDefense();
        if (hit > 0){
            hp-=hit ;
        }
    }
    public void Attack(Charaters p){
        p.beAttcked(this);
    }
}
