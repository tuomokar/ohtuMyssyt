import com.myssyt.bibtex.*


description "As a user I want to add an article to the system so I can generate a bibtex-file"

scenario "Artikkelin luonti onnistuu, kun pakolliset kentät on annettu", {
    given 'Pakolliset artikkelin kentät on annettu', {
        journal = "Commun. ACM"
        title = "Novice mistakes: are the folk wisdoms correct?"
        author = "Spohrer, James C. and Soloway, Elliot"
        publisher = "Consortium for Computing Sciences in Colleges"
        year = 2006

    }

    when 'Luodaan uusi artikkeli käyttäen kenttiä', {
        artikkeli = new Artikkeli(journal, title, author, publisher, year)
    }

    then 'Artikkeli kentät toimivat oikein', {
        artikkeli.getJournal().shouldEqual "Commun. ACM"
        artikkeli.getTitle().shouldEqual "Novice mistakes: are the folk wisdoms correct?"
        artikkeli.getAuthor().shouldEqual "Spohrer, James C. and Soloway, Elliot"
        artikkeli.getPublisher().shouldEqual "Consortium for Computing Sciences in Colleges"
        artikkeli.getYear().shouldEqual 2006
    }
}