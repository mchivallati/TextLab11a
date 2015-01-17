package net.franklinps.chivallati.TextLab11a;

import java.util.Scanner;

/**
 * Created by CompSci-04 on 1/12/2015.
 */
public class TextLab11aChivallativ100
{

	public static void main( String[] args )
	{

		Scanner input = new Scanner( System.in );
		System.out.println( "\nLab11a\n" );

		System.out.print( "Enter a number ====> " );

		final int MAX = input.nextInt();

		displayPrimes( computePrimes( MAX ) );

	}

	public static boolean[] computePrimes( int max )

	{
		int maxSquareRoot = (int) Math.sqrt( max ); // Declares the Square Root of the maximum bound
		boolean[] notPrime = new boolean[ max + 1 ]; // creates the boolean array to store if a number is prime or not

		for ( int i = 2 ; i <= maxSquareRoot ; i++ ) // In the algorithm using Erathones' original 0-120 range you only have to use the 0-9 digit range, but to make it universal, you must use the square root of the maximum bound.
		{

			if ( ! notPrime[ i ] )
			{

				for ( int k = i * i ; k <= max ; k += i ) // Algorithm implementation
				{

					notPrime[ k ] = true;

				}

			}

		}

		notPrime[ 0 ] = true; // set 0 to not be a prime number
		notPrime[ 1 ] = true; // set 1 to not be a prime number

		return notPrime; // returns the array

	}

	public static void displayPrimes( boolean[] notPrime )
	{

		for ( int i = 0 ; i < notPrime.length ; i++ )
		{

			if ( !notPrime[i] ) // for every false part in the array
			{

				System.out.print( String.format( "%04d" , i ) + " " ); // print i which represents the prime number

			}

		}

	}

}