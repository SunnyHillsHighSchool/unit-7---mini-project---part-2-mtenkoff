import java.util.ArrayList;

public class ComputingStatistics 
{
   /**
   * The ArrayList containing all of the loan data.
   */
   private ArrayList<Loan> data;
   
   /**
    * Creates a new ComputingStatistics object with an empty ArrayList 
    */
   public ComputingStatistics() {
      data = new ArrayList<Loan>();
   }
   
   /**
    * Creates a new ComputingStatistics object with the data passed in
    */
   public ComputingStatistics(ArrayList<Loan> d) {
      data = d;
   }
   
   /**
    * Calclates the total amount funded from all of the loans in the file.
    * @return the total loan amount.
    */
   public double totalAmount() {
      double amount = 0.0;
      for(int i = 0; i < data.size(); i++) {
         amount = amount + data.get(i).getLoanAmount();
      }
      return amount;
   }

   public double largestLoan()
   {
   //Make double variable called largest and store 0
   //For loop each loop that iterates through list, element
   //If element is greater than largest
   //Store element in largest
   //Return largest
   double largest = Double.MIN_VALUE;
     for (int i = 0; i < data.size(); i++)
     {
       if (data.get(i).getLoanAmount() > largest)
         largest = data.get(i).getLoanAmount();
     } 
     return largest; 
   }
   
   public double smallestLoan()
   {
     //Make double variable called smallest and store 0
     //For loop each loop that iterates through list, element
     //If element is less than smallest 
     //Store element in smallest
     //Return smallest
     double smallest = Double.MAX_VALUE;
     for (int i = 0; i < data.size(); i++)
     {
       if (data.get(i).getLoanAmount() < smallest)
         smallest = data.get(i).getLoanAmount();
     } 
     return smallest; 
   } 
   

   public String largestLoanCountry()
   {
     //Double bigLoan = 0 -first element in list
     //For loop that iterates through countries, i
     //If call largestLoan() for i in list > call largestLoan() for bigLoan in list
		 //bigLoan = i;
     //Return country list index of bigLoan
     //data.getCountry()
     //data.getLoanAmount
          int largeIndex = 0;
     for (int i = 0; i < data.size(); i++)
     {
       if (data.get(i).getLoanAmount() > data.get(largeIndex).getLoanAmount())
         largeIndex = i;
     } 
     return data.get(largeIndex).getCountry();
   }

   public String smallestLoanCountry()
   {
     //Double sLoan = 0 - first element in list
     //For loop that iterates through countries (.getCountry())
     //If call smallestLoan() for index of i < call smallestLoan() for index of sLoan
		 //sLoan = i;
     //Return country list index of sLoan
     //double smallest = Double.MAX_VALUE;
     int smallIndex = 0;
     for (int i = 0; i < data.size(); i++)
     {
       if (data.get(i).getLoanAmount() < data.get(smallIndex).getLoanAmount())
         smallIndex = i;
     } 
     return data.get(smallIndex).getCountry();
   } 

   public double avgDaysToFund() 
   { 
     //create an int called sum and set it to 0
     double sum = 0; 
     //Loop through the data ArrayList: int i = 0, while i < size, i++
     for (int i = 0; i < data.size(); i++)
     {
       //get the days of the element at i and add it to sum
       sum += data.get(i).getDaysToFund();
     }
     //create an int called avg and set it to sum / size
     double avg = sum / data.size();
     //return avg
     return avg;
   }

   public double avgLoan()
   {
     double sum = 0;
     for (int i = 0; i < data.size(); i++)
     {
       sum += data.get(i).getLoanAmount();
     }
     return (double) sum / (data.size());
   }

   public double largestLoanKenya()
   {
     //create an int called largest and set it to 0
     double largest = 0;
     //Loop through the data ArrayList: int i = 0, while i < size, i++
     for (int i = 0; i < data.size(); i++)
     {
       //get the element at i and check if its country is kenya
       if (data.get(i).getCountry().equals("Kenya"))
       {
         //if that element’s loan amount is greater than largest
         if (data.get(i).getLoanAmount() > largest)
         {
           //set the largest to the loan amount
           largest = data.get(i).getLoanAmount();
         }
       }
     }
     //return largest
     return largest;
   }

   public double avgLoanPhilippines()
   {
     //create an int called sum and set it to 0
     double sum = 0;
     //create an int called num and set it to 0
     double num = 0;
     //Loop through the data ArrayList: int i = 0, while i < size, i++
     for (int i = 0; i < data.size(); i++)
     {
       //get the element at i and check if its country is the philippines
       if (data.get(i).getCountry().equals("Philippines"))
       {
         //increment num
         num++;
	       //add the loan amount to sum
         sum += data.get(i).getLoanAmount();
       }
     }
     //create an double called avg and set it to sum / num
     double avg = (double) sum / num;
     //return avg
     return avg;
   }

   public String longestToFundCountry()
   {
     //create a int called longest and set it to 0
     int longest = 0;
     //create an int called indexOfLongest and set it to 0
     int indexOfLongest = 0;
     //Loop through the data ArrayList: int i = 0, while i < size, i++
     for (int i = 0; i < data.size(); i++)
     {
       //if the current element’s daysToFund is greater than longest
       if (data.get(i).getDaysToFund() >= longest)
       {
         //set longest to daysToFund of that element
         longest = data.get(i).getDaysToFund();
         //set indexOfLongest to the index
         indexOfLongest = i;
       }
     }
     //return the country at postition indexOfLongest
     return data.get(indexOfLongest).getCountry();
   }
   
   public double variance()
   {
     //create an int called sum and set it to 0
     double sum = 0;
     //Loop through the data ArrayList: int i = 0, while i < size, i++
     for (int i = 0; i < data.size(); i++)
     {
       //get the loan amount of the element at i and add it to sum
       sum += data.get(i).getLoanAmount();
     }
     //create an int called avg and set it to sum / size
     double avg = sum / data.size();
     //create an int called variance and set it to 0
     double variance = 0;
     //Loop through the data ArrayList: int i = 0, while i < size, i++
     for (int i = 0; i < data.size(); i++)
     {
       //create an int called subtracted and set it to the square root of the element’s loan amount and subtracted with the avg
       double subtracted = (data.get(i).getLoanAmount()- avg)*(data.get(i).getLoanAmount()- avg);
       //divide subtracted by the size 
       subtracted /= data.size();
	     //add subtracted to variance
       variance += subtracted;
     }
     //return variance
     return variance;
   }
//katelyn fu and mel
   public double standardDeviation()
   {
    //create an int called sum and set it to 0
     double sum = 0;
     //Loop through the data ArrayList: int i = 0, while i < size, i++
     for (int i = 0; i < data.size(); i++)
     {
       //get the loan amount of the element at i and add it to sum
       sum += data.get(i).getLoanAmount();
     }
     //create an int called avg and set it to sum / size
     double avg = sum / data.size();
     //create an int called variance and set it to 0
     double variance = 0;
     //Loop through the data ArrayList: int i = 0, while i < size, i++
     for (int i = 0; i < data.size(); i++)
     {
       //create an int called subtracted and set it to the square root of the element’s loan amount and subtracted with the avg
       double subtracted = (data.get(i).getLoanAmount()- avg)*(data.get(i).getLoanAmount()- avg);
       //divide subtracted by the size 
       subtracted /= data.size();
	     //add subtracted to variance
       variance += subtracted;
     }
     //Return square root of variance() - (Math.sqrt())
     return Math.sqrt(variance);
   }


//-------------------------------------------------------------

   public boolean empiricalRule()
   {
     //calculate mean of values
   //calculate standard deviation
   //apply empirical rule formula
   //    68 percent of data should fall between 1 standard deviation from the mean(x - y and x + y)
   //    95 percent of the data should fall between 2 standard deviations from the mean (x - 2y and x + 2y)
   //    99.7 percent of the data should fall between 3 standard deviations from the mean (x - 3y and x + 3y)
   // mean is x      standard deviation is y
     
     //AVERAGE METHOD
     double sum = 0;
     for (int i = 0; i < data.size(); i++)
     {
       sum += data.get(i).getLoanAmount();
     }
     double avg = sum / data.size();

     //VARIANCE METHOD
     double variance = 0;
     for (int i = 0; i < data.size(); i++)
     {
       double subtracted = (data.get(i).getLoanAmount()- avg)*(data.get(i).getLoanAmount()- avg);
       //divide subtracted by the size 
       subtracted /= data.size();
	     //add subtracted to variance
       variance += subtracted;
     }
     


//////////////////////////////////////////////////


     double deviation = Math.sqrt(variance);
     double low1 = avg - deviation;
     double high1 = avg + deviation;
     double num1 = 0;
     for (int i = 0; i < data.size(); i++)
     {
       if ((low1 < data.get(i).getLoanAmount()) && (data.get(i).getLoanAmount() < high1))
       {
         num1++;
       }
     }
     
     boolean result = false;
     System.out.println("\n");
     System.out.println("num1: " + num1);
     System.out.println("size: " + data.size());
     double difference = Math.abs(num1 - data.size()*0.68);

     System.out.println("difference: " + difference);
     System.out.println(".68% of size: " + data.size() * 0.68);
     
     difference = data.size()*0.68;
     if (num1 <= difference)
     {
       result = true;
     }
     return result;
   }
   
//if (num1/data.size <= data.size()*0.68)

//Katelyn Fu
   public String toString() 
   {
     return "" + data;
   }
}