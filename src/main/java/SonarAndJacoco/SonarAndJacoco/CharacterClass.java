package SonarAndJacoco.SonarAndJacoco;

abstract class CharacterClass {

    private String characterClass;
    private int level;
    private int hp;

   // private int strength;
 //   private int constitution;
    private int dexterity;
    private int intelligence;
    private int wisdom;
    private int charisma;

    protected CharacterClass(){

        setCharacterClass("Character Class");
        setLevel(1);
       setHp(10);
     //   setStrength(10);
      //  setConstitution(10);
        setDexterity(10);
        setIntelligence(10);
        setWisdom(10);
        setCharisma(10);
    }

    public String getCharacterClass() { return characterClass; }
    public int getLevel() { return level; }
    public int getHp() { return  hp; }
  //  public int getStrength(){ return strength; }
  //  public int getConstitution(){ return constitution; }
    public int getDexterity(){ return dexterity; }
    public int getIntelligence(){ return intelligence; }
    public int getWisdom(){ return wisdom; }
    public int getCharisma(){ return charisma; }

    protected void setCharacterClass(String characterClass){ this.characterClass = characterClass; }
    protected void setLevel(int lvl){ level = lvl; }
    protected void setHp(int hitPoints){ hp = hitPoints; }
   // protected void setStrength(int str){ strength = str; }
  //  protected void setConstitution(int con){ constitution = con; }
    protected void setDexterity( int dex) { dexterity = dex; }
    protected void setIntelligence(int intel){ intelligence = intel; }
    protected void setWisdom(int wis){ wisdom = wis; }
    protected void setCharisma(int cha){charisma = cha; }

}



class Fighter extends CharacterClass {

    Fighter(){
        setCharacterClass("Fighter");
        setLevel(1);
        setHp(10);
      //  setStrength(14);
     //   setConstitution(16);
        setDexterity(14);
        setIntelligence(10);
        setWisdom(10);
        setCharisma(10);
    }
}
