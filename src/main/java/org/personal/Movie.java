package org.personal;

public class Movie {
    private String title;

    public Movie(String title){
        this.title = title;
    }

    public void watchMovie(){
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");
    }

    public static Movie getMovie(String type,String title){
        return switch (type.toUpperCase().charAt(0)){
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new Sciencefiction(title);
            default -> new Movie(title);
        };
    }
}

    class Adventure extends  Movie {

        public Adventure(String title) {
            super(title);
        }

        @Override
        public void watchMovie() {
            super.watchMovie();
            System.out.printf(".. %s%n".repeat(3),
                    "Pleasant Scene",
                    "Scary Music",
                    "Something Bad Happens");
        }
    }

    class Comedy extends Movie{

    public Comedy(String title){
        super(title);
    }

        @Override
        public void watchMovie() {
            super.watchMovie();
            System.out.printf("...%s%n".repeat(3),
                    "Fun",
                    "Laugh",
                    "High");
        }
    }
    class Sciencefiction extends Movie{
        public Sciencefiction(String title) {
            super(title);
        }

        @Override
        public void watchMovie() {
            super.watchMovie();
            System.out.printf(".. %s%n".repeat(3),
                    "Bad Aliens do Bad Stuff",
                    "Laser",
                    "Yolks on run");
        }
    }
