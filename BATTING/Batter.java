package BATTING;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;


  public class Batter { 
  Scanner sc = new Scanner(System.in); 
  private String  playerName; 
  int numberOfAtBat; 
  int numberOfHits; 
  double battingAverage; 
  int totalNumberOfBase;
   int sum = 0;
    ArrayList<Integer> basesEarned = new ArrayList<Integer>();
  
  public Batter(String playerName) { 
  this.playerName = playerName;
  
  }
  
 // public String getPlayerName() {
  // return playerName; }
  
 // public void setPlayerName(String playerName) {
  // this.playerName = playerName;
 // }
  
  public void setBasesEarned(ArrayList<Integer> basesEarned) {
   this.basesEarned  = basesEarned; }
  
  public Integer getBasesEarned() {
  
  for (int i = 0; i < basesEarned.size(); i++) { sum += basesEarned.get(i);
  
  } return sum;
  
  }
  public double getBattingAverage() {
  
  return (double) numberOfHits / (double) numberOfAtBat; }
  
  public String getFormatedSluggingPercentage() {
	   return  formatNumber(getsluggingPercentage()); }
  
  public String getFormatedBattingAverage() {
   return  formatNumber(getBattingAverage()); }
  
  
  
  
  
  private String formatNumber(double x) {
   NumberFormat number = NumberFormat.getNumberInstance(); 
   number.setMaximumFractionDigits(2); 
   String  format = number.format(x); return format; 
  }
  
  public double getsluggingPercentage() { 
	  double sluggingPercentage = sum /numberOfAtBat; 
	  return (int) sluggingPercentage; }
   }
 
