#!/usr/bin/perl 

##
## Find numbers greater than given number
## Using if
##

use strict;
use warnings;

our $debug_flag = 0;

sub main()
{
    ## Get array size as user input
    print "\nEnter the array size: ";
    my $array_size = <STDIN>;
    chomp ($array_size);

    ## Get the number from the user
    print "Enter the number: ";
    my $number = <STDIN>;
    chomp ($number);

    ## Array to store random numbers
    my @random_array;

    ## Range for generating random numbers
    my $range = 2 * $array_size;

    ## Generate random numbers
    ## Store in array
    foreach (1..$array_size) {
        push (@random_array, int(rand($range)) + 1);
    }

    ## Print random array
    print "\nRandom array numbers: \n" if  $debug_flag;
    print join(", ", @random_array), "\n" if $debug_flag;

    my $now = time;
    my @sorted_array = sort {$b <=> $a} @random_array;
    ## Find numbers greater than given numbers using if
    my @bigger_than_number;
    my $j = 0;
    while (($j < $array_size) && ($sorted_array[$j] > $number)) {
            push (@bigger_than_number, $sorted_array[$j++]);
    }
    $now = time - $now;

    ## Print numbers bigger than given number
    print "\nNumbrs bigger than $number: \n" if  $debug_flag;
    print join(", ", @bigger_than_number), "\n" if $debug_flag; 
  
    ## Print time taken
    print "\nArraySize: ", $array_size, ", Time: ", $now, " Seconds\n";
}

&main();
