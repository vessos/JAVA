package infernoInfinity;

@Custom(author = "Pesho", revision =3 , description = "Used for Java OOP Advanced course - Enumerations and Annotations.", reviewers ={"Pesho","Svetlio"})
public class Weapon implements Comparable<Weapon> {

    private static final double ITEM_LEVEL = 0.0;
    private String name;
    private TypeOfWeapon weapon;
    private TypeOfGems[] sockets ;
    private double itemLevel;


    public Weapon(String name, String typeOfWeapon, int valueOfSockets) {
        this.name = name;
        this.weapon = TypeOfWeapon.valueOf(typeOfWeapon);
        this.sockets= new TypeOfGems[valueOfSockets];
        this.itemLevel =ITEM_LEVEL;

    }

    public double getItemLevel() {
        return this.itemLevel;
    }

    public  void addGems(int position,TypeOfGems gems){
        if(position>=0&&position<sockets.length){
            sockets[position]=gems;
            this.calculateItemLevel();
        }
    }

    public void removeGems(int position){
        if(position>=0&&position<sockets.length){
            this.sockets[position] =null;
            this.calculateItemLevel();
        }

    }

    private void calculateItemLevel(){
        int strength =0;
        int agility = 0;
        int vitality = 0;

        for (TypeOfGems socket : sockets) {
            if(socket!=null){
                strength+=socket.getStrength();
                agility+=socket.getAgility();
                vitality+=socket.getVitality();
            }
        }
        int minDamage = this.weapon.getMinDamage()+strength*2+agility;
        int maxDamage = this.weapon.getMaxDamage()+strength*3+agility*4;
        this.itemLevel=((double)(minDamage+maxDamage)/2)+strength+agility+vitality;
    }



    @Override
    public String toString() {
        int strength =0;
        int agility = 0;
        int vitality = 0;

        for (TypeOfGems socket : sockets) {
            if(socket!=null){
                strength+=socket.getStrength();
                agility+=socket.getAgility();
                vitality+=socket.getVitality();
            }
        }
        int minDamage = this.weapon.getMinDamage()+strength*2+agility;
        int maxDamage = this.weapon.getMaxDamage()+strength*3+agility*4;


        return String.format("%s: %d-%d Damage, +%d Strength, +%d Agility, +%d Vitality",
                this.name,minDamage,maxDamage,strength,agility,vitality);
    }

    @Override
    public int compareTo(Weapon o) {

        if(this.getItemLevel()-o.getItemLevel()<0){
            return -1;
        }else if(this.getItemLevel()-o.getItemLevel()>0){
            return 1;
        }
            return 0;
    }
}
