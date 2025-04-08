# Advent of Code 2022 - Day 1: Calorie Counting
![Mi proyecto](assets/advent-of-code.jpeg)
This repository contains the solution for **Day 1** of the **Advent of Code 2022** challenge, focusing on calorie counting for Santa's reindeer expedition. The challenge is about analyzing calorie inventories and determining which elves carry the most calories.

## Problem Description

Santa’s elves are on an expedition to gather magical star fruit, and each elf is carrying food supplies. The goal is to analyze the calorie count of the food that each elf carries.

### Part One

The elves have recorded their food inventories in a list. Your task is to find the elf carrying the most calories. Each elf’s inventory is separated by a blank line.

For example, given the following inventory:

```
1000
2000
3000

4000

5000
6000

7000
8000
9000

10000
```

You need to calculate the total calories each elf carries and determine the maximum. In this case, the fourth elf is carrying 24,000 calories, which is the highest.

### Part Two

Now, instead of just the top elf, you need to find the total calories carried by the top three elves carrying the most food. In the example above, the total for the top three elves would be 45,000 calories.

## My Solution

This solution processes the input by:

1. Reading the file line by line.
2. Splitting the calorie inventories based on blank lines.
3. Summing the calorie count for each elf.
4. Finding the elf carrying the most calories (Part One).
5. Finding the total calories carried by the top three elves (Part Two).

## Usage

1. Clone the repository:  
   ```bash
   git clone https://github.com/your-username/advent-of-code-2022-day1.git
   ```

2. **Change the file location**:  
   The file path for the calorie input is specified in the code. You can either place your input file at the default path (`"C:\\Users\\Alex\\Desktop\\Universidad\\2n\\paed\\advent\\star1\\src\\hola"`) or modify the `archivo` variable in `Main.java` to point to your file’s location.

3. Run the program to solve the challenge:
   ```bash
   javac Main.java
   java Main
   ```

4. The program will display:
   - The highest number of calories carried by a single elf (Part One).
   - The total calories carried by the top three elves (Part Two).

## Results

- **Part One**: 64,929 Calories carried by the top elf.
- **Part Two**: 193,697 Calories carried by the top three elves.

## Advent of Code

This project is part of the **Advent of Code 2022** event, where participants solve daily coding puzzles throughout December. Check out the full event at [Advent of Code](https://adventofcode.com/2022).

## Contributions

Feel free to contribute with improvements or alternative solutions. Fork the repository and open a **pull request**.
