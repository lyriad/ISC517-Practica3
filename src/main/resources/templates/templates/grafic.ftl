<html>
<head>
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">

        google.charts.load('current', {'packages':['corechart']});

        google.charts.setOnLoadCallback(drawChart);

        function drawChart() {

            var data = new google.visualization.DataTable();
            data.addColumn('string', 'Topping');
            data.addColumn('number', 'Votos');
            data.addRows([
                ['¿Las charlas donde usted participó cumplieron con sus expectativas?', ${questionOne}],
                ['¿Los expositores mostraron tener dominio del tema?', ${questionTwo}],
                ['¿Las instalaciones del evento fueron confortables para usted?', ${questionThree}],

            ]);

            var options = {'title':'Barcamp Form',
                'width':1600,
                'height':800};

            var chart = new google.visualization.ColumnChart(document.getElementById('chart_div'));
            chart.draw(data, options);
        }
    </script>
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
<div id="chart_div"></div>
</body>
</html>