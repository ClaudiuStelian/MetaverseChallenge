# Metaverse calendar (metaverse)
Meeting your friends in the metaverse can be hard sometimes!  
Some of them log in every day, others only once a month.  
Given a window of days, your goal is to calculate how many times you’re all logged in together.  
For the problem, we assume that in the first day, all players are logged in.  

## Input data  
In each file, the first line contains T the number of test cases.  
Then, for each test case, there are the following two lines:  
1. Two space-separated integer numbers N and M, the number of friends in your group and the  
window of days in which you have to simultaneously log in.  
2. N space-separated integer numbers Pn, the array of frequency of the N players, for example, if Pn=3 means that friend n logs in each third day.    

## Output data  
The output file must contain T lines. For each test case in the input file, the output file must contain a line with the characters:  
Case #t: S  
where t is the test case number (from 1 to T) and S is the number of days when all the N players are logged in at the same time. 

## Constraints  
• Days are counted starting from 1  
• On day 1 all friends are connected  
• 1 ≤ T ≤ 20  
• 2 ≤ N ≤ 6  
• 1 ≤ M ≤ 1 000 000  

## Scoring   
• input 1 : T = 1, N ≤ 2 and M ≤ 100  
• input 2 : T = 5, N ≤ 3 and M ≤ 1 000  
• input 3 : T = 10, N ≤ 4 and M ≤ 10 000  
• input 4 : T = 15, N ≤ 5 and M ≤ 100 000  
• input 5 : T = 20, N ≤ 6 and M ≤ 1 000 000  
