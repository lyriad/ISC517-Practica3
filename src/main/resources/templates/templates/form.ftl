<!DOCTYPE html>
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <title>Barcamp Form</title>
    </head>

    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <a class="navbar-brand" href="/form">Barcamp</a>

            <div class="collapse navbar-collapse" id="navbarColor01">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="/form">Form</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/admin">Admin</a>
                    </li>
                </ul>
            </div>
        </nav>
        <form name="form" action="/saveform" method="POST">

            <label>¿Las charlas donde usted participó cumplieron con sus expectativas? </label>
            <input  name="questionOne" type="number" placeholder="Grade 1-5" ><br/>

            <label>¿Los expositores mostraron tener dominio del tema?</label>
            <input name="questionTwo" type="number" placeholder="Grade 1-5"><br/>

            <label>¿Las instalaciones del evento fueron confortables para usted?.</label>
            <input name="questionThree" type="number" placeholder="Grade 1-5"> <br/>

            <label> ¿Tiene algún comentario para los organizadores? (Comentario).</label>
            <input name="questionFour" type="text" placeholder="Text" ></br>

            <button type="submit">Send</button>
        </form>
    </body>
</html>

