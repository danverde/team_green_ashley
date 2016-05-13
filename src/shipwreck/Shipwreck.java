/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shipwreck;

import ShipwreckPackage.Game;
import ShipwreckPackage.Player;
import ShipwreckPackage.Character;
import ShipwreckPackage.Weather;
import ShipwreckPackage.Inventory;
import ShipwreckPackage.Item;
import ShipwreckPackage.Fire;
import ShipwreckPackage.Enemy;

/**
 *
 * @author Jack
 */
public class Shipwreck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Player player1 = new Player();
        player1.setName("John Doe");
        String playerInfo = player1.toString();
        System.out.println(playerInfo);
        
        Character character1 = new Character();
        character1.setType("Canibal");
        character1.setHealth(30);
        character1.setAttack(10);
        character1.setDefense(300);
        character1.setHunger(5000);
        character1.setCoordinates(5);
        String characterInfo = character1.toString();
        System.out.println(characterInfo);
        
        Weather weather1 = new Weather();
        weather1.setWeatherType("Rainy");
        weather1.setWeatherDuration(5);
        String weatherInfo = weather1.toString();
        System.out.println(weatherInfo);
        
        Inventory inventory1 = new Inventory();
        inventory1.setSize(40);
        String inventoryInfo = inventory1.toString();
        System.out.println(inventoryInfo);
        
        Item item1 = new Item();
        item1.setItemType("Meat");
        item1.setQuantity(2);
        String itemInfo = item1.toString();
        System.out.println(itemInfo);
        
        Fire fire1 = new Fire();
        fire1.setBurnTime(30);
        fire1.setQuantity(1);
        fire1.setWoodAmount(15);
        fire1.setItemType("Fire");
        String fireInfo = fire1.toString();
        System.out.println(fireInfo);
        
        Enemy enemy1 = new Enemy();
        enemy1.setType("Canibal");
        enemy1.setHealth(30);
        enemy1.setAttack(10);
        enemy1.setDefense(300);
        enemy1.setHunger(5000);
        enemy1.setCoordinates(5);
        enemy1.setMeat(5);
        String enemyInfo = enemy1.toString();
        System.out.println(enemyInfo);
        
        Game game1 = new Game();
        game1.setTime(17.00);
        game1.setBestTime(7.00);
        String gameInfo = game1.toString();
        System.out.println(gameInfo);
    }
    
}
