import com.myssyt.bibtex.*
import com.myssyt.bibtex.domain.*


description "Käyttäjä voi lisätä järjestelmään article, book ja inproceedings -tyyppisiä viitteitä"

scenario "Artikkelin lisääminen onnistuu, kun pakolliset kentät on annettu", {
    given 'Pakolliset artikkelin kentät on annettu', {
        bibtexkey = "artikkeli"
        journal = "Commun. ACM"
        title = "Novice mistakes: are the folk wisdoms correct?"
        author = "Spohrer, James C. and Soloway, Elliot"
        year = "2006"
        manageri = new ViiteManageri()
    }

    when 'Luodaan artikkeli ja lisätään se järjestelmään', {
        manageri.lisaaArtikkeli(bibtexkey, author, title, journal, year, null, null, null, null, null)
    }

    then 'Artikkeli löytyy järjestelmästä ja sen kentät ovat oikein', {
        artikkeli = manageri.getViitteet().get(0)
        artikkeli.getBibtexKey().shouldEqual "artikkeli"
        artikkeli.getJournal().shouldEqual "Commun. ACM"
        artikkeli.getTitle().shouldEqual "Novice mistakes: are the folk wisdoms correct?"
        artikkeli.getAuthor().shouldEqual "Spohrer, James C. and Soloway, Elliot"
        artikkeli.getYear().shouldEqual "2006"
    }
}

scenario "Kirjan lisääminen onnistuu, kun pakolliset kentät on annettu", {
    given 'Pakolliset kirjan kentät on annettu', {
        bibtexkey = "kirja"
        author = "Beck, Kent and Andres, Cynthia"
        title = "Extreme Programming Explained: Embrace Change (2nd Edition)"
        year = "2004"
        publisher = "Addison-Wesley Professional"
        manageri = new ViiteManageri()
    }

    when 'Luodaan kirja ja lisätään se järjestelmään', {
        manageri.lisaaKirja(bibtexkey, author, null, title, publisher, year, null, null, null, null, null, null, null)
    }

    then 'Kirja löytyy järjestelmästä ja sen kentät ovat oikein', {
        kirja = manageri.getViitteet().get(0)
        kirja.getBibtexKey().shouldEqual "kirja"
        kirja.getTitle().shouldEqual "Extreme Programming Explained: Embrace Change (2nd Edition)"
        kirja.getAuthor().shouldEqual "Beck, Kent and Andres, Cynthia"
        kirja.getPublisher().shouldEqual "Addison-Wesley Professional"
        kirja.getYear().shouldEqual "2004"
    }
}

scenario "Inproceedingsin lisääminen onnistuu, kun pakolliset kentät on annettu", {
    given 'Pakolliset inproceedingsin kentät on annettu', {
        bibtexkey = "inproceedings"
        author = "Pears, Arnold and Seidman, Stephen and Malmi, Lauri and Mannila, Linda and Adams, Elizabeth and Bennedsen, Jens and Devlin, Marie and Paterson, James"
        title = "A survey of literature on the teaching of introductory programming"
        booktitle = "ITiCSE-WGR '07: Working group reports on ITiCSE on Innovation and technology in computer science education"
        year = "2007"
        manageri = new ViiteManageri()
    }

    when 'Luodaan inproceedings ja lisätään se järjestelmään', {
        manageri.lisaaInproceedings(bibtexkey, author, title, booktitle, year, null, null, null, null, null, null, null, null, null, null)
    }

    then 'Inproceedings löytyy järjestelmästä ja sen kentät ovat oikein', {
        inproceedings = manageri.getViitteet().get(0)
        inproceedings.getBibtexKey().shouldEqual "inproceedings"
        inproceedings.getTitle().shouldEqual "A survey of literature on the teaching of introductory programming"
        inproceedings.getAuthor().shouldEqual "Pears, Arnold and Seidman, Stephen and Malmi, Lauri and Mannila, Linda and Adams, Elizabeth and Bennedsen, Jens and Devlin, Marie and Paterson, James"
        inproceedings.getBooktitle().shouldEqual "ITiCSE-WGR '07: Working group reports on ITiCSE on Innovation and technology in computer science education"
        inproceedings.getYear().shouldEqual "2007"
    }
}

scenario "Bookletin lisääminen onnistuu, kun pakolliset kentät on annettu", {
    given 'Pakolliset bookletin kentät on annettu', {
        bibtexkey = "booklet"
        title = "Tämä on testi; erikoismerkkien t@rina."
        manageri = new ViiteManageri()
    }

    when 'Luodaan booklet ja lisätään se järjestelmään', {
        manageri.lisaaBooklet(bibtexkey, title, null, null, null, null, null, null)
    }

    then 'Booklet löytyy järjestelmästä ja sen kentät ovat oikein', {
        booklet = manageri.getViitteet().get(0)
        booklet.getBibtexKey().shouldEqual "booklet"
        booklet.getTitle().shouldEqual "Tämä on testi; erikoismerkkien t@rina."
    }
}

scenario "Incollectioning lisääminen onnistuu, kun pakolliset kentät on annettu", {
    given 'Pakolliset incollectionin kentät on annettu', {
        bibtexkey = "incollection"
        author = "Beck, Kent and Andres, Cynthia"
        title = "~EXP"
        booktitle = "Extreme Programming Explained: Embrace Change (2nd Edition)"
        year = "2004"
        publisher = "Addison-Wesley Professional"
        manageri = new ViiteManageri()
    }

    when 'Luodaan incollection ja lisätään se järjestelmään', {
        manageri.lisaaIncollection(bibtexkey, author, title, booktitle, publisher, year, null, null, null, null, null, null, null, null, null, null, null)
    }

    then 'Incollection löytyy järjestelmästä ja sen kentät ovat oikein', {
        incollection = manageri.getViitteet().get(0)
        incollection.getBibtexKey().shouldEqual "incollection"
        incollection.getTitle().shouldEqual "~EXP"
        incollection.getBooktitle().shouldEqual "Extreme Programming Explained: Embrace Change (2nd Edition)"
        incollection.getAuthor().shouldEqual "Beck, Kent and Andres, Cynthia"
        incollection.getPublisher().shouldEqual "Addison-Wesley Professional"
        incollection.getYear().shouldEqual "2004"
    }
}