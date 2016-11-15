package com.designPattern.strategy;

public class GamePanel {
	public static void main(String args[]){
		TeamArgentina argentina = new TeamArgentina();
		TeamGermany germany = new TeamGermany();
		AttackingStrategy attack = new AttackingStrategy();
		DefensiveStrategy defense = new DefensiveStrategy();

		argentina.setTeamName("Argentina");
		argentina.setTeamStrategy(attack);

		germany.setTeamName("Germany");
		germany.setTeamStrategy(defense);

		argentina.playGame();
		germany.playGame();

		germany.setTeamStrategy(attack);
		germany.playGame();

		argentina.setTeamStrategy(defense);
		argentina.playGame();
	}
}
