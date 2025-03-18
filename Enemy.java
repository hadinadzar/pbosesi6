/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package characters;


import base.Player;
public class Enemy extends Player {
    public Enemy(String n, int h, int ap){
        super(n, h, ap);
    }
    
    @Override
    public int attack(){
        int damage = super.attack();
        boolean magic = rand.nextDouble() > 0.4;
        if(magic){
            System.out.println("🔥🔥Serangan Magic dari" + name);
            damage *=2;
        }
        return damage;
    }
    
    @Override
    public void infoPlayer(){
        System.out.println("Enemy :" + name + "Health : " + health + "Attack Power : " + attackPower);
    }
}
