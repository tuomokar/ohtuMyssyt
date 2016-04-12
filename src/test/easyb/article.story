import com.hatut.bibtex.*

As a user I want to add an article to the system so I can generate a bibtex-file

scenario "system accepts required field inputs (as defined in https://en.wikipedia.org/wiki/BibTeX)", {
    given 'Pakolliset artikkelin kentät on annettu', {
       String journal = "Commun. ACM"
       String title = "Novice mistakes: are the folk wisdoms correct?"
       String author = "Spohrer, James C. and Soloway, Elliot";
       String publisher = "Consortium for Computing Sciences in Colleges"
       int year = 2006
    }

    when 'Luodaan uusi artikkeli käyttäen kenttiä', {
       artikkeli = new Artikkeli(journal, title, author, publisher, year)
    }

    then 'Artikkeli tulostuu oikein', {
       System.out.print("ok").getPrints().shouldHave("ok")
    }
}
