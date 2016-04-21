import com.myssyt.bibtex.*

description "As a user I want to add an article to the system so I can generate a bibtex-file"

scenario "Artikkelin luonti onnistuu, kun pakolliset kentät on annettu", {
    given 'Pakolliset artikkelin kentät on annettu', {
        title = "Novice mistakes: are the folk wisdoms correct?";
        author = "Spohrer, James C. and Soloway, Elliot";
        journal = "Commun. ACM";
        year = "2006";
    }

    when 'Luodaan uusi artikkeli käyttäen kenttiä', {
        artikkeli = new Artikkeli(null, author, title, journal, year, null, null, null, null, null);
    }

    then 'Artikkeli kentät toimivat oikein', {
        artikkeli.getAuthor().shouldEqual "Spohrer, James C. and Soloway, Elliot"
        artikkeli.getTitle().shouldEqual "Novice mistakes: are the folk wisdoms correct?"
        artikkeli.getJournal().shouldEqual "Commun. ACM"
        artikkeli.getYear().shouldEqual "2006"
    }
}