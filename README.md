# Mastermind Code Breaker
A command line program that suggests code guesses that allow the user to win a game of Mastermind in about five or six guesses.

## The Game
![Mastermind](https://i.imgur.com/5qg3tjC.jpg)

## The Rules
[Official Hasbro rules](https://www.hasbro.com/common/documents/dad261421c4311ddbd0b0800200c9a66/819DF9B85056900B10B25C68C95E39E5.pdf)

#### *TL;DR:*
- One player chooses and remembers a four colour code
- A second player attempts to guess the code maker's code by placing four pegs in a row on the Mastermind "board"
- After a guess has been made, the code maker pulls out the 
  - *White slider* to the number of correct peg colours that are in the code guesser's guess
  - *Red slider* to the number of exactly correct pegs that are in the code guesser's guess
- The code guesser continues to make informed guesses based on their previous guesses until he or she guesses the exact code

## Important Information
- There are four colours per Mastermind code
- There are eight colours (red, orange, yellow, green, blue, pink, grey, white)
- There are 8^4 (4096) possible codes

## Usage
The first code guess is not suggested by the program. It is up to the user to do so.

Enter your desired code as a number. Use this table for reference:

| Colour          |  Number |
| :-------------: | :-------------: | 
| Red             | 0               |
| Orange          | 1               |
| Yellow          | 2               |
| Green           | 3               |
| Blue            | 4               |
| Pink            | 5               |
| Grey            | 6               |
| White           | 7               |

After inputting a guess, wait for the code setting player to pull out the red and white sliders. Follow the prompt and enter the red and white slider values. The console will suggest the next ideal guess. It will look something like this:
```
|RED|RED|GREEN|GREEN|
```
Use this as your next guess. Repeat this process until you win!

## How it Works
This program works using a linked list that stores every possible combination from 0000 to 9999. After a code guess and its corresponding red and white slider values are inputted, the program eliminates every code combination from the linked list that does *not* produce the exact same red and white slider values. The suggested guess is given by the first element in the linked list after the wrong answers are removed.

## More Information
- [Swaszek's algorithm and analysis](https://arxiv.org/pdf/1305.1010.pdf)
- [Wikipedia](https://en.wikipedia.org/wiki/Mastermind_(board_game))

## To Do:
- [ ] Exit the program when the user declares that all four red sliders are pulled out
- [ ] Add exceptions to slider inputs of greater than four or less than zero
- [ ] Clean up MastermindGuesser() by creating more functions
- [ ] Add options to customize the number of peg colours and pegs per code
- [ ] Make the console interface more appealing and intuitive
- [ ] Allow users to input strings for colours instead of numbers
- [ ] Implement a GUI?
- [ ] Implement this code in an Android app using Android Studio?
