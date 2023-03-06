/* 
The file pricelist.txt contains a list of goods in a diary and their prices.
Each line in the file contains a name (without spaces) and a price (a
double)
Read the list and create a HashMap using the item name as the key and
the price as the data

Sample file pricelist.txt
Bread 2.20
Lemonade 1.95
Butter 5.80
Mince_Pie 0.95
Chocolate 3.50

From standard input read a shopping list
Each line contains a series of item names and the quantity of each
required (as an integer)
For each line output the total price of the grocery order formatted to a
precision of 2 decimal places and preceded by a $ symbol.
The input data will end in a single line containing a #
Do not process the line with the # in it
Assume all items exist in the inventory.

Sample Input Sample Output
Butter 1 Lemonade 2 $9.70
Chocolate 2 Mince_Pie 3 Bread 1 $12.05
# 

*/


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
