package e185743;

public class LivingThing {

    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    public String getName(){return name ;}

    public int getHitPoint(){ return hitPoint; }

    public void setHitPoint(int val){ this.hitPoint = val; }

    public void setDead(boolean a){ this.dead = a; }

    public LivingThing(String name, int maximumHP, int attack){
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    public boolean isDead(){return  dead;}

    public void attack(LivingThing opponent){
        if(dead == false){
            int damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint <= 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
}
