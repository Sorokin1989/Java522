package Classwork4;

import java.util.Stack;

class Location {
    private int x;
    private int y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

enum Direction {
    UP, DOWN, LEFT, RIGHT;

}

class Player {
    private int hp = 100;
    private int stamina = 100;
    private String name;
    private Location location;

    public Player(String name) {
        this.name = name;
        location = new Location(0, 0);
    }

    public void move(Direction direction) {
        switch (direction) {
            case UP -> location.setY(location.getY() + 1);
            case DOWN -> location.setY(location.getY() - 1);
            case LEFT -> location.setX(location.getX() - 1);
            case RIGHT -> location.setX(location.getX() + 1);
        }
    }

    public void attack() {
        stamina -= 5;
    }

    public void takeDamage(int damage) {
        hp -= damage;
    }

    public PlayerMemento save() {
        return new PlayerMemento(hp, stamina,
                name, location.getX(),location.getY());
    }

    public void load(PlayerMemento memento) {
        this.hp = memento.getHp();
        this.stamina = memento.getStamina();
        this.name = memento.getName();
        this.location = memento.getLocation();
    }


    public void info() {
        System.out.println("\n");
        System.out.println("Name        : " + name);
        System.out.println("Hp          : " + hp);
        System.out.println("Stamina     : " + stamina);
        System.out.println("Location    : " + location.getX() + " " +
                location.getY());
    }

}

class PlayerSaves{
  private   Player player;
    private Stack<PlayerMemento> saves;

    public PlayerSaves(Player player) {
        this.player = player;
        this.saves = new Stack<>();
    }
public void savePlayer(){
        PlayerMemento playerMemento=player.save();
        saves.push(playerMemento);
}

public void loadPlayer(){
        if(!saves.isEmpty()){
        PlayerMemento playerMemento=saves.pop();
        player.load(playerMemento);

        }else {
            System.out.println("No saves stat to load");
        }

}

}

class PlayerMemento {

    private int hp = 100;
    private int stamina = 100;
    private String name;
    private Location location;

    public PlayerMemento(int hp, int stamina,
                         String name, int x, int y) {
        this.hp = hp;
        this.stamina = stamina;
        this.name = name;
        this.location = new Location(x, y);
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}


public class Classwork4 {
    public static void main(String[] args) {

        Player player = new Player("Dima");
        PlayerSaves saves=new PlayerSaves(player);
        player.info();
        saves.savePlayer();

        player.attack();
        player.takeDamage(5);
        player.move(Direction.RIGHT);
        player.move(Direction.UP);
        player.move(Direction.UP);
        player.attack();
        player.takeDamage(5);
        player.info();
        saves.savePlayer();


        player.attack();
        player.takeDamage(20);
        player.move(Direction.RIGHT);
        player.move(Direction.RIGHT);
        player.move(Direction.UP);
        player.attack();
        player.takeDamage(5);
        player.info();
        saves.savePlayer();


        player.attack();
        player.takeDamage(30);
        player.move(Direction.RIGHT);
        player.move(Direction.UP);
        player.attack();
        player.takeDamage(5);
        player.info();
        saves.savePlayer();

        player.attack();
        player.takeDamage(30);
        player.move(Direction.RIGHT);
        player.move(Direction.UP);
        player.attack();
        player.info();
        saves.savePlayer();


        System.out.println("======================================");


        saves.loadPlayer();
        player.info();

        saves.loadPlayer();
        player.info();



        saves.loadPlayer();
        player.info();

        saves.loadPlayer();
        player.info();





    }
}
