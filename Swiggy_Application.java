
/*

SNEHA
9940708824
08:00 AM BATCH

*/ 

// SWIGGY APPLICATION

import java.util.*;
class Swiggy_Application
{
	static Scanner sn = new Scanner(System.in);
	public static void main(String[] args)throws Exception
	{ 
		System.out.println("\t\t\t`````````````````````````````\t\t\t");
		System.out.println("\t\t\tWELCOME TO SWIGGY APPLICATION\t\t\t");
		System.out.println("\t\t\t`````````````````````````````\t\t\t");
	    System.out.println("****************");
		System.out.println("SELECT THE HOTEL");
	    System.out.println("****************");
        System.out.println("1.Bilal's\n2.Buhari\n3.A2B\n4.Exit");

		int user_selected_hotel = sn.nextInt();
		switch(user_selected_hotel)
		{
			//Bilal's hotel menu started here
			case 1:{
				System.out.println("\t\t\tTHANK YOU FOR SELECTING BILAL HOTEL\t\t\t");
	            System.out.println("*********");
			    System.out.println("Menu Card");
	            System.out.println("*********");
		        System.out.println("1.Mutton Briyani\n2.Chicken Briyani\n3.Exit");

			    int user_selected_food = sn.nextInt();
				switch (user_selected_food)
				{
				//1.Mutton Briyani 
				case 1:{
					double per_plate=380;
					Thread.sleep(1000);
	                System.out.println("One Plate Mutton Briyani: "+per_plate);
				    System.out.println("\t\t\tEnter the quantity you want:");
				    int qty = sn.nextInt();
                    double bill = qty*per_plate;
	                System.out.println("***********************");
				    System.out.println("Select the Payment mode");
	                System.out.println("***********************");
					Thread.sleep(1000);
				    System.out.println("1.GPay\n2.PhonePay\n3.COD");

				    int payment_mode = sn.nextInt();
					switch (payment_mode)
					{
                    //mutton briyani payment mode gpay started here
					case 1:{
	                    System.out.println("Selected payment mode is GPAY");
						Thread.sleep(1000);
						System.out.println("\t\t\tEnter the bill amt "+bill);
					    int user_bill_amt = sn.nextInt();
					    if (user_bill_amt==bill)
					    {
	                    System.out.println("Payment OTP is generating........");
						Thread.sleep(2000);
						int sys_otp=(int)(Math.random()*9999+9999);
						System.out.println(sys_otp);
						System.out.println("Enter the OTP:");
						int user_entered_otp =sn.nextInt();
						System.out.println( user_entered_otp);
					
					        if (user_entered_otp==sys_otp)
							{
								System.out.println("\t\t\tORDER PLACED");
								System.out.println("\t\t\t************THANK YOU VISIT AGAIN***********");
							}
							else
							{
								System.out.println("Oder NOT Placed you entered invalid OTP");
							}
					    }
						else
						{
							System.out.println("Entered bill amount isn't matching \n KINDLY ENTER CORRECTLY \n ******retry*****");
						}
						break;}
						//mutton briyani payment mode gpay ended here
					//mutton briyani payment mode phonepay started here
					case 2:{
	                    System.out.println("Selected payment mode is PHONEPAY");
						Thread.sleep(1000);
						System.out.println("\t\t\tEnter the bill amt "+bill);
					    int user_bill_amt = sn.nextInt();
					    if (user_bill_amt==bill)
						{
                        System.out.println("Payment OTP is generating........");
						Thread.sleep(2000);
						int sys_otp=(int)(Math.random()*9999+9999);
						System.out.println(sys_otp);
						System.out.println("Enter the OTP:");
						int user_entered_otp =sn.nextInt();
						System.out.println( user_entered_otp);
					
					        if (user_entered_otp==sys_otp)
							{
								System.out.println("\t\t\tORDER PLACED");
								System.out.println("\t\t\t************THANK YOU VISIT AGAIN***********");
							}
							else
							{
								System.out.println("Oder NOT Placed you entered invalid OTP");
							}
                           
						}
						else
						{
							System.out.println("Entered bill amount isn't matching \n KINDLY ENTER CORRECTLY \n ******retry*****");
						}
						break;}
						//mutton briyani payment mode phonepay ended here
					// mutton briyani payment mode cod started here
					case 3:{
						System.out.println("Selected payment mode is COD");
					    System.out.println("\t\t\tEnter the bill amt "+bill);
						int user_bill_amt = sn.nextInt();
						if (user_bill_amt==bill)
						{
							System.out.println("\t\t\tCash Paid");
							System.out.println("\t\t\t*************THANK YOU VISIT AGAIN******************");
						}
						else
						{
							System.out.println(" Cash payment amount isn't matching \n KINDLY ENTER CORRECT AMT \n ******retry******");
						}
						break;}
					}
					break;}
					//case 1 for bilal hotel's menu selection has ended here
					//2.Chicken Briyani
				case 2:{
					double per_plate=250;
	                System.out.println("One Plate Chicken Briyani: "+per_plate);
					Thread.sleep(1000);
				    System.out.println("\t\t\tEnter the quantity you want");
				    int qty = sn.nextInt();
                    double bill = qty*per_plate;
					System.out.println("***********************");
				    System.out.println("Select the Payment mode");
					System.out.println("***********************");
				    System.out.println("1.GPay\n2.PhonePay\n3.COD");

				    int payment_mode = sn.nextInt();
                    switch (payment_mode)
                    {
					//chicken briyani payment mode gpay started here
                    case 1:{
						System.out.println("Selected payment mode is GPAY");
						Thread.sleep(1000);
                        System.out.println("\t\t\tEnter the bill amt "+bill);
					    int user_bill_amt = sn.nextInt();
						if (user_bill_amt==bill)
						{
						System.out.println("Payment OTP is generating.........");
						Thread.sleep(2000);
                        int sys_otp=(int)(Math.random()*9999+9999);
						System.out.println(sys_otp);
						System.out.println("Enter the OTP:");
						int user_entered_otp =sn.nextInt();
						System.out.println( user_entered_otp);
					
					        if (user_entered_otp==sys_otp)
							{
								System.out.println("\t\t\tORDER PLACED");
								System.out.println("\t\t\t************THANK YOU VISIT AGAIN***********");
							}
							else
							{
								System.out.println("Oder NOT Placed you entered invalid OTP");
							}
						}
						else
						{
							System.out.println("Entered bill amount isn't matching \n KINDLY ENTER CORRECTLY \n ******retry*****");
						}
						break;}
						//chicken briyani's payment mode gpay ended here
						//chicken briyani's payment mode phonepay started here
					case 2:{
						System.out.println("Selected payment mode is PHONEPAY");
						Thread.sleep(1000);
						System.out.println("\t\t\tEnter the bill amt "+bill);
					    int user_bill_amt = sn.nextInt();
						if (user_bill_amt==bill)
						{
						System.out.println("Payment OTP is generating............");
						Thread.sleep(2000);
                        int sys_otp=(int)(Math.random()*9999+9999);
						System.out.println(sys_otp);
						System.out.println("Enter the OTP:");
						int user_entered_otp =sn.nextInt();
						System.out.println( user_entered_otp);
					
					        if (user_entered_otp==sys_otp)
							{
								System.out.println("\t\t\tORDER PLACED");
								System.out.println("\t\t\t************THANK YOU VISIT AGAIN***********");
							}
							else
							{
								System.out.println("Oder NOT Placed you entered invalid OTP");
							}
						}
						else
						{
							System.out.println("Entered bill amount isn't matching \n KINDLY ENTER CORRECTLY \n ******retry*****");
						}
						break;}
						//chicken briyani's payment mode phonepay code ended here
						// chicken briyani's payment mode cod started here
					case 3:{
						System.out.println("Selected payment mode is COD");
                        System.out.println("\t\t\tEnter the bill amt "+bill);
						int user_bill_amt = sn.nextInt();
						if (user_bill_amt==bill)
						{
							System.out.println("\t\t\tCash Paid");
							System.out.println("\t\t\t*************THANK YOU VISIT AGAIN******************");
						}
						else
						{
							System.out.println(" Cash payment amount isn't matching \n KINDLY ENTER CORRECT AMT \n ******retry******");
						}
						break;}
						//chicken briyani's payment mode cod ended here
                    }  
					break;}
					//case 2 for bilal's hotel menu ended here
				case 3:{
					System.out.println("THANKS for Coming to Bilal Hotel");
					break;}
				}
				// case 3 for bilal's hotel menu ended here 
				break;}
				// Bilal's hotel menu ended here
				// Buhari's hotel menu started here
			case 2:{
				System.out.println("\t\t\tTHANK YOU FOR SELECTING BUHARI HOTEL");
				System.out.println("*********");
			    System.out.println("Menu Card");
				System.out.println("*********");
		        System.out.println("1.Fish Cutlet\n2.Prawn Fry\n3.Exit");

			    int user_selected_food = sn.nextInt();
				switch (user_selected_food)
				{
					//1.fish cutlet
				case 1:{
					double per_plate=100;
					Thread.sleep(1000);
					System.out.println("One plate Fish Cutlet is "+per_plate);
				    System.out.println("\t\t\tEnter the Quantity");
				    int qty = sn.nextInt();
                    double bill = qty*per_plate;
					System.out.println("***********************");
				    System.out.println("Select the Payment mode");
					System.out.println("***********************");
				    System.out.println("1.GPay\n2.PhonePay\n3.COD");

				    int payment_mode = sn.nextInt();
					switch (payment_mode)
					{
						// fish cutlet payment mode gpay started here
					case 1:{
						System.out.println("Selected payment mode is GPAY");
						Thread.sleep(1000);
						System.out.println("\t\t\tEnter the bill amt "+bill);
					    int user_bill_amt = sn.nextInt();
					    if (user_bill_amt==bill)
					    {
						System.out.println("Payment OTP is generating..........");
						Thread.sleep(2000);
						int sys_otp=(int)(Math.random()*9999+9999);
						System.out.println(sys_otp);
						System.out.println("Enter the OTP:");
						int user_entered_otp =sn.nextInt();
						System.out.println( user_entered_otp);
					
					        if (user_entered_otp==sys_otp)
							{
								System.out.println("\t\t\tORDER PLACED");
								System.out.println("\t\t\t************THANK YOU VISIT AGAIN***********");
							}
							else
							{
								System.out.println("Oder NOT Placed you entered invalid OTP");
							}
					    }
						else
						{
							System.out.println("Entered bill amount isn't matching \n KINDLY ENTER CORRECTLY \n ******retry*****");
						}
						break;}
						//fish cutlet payment mode gpay ended here
						//fish cutlet payment mode phonepay started here
					case 2:{
						System.out.println("Selected payment mode is PHONEPAY");
						Thread.sleep(1000);
						System.out.println("\t\t\tEnter the bill amt "+bill);
					    int user_bill_amt = sn.nextInt();
						if (user_bill_amt==bill)
						{
                        System.out.println("Payment OTP is generating............");
						Thread.sleep(2000);
                        int sys_otp=(int)(Math.random()*9999+9999);
						System.out.println(sys_otp);
						System.out.println("Enter the OTP:");
						int user_entered_otp =sn.nextInt();
						System.out.println( user_entered_otp);
					
					        if (user_entered_otp==sys_otp)
							{
								System.out.println("\t\t\tORDER PLACED");
								System.out.println("\t\t\t************THANK YOU VISIT AGAIN***********");
							}
							else
							{
								System.out.println("Oder NOT Placed you entered invalid OTP");
							}
						}
						else
						{
							System.out.println("Entered bill amount isn't matching \n KINDLY ENTER CORRECTLY \n ******retry*****");
						}
						break;}
						//fish cutlet payment mode phonepay ended here
						// fish cutlet payment mode cod started here
					case 3:{
						System.out.println("Selected payment mode is COD");
						System.out.println("\t\t\tEnter the bill amt "+bill);
						int user_bill_amt = sn.nextInt();
						if (user_bill_amt==bill)
						{
							System.out.println("\t\t\tCash Paid");
							System.out.println("\t\t\t*************THANK YOU VISIT AGAIN******************");
						}
						else
						{
							System.out.println(" Cash payment amount isn't matching \n KINDLY ENTER CORRECT AMT \n ******retry******");
						}
						break;}
					
					}
					break;}
					// fish cutlet payment mode cod ended here
					//case 1 for Buhari's hotel menu ended here
				//2.prawn fry
				case 2:{
					double per_plate=80;
					Thread.sleep(1000);
					System.out.println("One Plate Prawn Fry: "+per_plate);
				    System.out.println("\t\t\tEnter the Quantity you want :");
				    int qty = sn.nextInt();
                    double bill = qty*per_plate;
					System.out.println("***********************");
				    System.out.println("Select the Payment mode");
					System.out.println("***********************");
				    System.out.println("1.GPay\n2.PhonePay\n3.COD");

				    int payment_mode = sn.nextInt();
					switch (payment_mode)
					{
				    // prawn fry payment mode gpay started here
					case 1:{
						System.out.println("Selected payment mode is GPAY");
						Thread.sleep(1000);
						System.out.println("\t\t\tEnter the bill amt "+bill);
					    int user_bill_amt = sn.nextInt();
					    if (user_bill_amt==bill)
					    {
						System.out.println("Payment OTP is generating............");
						Thread.sleep(2000);
						int sys_otp=(int)(Math.random()*9999+9999);
						System.out.println(sys_otp);
						System.out.println("Enter the OTP:");
						int user_entered_otp =sn.nextInt();
						System.out.println( user_entered_otp);
					
					        if (user_entered_otp==sys_otp)
							{
								System.out.println("\t\t\tORDER PLACED");
								System.out.println("\t\t\t************THANK YOU VISIT AGAIN***********");
							}
							else
							{
								System.out.println("Oder NOT Placed you entered invalid OTP");
							}
					    }
						else
						{
							System.out.println("Entered bill amount isn't matching \n KINDLY ENTER CORRECTLY \n ******retry*****");
						}
						break;}
						//prawn fry payment mode gpay ended here
					//prawn fry payment mode phonepay started here
					case 2:{
						System.out.println("Selected payment mode is PHONEPAY");
						Thread.sleep(1000);
						System.out.println("\t\t\tEnter the bill amt "+bill);
					    int user_bill_amt = sn.nextInt();
					    if (user_bill_amt==bill)
					    {
						System.out.println("Payment OTP is generating..............");
						Thread.sleep(2000);
						int sys_otp=(int)(Math.random()*9999+9999);
						System.out.println(sys_otp);
						System.out.println("Enter the OTP:");
						int user_entered_otp =sn.nextInt();
						System.out.println( user_entered_otp);
					
					        if (user_entered_otp==sys_otp)
							{
								System.out.println("\t\t\tORDER PLACED");
								System.out.println("\t\t\t************THANK YOU VISIT AGAIN***********");
							}
							else
							{
								System.out.println("Oder NOT Placed you entered invalid OTP");
							}
					    }
						else
						{
							System.out.println("Entered bill amount isn't matching \n KINDLY ENTER CORRECTLY \n ******retry*****");
						}
						break;}
						//prawn fry payment mode phonepay ended here
					//prawn fry payment mode cod started here
					case 3:{
						System.out.println("Selected payment mode is COD");
						System.out.println("\t\t\tEnter the bill amt "+bill);
						int user_bill_amt = sn.nextInt();
						if (user_bill_amt==bill)
						{
							System.out.println("\t\t\tCash Paid");
							System.out.println("\t\t\t*************THANK YOU VISIT AGAIN******************");
						}
						else
						{
							System.out.println(" Cash payment amount isn't matching \n KINDLY ENTER CORRECT AMT \n ******retry******");
						}
						break;}
					    //prawn fry payment mode cod ended here
					}
					break;}
					// case 2 for Buhari's hotel ended here
				//Exit
				case 3:{
					System.out.println("THANKS for Coming to Buhari Hotel");
					break;}
				// case 3 for Buhari's hotel ended here
				}
				break;}
				//Buhari's hotel menu ended here
			// A2B's hotel menu started here
			case 3:{
				System.out.println("\t\t\tTHANK YOU FOR SELECTING A2B HOTEL");
				System.out.println("*********");
			    System.out.println("Menu Card");
				System.out.println("*********");
		        System.out.println("1.Carrot Halwa\n2.Grass Juice\n3.Exit");

			    int user_selected_food = sn.nextInt();
				switch (user_selected_food)
				{
				//1.carrot halwa
				case 1:{
					double per_plate=120;
                    System.out.println("One plate carrot halwa: "+per_plate);
					Thread.sleep(1000);
				    System.out.println("\t\t\tEnter the Quantity");
				    int qty = sn.nextInt();
                    double bill = qty*per_plate;
					System.out.println("***********************");
				    System.out.println("Select the Payment mode");
					System.out.println("***********************");
				    System.out.println("1.GPay\n2.PhonePay\n3.COD");

				    int payment_mode = sn.nextInt();
					switch (payment_mode)
					{
					//carrot payment mode gpay started here
					case 1:{
						System.out.println("Selected payment mode is GPAY");
						Thread.sleep(2000);
						System.out.println("\t\t\tEnter the bill amt "+bill);
					    int user_bill_amt = sn.nextInt();
					    if (user_bill_amt==bill)
					    {
						System.out.println("Payment OTP is generating............");
						Thread.sleep(1000);
						int sys_otp=(int)(Math.random()*9999+9999);
						System.out.println(sys_otp);
						System.out.println("Enter the OTP:");
						int user_entered_otp =sn.nextInt();
						System.out.println( user_entered_otp);
					
					        if (user_entered_otp==sys_otp)
							{
								System.out.println("\t\t\tORDER PLACED");
								System.out.println("\t\t\t************THANK YOU VISIT AGAIN***********");
							}
							else
							{
								System.out.println("Oder NOT Placed you entered invalid OTP");
							}
					    }
						else
						{
							System.out.println("Entered bill amount isn't matching \n KINDLY ENTER CORRECTLY \n ******retry*****");
						}
						break;}
						//carrot payment mode gpay ended here
					//carrot payment mode phonepay started here
					case 2:{
						System.out.println("Selected payment mode is PHONEPAY");
						System.out.println(2000);
						System.out.println("\t\t\tEnter the bill amt "+bill);
					    int user_bill_amt = sn.nextInt();
					    if (user_bill_amt==bill)
					    {
						System.out.println("Payment OTP is generating..............");
						Thread.sleep(1000);
						int sys_otp=(int)(Math.random()*9999+9999);
						System.out.println(sys_otp);
						System.out.println("Enter the OTP:");
						int user_entered_otp =sn.nextInt();
						System.out.println( user_entered_otp);
					
					        if (user_entered_otp==sys_otp)
							{
								System.out.println("\t\t\tORDER PLACED");
								System.out.println("\t\t\t************THANK YOU VISIT AGAIN***********");
							}
							else
							{
								System.out.println("Oder NOT Placed you entered invalid OTP");
							}
					    }
						else
						{
							System.out.println("Entered bill amount isn't matching \n KINDLY ENTER CORRECTLY \n ******retry*****");
						}
						break;}
						//carrot payment mode phonepay ended here
					//carrot payment mode cod started here
					case 3:{
						System.out.println("Selected payment mode is COD");
						System.out.println("\t\t\tEnter the bill amt "+bill);
						int user_bill_amt = sn.nextInt();
						if (user_bill_amt==bill)
						{
							System.out.println("\t\t\tCash Paid");
							System.out.println("\t\t\t*************THANK YOU VISIT AGAIN******************");
						}
						else
						{
							System.out.println(" Cash payment amount isn't matching \n KINDLY ENTER CORRECT AMT \n ******retry******");
						}
						break;}
						//carrot payment mode cod ended here
					
					}
					break;}
				// case 1 for A2b ended here
				//2.Grass Juice
				case 2:{
					double per_plate=120;
				    System.out.println("One grass juice: "+per_plate);
					Thread.sleep(1000);
				    System.out.println("\t\t\tEnter the Quantity you want:");
				    int qty = sn.nextInt();
                    double bill = qty*per_plate;
					System.out.println("***********************");
				    System.out.println("Select the Payment mode");
					System.out.println("***********************");
				    System.out.println("1.GPay\n2.PhonePay\n3.COD");

				    int payment_mode = sn.nextInt();
                    switch (payment_mode)
                    {
				    //grass payment mode gpay started here
                    case 1:{
						System.out.println("Selected payment mode is GPAY");
						Thread.sleep(1000);
                        System.out.println("\t\t\tEnter the bill amt "+bill);
					    int user_bill_amt = sn.nextInt();
					    if (user_bill_amt==bill)
					    {
						System.out.println("Payment OTP is generating.........");
						Thread.sleep(2000);
						int sys_otp=(int)(Math.random()*9999+9999);
						System.out.println(sys_otp);
						System.out.println("Enter the OTP:");
						int user_entered_otp =sn.nextInt();
						System.out.println( user_entered_otp);
					
					        if (user_entered_otp==sys_otp)
							{
								System.out.println("\t\t\tORDER PLACED");
								System.out.println("\t\t\t************THANK YOU VISIT AGAIN***********");
							}
							else
							{
								System.out.println("Oder NOT Placed you entered invalid OTP");
							}
						}
						else
						{
							System.out.println("Entered bill amount isn't matching \n KINDLY ENTER CORRECTLY \n ******retry*****");
						}
						break;}
						//grass payment mode gpay ended here
					//grass payment mode phonepay started here
					case 2:{
						System.out.println("Selected payment mode is PHONEPAY");
						Thread.sleep(1000);
                        System.out.println("\t\t\tEnter the bill amt "+bill);
					    int user_bill_amt = sn.nextInt();
					    if (user_bill_amt==bill)
					    {
						System.out.println("Payment OTP is generating.............");
						Thread.sleep(1000);
						int sys_otp=(int)(Math.random()*9999+9999);
						System.out.println(sys_otp);
						System.out.println("Enter the OTP:");
						int user_entered_otp =sn.nextInt();
						System.out.println( user_entered_otp);
					
					        if (user_entered_otp==sys_otp)
							{
								System.out.println("\t\t\tORDER PLACED");
								System.out.println("\t\t\t************THANK YOU VISIT AGAIN***********");
							}
							else
							{
								System.out.println("Oder NOT Placed you entered invalid OTP");
							}
						}
						else
						{
							System.out.println("Entered bill amount isn't matching \n KINDLY ENTER CORRECTLY \n ******retry*****");
						}
						break;}
						//grass payment mode phonepay ended here
					//grass payment mode cod started here
					case 3:{
						System.out.println("Selected payment mode is COD");
						System.out.println("\t\t\tEnter the bill amt "+bill);
						int user_bill_amt = sn.nextInt();
						if (user_bill_amt==bill)
						{
							System.out.println("\t\t\tCash Paid");
							System.out.println("\t\t\t*************THANK YOU VISIT AGAIN******************");
						}
						else
						{
							System.out.println(" Cash payment amount isn't matching \n KINDLY ENTER CORRECT AMT \n ******retry******");
						}
						break;}
						//grass payment mode cod ended here
                    
                    }
					break;}
				// case 2 for A2B ended here
				//3.Exit
				case 3:{
					System.out.println("THANKS for Coming to A2B Hotel");
					break;}
				//case 3 for A2B ended here
				
				}
				break;}
				// A2B's hotel menu ended here
			//4.Exit
			case 4:{
				System.out.println("THANK YOU for using the SWIGGY Application");
				break;}
		}

	}
}
/*
OUTPUT EXECUTING ONLY IF BLOCK:

                        `````````````````````````````
                        WELCOME TO SWIGGY APPLICATION
                        `````````````````````````````
****************
SELECT THE HOTEL
****************
1.Bilal's
2.Buhari
3.A2B
4.Exit
1
                        THANK YOU FOR SELECTING BILAL HOTEL
*********
Menu Card
*********
1.Mutton Briyani
2.Chicken Briyani
3.Exit
1
One Plate Mutton Briyani: 380.0
                        Enter the quantity you want:
2
***********************
Select the Payment mode
***********************
1.GPay
2.PhonePay
3.COD
2
Selected payment mode is PHONEPAY
                        Enter the bill amt 760.0
760
Payment OTP is generating........
12448
Enter the OTP:
12448
12448
                        ORDER PLACED
                        ************THANK YOU VISIT AGAIN***********

*/




/*

OUTPUT EXECUTING ELSE BLOCK IN BILL AMT


                        `````````````````````````````
                        WELCOME TO SWIGGY APPLICATION
                        `````````````````````````````
****************
SELECT THE HOTEL
****************
1.Bilal's
2.Buhari
3.A2B
4.Exit
2
                        THANK YOU FOR SELECTING BUHARI HOTEL
*********
Menu Card
*********
1.Fish Cutlet
2.Prawn Fry
3.Exit
2
One Plate Prawn Fry: 80.0
                        Enter the Quantity you want :
1
***********************
Select the Payment mode
***********************
1.GPay
2.PhonePay
3.COD
1
Selected payment mode is GPAY
                        Enter the bill amt 80.0
8
Entered bill amount isn't matching
 KINDLY ENTER CORRECTLY
 ******retry*****

*/



/* 

OUTPUT EXECUTING ELSE BLOCK IN OTP GENERATION

                        `````````````````````````````
                        WELCOME TO SWIGGY APPLICATION
                        `````````````````````````````
****************
SELECT THE HOTEL
****************
1.Bilal's
2.Buhari
3.A2B
4.Exit
3
                        THANK YOU FOR SELECTING A2B HOTEL
*********
Menu Card
*********
1.Carrot Halwa
2.Grass Juice
3.Exit
1
One plate carrot halwa: 120.0
                        Enter the Quantity
5
***********************
Select the Payment mode
***********************
1.GPay
2.PhonePay
3.COD
2
Selected payment mode is PHONEPAY
2000
                        Enter the bill amt 600.0
600
Payment OTP is generating..............
11874
Enter the OTP:
11784
11784
Oder NOT Placed you entered invalid OTP

*/

/*

OUTPUT EXECUTING EXIT CASE

                      `````````````````````````````
                        WELCOME TO SWIGGY APPLICATION
                        `````````````````````````````
****************
SELECT THE HOTEL
****************
1.Bilal's
2.Buhari
3.A2B
4.Exit
4
THANK YOU for using the SWIGGY Application

*/