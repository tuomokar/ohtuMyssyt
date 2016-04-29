import com.myssyt.bibtex.*
import com.myssyt.bibtex.domain.*


description "Käyttäjänä haluan muokata järjestelmässä olevia viitteitä"

scenario "Artikkelin muokkaaminen onnistuu, kun pakolliset kentät on annettu", {
    given 'Järjestelmästä löytyy artikkeli ja pakolliset artikkelin uudet kentät on annettu', {
        bibtexkey = "artikkeli"
        journal = "journal"
        title = "title"
        author = "author"
        year = "2006"
        manageri = new ReferenceManager()
        manageri.addArticle(bibtexkey, author, title, journal, year, null, null, null, null, null)
        newjournal = "newjournal"
        newtitle = "newtitle"
        newauthor = "newauthor"
        newyear = "2008"
    }

    when 'Artikkelia muokataan', {
        manageri.editArticle(0, bibtexkey, newauthor, newtitle, newjournal, newyear, null, null, null, null, null)
    }

    then 'Artikkelin kentät ovat oikein muutoksen jälkeen', {
        artikkeli = manageri.getReferences().get(0)
        artikkeli.getBibtexKey().shouldEqual "artikkeli"
        artikkeli.getJournal().shouldEqual "newjournal"
        artikkeli.getTitle().shouldEqual "newtitle"
        artikkeli.getAuthor().shouldEqual "newauthor"
        artikkeli.getYear().shouldEqual "2008"
    }
}

scenario "Kirjan muokkaaminen onnistuu, kun pakolliset kentät on annettu", {
    given 'Järjestelmästä löytyy kirja ja pakolliset kirjan uudet kentät on annettu', {
        /*bibtexkey = "kirja"
        editor = "editor"
        title = "title"
        author = "author"
        year = "2006"
        manageri = new ReferenceManager()
        manageri.addBook(bibtexkey, author, title, editor, year, null, null, null, null, null)
        neweditor = "neweditor"
        newtitle = "newtitle"
        newauthor = "newauthor"
        newyear = "2008"*/
    }

    when 'Kirjaa muokataan', {
        /*manageri.muokkaaBook(0, bibtexkey, newauthor, newtitle, neweditor, newyear, null, null, null, null, null)*/
    }

    then 'Kirjan kentät ovat oikein muutoksen jälkeen', {
        /*kirja = manageri.getReferences().get(0)
        kirja.getBibtexKey().shouldEqual "kirja"
        kirja.getEditor().shouldEqual "neweditor"
        kirja.getTitle().shouldEqual "newtitle"
        kirja.getAuthor().shouldEqual "newauthor"
        kirja.getYear().shouldEqual "2008"*/
    }
}