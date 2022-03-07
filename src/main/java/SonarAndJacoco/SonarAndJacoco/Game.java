package SonarAndJacoco.SonarAndJacoco;

import java.io.IOException;
import java.util.Scanner;

public class Game {
  

	public static void main(String[] args) {
        Character hero =  Character.CharacterCreator();
    }
}


 class CreateCharacter {

    public static Character CharacterCreator() {
        System.out.println("Choose a character: ");
        System.out.println("1. Fighter");
        System.out.println("2. Rogue");
        System.out.println("3. Mage");
        System.out.println("4. Cleric");


        Scanner sc = new Scanner(System.in);
        int scan = sc.nextInt();
        String choice = getCharacterClass(scan);

        System.out.println("Choose Name:");
        Scanner nameIn = new Scanner(System.in);
        String name = nameIn.next();

        CharacterClass chosenClass = null;
        Character hero = null;

        switch (choice){
        case "Fighter":
            chosenClass = new Fighter();
            break;
       /* case "Rogue":
            chosenClass = new Rogue();
            break;
        case "Mage":
            chosenClass = new Mage();
            break;
        case "Cleric":
            chosenClass = new Cleric();
            break; */
        }

        try {
            hero = new Character(name, chosenClass);
            System.out.println("A hero has been created");
            hero.displayCharacter();
        } catch (Exception e){
            System.out.println("There was a problem assigning a character class");
        }

        return hero;

    }

    public static String getCharacterClass(int scan){

        String classIn;

        switch (scan) {
        case 1:
            classIn = "Fighter";
            break;
        case 2:
            classIn = "Rogue";
            break;
        case 3:
            classIn = "Mage";
            break;
        case 4:
            classIn = "Cleric";
            break;
        default:
            System.out.println("Enter again");
            classIn = "def";
        }

        return classIn;
    }
}

 class Character {

    private String name;
    private String characterClass;
    private int level;
    private int hp;
    private int currentHp;
    private int armorClass;

    private long xp;
    /*private int BAB; /*Base attack bonus*/

    private int strength;
    private int constitution;
    private int dexterity;
    private int intelligence;
    private int wisdom;
    private int charisma;

    Character(String name, CharacterClass chosenClass){

        this.name = name;
        this.characterClass = chosenClass.getCharacterClass();
        level =  chosenClass.getLevel() ;
        hp = ( chosenClass.getHp() + getModifier( chosenClass.getConstitution() )  );
        currentHp = hp;
        setArmorClass(10 + getModifier( + chosenClass.getDexterity()));
        strength = chosenClass.getStrength();
        constitution = chosenClass.getConstitution();
        dexterity = chosenClass.getDexterity();
        intelligence = chosenClass.getIntelligence();
        wisdom = chosenClass.getWisdom();
        charisma = chosenClass.getCharisma();
        xp = 0;


    }

    public static Character CharacterCreator() {
		// TODO Auto-generated method stub
		return null;
	}

	void displayCharacter() throws IOException {
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("Name: " + getName());
        System.out.println("Class: " + getCharacterClass());
        System.out.println("Level: " + getLevel());
        System.out.println("HP: " + getHp());
        System.out.println("Armor Class: " + getArmorClass());

        System.out.println("***************");
        System.out.println("Attributes: ");
        System.out.println("Strength: " + getStrength());
        System.out.println("Constitution: " + getConstitution());
        System.out.println("Dexterity: " + getDexterity());
        System.out.println("Intelligence: " + getIntelligence());
        System.out.println("Wisdom: " + getWisdom());
        System.out.println("Charisma: " + getCharisma());
        System.out.println("***************");
        System.out.println("XP: " + getXp());

    }

    public int getModifier(int number){
        int mod = (int)((number -10)/2);
        return mod;
    }

    public String getName() { return name; }
    public String getCharacterClass() { return characterClass; }
    public int getLevel() { return level; }
    public int getHp() { return  hp; }
    public int getCurrentHp() { return  currentHp; }
    public int getArmorClass() { return  armorClass; }
    public int getStrength(){ return strength; }
    public int getConstitution(){ return constitution; }
    public int getDexterity(){ return dexterity; }
    public int getIntelligence(){ return intelligence; }
    public int getWisdom(){ return wisdom; }
    public int getCharisma(){ return charisma;}
    public long getXp(){ return xp;}


    protected void setLevel(int lvl){ level = lvl; }
    protected void setHp(int hitPoints){ hp = hitPoints; }
    protected void setCurrentHp(int curHp){ currentHp = curHp; }
    protected void setArmorClass(int ac){ armorClass = ac; }
    protected void setStrength(int str){ strength = str; }
    protected void setConstitution(int con){ constitution = con; }
    protected void setDexterity( int dex) { dexterity = dex; }
    protected void setIntelligence(int intel){ intelligence = intel; }
    protected void setWisdom(int wis){ wisdom = wis; }
    protected void setCharisma(int cha){charisma = cha; }



}