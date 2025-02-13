package OOPs.Assignment_1;

public class Question6 {
    public static void main(String[] args) {
        Movie[] movieList = {
                new Movie("Bahubali","Hombale Films"),
                new Movie("Stree 2","Maddock Films"),
                new Movie("Harry Potter","Warner Bros","5 star"),
                new Movie("Pathaan","Yash Raj Films","4 star"),
                new Movie("Brothers","Dharma Production"),
                new Movie("Drishyam 2","Panorama Studios","5 star"),
                new Movie("Azhar","Panorama Studios","3 star"),
                new Movie("Himmatwala","Dharma Production","2 star"),
                new Movie("Adipurush","Dharma Production","2 star"),
                new Movie("Drona","Dharma Production","1 star"),
        };

        Movie[] topMovieList=new Movie[movieList.length];
        topMovieList=get5StarMovies(movieList);
        displayTopMoviesDetails(topMovieList);

    }
    public static void displayTopMoviesDetails(Movie[] topMovieList){
        for(int i=0;i<topMovieList.length;i++){
            if(topMovieList[i]==null){
                break;
            }
            topMovieList[i].displayMovieDetails();
            System.out.println();
        }
    }

    public static Movie[] get5StarMovies(Movie[] movieList){
        Movie[] topMovieList=new Movie[movieList.length];
        int index=0;

        for(int i=0;i<movieList.length;i++){
            if(movieList[i].getMovieRating()=="5 star"){
                topMovieList[index]=movieList[i];
                index++;
            }
        }
        return topMovieList;
    }
}

class Movie{
    private String title;
    private String studio;
    private String rating;

    Movie(String title,String studio,String rating){
        this.title=title;
        this.studio=studio;
        this.rating=rating;
    }

    Movie(String title,String studio){
        this.title=title;
        this.studio=studio;
        this.rating="5 star";
    }

    public String getMovieRating(){
        return this.rating;
    }

    public void displayMovieDetails(){
        System.out.println("Name : "+this.title);
        System.out.println("Studio : "+this.studio);
        System.out.println("Ratin : "+this.rating);
    }
}