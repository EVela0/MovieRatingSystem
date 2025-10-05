import java.util.Scanner;

public class MovieSurvey {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Step 1: Get user name
        System.out.print("Enter your name: ");
        String userName = input.nextLine();
        System.out.println("Hello, " + userName + "!");

        //Step 2: Ask favorite genre with validation
        String genre = "";
        boolean validGenre = false;

        while (!validGenre) {
            System.out.print("What's your favorite movie genre (Action, Comedy, Horror, Drama, Sci-Fi)? ");
            genre = input.nextLine();

            switch (genre.toLowerCase()) {
                case "action":
                    System.out.println("You love excitement and thrills!");
                    validGenre = true;
                    break;
                case "comedy":
                    System.out.println("You enjoy a good laugh.");
                    validGenre = true;
                    break;
                case "horror":
                    System.out.println("You have a taste for fear!");
                    validGenre = true;
                    break;
                case "drama":
                    System.out.println("You appreciate deep storytelling.");
                    validGenre = true;
                    break;
                case "sci-fi":
                    System.out.println("You love futuristic and imaginative worlds!");
                    validGenre = true;
                    break;
                default:
                    System.out.println("Invalid genre, please try again.");
            }
        }

        //Step 3:Arrays for 5 movies
        String[] movies = new String[5];
        int[] ratings = new int[5];

        //Step 4:Input loop for movies and ratings
        for (int i = 0; i < 5; i++) {
            System.out.print("Out of the recent movies you have seen, what is one movie you can remember: ");
            movies[i] = input.nextLine();

            boolean validRating = false;
            while (!validRating) {
                System.out.print("What would you rate the movie (1-10)? ");
                if (input.hasNextInt()) {
                    int rating = input.nextInt();
                    input.nextLine(); //consume leftover newline

                    if (rating >= 1 && rating <= 10) {
                        ratings[i] = rating;
                        validRating = true;

                        //Individual feedback
                        if (rating == 10) {
                            System.out.println("Wow! You found a masterpiece.");
                        } else if (rating < 4) {
                            System.out.println("That movie didn’t impress you much.");
                        }
                    } else {
                        System.out.println("Not valid, please try again.");
                    }
                } else {
                    System.out.println("Not valid, please enter a number.");
                    input.nextLine(); //clear invalid input
                }
            }

            //Logical checks after each rating
            boolean allAbove7 = true;
            boolean anyBelow3 = false;

            for (int j = 0; j <= i; j++) {
                if (ratings[j] < 7) {
                    allAbove7 = false;
                }
                if (ratings[j] < 3) {
                    anyBelow3 = true;
                }
            }

            if (allAbove7) {
                System.out.println("You seem to enjoy most movies.");
            } else if (anyBelow3) {
                System.out.println("You have strong opinions on movies!");
            }
        }

        //Step 5: Calculate average rating
        int sum = 0;
        for (int rating : ratings) {
            sum += rating;
        }
        double average = sum / 5.0;

        //Step 6: Classify taste
        String classification;
        if (average >= 9) {
            classification = "You are a cinephile!";
        } else if (average >= 7) {
            classification = "You enjoy movies quite a bit.";
        } else if (average >= 5) {
            classification = "You have mixed feelings about movies.";
        } else {
            classification = "You are a tough critic!";
        }

        //Step 7: Genre-based recommendation
        String recommendation;
        switch (genre.toLowerCase()) {
            case "action":
                recommendation = "Die Hard";
                break;
            case "comedy":
                recommendation = "Dumb and Dumberer";
                break;
            case "horror":
                recommendation = "The Thing";
                break;
            case "drama":
                recommendation = "The Godfather";
                break;
            case "sci-fi":
                recommendation = "Blade Runner";
                break;
            default:
                recommendation = "The Demon Slayer Movie!"; 
                //surprise pick!
        }

        //Output
        System.out.println("\nWow, the average rating for your list of movies is " + average + ".");
        System.out.println("You're a \"" + classification + "\"");
        System.out.println("I would recommend \"" + recommendation + "\".");

        //Closes scanner
        input.close();
    }
}