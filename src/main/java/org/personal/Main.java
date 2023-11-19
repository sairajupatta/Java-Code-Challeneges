package org.personal;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//            Movie movie = new Movie("Star Wars");
//            Movie.getMovie("Comedy","Saw 2");
//            movie.watchMovie();
        Scanner s = new Scanner(System.in);
        while (true){
            System.out.print(" A C S Q\n");
            String type = s.nextLine();
            if("Qq".contains(type)){
                break;
            }
            System.out.println("Enter the movie title : ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type,title);
            movie.watchMovie();
        }

        }
    }
