<%-- 
    Document   : home
    Created on : Oct 4, 2018, 7:59:00 AM
    Author     : Jelena
--%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ include file="header.jsp" %>

<link href="https://fonts.googleapis.com/css?family=Pacifico" rel="stylesheet">
<link href="<c:url value="/resources/css/footer.css" />" rel="stylesheet">
<!-- Header with Background Image -->
<header class="business-header">
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <img class="centerImage" style="margin-top: 50px; margin-bottom: -100px; width: 100%; height: 500px" src="<c:url value="/resources/images/slika1.jpg" />" alt="" />
                <h1 class="display-3 text-center text-white mt-4" style="color: darkslategray; margin-top: -10px; font-family: 'Pacifico', cursive; font-size: 80px">Met Life</h1>
            </div>
        </div>
    </div>
</header>

<!-- Page Content -->
<div class="container">

    <div class="row">
        <div class="col-sm-12">
            <h2 class="mt-4">Sta je zapravo fitness?</h2>
            <p>Fizi?ka spremnost (Fitness eng.) je stanje zdravlja i blagostanja, i konkretnije, sposobnost obavljanja aspekta sporta, zanimanja i svakodnevnih aktivnosti. Fizi?ku spremnost se generalno posti?e pravilnom ishranom, umereno sna?nom fizi?kom ve?bom, i dovoljnim odmora. </p>
            <p>Pre industrijske revolucije, fitness je bio definisan kao kapacitet za obavljanje dnevnih aktivnosti bez nepotrebnog zamora. Me?utim, sa automatizacijom i promenama u na?inu ?ivota, fizi?ka sposobnost sada se smatra merilom sposobnosti tela da efikasno i efikasno funkcioni?u u radnim i rekreativnim aktivnostima, da budu zdravi, da se odupru hipokineti?kim bolestima i da se suo?e sa vanrednim situacijama.</p>

        </div>
        
    </div>
    <img class="centerImage" style="margin-top: 50px; margin-bottom: 0px; width: 100%; height: 350px" src="<c:url value="/resources/images/slika5.jpg" />" alt="" />
     <div class="row">
         <div class="col-sm-12" style="margin-bottom: 25px">
            <h2 class="mt-4">Yoga</h2>
            <p>Joga (sanskrit: ??? yóga - jedinstvo) je drevna metoda samorazvoja koja podrazumeva upotrebu tehnika: fizi?kih polo?aja (Asana), ve?bi upravljanja pranom (energijom) putem disanja (Pranajama), relaksaciono-meditativnih ve?bi (Pratjahara), koncentracije (Dharana), meditacije (Dhjana) i samorealizacije (Samadhi). Joga predla?e usvajanje vrednosnog sistema (Jama, Nijama) koji kreira ?ivotnu filozofiju iz koje proizilazi novi razvojni ?ivotni stil. Njen nastanak se vezuje za susret Arijaca i Dravida u Indiji. Znanja o joga metodu, koja se nalaze u Vedama, Upani?adama i drugim izvornim spisima uobli?io je i sistematizovao Patan?ali u legendarnom spisu Joga sutre. </p>
            <p>Joga predstavlja jedan od ?est indijskih filozofskih sistema (Darshana). Za razliku od mnogih filozofskih sistema, koji se bave uglavnom misaonim istra?ivanjem ?oveka, ?ivota i sveta, sistem joge stavlja naglasak na prakti?ne telesne i psihi?ke ve?be, u cilju razvoja svih potencijala pojedinca. Zbog delotvornosti joge kao discipline nalazi je u upotrebi mnogih religijskih kultova.[1][2] Me?utim, do danas joga kao disciplina samorazvoja uspeva da sa?uva svoju autenti?nost u zna?ajnoj meri zahvaljuju?i Patan?alijevom trudu. Danas su joga tehnike va?ne u zdravstvenoj preventivi, kao i rehabilitaciji. </p>

        </div>
        
    </div>
     <img class="centerImage" style="margin-top: 50px; margin-bottom: 0px; width: 100%; height: 350px" src="<c:url value="/resources/images/slika6.png" />" alt="" />
     <div class="row">
         <div class="col-sm-12" style="margin-bottom: 25px">
            <h2 class="mt-4">Pilates</h2>
            <p>Pilates metod (ponekad se naziva jednostavno Pilates) je sistem fizi?kih ve?bi koji je razvio Jozef Pilates (Joseph Pilates), u prvoj polovini 20. veka.Pilates je profinjena forma ve?banja koja istovremeno razvija specifi?nu mi?i?nu snagu kao i fleksibilnost mi?i?a i zglobova, cime se posti?e optimalna telesna uravnote?enost. Pilates izdu?uje i tonizira telo, uti?e na elegantnu posturu, osloba?a stresa, doprinosi boljoj samokontroli i ve?em samopouzdanju. </p>
            <p>Pilates je nazvao svoj metod "Kontrologija", ?to upu?uje na na?in na koji ovaj metod ohrabruje ljude da koriste svoj um da bi "kontrolisali" svoje mi?i?e. Ovaj program koncentri?e se na unutra?nje mi?i?e-dr?a?e koji su va?ni za odr?avanje tela u ravnote?i, a od su?tinskog su zna?aja za podr?avanje normalnog stanja ki?menog stuba. Posebno, Pilates ve?be podu?avaju o svesnosti disanja i poravnavanju ki?me, odnosno ja?aju unutra?nje mi?i?e trupa, ?to je od velikog zna?aja za ubla?avanje i predupre?ivanje (preventivu) bolova u le?ima. </p>

        </div>
        
    </div>
     <img class="centerImage" style="margin-top: 50px; margin-bottom: 0px; width: 100%; height: 350px" src="<c:url value="/resources/images/slika7.jpg" />" alt="" />
     <div class="row">
         <div class="col-sm-12" style="margin-bottom: 25px">
            <h2 class="mt-4">Kardio vezbe</h2>
            <p>Aerobna ve?ba (poznata i kao kardio) je fizi?ka ve?ba od niskog do visokog intenziteta koja zavisi prvenstveno od aerobnog procesa generisanja energije. [1] Aerobna bukvalno zna?i "vezivanje, uklju?ivanje ili tra?enje slobodnog kiseonika", [2] i odnosi se na upotrebu kiseonika kako bi se adekvatno zadovoljavali zahtjevi energije prilikom ve?banja aerobnim metabolizmom [3]. Uop?teno gledano, intenzitet svetlosti do umerenog intenziteta koji su dovoljno podr?ani aerobnim metabolizmom mogu se izvoditi u du?em vremenskom periodu. </p>
            <p>Kada se ve?baju na ovaj na?in, primjeri kardiovaskularne / aerobne vje?be su tr?anje / tr?anje srednje veli?ine, vo?nja biciklom i hodanje, prema prvom obimnom istra?ivanju aerobne vje?be, provedeno u 1960-im na vi?e od 5.000 ameri?kih slu?benika Vazduhoplovstva Dr. Kenneth H. Cooper. </p>

        </div>
        
    </div>
     
    <!-- /.row -->

    <div class="row">
        <div class="col-sm-4 my-4">
            <div class="card">
                <img class="card-img-top" src="<c:url value="/resources/images/icon1.png"/>" alt="TestDisplay"/>
                <div class="card-body">
                    <h4 class="card-title">Galerija</h4>
                    <p class="card-text">Ukoliko zelite da vidite slike naseg studija, pritisnite link ispod.</p>
                </div>
                <div class="card-footer">
                    <c:url var="galerija"  value="/galerija" />
                    <a class="btn btn-primary" href="${galerija}">Idi u galeriju</a>
                </div>
            </div>
        </div>
        <div class="col-sm-4 my-4">
            <div class="card">
                <img class="card-img-top" src="<c:url value="/resources/images/icon2.png" />" alt="TestDisplay"/>
                <div class="card-body">
                    <h4 class="card-title">Kontakt</h4>
                    <p class="card-text">Imate dodatna pitanja? zelite da dobijete detaljniji odgovor na Vase pitanje? Idite na kontakt stranicu, posaljite poruku i mi cemo Vam u najkracem roku odgovoriti.</p>
                </div>
                <div class="card-footer">
                    <c:url var="kontakt"  value="/kontakt" />
                    <a class="btn btn-primary" href="${kontakt}">Kontaktirajte nas</a>
                </div>
            </div>
        </div>
        <div class="col-sm-4 my-4">
            <div class="card">
                <img class="card-img-top" src="<c:url value="/resources/images/icon3.png" />" alt="TestDisplay"/>
                <div class="card-body">
                    <h4 class="card-title">O nama</h4>
                    <p class="card-text">Ukoliko zelite da saznate vise informacija o nasoj firmi, idite na link ispod i upoznajte se o nasem nacinu poslovanja.</p>
                </div>
                <div class="card-footer">
                    <c:url var="onama"  value="/onama" />
                    <a class="btn btn-primary" href="${onama}">Saznajte vise</a>
                </div>
            </div>
        </div>

    </div>
