package com.objectdesign;

public class SportsJerseys extends Clothing {

	public String sport = null;
	public String teamLogo = null;
	public String team = null;
	public String size = null;
	public String fabric = null;
	public String sleeveLength = null;
	public String nameOnBack = null;
	public String primaryColor = null;
	public String secondaryColor = null;
	public int numberOnBack = 0;


	public SportsJerseys(String sport, String teamLogo, String team, String size, String fabric, String sleeveLength,
			String nameOnBack, String primaryColor, String secondaryColor, int numberOnBack) {
		super();
		this.sport = sport;
		this.teamLogo = teamLogo;
		this.team = team;
		this.size = size;
		this.fabric = fabric;
		this.sleeveLength = sleeveLength;
		this.nameOnBack = nameOnBack;
		this.primaryColor = primaryColor;
		this.secondaryColor = secondaryColor;
		this.numberOnBack = numberOnBack;
	}


	public SportsJerseys() {
		super();
	}


	public String getSport() {
		return sport;
	}


	public void setSport(String sport) {
		this.sport = sport;
	}


	public String getTeamLogo() {
		return teamLogo;
	}


	public void setTeamLogo(String teamLogo) {
		this.teamLogo = teamLogo;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		this.team = team;
	}


	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}


	public String getFabric() {
		return fabric;
	}


	public void setFabric(String fabric) {
		this.fabric = fabric;
	}


	public String getSleeveLength() {
		return sleeveLength;
	}


	public void setSleeveLength(String sleeveLength) {
		this.sleeveLength = sleeveLength;
	}


	public String getNameOnBack() {
		return nameOnBack;
	}


	public void setNameOnBack(String nameOnBack) {
		this.nameOnBack = nameOnBack;
	}


	public String getPrimaryColor() {
		return primaryColor;
	}


	public void setPrimaryColor(String primaryColor) {
		this.primaryColor = primaryColor;
	}


	public String getSecondaryColor() {
		return secondaryColor;
	}


	public void setSecondaryColor(String secondaryColor) {
		this.secondaryColor = secondaryColor;
	}


	public int getNumberOnBack() {
		return numberOnBack;
	}


	public void setNumberOnBack(int numberOnBack) {
		this.numberOnBack = numberOnBack;
	}


	@Override
	public void fabricType() {
		// TODO Auto-generated method stub

	}


	@Override
	public void qualityLevel() {
		// TODO Auto-generated method stub

	}


	@Override
	public void typeOfClothing() {
		// TODO Auto-generated method stub

	}


	@Override
	public String toString() {
		return "You have completed you custom Jersey!\n"
				+ "Sport: " + sport + "\n" + "Team: " + team + "\n" + "teamLogo: " + teamLogo + "\n"
				+ "Size: " + size + "\n" + "Fabric Type: " + fabric + "\n" + "Sleeve Type: " + sleeveLength + "\n" 
				+ "Number On Jersey: " + numberOnBack + "\n" + "Name On Jersey: " + nameOnBack + "\n" 
				+ "Jersey Colors: " + primaryColor + " " + "and" + " " + secondaryColor + "\n" +
				"Please allow 3-5 business days for shipping. Thank you for your purchase.";
	}

}
