/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import characters.Hero;
import characters.Enemy;

public class Battle {
    
    public static void main(String[] args){
        Hero hero = new Hero("warior", 1000, 500);
        Enemy enemy = new Enemy ("Jepo", 500, 300);
        
        System.out.println("Pertarungan dimulai!!");
        System.out.println("antara" + hero.getName() + "VS" + enemy.getName());
        
        while(hero.isAlive() && enemy.isAlive()){
            int heroDamage = hero.attack();
            enemy.takeDamage(heroDamage);
            if(!enemy.isAlive()){   
                System.out.println(enemy.getName() + "kalah!!");
            }
            
            
            int enemyDamage = enemy.attack();
            hero.takeDamage(enemyDamage);
            if(!hero.isAlive()){   
                System.out.println(hero.getName() + "kalah!!");
            }
            
            System.out.println("==========");
        }
      
   
    
    }
}
