import com.myssyt.bibtex.*

description "As a user I want to add an article to the system so I can generate a bibtex-file"

scenario "Artikkelin luonti onnistuu, kun kentät on annettu", {
    given 'Artikkelin kentät on annettu', {
        author = "Spohrer, James C. and Soloway, Elliot"
        title = "Novice mistakes: are the folk wisdoms correct?"
        journal = "Commun. ACM"
        year = "2006"
    }

    when 'Luodaan uusi artikkeli käyttäen kenttiä', {
        artikkeli = new Artikkeli(null, author, title, journal, year, null, null, null, null, null)
    }

    then 'Artikkelin kentät toimivat oikein', {
        artikkeli.getAuthor().shouldEqual "Spohrer, James C. and Soloway, Elliot"
        artikkeli.getTitle().shouldEqual "Novice mistakes: are the folk wisdoms correct?"
        artikkeli.getJournal().shouldEqual "Commun. ACM"
        artikkeli.getYear().shouldEqual "2006"
    }
}