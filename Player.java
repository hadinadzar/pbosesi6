/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package base;

import abilities.Attackable;
import java.util.Random;
public abstract class Player implements Attackable {
    protected String name;
    protected int health;
    protected int attackPower;
    protected Random rand = new Random();
    
    public Player(String n, int h, int ap){
        name = n;
        health = h;
        attackPower = ap;
    }
    
    @Override
    public int attack(){
        return rand.nextInt(attackPower) + 1;
    }
    
    public void takeDamage( int damage){
        this.health -= damage;
        System.out.println(name + "Mendapat" + damage + "Damage !!");
        System.out.println("Sisa Health" + this.health);
        
    }
    
    public boolean isAlive(){
        return health > 0;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getHealth(){
        return this.health;
    }
    
    
    
    public abstract void infoPlayer();
}
