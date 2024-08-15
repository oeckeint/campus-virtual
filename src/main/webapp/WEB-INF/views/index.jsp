<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Universidad</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <!-- Navigation Bar -->
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="#">Universidad</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="/inicio/detalles">Inicio <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/inicio/acercade">Acerca de</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/inicio/carreras">Carreras</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/inicio/usuario">Usuario (${user})</a>
                </li>
            </ul>
        </div>
    </nav>

    <!-- Header Section -->
    <header class="jumbotron text-center">
        <h1 class="display-4">Bienvenidos a la Universidad</h1>
        <p class="lead">Educación de calidad para un futuro brillante</p>
        <a class="btn btn-primary btn-lg" href="#" role="button">Más información</a>
    </header>

    <!-- Main Content Section -->
    <div class="container">
        <div class="row">
            <div class="col-md-4">
                <h2>Facultades</h2>
                <p>Conoce nuestras diversas facultades y programas académicos.</p>
                <a class="btn btn-secondary" href="/inicio/facultades" role="button">Ver detalles &raquo;</a>
            </div>
            <div class="col-md-4">
                <h2>Investigación</h2>
                <p>Descubre nuestros proyectos de investigación y publicaciones.</p>
                <a class="btn btn-secondary" href="/inicio/investigacion" role="button">Ver detalles &raquo;</a>
            </div>
            <div class="col-md-4">
                <h2>Admisiones</h2>
                <p>Infórmate sobre el proceso de admisión y requisitos.</p>
                <a class="btn btn-secondary" href="/inicio/admisiones" role="button">Ver detalles &raquo;</a>
            </div>
        </div>
    </div>

    <!-- Footer Section -->
    <footer class="footer bg-light text-center py-3">
        <div class="container">
            <span class="text-muted">&copy; 2024 Universidad. Todos los derechos reservados.</span>
        </div>
    </footer>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>