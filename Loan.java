//Programmers: Mel Tenkoff, Katelyn Fu

import java.util.ArrayList;

public class Loan
{
  //instance variables
  private int id;
  private double loanAmount;
  private String country;
  private int daysToFund;
  private int numLenders;

  //constructor
  public Loan(int id, double loanAmount, String country, int daysToFund, int numLenders)
  {
    this.id = id; 
    this.loanAmount = loanAmount;
    this.country = country;
    this.daysToFund = daysToFund;
    this.numLenders = numLenders;
  }

  //accessor methods
  public int getID()
  {
    return id; 
  }
  public double getLoanAmount()
  {
    return loanAmount;
  }
  public String getCountry()
  {
    return country;
  }
  public int getDaysToFund()
  {
    return daysToFund;
  }
  public int getNumLenders()
  {
    return numLenders;
  }

  //modifier methods
  public void setID(int x)
  {
    this.id = x;
  }
  public void setLoanAmount(double x)
  {
    this.loanAmount = x;
  }
  public void setCountry(String x)
  {
    this.country = x;
  }
  public void setDaysToFund(int x)
  {
    this.daysToFund = x;
  }
  public void setNumLenders(int x)
  {
    this.numLenders = x;
  }
  
  //toString
  public String toString()
  {
    return "ID: " + id + " Loan Amount: " + loanAmount + " Country: " + country + " Days to Fund: " + daysToFund + " Number of Lenders: " + numLenders;
  }
}
