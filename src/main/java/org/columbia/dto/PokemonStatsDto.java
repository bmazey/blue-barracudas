package org.columbia.dto;

import com.fasterxml.jackson.annotation.JsonAlias;

public class PokemonStatsDto {

    public int Attack;
    public int Defense;

    @JsonAlias("Sp.Atk")
    public int SpecialAttack;

    @JsonAlias("Sp.Def")
    public int SpecialDefense;

    public int Speed;
    public int HP;

    public int getAttack() {
        return Attack;
    }

    public void setAttack(int attack) {
        Attack = attack;
    }

    public int getDefense() {
        return Defense;
    }

    public void setDefense(int defense) {
        Defense = defense;
    }

    public int getSpecialAttack() {
        return SpecialAttack;
    }

    public void setSpecialAttack(int specialAttack) {
        SpecialAttack = specialAttack;
    }

    public int getSpecialDefense() {
        return SpecialDefense;
    }

    public void setSpecialDefense(int specialDefense) {
        SpecialDefense = specialDefense;
    }

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

}
