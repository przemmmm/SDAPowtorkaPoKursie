package org.example.ZadaniaPodstawa.Task19;

public class Task19 {
    public static void main(String[] args) {

        Poem poem1 = new Poem(new Author("Polska", "Mickiewicz"), 25);
        Poem poem2 = new Poem(new Author("USA", "King"), 125);
        Poem poem3 = new Poem(new Author("Polska", "Szymborska"), 12325);

        Poem[] poems = {poem1, poem2, poem3};


        int maxPoems=0;
        String mostStrophes="null";
        for (Poem poem : poems) {
            if(poem.getStropheNumbers()>maxPoems){
                maxPoems=poem.getStropheNumbers();
                mostStrophes=poem.getCreator().getName();
            }


        }
        System.out.println(mostStrophes);

    }



}
