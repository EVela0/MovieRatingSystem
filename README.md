The mentality I had to build the program MovieRatingSystem, was simplifying the blocks of the prompt into sections. Writing out the logic of what is the order each block should do inorder to not break and make sense. I created a word document with the basic idea before writing any code at all. Ill copy and paste it under this explanation.

Scanner Input 

Output: User_name 

Input: Name_Variable 

Output: Whats your favorite movie genre 

Input: Genre 

If:  

Action → “You love excitement and thrills!” 

Comedy → “You enjoy a good laugh.” 

Horror → “You have a taste for fear!” 

Drama → “You appreciate deep storytelling.” 

Sci-Fi → “You love futuristic and imaginative worlds!” 

 

Else: loop back with error for invalid genre. 

Output: Out of the recent movies you have seen. What is one movie you can remember: 

Input: MovieOne (Make responses into an arrays) 

Output: What would you rate the movie? 

Input: RatingOne (Make Ratings into an arrays) 

If 1-10 move to next question 

Else: Not valid, please try again. (Loop to original prompt) 

If the user has rated any movie 10, display “Wow! You found a masterpiece.” 

If they rated any movie below 4, display “That movie didn’t impress you much.” 

Step 6: Use Logical Operators to Identify Consistent Ratings 

Use the && operator to check if all ratings are 7 or higher. 

If so, display “You seem to enjoy most movies.” 

If not, check if any rating is below 3 using ||. 

If a very low rating is found, display “You have strong opinions on movies!” 

Output: What is the second movie you can remember: 

Input: MovieTwo (Make responses into an arrays) 

Output: What would you rate the movie? 

Input: RatingTwo (Make Ratings into an arrays) 

If 1-10 move to next question 

Else: Not valid, please try again. (Loop to original prompt) 

If the user has rated any movie 10, display “Wow! You found a masterpiece.” 

If they rated any movie below 4, display “That movie didn’t impress you much.” 

Step 6: Use Logical Operators to Identify Consistent Ratings 

Use the && operator to check if all ratings are 7 or higher. 

If so, display “You seem to enjoy most movies.” 

If not, check if any rating is below 3 using ||. 

If a very low rating is found, display “You have strong opinions on movies!”  

 

Output: What is the third movie you can remember: 

Input: MovieThree (Make responses into an arrays) 

Output: What would you rate the movie? 

Input: RatingThree (Make Ratings into an arrays) 

If 1-10 move to next question 

Else: Not valid, please try again. (Loop to original prompt) 

If the user has rated any movie 10, display “Wow! You found a masterpiece.” 

If they rated any movie below 4, display “That movie didn’t impress you much.” 

Step 6: Use Logical Operators to Identify Consistent Ratings 

Use the && operator to check if all ratings are 7 or higher. 

If so, display “You seem to enjoy most movies.” 

If not, check if any rating is below 3 using ||. 

If a very low rating is found, display “You have strong opinions on movies!”  

 

Output: What is the fourth movie you can remember: 

Input: MovieFour (Make responses into an arrays) 

Output: What would you rate the movie? 

Input: RatingFour (Make Ratings into an arrays) 

If 1-10 move to next question 

Else: Not valid, please try again. (Loop to original prompt) 

If the user has rated any movie 10, display “Wow! You found a masterpiece.” 

If they rated any movie below 4, display “That movie didn’t impress you much.” 

Step 6: Use Logical Operators to Identify Consistent Ratings 

Use the && operator to check if all ratings are 7 or higher. 

If so, display “You seem to enjoy most movies.” 

If not, check if any rating is below 3 using ||. 

If a very low rating is found, display “You have strong opinions on movies!”  

 

Output: What is the fifth movie you can remember: 

Input: MovieFive (Make MovieNames into an arrays) 

Output: What would you rate the movie? 

Input: RatingFive (Make Ratings into an arrays) 

If 1-10 move to next question 

Else: Not valid, please try again. (Loop to original prompt) 

If the user has rated any movie 10, display “Wow! You found a masterpiece.” 

If they rated any movie below 4, display “That movie didn’t impress you much.” 

Step 6: Use Logical Operators to Identify Consistent Ratings 

Use the && operator to check if all ratings are 7 or higher. 

If so, display “You seem to enjoy most movies.” 

If not, check if any rating is below 3 using ||. 

If a very low rating is found, display “You have strong opinions on movies!”  

 

All five ratings added together  /5 

Use an if-else statement to classify the user’s overall taste in movies based on their average rating: 

9-10: “You are a cinephile!” 

7-8: “You enjoy movies quite a bit.” 

5-6: “You have mixed feelings about movies.” 

Below 5: “You are a tough critic!” 

 

Genre if: 

Action → “Die Hard” 

Comedy → “Dumb and Dumberer” 

Horror → “The Thing” 

Drama → “The Godfather” 

Sci-Fi → “BladeRunner” 

 

Output: Wow the average rating for your list of movies is Average. Your a “RatingClassification”. I would reccomend “Recommendation”. 

 
