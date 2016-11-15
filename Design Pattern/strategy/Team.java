package com.designPattern.strategy;

public abstract class Team {
	private String teamName;
	private TeamStrategy strategy;

	public void setTeamName(String teamName){
		this.teamName = teamName;
	}

	public void setTeamStrategy(TeamStrategy strategy){
		this.strategy = strategy;
	}

	public abstract void teamInfo();

	public void playGame(){
		strategy.play(teamName);
	}
}
